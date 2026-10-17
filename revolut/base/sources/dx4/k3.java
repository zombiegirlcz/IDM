package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k3 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120653c;
    public final j3 d;

    public k3(String id10, String str, String str2, j3 inputDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(inputDetails, "inputDetails");
        this.f120651a = id10;
        this.f120652b = str;
        this.f120653c = str2;
        this.d = inputDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f120651a, k3Var.f120651a) && Intrinsics.f(this.f120652b, k3Var.f120652b) && Intrinsics.f(this.f120653c, k3Var.f120653c) && Intrinsics.f(this.d, k3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f120651a.hashCode() * 31;
        String str = this.f120652b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120653c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
