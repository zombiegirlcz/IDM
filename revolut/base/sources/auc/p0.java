package auc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9779c;

    public /* synthetic */ p0(double d, double d5, int i, String str) {
        if (7 != (i & 7)) {
            j1.f(n0.f9765a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9777a = str;
        this.f9778b = d;
        this.f9779c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f9777a, p0Var.f9777a) && Double.compare(this.f9778b, p0Var.f9778b) == 0 && Double.compare(this.f9779c, p0Var.f9779c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9779c) + m72.b.c(this.f9777a.hashCode() * 31, this.f9778b, 31);
    }

    public p0(String ssid, double d, double d5) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        this.f9777a = ssid;
        this.f9778b = d;
        this.f9779c = d5;
    }
}
