package androidx.room;

import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class InvalidationTracker$implementation$1 extends q implements Function1<Set<? extends Integer>, Unit> {
    public InvalidationTracker$implementation$1(Object obj2) {
        super(1, 0, InvalidationTracker.class, obj2, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Set<Integer>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Set<Integer> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(p0);
    }
}
