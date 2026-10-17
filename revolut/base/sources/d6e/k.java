package d6e;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5e.c f111513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5e.c f111514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5e.c f111515c;
    public final z5e.c d;
    public final z5e.c e;
    public final z5e.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z5e.c f111516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z5e.c f111517h;
    public final z5e.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z5e.c f111518j;
    public final f01.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y91.b f111519l;

    public k(z5e.c personalDataSource, z5e.c groupDataSource, z5e.c planCashbackDataSource, z5e.c revPointsDataSource, z5e.c proDataSource, z5e.c proTaxDataSource, z5e.c jointDataSource, z5e.c juniorDataSource, z5e.c teenDataSource, z5e.c collateralDataSource, f01.c uiKitResources, y91.b accountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(personalDataSource, "personalDataSource");
        Intrinsics.checkNotNullParameter(groupDataSource, "groupDataSource");
        Intrinsics.checkNotNullParameter(planCashbackDataSource, "planCashbackDataSource");
        Intrinsics.checkNotNullParameter(revPointsDataSource, "revPointsDataSource");
        Intrinsics.checkNotNullParameter(proDataSource, "proDataSource");
        Intrinsics.checkNotNullParameter(proTaxDataSource, "proTaxDataSource");
        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(teenDataSource, "teenDataSource");
        Intrinsics.checkNotNullParameter(collateralDataSource, "collateralDataSource");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        this.f111513a = personalDataSource;
        this.f111514b = groupDataSource;
        this.f111515c = planCashbackDataSource;
        this.d = revPointsDataSource;
        this.e = proDataSource;
        this.f = proTaxDataSource;
        this.f111516g = jointDataSource;
        this.f111517h = juniorDataSource;
        this.i = teenDataSource;
        this.f111518j = collateralDataSource;
        this.k = uiKitResources;
        this.f111519l = accountsProductFeatureChecker;
    }

    public static v1 c(Flow flow, Function0 function0) {
        return new v1(new cuc.c(function0, flow, (Continuation) null));
    }

    public static y d(Flow flow, String str) {
        return rd0.e.e(flow, m72.b.w("subaccountType", str), new c9k.k(3, 11, null));
    }

    public final cyh.f a(ProductSpaceIdentifier productSpaceIdentifier, sfe.a aVar) {
        Flow flowF = this.f111513a.f(productSpaceIdentifier, aVar);
        y91.b bVar = this.f111519l;
        return new cyh.f(yh5.b.h(d(c(flowF, new a76.c(0, bVar, y91.b.class, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z", 0, 5)), "personalDataSource"), d(c(this.f111514b.f(productSpaceIdentifier, aVar), new a76.c(0, bVar, y91.b.class, "groupPocketFeatureIsEnabled", "groupPocketFeatureIsEnabled()Z", 0, 6)), "groupDataSource"), d(this.f111515c.f(productSpaceIdentifier, aVar), "planCashbackDataSource"), d(this.d.f(productSpaceIdentifier, aVar), "revPointsDataSource"), d(this.f111518j.f(productSpaceIdentifier, aVar), "collateralDataSource")), 1);
    }

    public final ax9.o b(ProductSpaceIdentifier productSpaceIdentifier, sfe.a aVar) {
        Flow flowF = this.e.f(productSpaceIdentifier, aVar);
        y91.b bVar = this.f111519l;
        return new ax9.o(yh5.b.d(d(c(flowF, new a76.c(0, bVar, y91.b.class, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z", 0, 7)), "proDataSource"), d(c(this.f.f(productSpaceIdentifier, aVar), new a76.c(0, bVar, y91.b.class, "personalPocketFeatureIsEnabled", "personalPocketFeatureIsEnabled()Z", 0, 8)), "proTaxDataSource")), 5);
    }
}
