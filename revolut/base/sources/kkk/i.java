package kkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f185101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f185102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f185103c;
    public final Data d;
    public final Data e;

    public i(Data pricingPlan, Data invitationInfo, Data benefitsSuggestions, Data insuranceAvailability, Data subscription) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(invitationInfo, "invitationInfo");
        Intrinsics.checkNotNullParameter(benefitsSuggestions, "benefitsSuggestions");
        Intrinsics.checkNotNullParameter(insuranceAvailability, "insuranceAvailability");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f185101a = pricingPlan;
        this.f185102b = invitationInfo;
        this.f185103c = benefitsSuggestions;
        this.d = insuranceAvailability;
        this.e = subscription;
    }

    public static i a(i iVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = iVar.f185101a;
        }
        Data pricingPlan = data;
        if ((i & 2) != 0) {
            data2 = iVar.f185102b;
        }
        Data invitationInfo = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f185103c;
        }
        Data benefitsSuggestions = data3;
        if ((i & 8) != 0) {
            data4 = iVar.d;
        }
        Data insuranceAvailability = data4;
        if ((i & 16) != 0) {
            data5 = iVar.e;
        }
        Data subscription = data5;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(invitationInfo, "invitationInfo");
        Intrinsics.checkNotNullParameter(benefitsSuggestions, "benefitsSuggestions");
        Intrinsics.checkNotNullParameter(insuranceAvailability, "insuranceAvailability");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return new i(pricingPlan, invitationInfo, benefitsSuggestions, insuranceAvailability, subscription);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f185101a, iVar.f185101a) && Intrinsics.f(this.f185102b, iVar.f185102b) && Intrinsics.f(this.f185103c, iVar.f185103c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f185103c, kii.e.c(this.f185102b, this.f185101a.hashCode() * 31, 31), 31), 31);
    }
}
