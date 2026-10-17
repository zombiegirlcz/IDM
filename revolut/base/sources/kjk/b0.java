package kjk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184422c;

    public b0(String str, String str2, String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f184420a = str;
        this.f184421b = str2;
        this.f184422c = planId;
    }

    public final String a() {
        String str = this.f184420a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f184421b;
        return v1.c.t((str + "|" + (str2 != null ? str2 : "")).hashCode(), "plan_billing_picker_-", this.f184422c, "-");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f184420a, b0Var.f184420a) && Intrinsics.f(this.f184421b, b0Var.f184421b) && Intrinsics.f(this.f184422c, b0Var.f184422c);
    }

    public final int hashCode() {
        String str = this.f184420a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f184421b;
        return this.f184422c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
