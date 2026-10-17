package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i1 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f117713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f117714c;
    public final g1 d;

    public /* synthetic */ i1(int i, String str, h1 h1Var, w0 w0Var, g1 g1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(v0.f117869a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117712a = str;
        this.f117713b = h1Var;
        this.f117714c = w0Var;
        this.d = g1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f117712a, i1Var.f117712a) && Intrinsics.f(this.f117713b, i1Var.f117713b) && Intrinsics.f(this.f117714c, i1Var.f117714c) && Intrinsics.f(this.d, i1Var.d);
    }

    public final int hashCode() {
        String str = this.f117712a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        h1 h1Var = this.f117713b;
        int iHashCode2 = (iHashCode + (h1Var == null ? 0 : h1Var.f117691a.hashCode())) * 31;
        w0 w0Var = this.f117714c;
        int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        g1 g1Var = this.d;
        return iHashCode3 + (g1Var != null ? g1Var.hashCode() : 0);
    }
}
