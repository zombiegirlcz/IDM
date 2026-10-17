package zim;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1$Getter;

/* JADX INFO: loaded from: classes14.dex */
public final class i1 extends r1 implements KProperty1$Getter {
    public final j1 k;

    public i1(j1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.k = property;
    }

    @Override // wim.n
    public final KProperty a() {
        return this.k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return this.k.get(obj2);
    }

    @Override // zim.o1
    public final u1 r() {
        return this.k;
    }
}
