package pfk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235704c;

    public v0(String planId, String str, String str2) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f235702a = planId;
        this.f235703b = str;
        this.f235704c = str2;
    }

    public final String a() {
        String str = this.f235703b;
        if (str == null) {
            str = "";
        }
        String str2 = this.f235704c;
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f235702a, str, str2 != null ? str2 : "");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f235702a, v0Var.f235702a) && Intrinsics.f(this.f235703b, v0Var.f235703b) && Intrinsics.f(this.f235704c, v0Var.f235704c);
    }

    public final int hashCode() {
        int iHashCode = this.f235702a.hashCode() * 31;
        String str = this.f235703b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f235704c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
