package zim;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes14.dex */
public final class s0 extends t1 implements wim.i {
    public final t0 k;

    public s0(t0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws IllegalCallableAccessException {
        ((s0) this.k.f322700q.getValue()).call(obj2, obj3, obj4);
        return Unit.f186387a;
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
