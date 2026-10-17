package fmk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanRevPointsCardsScreenContract$RevPointsCardType f136465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f136466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f136467c;
    public final Data d;
    public final Data e;
    public final Data f;

    public f(PlanRevPointsCardsScreenContract$RevPointsCardType type, Data revPointsUpgradeInfo, Data revPointsRate, Data revPointsOptInState, Data cards, Data kyc2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(revPointsUpgradeInfo, "revPointsUpgradeInfo");
        Intrinsics.checkNotNullParameter(revPointsRate, "revPointsRate");
        Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        this.f136465a = type;
        this.f136466b = revPointsUpgradeInfo;
        this.f136467c = revPointsRate;
        this.d = revPointsOptInState;
        this.e = cards;
        this.f = kyc2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136465a, fVar.f136465a) && Intrinsics.f(this.f136466b, fVar.f136466b) && Intrinsics.f(this.f136467c, fVar.f136467c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f136467c, kii.e.c(this.f136466b, this.f136465a.hashCode() * 31, 31), 31), 31), 31);
    }
}
