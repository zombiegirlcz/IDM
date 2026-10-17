package c0c;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f20209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f20210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f20211c;
    public final Data d;
    public final Data e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f20212g;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data data, Data data2, Data data3, Data data4, Data data5, LinkedHashSet linkedHashSet, Data data6, int i) {
        if ((i & 1) != 0) {
            data = kVar.f20209a;
        }
        Data revPointsAccountStatus = data;
        if ((i & 2) != 0) {
            data2 = kVar.f20210b;
        }
        Data productItems = data2;
        if ((i & 4) != 0) {
            data3 = kVar.f20211c;
        }
        Data revPointsFeaturedRewards = data3;
        if ((i & 8) != 0) {
            data4 = kVar.d;
        }
        Data redeemHubRewardsForYou = data4;
        if ((i & 16) != 0) {
            data5 = kVar.e;
        }
        Data slotManagerItems = data5;
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = kVar.f;
        }
        Set featuredRewardItemsVisible = set;
        if ((i & 64) != 0) {
            data6 = kVar.f20212g;
        }
        Data legalEntityContext = data6;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(productItems, "productItems");
        Intrinsics.checkNotNullParameter(revPointsFeaturedRewards, "revPointsFeaturedRewards");
        Intrinsics.checkNotNullParameter(redeemHubRewardsForYou, "redeemHubRewardsForYou");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(featuredRewardItemsVisible, "featuredRewardItemsVisible");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new k(revPointsAccountStatus, productItems, revPointsFeaturedRewards, redeemHubRewardsForYou, slotManagerItems, featuredRewardItemsVisible, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f20209a, kVar.f20209a) && Intrinsics.f(this.f20210b, kVar.f20210b) && Intrinsics.f(this.f20211c, kVar.f20211c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f20212g, kVar.f20212g);
    }

    public final int hashCode() {
        return this.f20212g.hashCode() + p.a.f(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f20211c, kii.e.c(this.f20210b, this.f20209a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
    }

    public k(Data revPointsAccountStatus, Data productItems, Data revPointsFeaturedRewards, Data redeemHubRewardsForYou, Data slotManagerItems, Set featuredRewardItemsVisible, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(productItems, "productItems");
        Intrinsics.checkNotNullParameter(revPointsFeaturedRewards, "revPointsFeaturedRewards");
        Intrinsics.checkNotNullParameter(redeemHubRewardsForYou, "redeemHubRewardsForYou");
        Intrinsics.checkNotNullParameter(slotManagerItems, "slotManagerItems");
        Intrinsics.checkNotNullParameter(featuredRewardItemsVisible, "featuredRewardItemsVisible");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f20209a = revPointsAccountStatus;
        this.f20210b = productItems;
        this.f20211c = revPointsFeaturedRewards;
        this.d = redeemHubRewardsForYou;
        this.e = slotManagerItems;
        this.f = featuredRewardItemsVisible;
        this.f20212g = legalEntityContext;
    }

    public k(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), h0.f322473a, new Data(null, null, true, 3, null));
    }
}
