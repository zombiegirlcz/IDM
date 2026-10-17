package fjd;

import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$UpgradePlanRequest;
import jid.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jid.t f135581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f135582c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ShopsCategory f135583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lk0.g f135584h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f135585j;
    public final ShopsCombinedHomeScreenContract$UpgradePlanRequest k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f135586l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f135587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f135588n;

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 0 == true ? 1 : 0, 16383);
    }

    public static o a(o oVar, Data data, jid.t tVar, Data data2, Data data3, Data data4, Data data5, ShopsCategory shopsCategory, lk0.g gVar, Data data6, boolean z, ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest, Data data7, Data data8, long j2, int i) {
        Data homeLayout = (i & 1) != 0 ? oVar.f135580a : data;
        jid.t userLocation = (i & 2) != 0 ? oVar.f135581b : tVar;
        Data revPointsAccount = (i & 4) != 0 ? oVar.f135582c : data2;
        Data planUpgradeAvailable = (i & 8) != 0 ? oVar.d : data3;
        Data advertisingInfo = (i & 16) != 0 ? oVar.e : data4;
        Data categories = (i & 32) != 0 ? oVar.f : data5;
        ShopsCategory shopsCategory2 = (i & 64) != 0 ? oVar.f135583g : shopsCategory;
        lk0.g gVar2 = (i & 128) != 0 ? oVar.f135584h : gVar;
        Data personalizedSettingsEnabled = (i & 256) != 0 ? oVar.i : data6;
        boolean z3 = (i & 512) != 0 ? oVar.f135585j : z;
        ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest2 = (i & 1024) != 0 ? oVar.k : shopsCombinedHomeScreenContract$UpgradePlanRequest;
        Data plans = (i & 2048) != 0 ? oVar.f135586l : data7;
        Data legalEntityContext = (i & 4096) != 0 ? oVar.f135587m : data8;
        ShopsCategory shopsCategory3 = shopsCategory2;
        lk0.g gVar3 = gVar2;
        long j3 = (i & 8192) != 0 ? oVar.f135588n : j2;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(homeLayout, "homeLayout");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(planUpgradeAvailable, "planUpgradeAvailable");
        Intrinsics.checkNotNullParameter(advertisingInfo, "advertisingInfo");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(personalizedSettingsEnabled, "personalizedSettingsEnabled");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new o(homeLayout, userLocation, revPointsAccount, planUpgradeAvailable, advertisingInfo, categories, shopsCategory3, gVar3, personalizedSettingsEnabled, z3, shopsCombinedHomeScreenContract$UpgradePlanRequest2, plans, legalEntityContext, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f135580a, oVar.f135580a) && Intrinsics.f(this.f135581b, oVar.f135581b) && Intrinsics.f(this.f135582c, oVar.f135582c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f135583g, oVar.f135583g) && Intrinsics.f(this.f135584h, oVar.f135584h) && Intrinsics.f(this.i, oVar.i) && this.f135585j == oVar.f135585j && Intrinsics.f(this.k, oVar.k) && Intrinsics.f(this.f135586l, oVar.f135586l) && Intrinsics.f(this.f135587m, oVar.f135587m) && this.f135588n == oVar.f135588n;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f135582c, (this.f135581b.hashCode() + (this.f135580a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        ShopsCategory shopsCategory = this.f135583g;
        int iHashCode = (iC + (shopsCategory == null ? 0 : shopsCategory.hashCode())) * 31;
        lk0.g gVar = this.f135584h;
        int iC2 = j6.a.c(kii.e.c(this.i, (iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31, 31), 31, this.f135585j);
        ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest = this.k;
        return Long.hashCode(this.f135588n) + kii.e.c(this.f135587m, kii.e.c(this.f135586l, (iC2 + (shopsCombinedHomeScreenContract$UpgradePlanRequest != null ? shopsCombinedHomeScreenContract$UpgradePlanRequest.hashCode() : 0)) * 31, 31), 31);
    }

    public o(Data homeLayout, jid.t userLocation, Data revPointsAccount, Data planUpgradeAvailable, Data advertisingInfo, Data categories, ShopsCategory shopsCategory, lk0.g gVar, Data personalizedSettingsEnabled, boolean z, ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest, Data plans, Data legalEntityContext, long j2) {
        Intrinsics.checkNotNullParameter(homeLayout, "homeLayout");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
        Intrinsics.checkNotNullParameter(planUpgradeAvailable, "planUpgradeAvailable");
        Intrinsics.checkNotNullParameter(advertisingInfo, "advertisingInfo");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(personalizedSettingsEnabled, "personalizedSettingsEnabled");
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f135580a = homeLayout;
        this.f135581b = userLocation;
        this.f135582c = revPointsAccount;
        this.d = planUpgradeAvailable;
        this.e = advertisingInfo;
        this.f = categories;
        this.f135583g = shopsCategory;
        this.f135584h = gVar;
        this.i = personalizedSettingsEnabled;
        this.f135585j = z;
        this.k = shopsCombinedHomeScreenContract$UpgradePlanRequest;
        this.f135586l = plans;
        this.f135587m = legalEntityContext;
        this.f135588n = j2;
    }

    public /* synthetic */ o(Data data, ShopsCategory shopsCategory, int i) {
        this(new Data(null, null, false, 7, null), t.a.f174453a, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), (i & 32) != 0 ? new Data(null, null, false, 7, null) : data, (i & 64) != 0 ? null : shopsCategory, null, new Data(null, null, false, 7, null), false, null, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), 0L);
    }
}
