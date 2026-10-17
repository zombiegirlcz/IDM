package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9787c;
    public final double d;

    public /* synthetic */ s0(double d, double d5, int i, String str, String str2) {
        if (15 != (i & 15)) {
            j1.f(q0.f9781a.getDescriptor(), i, 15);
            throw null;
        }
        this.f9785a = str;
        this.f9786b = str2;
        this.f9787c = d;
        this.d = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f9785a, s0Var.f9785a) && Intrinsics.f(this.f9786b, s0Var.f9786b) && Double.compare(this.f9787c, s0Var.f9787c) == 0 && Double.compare(this.d, s0Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + m72.b.c(p.a.c(this.f9785a.hashCode() * 31, 31, this.f9786b), this.f9787c, 31);
    }

    public s0(String id10, String ssid, double d, double d5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        this.f9785a = id10;
        this.f9786b = ssid;
        this.f9787c = d;
        this.d = d5;
    }
}
