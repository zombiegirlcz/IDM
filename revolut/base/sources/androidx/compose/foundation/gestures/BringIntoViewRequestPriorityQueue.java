package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "request", "", "enqueue", "(Landroidx/compose/foundation/gestures/ContentInViewNode$Request;)Z", "", "resumeAndRemoveAll", "", "cause", "cancelAndRemoveAll", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/collection/MutableVector;", "requests", "Landroidx/compose/runtime/collection/MutableVector;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;

    @NotNull
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enqueue$lambda$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewNode.Request request, Throwable th10) {
        bringIntoViewRequestPriorityQueue.requests.remove(request);
        return Unit.f186387a;
    }

    public final void cancelAndRemoveAll(Throwable cause) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[size];
        for (int i = 0; i < size; i++) {
            cancellableContinuationArr[i] = mutableVector.content[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            cancellableContinuationArr[i2].a(cause);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(@NotNull ContentInViewNode.Request request) {
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            CancellableContinuation continuation = request.getContinuation();
            m.Companion companion = m.INSTANCE;
            continuation.resumeWith(Unit.f186387a);
            return false;
        }
        request.getContinuation().r(new g0f.f(this, request, 1));
        IntRange intRangeO = kotlin.ranges.f.o(0, this.requests.getSize());
        int i = intRangeO.f186448a;
        int i2 = intRangeO.f186449b;
        if (i <= i2) {
            while (true) {
                Rect rect2 = (Rect) this.requests.content[i2].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect rectIntersect = rect.intersect(rect2);
                    if (Intrinsics.f(rectIntersect, rect)) {
                        this.requests.add(i2 + 1, request);
                        return true;
                    }
                    if (!Intrinsics.f(rectIntersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= i2) {
                            while (true) {
                                this.requests.content[i2].getContinuation().a(cancellationException);
                                if (size == i2) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (i2 == i) {
                    break;
                }
                i2--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void resumeAndRemoveAll() {
        IntRange intRangeO = kotlin.ranges.f.o(0, this.requests.getSize());
        int i = intRangeO.f186448a;
        int i2 = intRangeO.f186449b;
        if (i <= i2) {
            while (true) {
                CancellableContinuation continuation = this.requests.content[i].getContinuation();
                Unit unit = Unit.f186387a;
                m.Companion companion = m.INSTANCE;
                continuation.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.requests.clear();
    }
}
