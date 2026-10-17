package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154926c;

    public o0(String selectedPlanId, String str, String str2) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        this.f154924a = selectedPlanId;
        this.f154925b = str;
        this.f154926c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f154924a, o0Var.f154924a) && Intrinsics.f(this.f154925b, o0Var.f154925b) && Intrinsics.f(this.f154926c, o0Var.f154926c);
    }

    public final int hashCode() {
        int iHashCode = this.f154924a.hashCode() * 31;
        String str = this.f154925b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154926c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
