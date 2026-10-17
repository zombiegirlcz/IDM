package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229708c;
    public final long d;
    public final String e;
    public final String f;

    public /* synthetic */ y0(long j2, int i, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            qlm.j1.f(w0.f229699a.getDescriptor(), i, 63);
            throw null;
        }
        this.f229706a = str;
        this.f229707b = str2;
        this.f229708c = str3;
        this.d = j2;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f229706a, y0Var.f229706a) && Intrinsics.f(this.f229707b, y0Var.f229707b) && Intrinsics.f(this.f229708c, y0Var.f229708c) && this.d == y0Var.d && Intrinsics.f(this.e, y0Var.e) && Intrinsics.f(this.f, y0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f229706a.hashCode() * 31;
        String str = this.f229707b;
        int iC = a0.d.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229708c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public y0(String type, String str, String passIdentifier, String str2, long j2, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(passIdentifier, "passIdentifier");
        this.f229706a = type;
        this.f229707b = str;
        this.f229708c = passIdentifier;
        this.d = j2;
        this.e = str2;
        this.f = str3;
    }
}
