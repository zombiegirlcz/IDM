package kkf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.z2 f184903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.c f184904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.m1 f184905c;
    public final a9e.b d;
    public final elf.w0 e;

    public q3(klf.z2 subscriptionDataSource, klf.c blockedMerchantDataSource, klf.m1 juniorDataSource, a9e.b subscriptionsMapper, elf.w0 manageSubscriptionClickHandler) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(blockedMerchantDataSource, "blockedMerchantDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(subscriptionsMapper, "subscriptionsMapper");
        Intrinsics.checkNotNullParameter(manageSubscriptionClickHandler, "manageSubscriptionClickHandler");
        this.f184903a = subscriptionDataSource;
        this.f184904b = blockedMerchantDataSource;
        this.f184905c = juniorDataSource;
        this.d = subscriptionsMapper;
        this.e = manageSubscriptionClickHandler;
    }

    public final cmf.p a() {
        return new cmf.p(ta6.a.h(this.f184903a.a(), (SharedFlow) this.f184904b.e.getValue(), this.f184905c.a(), new b9k.a(4, this, q3.class, "buildBlock", "buildBlock(Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;Lcom/revolut/feature/blocked_merchants/api/model/TransactionBlockedMerchantInfo;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 5)), new i0(16), zhm.u.c(this.e), "ManageSubscription");
    }
}
