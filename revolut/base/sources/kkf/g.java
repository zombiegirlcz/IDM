package kkf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.z2 f184689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.c f184690c;
    public final nr2.d d;
    public final a9e.b e;
    public final thf.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final elf.m f184691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final klf.m1 f184692h;

    public g(klf.h0 commonDataSource, klf.z2 subscriptionDataSource, klf.c blockedMerchantDataSource, nr2.d blockedMerchantWidgetProvider, a9e.b subscriptionsMapper, thf.m transactionTextResourcesMapper, elf.m blockedSubscriptionOrMerchantClickHandler, klf.m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(blockedMerchantDataSource, "blockedMerchantDataSource");
        Intrinsics.checkNotNullParameter(blockedMerchantWidgetProvider, "blockedMerchantWidgetProvider");
        Intrinsics.checkNotNullParameter(subscriptionsMapper, "subscriptionsMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(blockedSubscriptionOrMerchantClickHandler, "blockedSubscriptionOrMerchantClickHandler");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f184688a = commonDataSource;
        this.f184689b = subscriptionDataSource;
        this.f184690c = blockedMerchantDataSource;
        this.d = blockedMerchantWidgetProvider;
        this.e = subscriptionsMapper;
        this.f = transactionTextResourcesMapper;
        this.f184691g = blockedSubscriptionOrMerchantClickHandler;
        this.f184692h = juniorDataSource;
    }

    public final cmf.p a() {
        SharedFlow sharedFlowD = this.f184688a.d();
        klf.m1 m1Var = this.f184692h;
        return new cmf.p(ta6.a.e(sharedFlowD, (SharedFlow) m1Var.f185532g.getValue(), m1Var.a(), (SharedFlow) this.f184690c.e.getValue(), this.f184689b.a(), new f(6, this, g.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/junior_profile/api/models/JuniorBankingProfile;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;Lcom/revolut/feature/blocked_merchants/api/model/TransactionBlockedMerchantInfo;Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;)Ljava/util/List;", 4, 0)), new ka9.b(24), zhm.u.c(this.f184691g), "BlockedSubscriptionOrMerchant");
    }
}
