package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f235701c;
    public final String d;
    public final String e;
    public final String f;

    public u0(String planId, String str, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f235699a = planId;
        this.f235700b = str;
        this.f235701c = bool;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final String a() {
        String str = this.f235700b;
        if (str == null) {
            str = "";
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f;
        return com.google.android.gms.internal.mlkit_vision_face.a.p(this.f235699a, str, str2, str3, str4 != null ? str4 : "");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f235699a, u0Var.f235699a) && Intrinsics.f(this.f235700b, u0Var.f235700b) && Intrinsics.f(this.f235701c, u0Var.f235701c) && Intrinsics.f(this.d, u0Var.d) && Intrinsics.f(this.e, u0Var.e) && Intrinsics.f(this.f, u0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f235699a.hashCode() * 31;
        String str = this.f235700b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f235701c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
