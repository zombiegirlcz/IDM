package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b3 f215694c;
    public final String d;
    public final String e;

    public a0(String str, String str2, b3 b3Var, String str3, String str4) {
        this.f215692a = str;
        this.f215693b = str2;
        this.f215694c = b3Var;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.f215692a;
    }

    public final b3 b() {
        return this.f215694c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f215693b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f215692a, a0Var.f215692a) && Intrinsics.f(this.f215693b, a0Var.f215693b) && Intrinsics.f(this.f215694c, a0Var.f215694c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e);
    }

    public final int hashCode() {
        String str = this.f215692a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215693b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b3 b3Var = this.f215694c;
        int iHashCode3 = (iHashCode2 + (b3Var == null ? 0 : b3Var.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
