package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class RoomDatabase$closeBarrier$1 extends q implements Function0<Unit> {
    public RoomDatabase$closeBarrier$1(Object obj2) {
        super(0, 0, RoomDatabase.class, obj2, "onClosed", "onClosed()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3589invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3589invoke() {
        ((RoomDatabase) this.receiver).onClosed();
    }
}
