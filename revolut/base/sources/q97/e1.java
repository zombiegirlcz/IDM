package q97;

import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.insurance_home.api.navigation.InsuranceHomeDestinations$Home;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e1 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9g.g f243677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a61.a f243678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tvi.a f243679c;
    public final cti.a d;
    public final puf.a e;
    public final f39.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f243680g;

    public e1(t97.c productCellProvider, p9g.g staysFeatureEntryPointCommandFactory, a61.a experiencesFeatureLauncher, tvi.a airportLoungesCommandProvider, cti.a asftHomeCommandProvider, puf.a navigationProvider, f39.c lifestyleFeaturesProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(staysFeatureEntryPointCommandFactory, "staysFeatureEntryPointCommandFactory");
        Intrinsics.checkNotNullParameter(experiencesFeatureLauncher, "experiencesFeatureLauncher");
        Intrinsics.checkNotNullParameter(airportLoungesCommandProvider, "airportLoungesCommandProvider");
        Intrinsics.checkNotNullParameter(asftHomeCommandProvider, "asftHomeCommandProvider");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(lifestyleFeaturesProvider, "lifestyleFeaturesProvider");
        this.f243677a = staysFeatureEntryPointCommandFactory;
        this.f243678b = experiencesFeatureLauncher;
        this.f243679c = airportLoungesCommandProvider;
        this.d = asftHomeCommandProvider;
        this.e = navigationProvider;
        this.f = lifestyleFeaturesProvider;
        this.f243680g = zhm.v.k(new Pair(b39.d.STAYS, t97.d.STAYS), new Pair(b39.d.DONATIONS, t97.d.DONATIONS), new Pair(b39.d.INSURANCE, t97.d.INSURANCE), new Pair(b39.d.SHOPS, t97.d.ONLINE_SHOPS), new Pair(b39.d.EXPERIENCES, t97.d.EXPERIENCE), new Pair(b39.d.LOUNGES, t97.d.LOUNGES), new Pair(b39.d.AIRPORT_SECURITY_FAST_TRACK, t97.d.AIRPORT_SECURITY_FAST_TRACK), new Pair(b39.d.REV_POINTS_GIFT_CARDS, t97.d.REV_POINTS_GIFT_CARDS), new Pair(b39.d.TRANSPORT, t97.d.TRANSPORT), new Pair(b39.d.REV_POINTS, t97.d.REV_POINTS));
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.STAYS || id10 == t97.d.DONATIONS || id10 == t97.d.INSURANCE || id10 == t97.d.ONLINE_SHOPS || id10 == t97.d.EXPERIENCE || id10 == t97.d.LOUNGES || id10 == t97.d.AIRPORT_SECURITY_FAST_TRACK || id10 == t97.d.REV_POINTS || id10 == t97.d.REV_POINTS_GIFT_CARDS || id10 == t97.d.TRANSPORT;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r map = ue0.e.E(m70.a.g(rd0.e.c(vkm.q.q(this.f.a()), kotlin.coroutines.g.f186406a), null, null, 3), zhm.f0.f322471a).map(new j0(new q56.o(this, 18), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.STAYS) {
            ufm.i iVar = new ufm.i(this.f243677a.a(), new j0(new h(25), 21), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        Continuation continuation = null;
        if (bVar == t97.d.DONATIONS) {
            ufm.b bVarM = efm.d0.m(new o97.d(new DonationsKompotFeatureConfig.CharitiesOverviewDestination(null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (bVar == t97.d.INSURANCE) {
            ufm.b bVarM2 = efm.d0.m(new o97.d(InsuranceHomeDestinations$Home.f76154a));
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        if (bVar == t97.d.ONLINE_SHOPS) {
            ufm.b bVarM3 = efm.d0.m(new o97.d(new ShopsFeatureConfig.Home.Destination((String) null, 3)));
            Intrinsics.checkNotNullExpressionValue(bVarM3, "just(...)");
            return bVarM3;
        }
        if (bVar == t97.d.EXPERIENCE) {
            ufm.i iVar2 = new ufm.i(this.f243678b.E(new FeatureCommand(TravelExperiencesFeatureConfig.ExperiencesHome.f92931g)), new j0(new h(26), 22), 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            return iVar2;
        }
        if (bVar == t97.d.LOUNGES) {
            ufm.i iVar3 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new fo1.b0((fwi.a) this.f243679c, continuation, 7)), new j0(new h(27), 23), 1);
            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
            return iVar3;
        }
        if (bVar == t97.d.AIRPORT_SECURITY_FAST_TRACK) {
            ufm.i iVar4 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new nt4.f((nti.a) this.d, continuation, 2)), new j0(new h(28), 24), 1);
            Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
            return iVar4;
        }
        if (bVar == t97.d.REV_POINTS_GIFT_CARDS) {
            ufm.b bVarM4 = efm.d0.m(new o97.d(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsHome(0), null)));
            Intrinsics.checkNotNullExpressionValue(bVarM4, "just(...)");
            return bVarM4;
        }
        if (bVar == t97.d.TRANSPORT) {
            ufm.i iVar5 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new d1(this, null)), new j0(new h(29), 25), 1);
            Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
            return iVar5;
        }
        if (bVar != t97.d.REV_POINTS) {
            throw new IllegalStateException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        ufm.b bVarM5 = efm.d0.m(new o97.l(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.e.f83420a, null), null, null, 6)))));
        Intrinsics.checkNotNullExpressionValue(bVarM5, "just(...)");
        return bVarM5;
    }
}
