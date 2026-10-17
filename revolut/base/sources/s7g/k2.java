package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260754c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f260755g;

    public /* synthetic */ k2(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (3 != (i & 3)) {
            qlm.j1.f(i2.f260744a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260752a = str;
        this.f260753b = str2;
        if ((i & 4) == 0) {
            this.f260754c = null;
        } else {
            this.f260754c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.f260755g = null;
        } else {
            this.f260755g = str7;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f260752a, k2Var.f260752a) && Intrinsics.f(this.f260753b, k2Var.f260753b) && Intrinsics.f(this.f260754c, k2Var.f260754c) && Intrinsics.f(this.d, k2Var.d) && Intrinsics.f(this.e, k2Var.e) && Intrinsics.f(this.f, k2Var.f) && Intrinsics.f(this.f260755g, k2Var.f260755g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260752a.hashCode() * 31, 31, this.f260753b);
        String str = this.f260754c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f260755g;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
