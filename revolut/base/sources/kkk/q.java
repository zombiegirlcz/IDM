package kkk;

import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lha.j f185116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggk.k f185117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f185118c;
    public final InsuranceDocumentsAvailability d;

    public q(lha.j invitationInfo, ggk.k benefits, hha.d pricingPlan, InsuranceDocumentsAvailability insuranceAvailability) {
        Intrinsics.checkNotNullParameter(invitationInfo, "invitationInfo");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(insuranceAvailability, "insuranceAvailability");
        this.f185116a = invitationInfo;
        this.f185117b = benefits;
        this.f185118c = pricingPlan;
        this.d = insuranceAvailability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f185116a, qVar.f185116a) && Intrinsics.f(this.f185117b, qVar.f185117b) && Intrinsics.f(this.f185118c, qVar.f185118c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f185118c.hashCode() + ((this.f185117b.hashCode() + (this.f185116a.hashCode() * 31)) * 31)) * 31);
    }
}
