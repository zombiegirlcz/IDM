package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d3 {

    @NotNull
    public static final c3 Companion = new c3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6 f124513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f124514b;

    public /* synthetic */ d3(int i, d6 d6Var, i2 i2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(b3.f124496a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124513a = d6Var;
        this.f124514b = i2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f124513a, d3Var.f124513a) && Intrinsics.f(this.f124514b, d3Var.f124514b);
    }

    public final int hashCode() {
        return this.f124514b.hashCode() + (this.f124513a.hashCode() * 31);
    }

    public d3(d6 product, i2 group) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f124513a = product;
        this.f124514b = group;
    }
}
