package zim;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes14.dex */
public final class q0 extends t1 implements wim.g {
    public final r0 k;

    public q0(r0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws IllegalCallableAccessException {
        this.k.f(obj2, obj3);
        return Unit.f186387a;
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
