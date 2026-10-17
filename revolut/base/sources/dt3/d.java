package dt3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117359c;
    public final a d;

    public d(String pricingPlanId, String str, String str2, a creditCardPostRetailOnboarding) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboarding, "creditCardPostRetailOnboarding");
        this.f117357a = pricingPlanId;
        this.f117358b = str;
        this.f117359c = str2;
        this.d = creditCardPostRetailOnboarding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f117357a, dVar.f117357a) && Intrinsics.f(this.f117358b, dVar.f117358b) && Intrinsics.f(this.f117359c, dVar.f117359c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f117357a.hashCode() * 31;
        String str = this.f117358b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117359c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
