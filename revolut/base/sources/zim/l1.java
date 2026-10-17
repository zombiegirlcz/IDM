package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class l1 extends r1 implements kotlin.reflect.b {
    public final m1 k;

    public l1(m1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l1) this.k.o.getValue()).call(obj2, obj3);
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
