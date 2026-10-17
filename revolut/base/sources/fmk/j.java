package fmk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pij.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f136473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Data f136474c;
    public final /* synthetic */ Data d;
    public final /* synthetic */ Data e;
    public final /* synthetic */ Data f;

    public /* synthetic */ j(Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        this.f136472a = i;
        this.f136473b = data;
        this.f136474c = data2;
        this.d = data3;
        this.e = data4;
        this.f = data5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136472a) {
            case 0:
                Data cards = this.f136473b;
                Intrinsics.h(cards);
                Data revPointsUpgradeInfo = this.f136474c;
                Intrinsics.h(revPointsUpgradeInfo);
                Data revPointsOptInState = this.d;
                Intrinsics.h(revPointsOptInState);
                Data kyc2 = this.e;
                Intrinsics.h(kyc2);
                PlanRevPointsCardsScreenContract$RevPointsCardType type = ((f) obj2).f136465a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(revPointsUpgradeInfo, "revPointsUpgradeInfo");
                Data revPointsRate = this.f;
                Intrinsics.checkNotNullParameter(revPointsRate, "revPointsRate");
                Intrinsics.checkNotNullParameter(revPointsOptInState, "revPointsOptInState");
                Intrinsics.checkNotNullParameter(cards, "cards");
                Intrinsics.checkNotNullParameter(kyc2, "kyc");
                return new f(type, revPointsUpgradeInfo, revPointsRate, revPointsOptInState, cards, kyc2);
            case 1:
                return jj9.c.a((jj9.c) obj2, this.f136473b, this.f136474c, this.d, this.e, this.f, null, 32);
            default:
                Data data = this.f136473b;
                Intrinsics.h(data);
                Data data2 = this.f136474c;
                Intrinsics.h(data2);
                return v.a((v) obj2, null, data, data2, null, this.d, this.e, this.f, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097033);
        }
    }
}
