package ip0;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p3 {

    @NotNull
    public static final l3 Companion = new l3();
    public static final p3 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f165762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sequence f165763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165764c;
    public final o3 d;

    static {
        zhm.f0 f0Var = zhm.f0.f322471a;
        Sequence sequenceD = nkm.t.d();
        Map mapG = zhm.r0.g();
        xi0.b.Companion.getClass();
        e = new p3(f0Var, sequenceD, mapG, new n3(xi0.b.f306271c));
    }

    public p3(List categories, Sequence series, Map colors, o3 yAxisLabels) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(series, "series");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(yAxisLabels, "yAxisLabels");
        this.f165762a = categories;
        this.f165763b = series;
        this.f165764c = colors;
        this.d = yAxisLabels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f165762a, p3Var.f165762a) && Intrinsics.f(this.f165763b, p3Var.f165763b) && this.f165764c.equals(p3Var.f165764c) && this.d.equals(p3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b((this.f165763b.hashCode() + (this.f165762a.hashCode() * 31)) * 31, 31, this.f165764c);
    }
}
