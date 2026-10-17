package kr;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new h2(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f188518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f188519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f188520c;

    public k2(double d5, Double d6, ArrayList samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        this.f188518a = d5;
        this.f188519b = d6;
        this.f188520c = samples;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Double.compare(this.f188518a, k2Var.f188518a) == 0 && Intrinsics.f(this.f188519b, k2Var.f188519b) && Intrinsics.f(this.f188520c, k2Var.f188520c);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f188518a) * 31;
        Double d5 = this.f188519b;
        return this.f188520c.hashCode() + ((iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31);
    }

    public /* synthetic */ k2(int i, double d5, Double d6, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(i2.f188510a.getDescriptor(), i, 7);
            throw null;
        }
        this.f188518a = d5;
        this.f188519b = d6;
        this.f188520c = list;
    }
}
