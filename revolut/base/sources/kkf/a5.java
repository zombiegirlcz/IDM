package kkf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.z2 f184596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.w0 f184598c;
    public final vlf.b d;
    public final a9e.b e;

    public a5(klf.z2 subscriptionDataSource, klf.m1 juniorDataSource, elf.w0 manageSubscriptionClickHandler, vlf.b commonUiMapper, a9e.b commonSubscriptionContentMapper) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(manageSubscriptionClickHandler, "manageSubscriptionClickHandler");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(commonSubscriptionContentMapper, "commonSubscriptionContentMapper");
        this.f184596a = subscriptionDataSource;
        this.f184597b = juniorDataSource;
        this.f184598c = manageSubscriptionClickHandler;
        this.d = commonUiMapper;
        this.e = commonSubscriptionContentMapper;
    }

    public final cmf.p a() {
        return new cmf.p(new t38.e((SharedFlow) this.f184596a.f185624h.getValue(), 24, this.f184597b.a(), new ael.l0(3, this, a5.class, "buildBlock", "buildBlock(Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 18)), new i0(26), zhm.u.c(this.f184598c), "RecurringTransfer");
    }
}
