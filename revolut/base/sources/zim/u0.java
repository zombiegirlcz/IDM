package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes14.dex */
public final class u0 extends t1 {
    public final v0 k;

    public u0(v0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
