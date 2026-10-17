package zim;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes14.dex */
public final class o0 extends t1 implements wim.e {
    public final p0 k;

    public o0(p0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IllegalCallableAccessException {
        ((o0) this.k.f322681q.getValue()).call(obj2);
        return Unit.f186387a;
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
