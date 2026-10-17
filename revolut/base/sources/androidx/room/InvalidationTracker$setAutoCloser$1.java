package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends q implements Function0<Unit> {
    public InvalidationTracker$setAutoCloser$1(Object obj2) {
        super(0, 0, InvalidationTracker.class, obj2, "onAutoCloseCallback", "onAutoCloseCallback()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3588invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3588invoke() {
        ((InvalidationTracker) this.receiver).onAutoCloseCallback();
    }
}
