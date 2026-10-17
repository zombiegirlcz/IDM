package kkk;

import hha.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f185110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f185111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185112c;
    public final b0 d;
    public final lha.k e;

    public m(hha.d currentPricingPlan, hha.d invitedPricingPlan, boolean z, b0 gift, lha.k inviter) {
        Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPricingPlan");
        Intrinsics.checkNotNullParameter(invitedPricingPlan, "invitedPricingPlan");
        Intrinsics.checkNotNullParameter(gift, "gift");
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        this.f185110a = currentPricingPlan;
        this.f185111b = invitedPricingPlan;
        this.f185112c = z;
        this.d = gift;
        this.e = inviter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f185110a, mVar.f185110a) && Intrinsics.f(this.f185111b, mVar.f185111b) && this.f185112c == mVar.f185112c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c((this.f185111b.hashCode() + (this.f185110a.hashCode() * 31)) * 31, 31, this.f185112c)) * 31);
    }
}
