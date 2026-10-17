package tb;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class a0 implements ScrollableState {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Saver f269373h = ListSaverKt.listSaver(y.f, r.i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyListState f269374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f269375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f269376c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    public final State d = SnapshotStateKt.derivedStateOf(new d(this, 3));
    public final State e = SnapshotStateKt.derivedStateOf(new d(this, 2));
    public final MutableState f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableState f269377g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public a0(int i) {
        this.f269374a = new LazyListState(i, 0, 2, null);
        this.f269375b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
    }

    public final LazyListItemInfo a() {
        Object obj2;
        LazyListLayoutInfo layoutInfo = this.f269374a.getLayoutInfo();
        Iterator<T> it8 = layoutInfo.getVisibleItemsInfo().iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int iMin = Math.min(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo.getOffset(), 0);
                do {
                    Object next2 = it8.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int iMin2 = Math.min(lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize(), layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding()) - Math.max(lazyListItemInfo2.getOffset(), 0);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (LazyListItemInfo) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b() {
        return ((Number) this.f269375b.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return this.f269374a.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.f269374a.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objScroll = this.f269374a.scroll(mutatePriority, function2, continuation);
        return objScroll == fim.a.COROUTINE_SUSPENDED ? objScroll : Unit.f186387a;
    }

    public final String toString() {
        return "PagerState(pageCount=" + ((Number) this.d.getValue()).intValue() + ", currentPage=" + b() + ", currentPageOffset=" + ((Number) this.e.getValue()).floatValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
