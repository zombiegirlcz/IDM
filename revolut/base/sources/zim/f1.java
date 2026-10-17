package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class f1 extends r1 implements kotlin.reflect.a {
    public final g1 k;

    public f1(g1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.k.get();
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
