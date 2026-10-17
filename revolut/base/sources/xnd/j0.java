package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djb.a f307411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pcd.s f307412c;
    public final ynd.j d;

    public j0(String savingsAccountId, djb.a autoPaymentMethods, pcd.s savingsVault, ynd.j extraData) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        Intrinsics.checkNotNullParameter(autoPaymentMethods, "autoPaymentMethods");
        Intrinsics.checkNotNullParameter(savingsVault, "savingsVault");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f307410a = savingsAccountId;
        this.f307411b = autoPaymentMethods;
        this.f307412c = savingsVault;
        this.d = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f307410a, j0Var.f307410a) && Intrinsics.f(this.f307411b, j0Var.f307411b) && Intrinsics.f(this.f307412c, j0Var.f307412c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f307412c.hashCode() + ((this.f307411b.hashCode() + (this.f307410a.hashCode() * 31)) * 31)) * 31);
    }
}
