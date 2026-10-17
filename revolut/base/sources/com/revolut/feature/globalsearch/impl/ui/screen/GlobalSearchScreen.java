package com.revolut.feature.globalsearch.impl.ui.screen;

import aii.q;
import akm.c;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.l8;
import aw0.o9;
import blh.n0;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RewardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileAssetViewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.ch;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.delegates.yg;
import com.revolut.core.ui_kit.delegates.zg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.tracking.v3.GlobalSearchSessionContext;
import dli.a;
import g48.r0;
import ihm.f;
import ip0.um0;
import java.util.List;
import jh.d;
import jii.m;
import k50.b2;
import kcg.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l97.e;
import l97.g;
import l97.i;
import l97.k0;
import l97.n;
import l97.r;
import no.k;
import qd0.b;
import skm.a2;
import te0.w;
import tjf.q0;
import vc.s;
import vea.m0;
import vea.p0;
import vea.s0;
import vkm.j2;
import xv0.x;
import yp0.y;
import zhm.v;
import zkh.t0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/globalsearch/impl/ui/screen/GlobalSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll97/i;", "Lno/k;", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalSearchScreen extends ViewController<q> implements a, k {
    public static final /* synthetic */ KProperty[] B0 = {o0.f186429a.j(new h0(GlobalSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public j60.a A0;
    public final int K;
    public AnalyticsContext L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final f Q;
    public final f R;
    public final RowDelegate S;
    public final SmallCardDelegate T;
    public final ListSubheaderDelegate U;
    public final AccountCellItemDelegate V;
    public final ActionsDelegate W;
    public final ScrollerDelegate X;
    public final ReferralContactDelegate Y;
    public final ScrollerBoxDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SwipeToActionDelegate f74619a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f74620b0;
    public final NewsDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ReferralContactDelegate f74621d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final IconDelegate f74622e0;
    public final GridBoxDelegate f0;
    public final LargeActionButtonDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f74623h0;
    public final TextDelegate i0;
    public final SmartTileExchangeLoadingDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final SmartTileExchangeDelegate f74624k0;
    public final SmartTileSendMoneyLoadingDelegate l0;
    public final SmartTileSendMoneyDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final SmartTileAssetViewLoadingDelegate f74625n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final SmartTileAssetViewDelegate f74626o0;
    public final EsimDelegate p0;
    public final EsimDetailsDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RewardsGridDelegate f74627r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final h f74628s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f74629t0;
    public String u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public r f74630v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public r f74631w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f74632x0;
    public a2 y0;
    public b z0;

    public GlobalSearchScreen(GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l97.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193050b;

            {
                this.f193050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GlobalSearchScreen globalSearchScreen = this.f193050b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        g97.b bVar = (g97.b) ((m97.c) globalSearchScreen.N.getValue());
                        GlobalSearchContext globalSearchContext = bVar.f141467a;
                        g97.a aVar = bVar.f141468b;
                        g97.d dVar = aVar.f141465c;
                        b97.f fVar = (b97.f) dVar.k.get();
                        vc.s.j(fVar);
                        xn.b bVarA = aVar.d.a();
                        i97.d dVar2 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar2);
                        i97.d dVar3 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar3);
                        l80.h hVarV = aVar.f141463a.v();
                        vc.s.j(hVarV);
                        jul.o oVar = new jul.o(dVar3, hVarV);
                        wli.x xVarD = ((s41.a) aVar.e).d();
                        j60.a aVar2 = (j60.a) bVar.o.get();
                        gte.a aVarB = aVar.f.b();
                        vc.s.j(aVarB);
                        i97.a aVar3 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar3);
                        z87.g gVar = (z87.g) bVar.f141478r.get();
                        z87.b globalSearchContentApi = aVar.f141464b;
                        pp.a aVar4 = (pp.a) globalSearchContentApi;
                        ImmutableMap immutableMapOf = ImmutableMap.of("EXCHANGE", aVar4.F1, "PAYMENT", aVar4.G1, "ASSET", aVar4.H1, "CRYPTO_ASSET", aVar4.I1);
                        vc.s.j(immutableMapOf);
                        i97.l lVar = (i97.l) dVar.f141489n.get();
                        vc.s.j(lVar);
                        n97.k smartTileSearchSource = new n97.k(immutableMapOf, lVar);
                        i97.a aVar5 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar5);
                        k97.d recentQueriesSearchSource = new k97.d(aVar5);
                        m97.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(globalSearchContentApi, "globalSearchContentApi");
                        Intrinsics.checkNotNullParameter(smartTileSearchSource, "smartTileSearchSource");
                        Intrinsics.checkNotNullParameter(recentQueriesSearchSource, "recentQueriesSearchSource");
                        aim.f builder = new aim.f();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(64);
                        o97.r rVar = o97.r.POCKETS;
                        c6e.a aVar6 = (c6e.a) aVar4.f238058a;
                        pfe.g aggregator = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator);
                        r6e.o oVar2 = aVar4.f238060b;
                        g6e.g navigationProvider = oVar2.a();
                        vc.s.j(navigationProvider);
                        b7e.a aVar7 = aVar4.f238063c;
                        z5e.c jointDataSource = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource);
                        e48.a aVar8 = aVar4.d;
                        r0 jointAccountsInteractor = aVar8.c();
                        pqi.a aVar9 = aVar4.e;
                        f01.c uiKitResources = aVar9.g();
                        ta7.a aVar10 = aVar4.f;
                        wa7.m hiddenAccountsInteractor = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
                        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
                        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar, new d6e.r(aggregator, jointDataSource, jointAccountsInteractor, navigationProvider, uiKitResources, d6e.l.PERSONAL, hiddenAccountsInteractor));
                        o97.r rVar2 = o97.r.JOINT_POCKETS;
                        pfe.g aggregator2 = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator2);
                        z5e.c jointDataSource2 = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource2);
                        r0 jointAccountsInteractor2 = aVar8.c();
                        g6e.g navigationProvider2 = oVar2.a();
                        vc.s.j(navigationProvider2);
                        f01.c uiKitResources2 = aVar9.g();
                        wa7.m hiddenAccountsInteractor2 = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator2, "aggregator");
                        Intrinsics.checkNotNullParameter(jointDataSource2, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor2, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(navigationProvider2, "navigationProvider");
                        Intrinsics.checkNotNullParameter(uiKitResources2, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor2, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar2, new d6e.r(aggregator2, jointDataSource2, jointAccountsInteractor2, navigationProvider2, uiKitResources2, d6e.l.JOINT, hiddenAccountsInteractor2));
                        o97.r rVar3 = o97.r.JOINT_SAVINGS;
                        djb.n savingsAccountsDetailsInteractor = aVar4.f238070g.a();
                        vc.s.j(savingsAccountsDetailsInteractor);
                        iob.c savingsAccountMapper = ((blb.e) aVar4.f238072h).c();
                        f01.c uiKitResources3 = aVar9.g();
                        ite.a aVar11 = aVar4.i;
                        gte.a featureToggleInteractor = aVar11.b();
                        vc.s.j(featureToggleInteractor);
                        bpj.a aVar12 = aVar4.f238076j;
                        xoj.a featuresInteractor = aVar12.a();
                        vc.s.j(featuresInteractor);
                        wa7.m hiddenAccountsInteractor3 = aVar10.i();
                        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
                        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
                        Intrinsics.checkNotNullParameter(uiKitResources3, "uiKitResources");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor3, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar3, new kob.h(kob.d.Joint, savingsAccountsDetailsInteractor, savingsAccountMapper, uiKitResources3, featureToggleInteractor, featuresInteractor, hiddenAccountsInteractor3));
                        o97.r rVar4 = o97.r.TRANSFER_VENDORS;
                        g3k.a aVar13 = (g3k.a) aVar4.k.f232493x.get();
                        vc.s.j(aVar13);
                        r10.t tVar = new r10.t(aVar13, aVar4.f238080l.a());
                        w2k.a subtitleMapper = new w2k.a();
                        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
                        b4k.d searchSource = new b4k.d(tVar, new b4k.b());
                        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
                        builderBuilderWithExpectedSize.put(rVar4, searchSource);
                        builderBuilderWithExpectedSize.put(o97.r.ASK_AIR, new k5l.a(((h30.n) aVar4.f238082m).t()));
                        o97.r rVar5 = o97.r.YOUR_FIAT_ACCOUNTS;
                        l70.e eVar = aVar4.f238083n;
                        t70.g gVarO = eVar.o();
                        vc.s.j(gVarO);
                        builderBuilderWithExpectedSize.put(rVar5, new vea.d0(gVarO, aVar4.d()));
                        o97.r rVar6 = o97.r.FIAT_ACCOUNTS;
                        t70.g gVarO2 = eVar.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.put(rVar6, new p0(gVarO2, aVar4.a()));
                        o97.r rVar7 = o97.r.TRANSACTIONS;
                        djf.c cVar = aVar4.f238108y;
                        thf.l lVarF = cVar.f();
                        vc.s.j(lVarF);
                        kjf.a aVar14 = aVar4.z;
                        tjf.l0 l0VarA = aVar14.a();
                        vjf.a aVar15 = aVar4.A;
                        ujf.h hVarA = aVar15.a();
                        mhf.j jVarE = ((bjf.a) aVar4.B).e();
                        vc.s.j(jVarE);
                        f01.c cVarG = aVar9.g();
                        aoi.c cVarA = aoi.f.a();
                        com.revolut.analytics.tracking.v3.d dVarF = aVar4.C.f();
                        vc.s.j(dVarF);
                        builderBuilderWithExpectedSize.put(rVar7, new q0(lVarF, l0VarA, hVarA, jVarE, cVarG, cVarA, dVarF));
                        o97.r rVar8 = o97.r.JOINT_TRANSACTIONS;
                        r0 r0VarC = aVar8.c();
                        usg.a aVar16 = aVar4.o;
                        wsg.n nVarB = aVar16.b();
                        thf.l lVarF2 = cVar.f();
                        vc.s.j(lVarF2);
                        builderBuilderWithExpectedSize.put(rVar8, new tjf.j(r0VarC, nVarB, lVarF2, aVar14.a(), aVar15.a(), aVar9.g()));
                        builderBuilderWithExpectedSize.put(o97.r.FIAT_CURRENCIES_RECENT_TRANSACTIONS, new tjf.v(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.LINKED_ACCOUNTS_RECENT_TRANSACTIONS, new tjf.z(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.CRYPTO_RECENT_TRANSACTIONS, new tjf.r(aVar14.a(), vd0.d.a()));
                        builderBuilderWithExpectedSize.put(o97.r.PAYMENTS_RECENT_TRANSACTIONS, new tjf.d0(aVar14.a()));
                        o97.r rVar9 = o97.r.WEALTH_ASSETS_ORDERS;
                        mkh.s sVar = (mkh.s) aVar4.D;
                        ite.a aVar17 = sVar.f206400a;
                        gte.a aVarB2 = aVar17.b();
                        vc.s.j(aVarB2);
                        fsl.m mVarB = sVar.u.b();
                        vc.s.j(mVarB);
                        ktl.a aVar18 = sVar.v;
                        htl.l lVar2 = new htl.l();
                        pqi.a aVar19 = sVar.f206415l;
                        builderBuilderWithExpectedSize.put(rVar9, new zkh.p(aVarB2, mVarB, lVar2, new zkh.n(aVar19.g()), new ugc.a(aVar18.a())));
                        o97.r rVar10 = o97.r.WEALTH_STOCKS_IPO;
                        f01.c cVarG2 = aVar19.g();
                        gte.a aVarB3 = aVar17.b();
                        vc.s.j(aVarB3);
                        h9h.a aVar20 = sVar.d;
                        tzg.m mVarT = aVar20.t();
                        vc.s.j(mVarT);
                        zdl.c cVar2 = sVar.f206413j;
                        ybl.b bVarB = cVar2.b();
                        vc.s.j(bVarB);
                        clh.q headerBuilder = new clh.q();
                        clh.a headerVariantTransformer = new clh.a();
                        nbh.a instrumentImageProvider = new nbh.a();
                        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                        clh.f instrumentSearchItemBuilder = new clh.f();
                        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer, "headerVariantTransformer");
                        Intrinsics.checkNotNullParameter(instrumentSearchItemBuilder, "instrumentSearchItemBuilder");
                        clh.h hVar = new clh.h();
                        c4f.a aVar21 = sVar.e;
                        builderBuilderWithExpectedSize.put(rVar10, new blh.k0(cVarG2, aVarB3, mVarT, bVarB, hVar, aVar21.a(), cVar2.c()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_STOCKS, new n0(aVar19.g(), sVar.f(), new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS, new blh.b0(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar11 = o97.r.WEALTH_STOCKS_ALL;
                        f01.c cVarG3 = aVar19.g();
                        blh.i iVarF = sVar.f();
                        nlh.b bVarA2 = sVar.f206417n.a();
                        vc.s.j(bVarA2);
                        builderBuilderWithExpectedSize.put(rVar11, new blh.q(cVarG3, iVarF, bVarA2, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS_ALL, new blh.n(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar12 = o97.r.WEALTH_BONDS;
                        f01.c cVarG4 = aVar19.g();
                        blh.i iVarF2 = sVar.f();
                        zdl.f fVar2 = sVar.f;
                        ybl.i iVarB = fVar2.b();
                        vc.s.j(iVarB);
                        builderBuilderWithExpectedSize.put(rVar12, new blh.s(cVarG4, iVarF2, iVarB, new blh.j()));
                        o97.r rVar13 = o97.r.WEALTH_FUNDS;
                        f01.c cVarG5 = aVar19.g();
                        blh.i iVarF3 = sVar.f();
                        b4f.b bVarA3 = aVar21.a();
                        ybl.b bVarB2 = cVar2.b();
                        vc.s.j(bVarB2);
                        blh.j jVar = new blh.j();
                        ybl.i iVarB2 = fVar2.b();
                        vc.s.j(iVarB2);
                        builderBuilderWithExpectedSize.put(rVar13, new blh.f0(cVarG5, iVarF3, bVarA3, bVarB2, jVar, iVarB2));
                        o97.r rVar14 = o97.r.WEALTH_MUTUAL_FUNDS;
                        f01.c cVarG6 = aVar19.g();
                        blh.i iVarF4 = sVar.f();
                        ybl.i iVarB3 = fVar2.b();
                        vc.s.j(iVarB3);
                        builderBuilderWithExpectedSize.put(rVar14, new blh.i0(cVarG6, iVarF4, iVarB3, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_CFDS, new blh.u(aVar19.g(), sVar.f(), new blh.j()));
                        o97.r rVar15 = o97.r.WEALTH_INDEXES;
                        f01.c cVarG7 = aVar19.g();
                        y77.i iVar = (y77.i) sVar.o;
                        jpf.a aVarB4 = iVar.b();
                        l77.a aVar22 = (l77.a) iVar.u.get();
                        vc.s.j(aVar22);
                        y87.a marketAssetsMapper = (y87.a) iVar.f311417r.get();
                        vc.s.j(marketAssetsMapper);
                        clh.q searchHeaderBuilder = new clh.q();
                        clh.a headerVariantTransformer2 = new clh.a();
                        Intrinsics.checkNotNullParameter(marketAssetsMapper, "marketAssetsMapper");
                        Intrinsics.checkNotNullParameter(searchHeaderBuilder, "searchHeaderBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer2, "headerVariantTransformer");
                        builderBuilderWithExpectedSize.put(rVar15, new alh.d(cVarG7, aVarB4, aVar22, new clh.b(), aVar21.a()));
                        o97.r rVar16 = o97.r.WEALTH_COMMODITIES;
                        o7.d dVar4 = new o7.d(sVar.b(), new t5d.d());
                        tzg.m mVarT2 = aVar20.t();
                        vc.s.j(mVarT2);
                        builderBuilderWithExpectedSize.put(rVar16, new blh.x(dVar4, mVarT2, (nih.a) sVar.u0.get()));
                        o97.r rVar17 = o97.r.WEALTH_COMMODITIES_ALL;
                        jbh.e performanceAssetMapper = aVar20.C();
                        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
                        zkh.l lVar3 = new zkh.l();
                        tzg.m mVarT3 = aVar20.t();
                        vc.s.j(mVarT3);
                        builderBuilderWithExpectedSize.put(rVar17, new zkh.m(lVar3, mVarT3, (nih.a) sVar.u0.get(), aVar19.g()));
                        o97.r rVar18 = o97.r.WEALTH_INSTRUMENTS_MOST_TRADED;
                        q9h.c cVar3 = (q9h.c) sVar.f206423r0.get();
                        jbh.e eVarC = aVar20.C();
                        gte.a aVarB5 = aVar17.b();
                        vc.s.j(aVarB5);
                        builderBuilderWithExpectedSize.put(rVar18, new zkh.x(cVar3, eVarC, aVarB5));
                        o97.r rVar19 = o97.r.WEALTH_DISCLAIMER;
                        tzg.m mVarT4 = aVar20.t();
                        vc.s.j(mVarT4);
                        u8h.b bVar2 = (u8h.b) sVar.i;
                        z0h.d dVarC = bVar2.c();
                        vc.s.j(dVarC);
                        z0h.a aVarB6 = bVar2.b();
                        vc.s.j(aVarB6);
                        builderBuilderWithExpectedSize.put(rVar19, new zkh.r(mVarT4, dVarC, aVarB6, (lih.a) sVar.q0.get()));
                        o97.r rVar20 = o97.r.WEALTH_STOCKS_MOST_OWNED;
                        t9h.a aVar23 = (t9h.a) sVar.f206425s0.get();
                        jbh.e eVarC2 = aVar20.C();
                        f01.c cVarG8 = aVar19.g();
                        t5d.d dVar5 = new t5d.d();
                        gte.a aVarB7 = aVar17.b();
                        vc.s.j(aVarB7);
                        whl.f fVar3 = sVar.f206422r;
                        builderBuilderWithExpectedSize.put(rVar20, new zkh.i0(aVar23, eVarC2, cVarG8, dVar5, aVarB7, fVar3.e()));
                        o97.r rVar21 = o97.r.WEALTH_ETFS_MOST_OWNED;
                        gte.a aVarB8 = aVar17.b();
                        vc.s.j(aVarB8);
                        builderBuilderWithExpectedSize.put(rVar21, new zkh.d0(aVarB8, (t9h.a) sVar.f206425s0.get(), aVar20.C(), aVar20.f(), aVar19.g(), fVar3.e()));
                        o97.r rVar22 = o97.r.WEALTH_ASSETS_RECENTLY_VIEWED;
                        dlh.a recentlyViewedMapper = new dlh.a(aVar20.C());
                        zkh.l0 recentlyViewedSearchDataProvider = sVar.l();
                        r39.a performanceAssetDestinationProvider = new r39.a(new g9h.c());
                        t0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(recentlyViewedMapper, "recentlyViewedMapper");
                        Intrinsics.checkNotNullParameter(recentlyViewedSearchDataProvider, "recentlyViewedSearchDataProvider");
                        Intrinsics.checkNotNullParameter(performanceAssetDestinationProvider, "performanceAssetDestinationProvider");
                        builderBuilderWithExpectedSize.put(rVar22, new zkh.o0(recentlyViewedMapper, recentlyViewedSearchDataProvider, performanceAssetDestinationProvider));
                        o97.r rVar23 = o97.r.WEALTH_STOCKS_SCREENER;
                        elh.a aVar24 = new elh.a();
                        tzg.m mVarT5 = aVar20.t();
                        vc.s.j(mVarT5);
                        builderBuilderWithExpectedSize.put(rVar23, new elh.c(aVar24, mVarT5, aVar19.g()));
                        o97.r rVar24 = o97.r.TRADING_HOLDINGS;
                        x8h.k kVarD = aVar20.d();
                        ael.t tVarF = cVar2.f();
                        vc.s.j(tVarF);
                        ybl.k kVarD2 = fVar2.d();
                        vc.s.j(kVarD2);
                        zkh.h hVar2 = new zkh.h(kVarD, tVarF, kVarD2, new ufl.b(new tfl.a()), new t5d.d());
                        f01.c cVarG9 = aVar19.g();
                        ybl.i iVarB4 = fVar2.b();
                        vc.s.j(iVarB4);
                        builderBuilderWithExpectedSize.put(rVar24, new zkh.v(hVar2, cVarG9, iVarB4, aVar21.a()));
                        o97.r rVar25 = o97.r.TRADING_TRANSACTIONS;
                        x8h.q qVarA = aVar20.A();
                        yah.a aVar25 = sVar.f206416m;
                        f1h.e eVar2 = (f1h.e) aVar25.f312023c.get();
                        vc.s.j(eVar2);
                        builderBuilderWithExpectedSize.put(rVar25, new zkh.r0(qVarA, eVar2, aVar25.b()));
                        o97.r rVar26 = o97.r.JUNIOR_KIDS_RECENT_TRANSACTIONS;
                        wsg.n nVarB2 = aVar16.b();
                        hj8.a aVarA = aVar4.E.a();
                        vc.s.j(aVarA);
                        te8.a0 a0Var = (te8.a0) aVar4.F.f262160y.get();
                        vc.s.j(a0Var);
                        thf.g gVarE = cVar.e();
                        vc.s.j(gVarE);
                        tjf.l0 l0VarA2 = aVar14.a();
                        ila.b bVar3 = aVar4.G;
                        builderBuilderWithExpectedSize.put(rVar26, new k5l.j(nVarB2, aVarA, a0Var, gVarE, l0VarA2, bVar3.a()));
                        o97.r rVar27 = o97.r.JUNIOR_RECENT_TRANSACTIONS;
                        jla.h hVarA2 = bVar3.a();
                        wsg.n nVarB3 = aVar16.b();
                        thf.g gVarE2 = cVar.e();
                        vc.s.j(gVarE2);
                        builderBuilderWithExpectedSize.put(rVar27, new k5l.n(hVarA2, nVarB3, gVarE2, aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.VAULTS_RECENT_TRANSACTIONS, new tjf.h0(aVar14.a()));
                        o97.r rVar28 = o97.r.CREDIT_RECENT_TRANSACTIONS;
                        jm4.r rVar29 = aVar4.H;
                        al4.p pVarI = rVar29.i();
                        u45.h hVar3 = aVar4.I;
                        builderBuilderWithExpectedSize.put(rVar28, new tjf.n(pVarI, aVar14.a(), hVar3.g()));
                        builderBuilderWithExpectedSize.put(o97.r.CREDIT_PAYMENTS, new tjf.c(rVar29.i(), aVar14.a(), hVar3.g()));
                        o97.r rVar30 = o97.r.VAULTS;
                        wpg.l lVar4 = (wpg.l) aVar4.J;
                        ppg.b bVarB3 = lVar4.b();
                        vc.s.j(bVarB3);
                        xmg.a aVar26 = aVar4.f238088p;
                        ang.f fVarE = aVar26.e();
                        dcd.b bVar4 = new dcd.b();
                        f01.c cVarG10 = aVar9.g();
                        kpg.a aVar27 = (kpg.a) lVar4.I.get();
                        vc.s.j(aVar27);
                        wa7.m mVarI = aVar10.i();
                        xoj.a aVarA2 = aVar12.a();
                        vc.s.j(aVarA2);
                        builderBuilderWithExpectedSize.put(rVar30, new uwl.d(bVarB3, fVarE, bVar4, cVarG10, aVar27, mVarI, aVarA2));
                        o97.r rVar31 = o97.r.SHOPS_BRANDS;
                        pid.b bVar5 = (pid.b) aVar4.K.E.get();
                        vc.s.j(bVar5);
                        builderBuilderWithExpectedSize.put(rVar31, bVar5);
                        o97.r rVar32 = o97.r.GIFT_CARDS;
                        vvb.a aVar28 = (vvb.a) aVar4.L.f169074t.get();
                        vc.s.j(aVar28);
                        builderBuilderWithExpectedSize.put(rVar32, aVar28);
                        o97.r rVar33 = o97.r.PLAN_SUBSCRIPTIONS;
                        jgc.a aVar29 = (jgc.a) aVar4.M.f297581w.get();
                        vc.s.j(aVar29);
                        builderBuilderWithExpectedSize.put(rVar33, aVar29);
                        o97.r rVar34 = o97.r.CRYPTOCURRENCIES;
                        vea.l lVarA = aVar4.a();
                        t70.g gVarO3 = eVar.o();
                        vc.s.j(gVarO3);
                        gte.a aVarB9 = aVar11.b();
                        vc.s.j(aVarB9);
                        builderBuilderWithExpectedSize.put(rVar34, new m0(lVarA, gVarO3, new vea.j0(aVarB9)));
                        o97.r rVar35 = o97.r.YOUR_CRYPTOCURRENCIES;
                        vea.x xVarD2 = aVar4.d();
                        t70.g gVarO4 = eVar.o();
                        vc.s.j(gVarO4);
                        gte.a aVarB10 = aVar11.b();
                        vc.s.j(aVarB10);
                        builderBuilderWithExpectedSize.put(rVar35, new vea.a0(xVarD2, gVarO4, new vea.j0(aVarB10)));
                        o97.r rVar36 = o97.r.HELPCENTRE;
                        ede.b bVar6 = aVar4.N;
                        wf0.a0 a0Var2 = (wf0.a0) bVar6.f124987b.G.get();
                        vc.s.j(a0Var2);
                        gte.a aVarB11 = bVar6.i.b();
                        vc.s.j(aVarB11);
                        ffk.t tVarF2 = bVar6.f124991j.f();
                        vc.s.j(tVarF2);
                        builderBuilderWithExpectedSize.put(rVar36, new ide.d(a0Var2, new lde.n(tVarF2, aVarB11)));
                        o97.r rVar37 = o97.r.EXPERIENCES;
                        e1g.j jVar2 = (e1g.j) aVar4.O.f318302b0.get();
                        vc.s.j(jVar2);
                        builderBuilderWithExpectedSize.put(rVar37, jVar2);
                        o97.r rVar38 = o97.r.CREDIT_CARDS;
                        qp3.a aVar30 = (qp3.a) ((t15.d) aVar4.P).P.get();
                        vc.s.j(aVar30);
                        builderBuilderWithExpectedSize.put(rVar38, aVar30);
                        o97.r rVar39 = o97.r.ESIM;
                        aej.a aVar31 = (aej.a) aVar4.Q.f4154r0.get();
                        vc.s.j(aVar31);
                        builderBuilderWithExpectedSize.put(rVar39, aVar31);
                        builderBuilderWithExpectedSize.put(o97.r.SECRET_ACCOUNTS_PHRASE_MATCH, new va7.a(aVar10.i()));
                        o97.r rVar40 = o97.r.TRAVEL_STATUS_PARTNERS;
                        y1l.b bVar7 = aVar4.R;
                        ugc.a aVar32 = new ugc.a((u1l.b) bVar7.f310399n.get());
                        gte.a aVarB12 = bVar7.f310391a.b();
                        vc.s.j(aVarB12);
                        builderBuilderWithExpectedSize.put(rVar40, new b2l.d(aVar32, aVarB12));
                        o97.r rVar41 = o97.r.CARDS;
                        da3.j jVar3 = aVar4.S;
                        l93.f fVarJ = jVar3.j();
                        vc.s.j(fVarJ);
                        mt8.d dVarB = aVar4.T.b();
                        vc.s.j(dVarB);
                        sh3.a aVarA3 = aVar4.U.a();
                        vc.s.j(aVarA3);
                        oi9.f fVar4 = aVar4.V;
                        xh9.a aVarE = fVar4.e();
                        vc.s.j(aVarE);
                        zjh.j jVarA = aVar4.W.a();
                        ti9.h hVarB = fVar4.b();
                        r0 r0VarC2 = aVar8.c();
                        f01.c cVarG11 = aVar9.g();
                        ia3.r rVarB = jVar3.b();
                        m93.d dVarF2 = jVar3.f();
                        vc.s.j(dVarF2);
                        builderBuilderWithExpectedSize.put(rVar41, new x97.e(fVarJ, dVarB, aVarA3, aVarE, jVarA, hVarB, r0VarC2, cVarG11, new x97.a(rVarB, dVarF2), aVar4.X.a()));
                        builderBuilderWithExpectedSize.put(o97.r.SUGGESTIONS_INVEST, new y97.e(sVar.l(), new y97.b(aVar4.Y.C()), (t97.b) aVar4.C1.get(), new p97.d(), new r39.a(new g9h.c())));
                        o97.r rVar42 = o97.r.JUNIOR_ACCOUNTS;
                        zf8.k kVarA = aVar4.f238064c1.a();
                        vc.s.j(kVarA);
                        builderBuilderWithExpectedSize.put(rVar42, new z97.f(kVarA, aVar9.g(), bVar3.a(), aVar4.f238066d1.a()));
                        o97.r rVar43 = o97.r.SUGGESTIONS;
                        t97.b bVar8 = (t97.b) aVar4.C1.get();
                        xo.h hVarA3 = aVar4.W0.a();
                        gte.a aVarB13 = aVar11.b();
                        vc.s.j(aVarB13);
                        builderBuilderWithExpectedSize.put(rVar43, new ca7.e(bVar8, hVarA3, aVarB13, (fa7.a) aVar4.D1.get()));
                        builderBuilderWithExpectedSize.put(o97.r.PRODUCTS, aVar4.E1.get());
                        o97.r rVar44 = o97.r.PAYMENT_ACTIONS;
                        dsd.i iVarB5 = aVar4.b();
                        ly9.l lVarF3 = aVar4.f();
                        my9.a aVar33 = new my9.a();
                        fl9.a aVar34 = (fl9.a) aVar4.f238081l1;
                        builderBuilderWithExpectedSize.put(rVar44, new my9.e(iVarB5, lVarF3, aVar33, aVar34.a()));
                        o97.r rVar45 = o97.r.GROUPS;
                        jr9.b bVar9 = aVar4.f238079k1;
                        rq9.a aVarA4 = bVar9.a();
                        vc.s.j(aVarA4);
                        mq9.f fVarC = bVar9.c();
                        vc.s.j(fVarC);
                        builderBuilderWithExpectedSize.put(rVar45, new my9.m(new jx0.a(aVarA4, fVarC), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.GROUP_ACTIONS, new my9.i(aVar4.b(), aVar4.f(), new my9.a(), aVar34.a()));
                        o97.r rVar46 = o97.r.RECENT_PAID_CONTACTS;
                        xx9.p pVarB = aVar4.f238096s1.b();
                        vc.s.j(pVarB);
                        builderBuilderWithExpectedSize.put(rVar46, new my9.q(new kpj.f(pVarB, new oy9.f()), aVar4.f()));
                        o97.r rVar47 = o97.r.CONTACTS;
                        d3j.b beneficiaryInteractor = ((b3j.p) aVar4.m1).e();
                        lra.d cardsInteractor = ((jqa.p) aVar4.f238085n1).b();
                        vc.s.j(cardsInteractor);
                        py9.a contactsSearchInteractor = aVar4.c();
                        vl3.n nVar = aVar4.f238087o1;
                        cl3.a aVarD = nVar.d();
                        vc.s.j(aVarD);
                        kgm.i usernameSearchInteractor = new kgm.i(aVarD, aVar26.e());
                        ang.f fVarE2 = aVar26.e();
                        z80.b bVarS = eVar.s();
                        vc.s.j(bVarS);
                        onh.b virtualSearchInteractor = new onh.b(new jul.o(fVarE2, bVarS));
                        co9.b paymentCounterpartyInteractor = aVar4.f238093r1.b();
                        vc.s.j(paymentCounterpartyInteractor);
                        oy9.f recipientSearchItemClickDelegate = new oy9.f();
                        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
                        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
                        Intrinsics.checkNotNullParameter(contactsSearchInteractor, "contactsSearchInteractor");
                        Intrinsics.checkNotNullParameter(usernameSearchInteractor, "usernameSearchInteractor");
                        Intrinsics.checkNotNullParameter(virtualSearchInteractor, "virtualSearchInteractor");
                        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
                        Intrinsics.checkNotNullParameter(recipientSearchItemClickDelegate, "recipientSearchItemClickDelegate");
                        hd.r rVar48 = new hd.r();
                        rVar48.f151364a = beneficiaryInteractor;
                        rVar48.f151365b = cardsInteractor;
                        rVar48.f151366c = contactsSearchInteractor;
                        rVar48.d = usernameSearchInteractor;
                        rVar48.e = virtualSearchInteractor;
                        rVar48.f = paymentCounterpartyInteractor;
                        builderBuilderWithExpectedSize.put(rVar47, new my9.u(rVar48, aVar4.f(), aVar9.g()));
                        o97.r rVar49 = o97.r.USERNAME;
                        py9.a aVarC = aVar4.c();
                        cl3.a aVarD2 = nVar.d();
                        vc.s.j(aVarD2);
                        builderBuilderWithExpectedSize.put(rVar49, new my9.y(new oy9.j(aVarC, new kgm.i(aVarD2, aVar26.e())), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.JOINT_ACCOUNTS, new s0(aVar9.g(), aVar4.a(), aVar8.c()));
                        builderBuilderWithExpectedSize.put(o97.r.YOUR_JOINT_ACCOUNTS, new vea.g0(aVar9.g(), aVar4.d(), aVar8.c()));
                        ImmutableMap sources = builderBuilderWithExpectedSize.build();
                        pp.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(sources, "sources");
                        vc.s.k(sources);
                        builder.putAll(sources);
                        builder.put(o97.r.SMART_TILES, smartTileSearchSource);
                        builder.put(o97.r.RECENT_QUERIES, recentQueriesSearchSource);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new n(globalSearchContext, fVar, bVarA, dVar2, oVar, xVarD, aVar2, aVarB, aVar3, gVar, builder.b(), (ImmutableSet) bVar.g());
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        return (on.a) ((g97.b) ((m97.c) globalSearchScreen.N.getValue())).f141480t.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        GlobalSearchScreen globalSearchScreen2 = this.f193050b;
                        return dli.f.a(globalSearchScreen2, globalSearchScreen2.d(), zhm.v.k(globalSearchScreen2.X, globalSearchScreen2.S, globalSearchScreen2.f74619a0, globalSearchScreen2.U, globalSearchScreen2.V, new RowLoadingDelegate(), globalSearchScreen2.f74620b0, globalSearchScreen2.c0, globalSearchScreen2.W, globalSearchScreen2.f0, new ListSubheaderLoadingDelegate(), globalSearchScreen2.Z, globalSearchScreen2.i0, globalSearchScreen2.f74624k0, globalSearchScreen2.j0, globalSearchScreen2.m0, globalSearchScreen2.l0, globalSearchScreen2.f74625n0, globalSearchScreen2.f74626o0, globalSearchScreen2.p0, globalSearchScreen2.q0, globalSearchScreen2.f74627r0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.N = w.y0(new kpl.b(this, context, 19));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: l97.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193050b;

            {
                this.f193050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GlobalSearchScreen globalSearchScreen = this.f193050b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        g97.b bVar = (g97.b) ((m97.c) globalSearchScreen.N.getValue());
                        GlobalSearchContext globalSearchContext = bVar.f141467a;
                        g97.a aVar = bVar.f141468b;
                        g97.d dVar = aVar.f141465c;
                        b97.f fVar = (b97.f) dVar.k.get();
                        vc.s.j(fVar);
                        xn.b bVarA = aVar.d.a();
                        i97.d dVar2 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar2);
                        i97.d dVar3 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar3);
                        l80.h hVarV = aVar.f141463a.v();
                        vc.s.j(hVarV);
                        jul.o oVar = new jul.o(dVar3, hVarV);
                        wli.x xVarD = ((s41.a) aVar.e).d();
                        j60.a aVar2 = (j60.a) bVar.o.get();
                        gte.a aVarB = aVar.f.b();
                        vc.s.j(aVarB);
                        i97.a aVar3 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar3);
                        z87.g gVar = (z87.g) bVar.f141478r.get();
                        z87.b globalSearchContentApi = aVar.f141464b;
                        pp.a aVar4 = (pp.a) globalSearchContentApi;
                        ImmutableMap immutableMapOf = ImmutableMap.of("EXCHANGE", aVar4.F1, "PAYMENT", aVar4.G1, "ASSET", aVar4.H1, "CRYPTO_ASSET", aVar4.I1);
                        vc.s.j(immutableMapOf);
                        i97.l lVar = (i97.l) dVar.f141489n.get();
                        vc.s.j(lVar);
                        n97.k smartTileSearchSource = new n97.k(immutableMapOf, lVar);
                        i97.a aVar5 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar5);
                        k97.d recentQueriesSearchSource = new k97.d(aVar5);
                        m97.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(globalSearchContentApi, "globalSearchContentApi");
                        Intrinsics.checkNotNullParameter(smartTileSearchSource, "smartTileSearchSource");
                        Intrinsics.checkNotNullParameter(recentQueriesSearchSource, "recentQueriesSearchSource");
                        aim.f builder = new aim.f();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(64);
                        o97.r rVar = o97.r.POCKETS;
                        c6e.a aVar6 = (c6e.a) aVar4.f238058a;
                        pfe.g aggregator = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator);
                        r6e.o oVar2 = aVar4.f238060b;
                        g6e.g navigationProvider = oVar2.a();
                        vc.s.j(navigationProvider);
                        b7e.a aVar7 = aVar4.f238063c;
                        z5e.c jointDataSource = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource);
                        e48.a aVar8 = aVar4.d;
                        r0 jointAccountsInteractor = aVar8.c();
                        pqi.a aVar9 = aVar4.e;
                        f01.c uiKitResources = aVar9.g();
                        ta7.a aVar10 = aVar4.f;
                        wa7.m hiddenAccountsInteractor = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
                        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
                        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar, new d6e.r(aggregator, jointDataSource, jointAccountsInteractor, navigationProvider, uiKitResources, d6e.l.PERSONAL, hiddenAccountsInteractor));
                        o97.r rVar2 = o97.r.JOINT_POCKETS;
                        pfe.g aggregator2 = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator2);
                        z5e.c jointDataSource2 = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource2);
                        r0 jointAccountsInteractor2 = aVar8.c();
                        g6e.g navigationProvider2 = oVar2.a();
                        vc.s.j(navigationProvider2);
                        f01.c uiKitResources2 = aVar9.g();
                        wa7.m hiddenAccountsInteractor2 = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator2, "aggregator");
                        Intrinsics.checkNotNullParameter(jointDataSource2, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor2, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(navigationProvider2, "navigationProvider");
                        Intrinsics.checkNotNullParameter(uiKitResources2, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor2, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar2, new d6e.r(aggregator2, jointDataSource2, jointAccountsInteractor2, navigationProvider2, uiKitResources2, d6e.l.JOINT, hiddenAccountsInteractor2));
                        o97.r rVar3 = o97.r.JOINT_SAVINGS;
                        djb.n savingsAccountsDetailsInteractor = aVar4.f238070g.a();
                        vc.s.j(savingsAccountsDetailsInteractor);
                        iob.c savingsAccountMapper = ((blb.e) aVar4.f238072h).c();
                        f01.c uiKitResources3 = aVar9.g();
                        ite.a aVar11 = aVar4.i;
                        gte.a featureToggleInteractor = aVar11.b();
                        vc.s.j(featureToggleInteractor);
                        bpj.a aVar12 = aVar4.f238076j;
                        xoj.a featuresInteractor = aVar12.a();
                        vc.s.j(featuresInteractor);
                        wa7.m hiddenAccountsInteractor3 = aVar10.i();
                        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
                        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
                        Intrinsics.checkNotNullParameter(uiKitResources3, "uiKitResources");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor3, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar3, new kob.h(kob.d.Joint, savingsAccountsDetailsInteractor, savingsAccountMapper, uiKitResources3, featureToggleInteractor, featuresInteractor, hiddenAccountsInteractor3));
                        o97.r rVar4 = o97.r.TRANSFER_VENDORS;
                        g3k.a aVar13 = (g3k.a) aVar4.k.f232493x.get();
                        vc.s.j(aVar13);
                        r10.t tVar = new r10.t(aVar13, aVar4.f238080l.a());
                        w2k.a subtitleMapper = new w2k.a();
                        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
                        b4k.d searchSource = new b4k.d(tVar, new b4k.b());
                        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
                        builderBuilderWithExpectedSize.put(rVar4, searchSource);
                        builderBuilderWithExpectedSize.put(o97.r.ASK_AIR, new k5l.a(((h30.n) aVar4.f238082m).t()));
                        o97.r rVar5 = o97.r.YOUR_FIAT_ACCOUNTS;
                        l70.e eVar = aVar4.f238083n;
                        t70.g gVarO = eVar.o();
                        vc.s.j(gVarO);
                        builderBuilderWithExpectedSize.put(rVar5, new vea.d0(gVarO, aVar4.d()));
                        o97.r rVar6 = o97.r.FIAT_ACCOUNTS;
                        t70.g gVarO2 = eVar.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.put(rVar6, new p0(gVarO2, aVar4.a()));
                        o97.r rVar7 = o97.r.TRANSACTIONS;
                        djf.c cVar = aVar4.f238108y;
                        thf.l lVarF = cVar.f();
                        vc.s.j(lVarF);
                        kjf.a aVar14 = aVar4.z;
                        tjf.l0 l0VarA = aVar14.a();
                        vjf.a aVar15 = aVar4.A;
                        ujf.h hVarA = aVar15.a();
                        mhf.j jVarE = ((bjf.a) aVar4.B).e();
                        vc.s.j(jVarE);
                        f01.c cVarG = aVar9.g();
                        aoi.c cVarA = aoi.f.a();
                        com.revolut.analytics.tracking.v3.d dVarF = aVar4.C.f();
                        vc.s.j(dVarF);
                        builderBuilderWithExpectedSize.put(rVar7, new q0(lVarF, l0VarA, hVarA, jVarE, cVarG, cVarA, dVarF));
                        o97.r rVar8 = o97.r.JOINT_TRANSACTIONS;
                        r0 r0VarC = aVar8.c();
                        usg.a aVar16 = aVar4.o;
                        wsg.n nVarB = aVar16.b();
                        thf.l lVarF2 = cVar.f();
                        vc.s.j(lVarF2);
                        builderBuilderWithExpectedSize.put(rVar8, new tjf.j(r0VarC, nVarB, lVarF2, aVar14.a(), aVar15.a(), aVar9.g()));
                        builderBuilderWithExpectedSize.put(o97.r.FIAT_CURRENCIES_RECENT_TRANSACTIONS, new tjf.v(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.LINKED_ACCOUNTS_RECENT_TRANSACTIONS, new tjf.z(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.CRYPTO_RECENT_TRANSACTIONS, new tjf.r(aVar14.a(), vd0.d.a()));
                        builderBuilderWithExpectedSize.put(o97.r.PAYMENTS_RECENT_TRANSACTIONS, new tjf.d0(aVar14.a()));
                        o97.r rVar9 = o97.r.WEALTH_ASSETS_ORDERS;
                        mkh.s sVar = (mkh.s) aVar4.D;
                        ite.a aVar17 = sVar.f206400a;
                        gte.a aVarB2 = aVar17.b();
                        vc.s.j(aVarB2);
                        fsl.m mVarB = sVar.u.b();
                        vc.s.j(mVarB);
                        ktl.a aVar18 = sVar.v;
                        htl.l lVar2 = new htl.l();
                        pqi.a aVar19 = sVar.f206415l;
                        builderBuilderWithExpectedSize.put(rVar9, new zkh.p(aVarB2, mVarB, lVar2, new zkh.n(aVar19.g()), new ugc.a(aVar18.a())));
                        o97.r rVar10 = o97.r.WEALTH_STOCKS_IPO;
                        f01.c cVarG2 = aVar19.g();
                        gte.a aVarB3 = aVar17.b();
                        vc.s.j(aVarB3);
                        h9h.a aVar20 = sVar.d;
                        tzg.m mVarT = aVar20.t();
                        vc.s.j(mVarT);
                        zdl.c cVar2 = sVar.f206413j;
                        ybl.b bVarB = cVar2.b();
                        vc.s.j(bVarB);
                        clh.q headerBuilder = new clh.q();
                        clh.a headerVariantTransformer = new clh.a();
                        nbh.a instrumentImageProvider = new nbh.a();
                        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                        clh.f instrumentSearchItemBuilder = new clh.f();
                        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer, "headerVariantTransformer");
                        Intrinsics.checkNotNullParameter(instrumentSearchItemBuilder, "instrumentSearchItemBuilder");
                        clh.h hVar = new clh.h();
                        c4f.a aVar21 = sVar.e;
                        builderBuilderWithExpectedSize.put(rVar10, new blh.k0(cVarG2, aVarB3, mVarT, bVarB, hVar, aVar21.a(), cVar2.c()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_STOCKS, new n0(aVar19.g(), sVar.f(), new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS, new blh.b0(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar11 = o97.r.WEALTH_STOCKS_ALL;
                        f01.c cVarG3 = aVar19.g();
                        blh.i iVarF = sVar.f();
                        nlh.b bVarA2 = sVar.f206417n.a();
                        vc.s.j(bVarA2);
                        builderBuilderWithExpectedSize.put(rVar11, new blh.q(cVarG3, iVarF, bVarA2, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS_ALL, new blh.n(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar12 = o97.r.WEALTH_BONDS;
                        f01.c cVarG4 = aVar19.g();
                        blh.i iVarF2 = sVar.f();
                        zdl.f fVar2 = sVar.f;
                        ybl.i iVarB = fVar2.b();
                        vc.s.j(iVarB);
                        builderBuilderWithExpectedSize.put(rVar12, new blh.s(cVarG4, iVarF2, iVarB, new blh.j()));
                        o97.r rVar13 = o97.r.WEALTH_FUNDS;
                        f01.c cVarG5 = aVar19.g();
                        blh.i iVarF3 = sVar.f();
                        b4f.b bVarA3 = aVar21.a();
                        ybl.b bVarB2 = cVar2.b();
                        vc.s.j(bVarB2);
                        blh.j jVar = new blh.j();
                        ybl.i iVarB2 = fVar2.b();
                        vc.s.j(iVarB2);
                        builderBuilderWithExpectedSize.put(rVar13, new blh.f0(cVarG5, iVarF3, bVarA3, bVarB2, jVar, iVarB2));
                        o97.r rVar14 = o97.r.WEALTH_MUTUAL_FUNDS;
                        f01.c cVarG6 = aVar19.g();
                        blh.i iVarF4 = sVar.f();
                        ybl.i iVarB3 = fVar2.b();
                        vc.s.j(iVarB3);
                        builderBuilderWithExpectedSize.put(rVar14, new blh.i0(cVarG6, iVarF4, iVarB3, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_CFDS, new blh.u(aVar19.g(), sVar.f(), new blh.j()));
                        o97.r rVar15 = o97.r.WEALTH_INDEXES;
                        f01.c cVarG7 = aVar19.g();
                        y77.i iVar = (y77.i) sVar.o;
                        jpf.a aVarB4 = iVar.b();
                        l77.a aVar22 = (l77.a) iVar.u.get();
                        vc.s.j(aVar22);
                        y87.a marketAssetsMapper = (y87.a) iVar.f311417r.get();
                        vc.s.j(marketAssetsMapper);
                        clh.q searchHeaderBuilder = new clh.q();
                        clh.a headerVariantTransformer2 = new clh.a();
                        Intrinsics.checkNotNullParameter(marketAssetsMapper, "marketAssetsMapper");
                        Intrinsics.checkNotNullParameter(searchHeaderBuilder, "searchHeaderBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer2, "headerVariantTransformer");
                        builderBuilderWithExpectedSize.put(rVar15, new alh.d(cVarG7, aVarB4, aVar22, new clh.b(), aVar21.a()));
                        o97.r rVar16 = o97.r.WEALTH_COMMODITIES;
                        o7.d dVar4 = new o7.d(sVar.b(), new t5d.d());
                        tzg.m mVarT2 = aVar20.t();
                        vc.s.j(mVarT2);
                        builderBuilderWithExpectedSize.put(rVar16, new blh.x(dVar4, mVarT2, (nih.a) sVar.u0.get()));
                        o97.r rVar17 = o97.r.WEALTH_COMMODITIES_ALL;
                        jbh.e performanceAssetMapper = aVar20.C();
                        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
                        zkh.l lVar3 = new zkh.l();
                        tzg.m mVarT3 = aVar20.t();
                        vc.s.j(mVarT3);
                        builderBuilderWithExpectedSize.put(rVar17, new zkh.m(lVar3, mVarT3, (nih.a) sVar.u0.get(), aVar19.g()));
                        o97.r rVar18 = o97.r.WEALTH_INSTRUMENTS_MOST_TRADED;
                        q9h.c cVar3 = (q9h.c) sVar.f206423r0.get();
                        jbh.e eVarC = aVar20.C();
                        gte.a aVarB5 = aVar17.b();
                        vc.s.j(aVarB5);
                        builderBuilderWithExpectedSize.put(rVar18, new zkh.x(cVar3, eVarC, aVarB5));
                        o97.r rVar19 = o97.r.WEALTH_DISCLAIMER;
                        tzg.m mVarT4 = aVar20.t();
                        vc.s.j(mVarT4);
                        u8h.b bVar2 = (u8h.b) sVar.i;
                        z0h.d dVarC = bVar2.c();
                        vc.s.j(dVarC);
                        z0h.a aVarB6 = bVar2.b();
                        vc.s.j(aVarB6);
                        builderBuilderWithExpectedSize.put(rVar19, new zkh.r(mVarT4, dVarC, aVarB6, (lih.a) sVar.q0.get()));
                        o97.r rVar20 = o97.r.WEALTH_STOCKS_MOST_OWNED;
                        t9h.a aVar23 = (t9h.a) sVar.f206425s0.get();
                        jbh.e eVarC2 = aVar20.C();
                        f01.c cVarG8 = aVar19.g();
                        t5d.d dVar5 = new t5d.d();
                        gte.a aVarB7 = aVar17.b();
                        vc.s.j(aVarB7);
                        whl.f fVar3 = sVar.f206422r;
                        builderBuilderWithExpectedSize.put(rVar20, new zkh.i0(aVar23, eVarC2, cVarG8, dVar5, aVarB7, fVar3.e()));
                        o97.r rVar21 = o97.r.WEALTH_ETFS_MOST_OWNED;
                        gte.a aVarB8 = aVar17.b();
                        vc.s.j(aVarB8);
                        builderBuilderWithExpectedSize.put(rVar21, new zkh.d0(aVarB8, (t9h.a) sVar.f206425s0.get(), aVar20.C(), aVar20.f(), aVar19.g(), fVar3.e()));
                        o97.r rVar22 = o97.r.WEALTH_ASSETS_RECENTLY_VIEWED;
                        dlh.a recentlyViewedMapper = new dlh.a(aVar20.C());
                        zkh.l0 recentlyViewedSearchDataProvider = sVar.l();
                        r39.a performanceAssetDestinationProvider = new r39.a(new g9h.c());
                        t0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(recentlyViewedMapper, "recentlyViewedMapper");
                        Intrinsics.checkNotNullParameter(recentlyViewedSearchDataProvider, "recentlyViewedSearchDataProvider");
                        Intrinsics.checkNotNullParameter(performanceAssetDestinationProvider, "performanceAssetDestinationProvider");
                        builderBuilderWithExpectedSize.put(rVar22, new zkh.o0(recentlyViewedMapper, recentlyViewedSearchDataProvider, performanceAssetDestinationProvider));
                        o97.r rVar23 = o97.r.WEALTH_STOCKS_SCREENER;
                        elh.a aVar24 = new elh.a();
                        tzg.m mVarT5 = aVar20.t();
                        vc.s.j(mVarT5);
                        builderBuilderWithExpectedSize.put(rVar23, new elh.c(aVar24, mVarT5, aVar19.g()));
                        o97.r rVar24 = o97.r.TRADING_HOLDINGS;
                        x8h.k kVarD = aVar20.d();
                        ael.t tVarF = cVar2.f();
                        vc.s.j(tVarF);
                        ybl.k kVarD2 = fVar2.d();
                        vc.s.j(kVarD2);
                        zkh.h hVar2 = new zkh.h(kVarD, tVarF, kVarD2, new ufl.b(new tfl.a()), new t5d.d());
                        f01.c cVarG9 = aVar19.g();
                        ybl.i iVarB4 = fVar2.b();
                        vc.s.j(iVarB4);
                        builderBuilderWithExpectedSize.put(rVar24, new zkh.v(hVar2, cVarG9, iVarB4, aVar21.a()));
                        o97.r rVar25 = o97.r.TRADING_TRANSACTIONS;
                        x8h.q qVarA = aVar20.A();
                        yah.a aVar25 = sVar.f206416m;
                        f1h.e eVar2 = (f1h.e) aVar25.f312023c.get();
                        vc.s.j(eVar2);
                        builderBuilderWithExpectedSize.put(rVar25, new zkh.r0(qVarA, eVar2, aVar25.b()));
                        o97.r rVar26 = o97.r.JUNIOR_KIDS_RECENT_TRANSACTIONS;
                        wsg.n nVarB2 = aVar16.b();
                        hj8.a aVarA = aVar4.E.a();
                        vc.s.j(aVarA);
                        te8.a0 a0Var = (te8.a0) aVar4.F.f262160y.get();
                        vc.s.j(a0Var);
                        thf.g gVarE = cVar.e();
                        vc.s.j(gVarE);
                        tjf.l0 l0VarA2 = aVar14.a();
                        ila.b bVar3 = aVar4.G;
                        builderBuilderWithExpectedSize.put(rVar26, new k5l.j(nVarB2, aVarA, a0Var, gVarE, l0VarA2, bVar3.a()));
                        o97.r rVar27 = o97.r.JUNIOR_RECENT_TRANSACTIONS;
                        jla.h hVarA2 = bVar3.a();
                        wsg.n nVarB3 = aVar16.b();
                        thf.g gVarE2 = cVar.e();
                        vc.s.j(gVarE2);
                        builderBuilderWithExpectedSize.put(rVar27, new k5l.n(hVarA2, nVarB3, gVarE2, aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.VAULTS_RECENT_TRANSACTIONS, new tjf.h0(aVar14.a()));
                        o97.r rVar28 = o97.r.CREDIT_RECENT_TRANSACTIONS;
                        jm4.r rVar29 = aVar4.H;
                        al4.p pVarI = rVar29.i();
                        u45.h hVar3 = aVar4.I;
                        builderBuilderWithExpectedSize.put(rVar28, new tjf.n(pVarI, aVar14.a(), hVar3.g()));
                        builderBuilderWithExpectedSize.put(o97.r.CREDIT_PAYMENTS, new tjf.c(rVar29.i(), aVar14.a(), hVar3.g()));
                        o97.r rVar30 = o97.r.VAULTS;
                        wpg.l lVar4 = (wpg.l) aVar4.J;
                        ppg.b bVarB3 = lVar4.b();
                        vc.s.j(bVarB3);
                        xmg.a aVar26 = aVar4.f238088p;
                        ang.f fVarE = aVar26.e();
                        dcd.b bVar4 = new dcd.b();
                        f01.c cVarG10 = aVar9.g();
                        kpg.a aVar27 = (kpg.a) lVar4.I.get();
                        vc.s.j(aVar27);
                        wa7.m mVarI = aVar10.i();
                        xoj.a aVarA2 = aVar12.a();
                        vc.s.j(aVarA2);
                        builderBuilderWithExpectedSize.put(rVar30, new uwl.d(bVarB3, fVarE, bVar4, cVarG10, aVar27, mVarI, aVarA2));
                        o97.r rVar31 = o97.r.SHOPS_BRANDS;
                        pid.b bVar5 = (pid.b) aVar4.K.E.get();
                        vc.s.j(bVar5);
                        builderBuilderWithExpectedSize.put(rVar31, bVar5);
                        o97.r rVar32 = o97.r.GIFT_CARDS;
                        vvb.a aVar28 = (vvb.a) aVar4.L.f169074t.get();
                        vc.s.j(aVar28);
                        builderBuilderWithExpectedSize.put(rVar32, aVar28);
                        o97.r rVar33 = o97.r.PLAN_SUBSCRIPTIONS;
                        jgc.a aVar29 = (jgc.a) aVar4.M.f297581w.get();
                        vc.s.j(aVar29);
                        builderBuilderWithExpectedSize.put(rVar33, aVar29);
                        o97.r rVar34 = o97.r.CRYPTOCURRENCIES;
                        vea.l lVarA = aVar4.a();
                        t70.g gVarO3 = eVar.o();
                        vc.s.j(gVarO3);
                        gte.a aVarB9 = aVar11.b();
                        vc.s.j(aVarB9);
                        builderBuilderWithExpectedSize.put(rVar34, new m0(lVarA, gVarO3, new vea.j0(aVarB9)));
                        o97.r rVar35 = o97.r.YOUR_CRYPTOCURRENCIES;
                        vea.x xVarD2 = aVar4.d();
                        t70.g gVarO4 = eVar.o();
                        vc.s.j(gVarO4);
                        gte.a aVarB10 = aVar11.b();
                        vc.s.j(aVarB10);
                        builderBuilderWithExpectedSize.put(rVar35, new vea.a0(xVarD2, gVarO4, new vea.j0(aVarB10)));
                        o97.r rVar36 = o97.r.HELPCENTRE;
                        ede.b bVar6 = aVar4.N;
                        wf0.a0 a0Var2 = (wf0.a0) bVar6.f124987b.G.get();
                        vc.s.j(a0Var2);
                        gte.a aVarB11 = bVar6.i.b();
                        vc.s.j(aVarB11);
                        ffk.t tVarF2 = bVar6.f124991j.f();
                        vc.s.j(tVarF2);
                        builderBuilderWithExpectedSize.put(rVar36, new ide.d(a0Var2, new lde.n(tVarF2, aVarB11)));
                        o97.r rVar37 = o97.r.EXPERIENCES;
                        e1g.j jVar2 = (e1g.j) aVar4.O.f318302b0.get();
                        vc.s.j(jVar2);
                        builderBuilderWithExpectedSize.put(rVar37, jVar2);
                        o97.r rVar38 = o97.r.CREDIT_CARDS;
                        qp3.a aVar30 = (qp3.a) ((t15.d) aVar4.P).P.get();
                        vc.s.j(aVar30);
                        builderBuilderWithExpectedSize.put(rVar38, aVar30);
                        o97.r rVar39 = o97.r.ESIM;
                        aej.a aVar31 = (aej.a) aVar4.Q.f4154r0.get();
                        vc.s.j(aVar31);
                        builderBuilderWithExpectedSize.put(rVar39, aVar31);
                        builderBuilderWithExpectedSize.put(o97.r.SECRET_ACCOUNTS_PHRASE_MATCH, new va7.a(aVar10.i()));
                        o97.r rVar40 = o97.r.TRAVEL_STATUS_PARTNERS;
                        y1l.b bVar7 = aVar4.R;
                        ugc.a aVar32 = new ugc.a((u1l.b) bVar7.f310399n.get());
                        gte.a aVarB12 = bVar7.f310391a.b();
                        vc.s.j(aVarB12);
                        builderBuilderWithExpectedSize.put(rVar40, new b2l.d(aVar32, aVarB12));
                        o97.r rVar41 = o97.r.CARDS;
                        da3.j jVar3 = aVar4.S;
                        l93.f fVarJ = jVar3.j();
                        vc.s.j(fVarJ);
                        mt8.d dVarB = aVar4.T.b();
                        vc.s.j(dVarB);
                        sh3.a aVarA3 = aVar4.U.a();
                        vc.s.j(aVarA3);
                        oi9.f fVar4 = aVar4.V;
                        xh9.a aVarE = fVar4.e();
                        vc.s.j(aVarE);
                        zjh.j jVarA = aVar4.W.a();
                        ti9.h hVarB = fVar4.b();
                        r0 r0VarC2 = aVar8.c();
                        f01.c cVarG11 = aVar9.g();
                        ia3.r rVarB = jVar3.b();
                        m93.d dVarF2 = jVar3.f();
                        vc.s.j(dVarF2);
                        builderBuilderWithExpectedSize.put(rVar41, new x97.e(fVarJ, dVarB, aVarA3, aVarE, jVarA, hVarB, r0VarC2, cVarG11, new x97.a(rVarB, dVarF2), aVar4.X.a()));
                        builderBuilderWithExpectedSize.put(o97.r.SUGGESTIONS_INVEST, new y97.e(sVar.l(), new y97.b(aVar4.Y.C()), (t97.b) aVar4.C1.get(), new p97.d(), new r39.a(new g9h.c())));
                        o97.r rVar42 = o97.r.JUNIOR_ACCOUNTS;
                        zf8.k kVarA = aVar4.f238064c1.a();
                        vc.s.j(kVarA);
                        builderBuilderWithExpectedSize.put(rVar42, new z97.f(kVarA, aVar9.g(), bVar3.a(), aVar4.f238066d1.a()));
                        o97.r rVar43 = o97.r.SUGGESTIONS;
                        t97.b bVar8 = (t97.b) aVar4.C1.get();
                        xo.h hVarA3 = aVar4.W0.a();
                        gte.a aVarB13 = aVar11.b();
                        vc.s.j(aVarB13);
                        builderBuilderWithExpectedSize.put(rVar43, new ca7.e(bVar8, hVarA3, aVarB13, (fa7.a) aVar4.D1.get()));
                        builderBuilderWithExpectedSize.put(o97.r.PRODUCTS, aVar4.E1.get());
                        o97.r rVar44 = o97.r.PAYMENT_ACTIONS;
                        dsd.i iVarB5 = aVar4.b();
                        ly9.l lVarF3 = aVar4.f();
                        my9.a aVar33 = new my9.a();
                        fl9.a aVar34 = (fl9.a) aVar4.f238081l1;
                        builderBuilderWithExpectedSize.put(rVar44, new my9.e(iVarB5, lVarF3, aVar33, aVar34.a()));
                        o97.r rVar45 = o97.r.GROUPS;
                        jr9.b bVar9 = aVar4.f238079k1;
                        rq9.a aVarA4 = bVar9.a();
                        vc.s.j(aVarA4);
                        mq9.f fVarC = bVar9.c();
                        vc.s.j(fVarC);
                        builderBuilderWithExpectedSize.put(rVar45, new my9.m(new jx0.a(aVarA4, fVarC), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.GROUP_ACTIONS, new my9.i(aVar4.b(), aVar4.f(), new my9.a(), aVar34.a()));
                        o97.r rVar46 = o97.r.RECENT_PAID_CONTACTS;
                        xx9.p pVarB = aVar4.f238096s1.b();
                        vc.s.j(pVarB);
                        builderBuilderWithExpectedSize.put(rVar46, new my9.q(new kpj.f(pVarB, new oy9.f()), aVar4.f()));
                        o97.r rVar47 = o97.r.CONTACTS;
                        d3j.b beneficiaryInteractor = ((b3j.p) aVar4.m1).e();
                        lra.d cardsInteractor = ((jqa.p) aVar4.f238085n1).b();
                        vc.s.j(cardsInteractor);
                        py9.a contactsSearchInteractor = aVar4.c();
                        vl3.n nVar = aVar4.f238087o1;
                        cl3.a aVarD = nVar.d();
                        vc.s.j(aVarD);
                        kgm.i usernameSearchInteractor = new kgm.i(aVarD, aVar26.e());
                        ang.f fVarE2 = aVar26.e();
                        z80.b bVarS = eVar.s();
                        vc.s.j(bVarS);
                        onh.b virtualSearchInteractor = new onh.b(new jul.o(fVarE2, bVarS));
                        co9.b paymentCounterpartyInteractor = aVar4.f238093r1.b();
                        vc.s.j(paymentCounterpartyInteractor);
                        oy9.f recipientSearchItemClickDelegate = new oy9.f();
                        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
                        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
                        Intrinsics.checkNotNullParameter(contactsSearchInteractor, "contactsSearchInteractor");
                        Intrinsics.checkNotNullParameter(usernameSearchInteractor, "usernameSearchInteractor");
                        Intrinsics.checkNotNullParameter(virtualSearchInteractor, "virtualSearchInteractor");
                        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
                        Intrinsics.checkNotNullParameter(recipientSearchItemClickDelegate, "recipientSearchItemClickDelegate");
                        hd.r rVar48 = new hd.r();
                        rVar48.f151364a = beneficiaryInteractor;
                        rVar48.f151365b = cardsInteractor;
                        rVar48.f151366c = contactsSearchInteractor;
                        rVar48.d = usernameSearchInteractor;
                        rVar48.e = virtualSearchInteractor;
                        rVar48.f = paymentCounterpartyInteractor;
                        builderBuilderWithExpectedSize.put(rVar47, new my9.u(rVar48, aVar4.f(), aVar9.g()));
                        o97.r rVar49 = o97.r.USERNAME;
                        py9.a aVarC = aVar4.c();
                        cl3.a aVarD2 = nVar.d();
                        vc.s.j(aVarD2);
                        builderBuilderWithExpectedSize.put(rVar49, new my9.y(new oy9.j(aVarC, new kgm.i(aVarD2, aVar26.e())), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.JOINT_ACCOUNTS, new s0(aVar9.g(), aVar4.a(), aVar8.c()));
                        builderBuilderWithExpectedSize.put(o97.r.YOUR_JOINT_ACCOUNTS, new vea.g0(aVar9.g(), aVar4.d(), aVar8.c()));
                        ImmutableMap sources = builderBuilderWithExpectedSize.build();
                        pp.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(sources, "sources");
                        vc.s.k(sources);
                        builder.putAll(sources);
                        builder.put(o97.r.SMART_TILES, smartTileSearchSource);
                        builder.put(o97.r.RECENT_QUERIES, recentQueriesSearchSource);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new n(globalSearchContext, fVar, bVarA, dVar2, oVar, xVarD, aVar2, aVarB, aVar3, gVar, builder.b(), (ImmutableSet) bVar.g());
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        return (on.a) ((g97.b) ((m97.c) globalSearchScreen.N.getValue())).f141480t.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        GlobalSearchScreen globalSearchScreen2 = this.f193050b;
                        return dli.f.a(globalSearchScreen2, globalSearchScreen2.d(), zhm.v.k(globalSearchScreen2.X, globalSearchScreen2.S, globalSearchScreen2.f74619a0, globalSearchScreen2.U, globalSearchScreen2.V, new RowLoadingDelegate(), globalSearchScreen2.f74620b0, globalSearchScreen2.c0, globalSearchScreen2.W, globalSearchScreen2.f0, new ListSubheaderLoadingDelegate(), globalSearchScreen2.Z, globalSearchScreen2.i0, globalSearchScreen2.f74624k0, globalSearchScreen2.j0, globalSearchScreen2.m0, globalSearchScreen2.l0, globalSearchScreen2.f74625n0, globalSearchScreen2.f74626o0, globalSearchScreen2.p0, globalSearchScreen2.q0, globalSearchScreen2.f74627r0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: l97.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193050b;

            {
                this.f193050b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GlobalSearchScreen globalSearchScreen = this.f193050b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        g97.b bVar = (g97.b) ((m97.c) globalSearchScreen.N.getValue());
                        GlobalSearchContext globalSearchContext = bVar.f141467a;
                        g97.a aVar = bVar.f141468b;
                        g97.d dVar = aVar.f141465c;
                        b97.f fVar = (b97.f) dVar.k.get();
                        vc.s.j(fVar);
                        xn.b bVarA = aVar.d.a();
                        i97.d dVar2 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar2);
                        i97.d dVar3 = (i97.d) dVar.f141487l.get();
                        vc.s.j(dVar3);
                        l80.h hVarV = aVar.f141463a.v();
                        vc.s.j(hVarV);
                        jul.o oVar = new jul.o(dVar3, hVarV);
                        wli.x xVarD = ((s41.a) aVar.e).d();
                        j60.a aVar2 = (j60.a) bVar.o.get();
                        gte.a aVarB = aVar.f.b();
                        vc.s.j(aVarB);
                        i97.a aVar3 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar3);
                        z87.g gVar = (z87.g) bVar.f141478r.get();
                        z87.b globalSearchContentApi = aVar.f141464b;
                        pp.a aVar4 = (pp.a) globalSearchContentApi;
                        ImmutableMap immutableMapOf = ImmutableMap.of("EXCHANGE", aVar4.F1, "PAYMENT", aVar4.G1, "ASSET", aVar4.H1, "CRYPTO_ASSET", aVar4.I1);
                        vc.s.j(immutableMapOf);
                        i97.l lVar = (i97.l) dVar.f141489n.get();
                        vc.s.j(lVar);
                        n97.k smartTileSearchSource = new n97.k(immutableMapOf, lVar);
                        i97.a aVar5 = (i97.a) dVar.f141490p.get();
                        vc.s.j(aVar5);
                        k97.d recentQueriesSearchSource = new k97.d(aVar5);
                        m97.e.Companion.getClass();
                        Intrinsics.checkNotNullParameter(globalSearchContentApi, "globalSearchContentApi");
                        Intrinsics.checkNotNullParameter(smartTileSearchSource, "smartTileSearchSource");
                        Intrinsics.checkNotNullParameter(recentQueriesSearchSource, "recentQueriesSearchSource");
                        aim.f builder = new aim.f();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(64);
                        o97.r rVar = o97.r.POCKETS;
                        c6e.a aVar6 = (c6e.a) aVar4.f238058a;
                        pfe.g aggregator = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator);
                        r6e.o oVar2 = aVar4.f238060b;
                        g6e.g navigationProvider = oVar2.a();
                        vc.s.j(navigationProvider);
                        b7e.a aVar7 = aVar4.f238063c;
                        z5e.c jointDataSource = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource);
                        e48.a aVar8 = aVar4.d;
                        r0 jointAccountsInteractor = aVar8.c();
                        pqi.a aVar9 = aVar4.e;
                        f01.c uiKitResources = aVar9.g();
                        ta7.a aVar10 = aVar4.f;
                        wa7.m hiddenAccountsInteractor = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
                        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
                        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar, new d6e.r(aggregator, jointDataSource, jointAccountsInteractor, navigationProvider, uiKitResources, d6e.l.PERSONAL, hiddenAccountsInteractor));
                        o97.r rVar2 = o97.r.JOINT_POCKETS;
                        pfe.g aggregator2 = (pfe.g) aVar6.f21785n.get();
                        vc.s.j(aggregator2);
                        z5e.c jointDataSource2 = (z5e.c) aVar7.K.get();
                        vc.s.j(jointDataSource2);
                        r0 jointAccountsInteractor2 = aVar8.c();
                        g6e.g navigationProvider2 = oVar2.a();
                        vc.s.j(navigationProvider2);
                        f01.c uiKitResources2 = aVar9.g();
                        wa7.m hiddenAccountsInteractor2 = aVar10.i();
                        Intrinsics.checkNotNullParameter(aggregator2, "aggregator");
                        Intrinsics.checkNotNullParameter(jointDataSource2, "jointDataSource");
                        Intrinsics.checkNotNullParameter(jointAccountsInteractor2, "jointAccountsInteractor");
                        Intrinsics.checkNotNullParameter(navigationProvider2, "navigationProvider");
                        Intrinsics.checkNotNullParameter(uiKitResources2, "uiKitResources");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor2, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar2, new d6e.r(aggregator2, jointDataSource2, jointAccountsInteractor2, navigationProvider2, uiKitResources2, d6e.l.JOINT, hiddenAccountsInteractor2));
                        o97.r rVar3 = o97.r.JOINT_SAVINGS;
                        djb.n savingsAccountsDetailsInteractor = aVar4.f238070g.a();
                        vc.s.j(savingsAccountsDetailsInteractor);
                        iob.c savingsAccountMapper = ((blb.e) aVar4.f238072h).c();
                        f01.c uiKitResources3 = aVar9.g();
                        ite.a aVar11 = aVar4.i;
                        gte.a featureToggleInteractor = aVar11.b();
                        vc.s.j(featureToggleInteractor);
                        bpj.a aVar12 = aVar4.f238076j;
                        xoj.a featuresInteractor = aVar12.a();
                        vc.s.j(featuresInteractor);
                        wa7.m hiddenAccountsInteractor3 = aVar10.i();
                        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
                        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
                        Intrinsics.checkNotNullParameter(uiKitResources3, "uiKitResources");
                        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor3, "hiddenAccountsInteractor");
                        builderBuilderWithExpectedSize.put(rVar3, new kob.h(kob.d.Joint, savingsAccountsDetailsInteractor, savingsAccountMapper, uiKitResources3, featureToggleInteractor, featuresInteractor, hiddenAccountsInteractor3));
                        o97.r rVar4 = o97.r.TRANSFER_VENDORS;
                        g3k.a aVar13 = (g3k.a) aVar4.k.f232493x.get();
                        vc.s.j(aVar13);
                        r10.t tVar = new r10.t(aVar13, aVar4.f238080l.a());
                        w2k.a subtitleMapper = new w2k.a();
                        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
                        b4k.d searchSource = new b4k.d(tVar, new b4k.b());
                        Intrinsics.checkNotNullParameter(searchSource, "searchSource");
                        builderBuilderWithExpectedSize.put(rVar4, searchSource);
                        builderBuilderWithExpectedSize.put(o97.r.ASK_AIR, new k5l.a(((h30.n) aVar4.f238082m).t()));
                        o97.r rVar5 = o97.r.YOUR_FIAT_ACCOUNTS;
                        l70.e eVar = aVar4.f238083n;
                        t70.g gVarO = eVar.o();
                        vc.s.j(gVarO);
                        builderBuilderWithExpectedSize.put(rVar5, new vea.d0(gVarO, aVar4.d()));
                        o97.r rVar6 = o97.r.FIAT_ACCOUNTS;
                        t70.g gVarO2 = eVar.o();
                        vc.s.j(gVarO2);
                        builderBuilderWithExpectedSize.put(rVar6, new p0(gVarO2, aVar4.a()));
                        o97.r rVar7 = o97.r.TRANSACTIONS;
                        djf.c cVar = aVar4.f238108y;
                        thf.l lVarF = cVar.f();
                        vc.s.j(lVarF);
                        kjf.a aVar14 = aVar4.z;
                        tjf.l0 l0VarA = aVar14.a();
                        vjf.a aVar15 = aVar4.A;
                        ujf.h hVarA = aVar15.a();
                        mhf.j jVarE = ((bjf.a) aVar4.B).e();
                        vc.s.j(jVarE);
                        f01.c cVarG = aVar9.g();
                        aoi.c cVarA = aoi.f.a();
                        com.revolut.analytics.tracking.v3.d dVarF = aVar4.C.f();
                        vc.s.j(dVarF);
                        builderBuilderWithExpectedSize.put(rVar7, new q0(lVarF, l0VarA, hVarA, jVarE, cVarG, cVarA, dVarF));
                        o97.r rVar8 = o97.r.JOINT_TRANSACTIONS;
                        r0 r0VarC = aVar8.c();
                        usg.a aVar16 = aVar4.o;
                        wsg.n nVarB = aVar16.b();
                        thf.l lVarF2 = cVar.f();
                        vc.s.j(lVarF2);
                        builderBuilderWithExpectedSize.put(rVar8, new tjf.j(r0VarC, nVarB, lVarF2, aVar14.a(), aVar15.a(), aVar9.g()));
                        builderBuilderWithExpectedSize.put(o97.r.FIAT_CURRENCIES_RECENT_TRANSACTIONS, new tjf.v(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.LINKED_ACCOUNTS_RECENT_TRANSACTIONS, new tjf.z(aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.CRYPTO_RECENT_TRANSACTIONS, new tjf.r(aVar14.a(), vd0.d.a()));
                        builderBuilderWithExpectedSize.put(o97.r.PAYMENTS_RECENT_TRANSACTIONS, new tjf.d0(aVar14.a()));
                        o97.r rVar9 = o97.r.WEALTH_ASSETS_ORDERS;
                        mkh.s sVar = (mkh.s) aVar4.D;
                        ite.a aVar17 = sVar.f206400a;
                        gte.a aVarB2 = aVar17.b();
                        vc.s.j(aVarB2);
                        fsl.m mVarB = sVar.u.b();
                        vc.s.j(mVarB);
                        ktl.a aVar18 = sVar.v;
                        htl.l lVar2 = new htl.l();
                        pqi.a aVar19 = sVar.f206415l;
                        builderBuilderWithExpectedSize.put(rVar9, new zkh.p(aVarB2, mVarB, lVar2, new zkh.n(aVar19.g()), new ugc.a(aVar18.a())));
                        o97.r rVar10 = o97.r.WEALTH_STOCKS_IPO;
                        f01.c cVarG2 = aVar19.g();
                        gte.a aVarB3 = aVar17.b();
                        vc.s.j(aVarB3);
                        h9h.a aVar20 = sVar.d;
                        tzg.m mVarT = aVar20.t();
                        vc.s.j(mVarT);
                        zdl.c cVar2 = sVar.f206413j;
                        ybl.b bVarB = cVar2.b();
                        vc.s.j(bVarB);
                        clh.q headerBuilder = new clh.q();
                        clh.a headerVariantTransformer = new clh.a();
                        nbh.a instrumentImageProvider = new nbh.a();
                        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
                        clh.f instrumentSearchItemBuilder = new clh.f();
                        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer, "headerVariantTransformer");
                        Intrinsics.checkNotNullParameter(instrumentSearchItemBuilder, "instrumentSearchItemBuilder");
                        clh.h hVar = new clh.h();
                        c4f.a aVar21 = sVar.e;
                        builderBuilderWithExpectedSize.put(rVar10, new blh.k0(cVarG2, aVarB3, mVarT, bVarB, hVar, aVar21.a(), cVar2.c()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_STOCKS, new n0(aVar19.g(), sVar.f(), new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS, new blh.b0(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar11 = o97.r.WEALTH_STOCKS_ALL;
                        f01.c cVarG3 = aVar19.g();
                        blh.i iVarF = sVar.f();
                        nlh.b bVarA2 = sVar.f206417n.a();
                        vc.s.j(bVarA2);
                        builderBuilderWithExpectedSize.put(rVar11, new blh.q(cVarG3, iVarF, bVarA2, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_ETFS_ALL, new blh.n(aVar19.g(), sVar.f(), new blh.j(), aVar20.g()));
                        o97.r rVar12 = o97.r.WEALTH_BONDS;
                        f01.c cVarG4 = aVar19.g();
                        blh.i iVarF2 = sVar.f();
                        zdl.f fVar2 = sVar.f;
                        ybl.i iVarB = fVar2.b();
                        vc.s.j(iVarB);
                        builderBuilderWithExpectedSize.put(rVar12, new blh.s(cVarG4, iVarF2, iVarB, new blh.j()));
                        o97.r rVar13 = o97.r.WEALTH_FUNDS;
                        f01.c cVarG5 = aVar19.g();
                        blh.i iVarF3 = sVar.f();
                        b4f.b bVarA3 = aVar21.a();
                        ybl.b bVarB2 = cVar2.b();
                        vc.s.j(bVarB2);
                        blh.j jVar = new blh.j();
                        ybl.i iVarB2 = fVar2.b();
                        vc.s.j(iVarB2);
                        builderBuilderWithExpectedSize.put(rVar13, new blh.f0(cVarG5, iVarF3, bVarA3, bVarB2, jVar, iVarB2));
                        o97.r rVar14 = o97.r.WEALTH_MUTUAL_FUNDS;
                        f01.c cVarG6 = aVar19.g();
                        blh.i iVarF4 = sVar.f();
                        ybl.i iVarB3 = fVar2.b();
                        vc.s.j(iVarB3);
                        builderBuilderWithExpectedSize.put(rVar14, new blh.i0(cVarG6, iVarF4, iVarB3, new blh.j()));
                        builderBuilderWithExpectedSize.put(o97.r.WEALTH_CFDS, new blh.u(aVar19.g(), sVar.f(), new blh.j()));
                        o97.r rVar15 = o97.r.WEALTH_INDEXES;
                        f01.c cVarG7 = aVar19.g();
                        y77.i iVar = (y77.i) sVar.o;
                        jpf.a aVarB4 = iVar.b();
                        l77.a aVar22 = (l77.a) iVar.u.get();
                        vc.s.j(aVar22);
                        y87.a marketAssetsMapper = (y87.a) iVar.f311417r.get();
                        vc.s.j(marketAssetsMapper);
                        clh.q searchHeaderBuilder = new clh.q();
                        clh.a headerVariantTransformer2 = new clh.a();
                        Intrinsics.checkNotNullParameter(marketAssetsMapper, "marketAssetsMapper");
                        Intrinsics.checkNotNullParameter(searchHeaderBuilder, "searchHeaderBuilder");
                        Intrinsics.checkNotNullParameter(headerVariantTransformer2, "headerVariantTransformer");
                        builderBuilderWithExpectedSize.put(rVar15, new alh.d(cVarG7, aVarB4, aVar22, new clh.b(), aVar21.a()));
                        o97.r rVar16 = o97.r.WEALTH_COMMODITIES;
                        o7.d dVar4 = new o7.d(sVar.b(), new t5d.d());
                        tzg.m mVarT2 = aVar20.t();
                        vc.s.j(mVarT2);
                        builderBuilderWithExpectedSize.put(rVar16, new blh.x(dVar4, mVarT2, (nih.a) sVar.u0.get()));
                        o97.r rVar17 = o97.r.WEALTH_COMMODITIES_ALL;
                        jbh.e performanceAssetMapper = aVar20.C();
                        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
                        zkh.l lVar3 = new zkh.l();
                        tzg.m mVarT3 = aVar20.t();
                        vc.s.j(mVarT3);
                        builderBuilderWithExpectedSize.put(rVar17, new zkh.m(lVar3, mVarT3, (nih.a) sVar.u0.get(), aVar19.g()));
                        o97.r rVar18 = o97.r.WEALTH_INSTRUMENTS_MOST_TRADED;
                        q9h.c cVar3 = (q9h.c) sVar.f206423r0.get();
                        jbh.e eVarC = aVar20.C();
                        gte.a aVarB5 = aVar17.b();
                        vc.s.j(aVarB5);
                        builderBuilderWithExpectedSize.put(rVar18, new zkh.x(cVar3, eVarC, aVarB5));
                        o97.r rVar19 = o97.r.WEALTH_DISCLAIMER;
                        tzg.m mVarT4 = aVar20.t();
                        vc.s.j(mVarT4);
                        u8h.b bVar2 = (u8h.b) sVar.i;
                        z0h.d dVarC = bVar2.c();
                        vc.s.j(dVarC);
                        z0h.a aVarB6 = bVar2.b();
                        vc.s.j(aVarB6);
                        builderBuilderWithExpectedSize.put(rVar19, new zkh.r(mVarT4, dVarC, aVarB6, (lih.a) sVar.q0.get()));
                        o97.r rVar20 = o97.r.WEALTH_STOCKS_MOST_OWNED;
                        t9h.a aVar23 = (t9h.a) sVar.f206425s0.get();
                        jbh.e eVarC2 = aVar20.C();
                        f01.c cVarG8 = aVar19.g();
                        t5d.d dVar5 = new t5d.d();
                        gte.a aVarB7 = aVar17.b();
                        vc.s.j(aVarB7);
                        whl.f fVar3 = sVar.f206422r;
                        builderBuilderWithExpectedSize.put(rVar20, new zkh.i0(aVar23, eVarC2, cVarG8, dVar5, aVarB7, fVar3.e()));
                        o97.r rVar21 = o97.r.WEALTH_ETFS_MOST_OWNED;
                        gte.a aVarB8 = aVar17.b();
                        vc.s.j(aVarB8);
                        builderBuilderWithExpectedSize.put(rVar21, new zkh.d0(aVarB8, (t9h.a) sVar.f206425s0.get(), aVar20.C(), aVar20.f(), aVar19.g(), fVar3.e()));
                        o97.r rVar22 = o97.r.WEALTH_ASSETS_RECENTLY_VIEWED;
                        dlh.a recentlyViewedMapper = new dlh.a(aVar20.C());
                        zkh.l0 recentlyViewedSearchDataProvider = sVar.l();
                        r39.a performanceAssetDestinationProvider = new r39.a(new g9h.c());
                        t0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(recentlyViewedMapper, "recentlyViewedMapper");
                        Intrinsics.checkNotNullParameter(recentlyViewedSearchDataProvider, "recentlyViewedSearchDataProvider");
                        Intrinsics.checkNotNullParameter(performanceAssetDestinationProvider, "performanceAssetDestinationProvider");
                        builderBuilderWithExpectedSize.put(rVar22, new zkh.o0(recentlyViewedMapper, recentlyViewedSearchDataProvider, performanceAssetDestinationProvider));
                        o97.r rVar23 = o97.r.WEALTH_STOCKS_SCREENER;
                        elh.a aVar24 = new elh.a();
                        tzg.m mVarT5 = aVar20.t();
                        vc.s.j(mVarT5);
                        builderBuilderWithExpectedSize.put(rVar23, new elh.c(aVar24, mVarT5, aVar19.g()));
                        o97.r rVar24 = o97.r.TRADING_HOLDINGS;
                        x8h.k kVarD = aVar20.d();
                        ael.t tVarF = cVar2.f();
                        vc.s.j(tVarF);
                        ybl.k kVarD2 = fVar2.d();
                        vc.s.j(kVarD2);
                        zkh.h hVar2 = new zkh.h(kVarD, tVarF, kVarD2, new ufl.b(new tfl.a()), new t5d.d());
                        f01.c cVarG9 = aVar19.g();
                        ybl.i iVarB4 = fVar2.b();
                        vc.s.j(iVarB4);
                        builderBuilderWithExpectedSize.put(rVar24, new zkh.v(hVar2, cVarG9, iVarB4, aVar21.a()));
                        o97.r rVar25 = o97.r.TRADING_TRANSACTIONS;
                        x8h.q qVarA = aVar20.A();
                        yah.a aVar25 = sVar.f206416m;
                        f1h.e eVar2 = (f1h.e) aVar25.f312023c.get();
                        vc.s.j(eVar2);
                        builderBuilderWithExpectedSize.put(rVar25, new zkh.r0(qVarA, eVar2, aVar25.b()));
                        o97.r rVar26 = o97.r.JUNIOR_KIDS_RECENT_TRANSACTIONS;
                        wsg.n nVarB2 = aVar16.b();
                        hj8.a aVarA = aVar4.E.a();
                        vc.s.j(aVarA);
                        te8.a0 a0Var = (te8.a0) aVar4.F.f262160y.get();
                        vc.s.j(a0Var);
                        thf.g gVarE = cVar.e();
                        vc.s.j(gVarE);
                        tjf.l0 l0VarA2 = aVar14.a();
                        ila.b bVar3 = aVar4.G;
                        builderBuilderWithExpectedSize.put(rVar26, new k5l.j(nVarB2, aVarA, a0Var, gVarE, l0VarA2, bVar3.a()));
                        o97.r rVar27 = o97.r.JUNIOR_RECENT_TRANSACTIONS;
                        jla.h hVarA2 = bVar3.a();
                        wsg.n nVarB3 = aVar16.b();
                        thf.g gVarE2 = cVar.e();
                        vc.s.j(gVarE2);
                        builderBuilderWithExpectedSize.put(rVar27, new k5l.n(hVarA2, nVarB3, gVarE2, aVar14.a()));
                        builderBuilderWithExpectedSize.put(o97.r.VAULTS_RECENT_TRANSACTIONS, new tjf.h0(aVar14.a()));
                        o97.r rVar28 = o97.r.CREDIT_RECENT_TRANSACTIONS;
                        jm4.r rVar29 = aVar4.H;
                        al4.p pVarI = rVar29.i();
                        u45.h hVar3 = aVar4.I;
                        builderBuilderWithExpectedSize.put(rVar28, new tjf.n(pVarI, aVar14.a(), hVar3.g()));
                        builderBuilderWithExpectedSize.put(o97.r.CREDIT_PAYMENTS, new tjf.c(rVar29.i(), aVar14.a(), hVar3.g()));
                        o97.r rVar30 = o97.r.VAULTS;
                        wpg.l lVar4 = (wpg.l) aVar4.J;
                        ppg.b bVarB3 = lVar4.b();
                        vc.s.j(bVarB3);
                        xmg.a aVar26 = aVar4.f238088p;
                        ang.f fVarE = aVar26.e();
                        dcd.b bVar4 = new dcd.b();
                        f01.c cVarG10 = aVar9.g();
                        kpg.a aVar27 = (kpg.a) lVar4.I.get();
                        vc.s.j(aVar27);
                        wa7.m mVarI = aVar10.i();
                        xoj.a aVarA2 = aVar12.a();
                        vc.s.j(aVarA2);
                        builderBuilderWithExpectedSize.put(rVar30, new uwl.d(bVarB3, fVarE, bVar4, cVarG10, aVar27, mVarI, aVarA2));
                        o97.r rVar31 = o97.r.SHOPS_BRANDS;
                        pid.b bVar5 = (pid.b) aVar4.K.E.get();
                        vc.s.j(bVar5);
                        builderBuilderWithExpectedSize.put(rVar31, bVar5);
                        o97.r rVar32 = o97.r.GIFT_CARDS;
                        vvb.a aVar28 = (vvb.a) aVar4.L.f169074t.get();
                        vc.s.j(aVar28);
                        builderBuilderWithExpectedSize.put(rVar32, aVar28);
                        o97.r rVar33 = o97.r.PLAN_SUBSCRIPTIONS;
                        jgc.a aVar29 = (jgc.a) aVar4.M.f297581w.get();
                        vc.s.j(aVar29);
                        builderBuilderWithExpectedSize.put(rVar33, aVar29);
                        o97.r rVar34 = o97.r.CRYPTOCURRENCIES;
                        vea.l lVarA = aVar4.a();
                        t70.g gVarO3 = eVar.o();
                        vc.s.j(gVarO3);
                        gte.a aVarB9 = aVar11.b();
                        vc.s.j(aVarB9);
                        builderBuilderWithExpectedSize.put(rVar34, new m0(lVarA, gVarO3, new vea.j0(aVarB9)));
                        o97.r rVar35 = o97.r.YOUR_CRYPTOCURRENCIES;
                        vea.x xVarD2 = aVar4.d();
                        t70.g gVarO4 = eVar.o();
                        vc.s.j(gVarO4);
                        gte.a aVarB10 = aVar11.b();
                        vc.s.j(aVarB10);
                        builderBuilderWithExpectedSize.put(rVar35, new vea.a0(xVarD2, gVarO4, new vea.j0(aVarB10)));
                        o97.r rVar36 = o97.r.HELPCENTRE;
                        ede.b bVar6 = aVar4.N;
                        wf0.a0 a0Var2 = (wf0.a0) bVar6.f124987b.G.get();
                        vc.s.j(a0Var2);
                        gte.a aVarB11 = bVar6.i.b();
                        vc.s.j(aVarB11);
                        ffk.t tVarF2 = bVar6.f124991j.f();
                        vc.s.j(tVarF2);
                        builderBuilderWithExpectedSize.put(rVar36, new ide.d(a0Var2, new lde.n(tVarF2, aVarB11)));
                        o97.r rVar37 = o97.r.EXPERIENCES;
                        e1g.j jVar2 = (e1g.j) aVar4.O.f318302b0.get();
                        vc.s.j(jVar2);
                        builderBuilderWithExpectedSize.put(rVar37, jVar2);
                        o97.r rVar38 = o97.r.CREDIT_CARDS;
                        qp3.a aVar30 = (qp3.a) ((t15.d) aVar4.P).P.get();
                        vc.s.j(aVar30);
                        builderBuilderWithExpectedSize.put(rVar38, aVar30);
                        o97.r rVar39 = o97.r.ESIM;
                        aej.a aVar31 = (aej.a) aVar4.Q.f4154r0.get();
                        vc.s.j(aVar31);
                        builderBuilderWithExpectedSize.put(rVar39, aVar31);
                        builderBuilderWithExpectedSize.put(o97.r.SECRET_ACCOUNTS_PHRASE_MATCH, new va7.a(aVar10.i()));
                        o97.r rVar40 = o97.r.TRAVEL_STATUS_PARTNERS;
                        y1l.b bVar7 = aVar4.R;
                        ugc.a aVar32 = new ugc.a((u1l.b) bVar7.f310399n.get());
                        gte.a aVarB12 = bVar7.f310391a.b();
                        vc.s.j(aVarB12);
                        builderBuilderWithExpectedSize.put(rVar40, new b2l.d(aVar32, aVarB12));
                        o97.r rVar41 = o97.r.CARDS;
                        da3.j jVar3 = aVar4.S;
                        l93.f fVarJ = jVar3.j();
                        vc.s.j(fVarJ);
                        mt8.d dVarB = aVar4.T.b();
                        vc.s.j(dVarB);
                        sh3.a aVarA3 = aVar4.U.a();
                        vc.s.j(aVarA3);
                        oi9.f fVar4 = aVar4.V;
                        xh9.a aVarE = fVar4.e();
                        vc.s.j(aVarE);
                        zjh.j jVarA = aVar4.W.a();
                        ti9.h hVarB = fVar4.b();
                        r0 r0VarC2 = aVar8.c();
                        f01.c cVarG11 = aVar9.g();
                        ia3.r rVarB = jVar3.b();
                        m93.d dVarF2 = jVar3.f();
                        vc.s.j(dVarF2);
                        builderBuilderWithExpectedSize.put(rVar41, new x97.e(fVarJ, dVarB, aVarA3, aVarE, jVarA, hVarB, r0VarC2, cVarG11, new x97.a(rVarB, dVarF2), aVar4.X.a()));
                        builderBuilderWithExpectedSize.put(o97.r.SUGGESTIONS_INVEST, new y97.e(sVar.l(), new y97.b(aVar4.Y.C()), (t97.b) aVar4.C1.get(), new p97.d(), new r39.a(new g9h.c())));
                        o97.r rVar42 = o97.r.JUNIOR_ACCOUNTS;
                        zf8.k kVarA = aVar4.f238064c1.a();
                        vc.s.j(kVarA);
                        builderBuilderWithExpectedSize.put(rVar42, new z97.f(kVarA, aVar9.g(), bVar3.a(), aVar4.f238066d1.a()));
                        o97.r rVar43 = o97.r.SUGGESTIONS;
                        t97.b bVar8 = (t97.b) aVar4.C1.get();
                        xo.h hVarA3 = aVar4.W0.a();
                        gte.a aVarB13 = aVar11.b();
                        vc.s.j(aVarB13);
                        builderBuilderWithExpectedSize.put(rVar43, new ca7.e(bVar8, hVarA3, aVarB13, (fa7.a) aVar4.D1.get()));
                        builderBuilderWithExpectedSize.put(o97.r.PRODUCTS, aVar4.E1.get());
                        o97.r rVar44 = o97.r.PAYMENT_ACTIONS;
                        dsd.i iVarB5 = aVar4.b();
                        ly9.l lVarF3 = aVar4.f();
                        my9.a aVar33 = new my9.a();
                        fl9.a aVar34 = (fl9.a) aVar4.f238081l1;
                        builderBuilderWithExpectedSize.put(rVar44, new my9.e(iVarB5, lVarF3, aVar33, aVar34.a()));
                        o97.r rVar45 = o97.r.GROUPS;
                        jr9.b bVar9 = aVar4.f238079k1;
                        rq9.a aVarA4 = bVar9.a();
                        vc.s.j(aVarA4);
                        mq9.f fVarC = bVar9.c();
                        vc.s.j(fVarC);
                        builderBuilderWithExpectedSize.put(rVar45, new my9.m(new jx0.a(aVarA4, fVarC), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.GROUP_ACTIONS, new my9.i(aVar4.b(), aVar4.f(), new my9.a(), aVar34.a()));
                        o97.r rVar46 = o97.r.RECENT_PAID_CONTACTS;
                        xx9.p pVarB = aVar4.f238096s1.b();
                        vc.s.j(pVarB);
                        builderBuilderWithExpectedSize.put(rVar46, new my9.q(new kpj.f(pVarB, new oy9.f()), aVar4.f()));
                        o97.r rVar47 = o97.r.CONTACTS;
                        d3j.b beneficiaryInteractor = ((b3j.p) aVar4.m1).e();
                        lra.d cardsInteractor = ((jqa.p) aVar4.f238085n1).b();
                        vc.s.j(cardsInteractor);
                        py9.a contactsSearchInteractor = aVar4.c();
                        vl3.n nVar = aVar4.f238087o1;
                        cl3.a aVarD = nVar.d();
                        vc.s.j(aVarD);
                        kgm.i usernameSearchInteractor = new kgm.i(aVarD, aVar26.e());
                        ang.f fVarE2 = aVar26.e();
                        z80.b bVarS = eVar.s();
                        vc.s.j(bVarS);
                        onh.b virtualSearchInteractor = new onh.b(new jul.o(fVarE2, bVarS));
                        co9.b paymentCounterpartyInteractor = aVar4.f238093r1.b();
                        vc.s.j(paymentCounterpartyInteractor);
                        oy9.f recipientSearchItemClickDelegate = new oy9.f();
                        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
                        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
                        Intrinsics.checkNotNullParameter(contactsSearchInteractor, "contactsSearchInteractor");
                        Intrinsics.checkNotNullParameter(usernameSearchInteractor, "usernameSearchInteractor");
                        Intrinsics.checkNotNullParameter(virtualSearchInteractor, "virtualSearchInteractor");
                        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
                        Intrinsics.checkNotNullParameter(recipientSearchItemClickDelegate, "recipientSearchItemClickDelegate");
                        hd.r rVar48 = new hd.r();
                        rVar48.f151364a = beneficiaryInteractor;
                        rVar48.f151365b = cardsInteractor;
                        rVar48.f151366c = contactsSearchInteractor;
                        rVar48.d = usernameSearchInteractor;
                        rVar48.e = virtualSearchInteractor;
                        rVar48.f = paymentCounterpartyInteractor;
                        builderBuilderWithExpectedSize.put(rVar47, new my9.u(rVar48, aVar4.f(), aVar9.g()));
                        o97.r rVar49 = o97.r.USERNAME;
                        py9.a aVarC = aVar4.c();
                        cl3.a aVarD2 = nVar.d();
                        vc.s.j(aVarD2);
                        builderBuilderWithExpectedSize.put(rVar49, new my9.y(new oy9.j(aVarC, new kgm.i(aVarD2, aVar26.e())), aVar4.f()));
                        builderBuilderWithExpectedSize.put(o97.r.JOINT_ACCOUNTS, new s0(aVar9.g(), aVar4.a(), aVar8.c()));
                        builderBuilderWithExpectedSize.put(o97.r.YOUR_JOINT_ACCOUNTS, new vea.g0(aVar9.g(), aVar4.d(), aVar8.c()));
                        ImmutableMap sources = builderBuilderWithExpectedSize.build();
                        pp.h.Companion.getClass();
                        Intrinsics.checkNotNullParameter(sources, "sources");
                        vc.s.k(sources);
                        builder.putAll(sources);
                        builder.put(o97.r.SMART_TILES, smartTileSearchSource);
                        builder.put(o97.r.RECENT_QUERIES, recentQueriesSearchSource);
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new n(globalSearchContext, fVar, bVarA, dVar2, oVar, xVarD, aVar2, aVarB, aVar3, gVar, builder.b(), (ImmutableSet) bVar.g());
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        return (on.a) ((g97.b) ((m97.c) globalSearchScreen.N.getValue())).f141480t.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        GlobalSearchScreen globalSearchScreen2 = this.f193050b;
                        return dli.f.a(globalSearchScreen2, globalSearchScreen2.d(), zhm.v.k(globalSearchScreen2.X, globalSearchScreen2.S, globalSearchScreen2.f74619a0, globalSearchScreen2.U, globalSearchScreen2.V, new RowLoadingDelegate(), globalSearchScreen2.f74620b0, globalSearchScreen2.c0, globalSearchScreen2.W, globalSearchScreen2.f0, new ListSubheaderLoadingDelegate(), globalSearchScreen2.Z, globalSearchScreen2.i0, globalSearchScreen2.f74624k0, globalSearchScreen2.j0, globalSearchScreen2.m0, globalSearchScreen2.l0, globalSearchScreen2.f74625n0, globalSearchScreen2.f74626o0, globalSearchScreen2.p0, globalSearchScreen2.q0, globalSearchScreen2.f74627r0), 0, null, new koi.h(null, false, true, 1), null, 44);
                }
            }
        });
        this.Q = v0.a.d("create(...)");
        this.R = v0.a.d("create(...)");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        SmallCardDelegate smallCardDelegate = new SmallCardDelegate(null);
        this.T = smallCardDelegate;
        this.U = new ListSubheaderDelegate();
        this.V = new AccountCellItemDelegate();
        this.W = new ActionsDelegate();
        this.X = new ScrollerDelegate(v.k(smallCardDelegate, new SmallCardLoadingDelegate(null)), false);
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Y = referralContactDelegate;
        this.Z = new ScrollerBoxDelegate(v.k(referralContactDelegate, new RewardLoadingDelegate()));
        this.f74619a0 = new SwipeToActionDelegate(rowDelegate, false);
        this.f74620b0 = new FullScreenStateDelegate();
        this.c0 = new NewsDelegate();
        ReferralContactDelegate referralContactDelegate2 = new ReferralContactDelegate();
        this.f74621d0 = referralContactDelegate2;
        IconDelegate iconDelegate = new IconDelegate();
        this.f74622e0 = iconDelegate;
        this.f0 = new GridBoxDelegate(v.k(iconDelegate, referralContactDelegate2, new IconLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.g0 = new LargeActionButtonDelegate();
        this.f74623h0 = new TwinHorizontalButtonDelegate();
        this.i0 = new TextDelegate();
        this.j0 = new SmartTileExchangeLoadingDelegate();
        this.f74624k0 = new SmartTileExchangeDelegate(new j(this, 27));
        this.l0 = new SmartTileSendMoneyLoadingDelegate();
        this.m0 = new SmartTileSendMoneyDelegate(new l0c.v(this, 18));
        this.f74625n0 = new SmartTileAssetViewLoadingDelegate();
        this.f74626o0 = new SmartTileAssetViewDelegate();
        this.p0 = new EsimDelegate();
        this.q0 = new EsimDetailsDelegate();
        this.f74627r0 = new RewardsGridDelegate();
        this.f74628s0 = s.t(this, e.f);
        this.f74629t0 = true;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = f3().f174539b;
        List<? extends Clause> list = uiState.f193060b;
        String str = uiState.f193061c;
        navBarWithToolbar.setHints(list);
        if (this.f74629t0) {
            f3().f174539b.setSearchInput(uiState.f193059a);
            this.f74629t0 = false;
        }
        l8 l8Var = uiState.f;
        if (l8Var != null) {
            c cVar = l8Var.f10412b;
            if (!cVar.f6128a) {
                cVar.f6128a = true;
                f3().f174539b.setSearchInputSilently(new TextClause((String) l8Var.f10411a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
        }
        if (Intrinsics.f(str, this.u0)) {
            return;
        }
        this.u0 = str;
        if (this.F.getState() != Lifecycle.State.RESUMED || str == null) {
            return;
        }
        f3().f174540c.scrollToPosition(0);
        e3(str);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m97.c) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 1024) {
            ExchangeGlobalAccessOutput exchangeGlobalAccessOutput = (i2 != -1 || intent == null) ? null : (ExchangeGlobalAccessOutput) intent.getParcelableExtra("EXCHANGE_GLOBAL_ACCESS_OUTPUT");
            n nVar = (n) d();
            o97.f fVar = nVar.D;
            nVar.D = null;
            if (fVar == null || !(exchangeGlobalAccessOutput instanceof ExchangeGlobalAccessOutput.FeatureAvailable)) {
                return;
            }
            nVar.K2(new k0(fVar.f223098a, fVar.f223099b));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        g97.b bVar = (g97.b) ((m97.c) this.N.getValue());
        b bVarN = bVar.f141468b.f141463a.n();
        s.j(bVarN);
        this.z0 = bVarN;
        this.A0 = (j60.a) bVar.o.get();
        pd.b.p(view, new TextLocalisedClause(R$string.search_title_accessibility, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = f3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.accountHome_search_placeholder, null, null, 14));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.E0();
        ScreenContentRecyclerView recyclerView = f3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
        f3().f174540c.setItemAnimator(new hoi.i(0));
        j60.a aVar = this.A0;
        if (aVar != null) {
            aVar.d(v.k(this.S, this.U, this.g0, this.f74623h0));
        } else {
            Intrinsics.r("bottomSheetApi");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        r rVar = this.f74630v0;
        if (rVar != null) {
            i3(rVar);
        }
    }

    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        final int i = 0;
        d3(f3().f174539b.f59409p.f57336l, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i2 = i;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i3 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i3 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 2;
        d3(f3().f174539b.f59409p.f57337m, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i22 = i2;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i3 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i3 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 14;
        d3(f3().f174539b.f59409p.o, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i22 = i3;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i32 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i32 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i32 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i5 = 15;
        d3(this.f74619a0.f, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i22 = i5;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i32 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i32 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i32 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i6 = 16;
        d3(this.Y.q(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i22 = i6;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i32 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i32 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i32 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        RowDelegate rowDelegate = this.S;
        efm.r rVarMergeWith = rowDelegate.f53218h.mergeWith(this.V.f51551c.f53218h);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        final int i21 = 17;
        d3(rVarMergeWith, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i22 = i21;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i22) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i32 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i32 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i32 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i22 = 18;
        d3(rowDelegate.f53220l, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i22;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i32 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i32 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i32 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        NewsDelegate newsDelegate = this.c0;
        final int i32 = 19;
        d3(newsDelegate.p(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i32;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i33 = 20;
        d3(newsDelegate.q(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i33;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i43 = 21;
        d3(newsDelegate.r(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i43;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i59 = 11;
        d3(this.U.f52707c, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i59;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i66 = 22;
        d3(this.T.d, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i66;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i74 = 23;
        d3(this.f74622e0.p(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i74;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i92 = 24;
        d3(this.f74621d0.q(), new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i92;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i96 = 25;
        d3(this.g0.d.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i96;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f74623h0;
        final int i99 = 26;
        d3(twinHorizontalButtonDelegate.f53572c.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i99;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i100 = 27;
        d3(twinHorizontalButtonDelegate.d.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i100;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        on.a aVar = (on.a) this.O.getValue();
        ScreenContentRecyclerView recyclerView = f3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) aVar).b(recyclerView, false), null, new l97.f(this, null, 0), 3);
        final int i101 = 28;
        d3(this.W.f51611c.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i101;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i102 = 29;
        d3(this.i0.d, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i102;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i103 = 1;
        d3(this.Q, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i103;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        SmartTileExchangeDelegate smartTileExchangeDelegate = this.f74624k0;
        final int i104 = 3;
        d3(smartTileExchangeDelegate.d.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i104;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i105 = 4;
        d3(smartTileExchangeDelegate.f, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i105;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i106 = 5;
        d3(smartTileExchangeDelegate.e.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i106;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i107 = 6;
        d3(this.R, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i107;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        SmartTileSendMoneyDelegate smartTileSendMoneyDelegate = this.m0;
        final int i108 = 7;
        d3(smartTileSendMoneyDelegate.e.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i108;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i109 = 8;
        d3(smartTileSendMoneyDelegate.d.f121375b, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i109;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i110 = 9;
        d3(this.f74626o0.f53401c, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i110;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i111 = 10;
        d3(this.p0.d, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i111;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i112 = 12;
        d3(this.q0.d, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i112;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        final int i113 = 13;
        d3(this.f74627r0.f53209c.d, new Function1(this) { // from class: l97.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalSearchScreen f193045b;

            {
                this.f193045b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                l0 l0VarM2;
                int i222 = i113;
                o97.y yVarA = null;
                GlobalSearchScreen globalSearchScreen = this.f193045b;
                switch (i222) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        globalSearchScreen.m2().onBackPressed();
                        return Unit.f186387a;
                    case 1:
                        zg data = (zg) obj2;
                        KProperty[] kPropertyArr2 = GlobalSearchScreen.B0;
                        h hVarD = globalSearchScreen.d();
                        Intrinsics.h(data);
                        n nVar = (n) hVarD;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        SmartTileExchangeDelegate.Model model = data.f55711c;
                        o97.y yVarL2 = n.L2(model.f53432q);
                        if (yVarL2 != null) {
                            nVar.K2(new k0(model.f53422a, o97.y.a(yVarL2, "tile_exchange_amount_changed", null, data, 43)));
                        }
                        return Unit.f186387a;
                    case 2:
                        String query = (String) obj2;
                        KProperty[] kPropertyArr3 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(query, "query");
                        n nVar2 = (n) globalSearchScreen.d();
                        nVar2.getClass();
                        Intrinsics.checkNotNullParameter(query, "query");
                        cli.y yVar = nVar2.G;
                        if (!Intrinsics.f(((i) ((j2) yVar.f22677a).getValue()).f193059a, query) || ((i) ((j2) yVar.f22677a).getValue()).f != null) {
                            nVar2.H2(yVar, new l3d.a(query, 5));
                            nVar2.F.setValue(n.N2(query));
                        }
                        return Unit.f186387a;
                    case 3:
                        yg data2 = (yg) obj2;
                        KProperty[] kPropertyArr4 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data2, "data");
                        n nVar3 = (n) globalSearchScreen.d();
                        nVar3.getClass();
                        Intrinsics.checkNotNullParameter(data2, "data");
                        o97.y yVarL22 = n.L2(data2.f55652b.f53432q);
                        if (yVarL22 != null) {
                            nVar3.K2(new k0(data2.f55652b.f53422a, o97.y.a(yVarL22, "tile_exchange_focus_changed", null, data2, 43)));
                        }
                        return Unit.f186387a;
                    case 4:
                        SmartTileExchangeDelegate.Model model2 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr5 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        n nVar4 = (n) globalSearchScreen.d();
                        nVar4.getClass();
                        Intrinsics.checkNotNullParameter(model2, "model");
                        o97.y yVarL23 = n.L2(model2.f53432q);
                        if (yVarL23 != null) {
                            nVar4.K2(new k0(model2.f53422a, o97.y.a(yVarL23, "tile_exchange_chart_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 5:
                        SmartTileExchangeDelegate.Model model3 = (SmartTileExchangeDelegate.Model) obj2;
                        KProperty[] kPropertyArr6 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model3, "model");
                        n nVar5 = (n) globalSearchScreen.d();
                        nVar5.getClass();
                        Intrinsics.checkNotNullParameter(model3, "model");
                        o97.y yVarL24 = n.L2(model3.f53432q);
                        if (yVarL24 != null) {
                            nVar5.K2(nVar5.M2(model3.f53422a, o97.y.a(yVarL24, "tile_button_click", null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 6:
                        ch data3 = (ch) obj2;
                        KProperty[] kPropertyArr7 = GlobalSearchScreen.B0;
                        h hVarD2 = globalSearchScreen.d();
                        Intrinsics.h(data3);
                        n nVar6 = (n) hVarD2;
                        nVar6.getClass();
                        Intrinsics.checkNotNullParameter(data3, "data");
                        SmartTileSendMoneyDelegate.Model model4 = data3.f53759b;
                        o97.y yVarL25 = n.L2(model4.f53446h);
                        if (yVarL25 != null) {
                            nVar6.K2(new k0(model4.f53442a, o97.y.a(yVarL25, "tile_send_money_amount_changed", null, data3, 43)));
                        }
                        return Unit.f186387a;
                    case 7:
                        SmartTileSendMoneyDelegate.Model model5 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr8 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model5, "data");
                        n nVar7 = (n) globalSearchScreen.d();
                        nVar7.getClass();
                        Intrinsics.checkNotNullParameter(model5, "model");
                        o97.y yVarL26 = n.L2(model5.f53446h);
                        if (yVarL26 != null) {
                            nVar7.K2(nVar7.M2(model5.f53442a, o97.y.a(yVarL26, "tile_send_money_button_click", null, model5, 43)));
                        }
                        return Unit.f186387a;
                    case 8:
                        SmartTileSendMoneyDelegate.Model model6 = (SmartTileSendMoneyDelegate.Model) obj2;
                        KProperty[] kPropertyArr9 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model6, "data");
                        n nVar8 = (n) globalSearchScreen.d();
                        nVar8.getClass();
                        Intrinsics.checkNotNullParameter(model6, "model");
                        o97.y yVarL27 = n.L2(model6.f53446h);
                        if (yVarL27 != null) {
                            nVar8.K2(new k0(model6.f53442a, o97.y.a(yVarL27, "tile_send_money_recipient_click", null, model6, 43)));
                        }
                        return Unit.f186387a;
                    case 9:
                        SmartTileAssetViewDelegate.Model model7 = (SmartTileAssetViewDelegate.Model) obj2;
                        KProperty[] kPropertyArr10 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model7, "data");
                        n nVar9 = (n) globalSearchScreen.d();
                        nVar9.getClass();
                        Intrinsics.checkNotNullParameter(model7, "model");
                        o97.y yVarL28 = n.L2(model7.f53405g);
                        if (yVarL28 != null) {
                            nVar9.K2(nVar9.M2(model7.f53402a, o97.y.a(yVarL28, "SMART_TILE_ASSET_VIEW_ITEM_CLICK", null, model7, 43)));
                        }
                        return Unit.f186387a;
                    case 10:
                        EsimDelegate.Model model8 = (EsimDelegate.Model) obj2;
                        KProperty[] kPropertyArr11 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model8, "data");
                        n nVar10 = (n) globalSearchScreen.d();
                        nVar10.getClass();
                        Intrinsics.checkNotNullParameter(model8, "model");
                        o97.y yVarL29 = n.L2(model8.f52238q);
                        if (yVarL29 != null) {
                            nVar10.K2(nVar10.M2(model8.f52228a, yVarL29));
                        }
                        return Unit.f186387a;
                    case 11:
                        ListSubheaderDelegate.Model model9 = (ListSubheaderDelegate.Model) obj2;
                        KProperty[] kPropertyArr12 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model9, "model");
                        n nVar11 = (n) globalSearchScreen.d();
                        nVar11.getClass();
                        Intrinsics.checkNotNullParameter(model9, "model");
                        o97.y yVarL210 = n.L2(model9.f52715m);
                        if (yVarL210 != null) {
                            nVar11.K2(new k0(model9.f52708a, yVarL210));
                        }
                        return Unit.f186387a;
                    case 12:
                        EsimDetailsDelegate.Model model10 = (EsimDetailsDelegate.Model) obj2;
                        KProperty[] kPropertyArr13 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model10, "data");
                        n nVar12 = (n) globalSearchScreen.d();
                        nVar12.getClass();
                        Intrinsics.checkNotNullParameter(model10, "model");
                        o97.y yVarL211 = n.L2(model10.f52249j);
                        if (yVarL211 != null) {
                            nVar12.K2(nVar12.M2(model10.f52244a, yVarL211));
                        }
                        return Unit.f186387a;
                    case 13:
                        RewardDelegate.Model model11 = (RewardDelegate.Model) obj2;
                        KProperty[] kPropertyArr14 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model11, "data");
                        n nVar13 = (n) globalSearchScreen.d();
                        nVar13.getClass();
                        Intrinsics.checkNotNullParameter(model11, "model");
                        o97.y yVarL212 = n.L2(model11.f53195h);
                        if (yVarL212 != null) {
                            nVar13.K2(nVar13.M2(model11.f53191a, yVarL212));
                        }
                        return Unit.f186387a;
                    case 14:
                        String it9 = (String) obj2;
                        KProperty[] kPropertyArr15 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0m.e.c(globalSearchScreen.m2());
                        return Unit.f186387a;
                    case 15:
                        vh clickData = (vh) obj2;
                        KProperty[] kPropertyArr16 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(clickData, "it");
                        n nVar14 = (n) globalSearchScreen.d();
                        nVar14.getClass();
                        Intrinsics.checkNotNullParameter(clickData, "clickData");
                        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
                        Object obj3 = clickData.f54884b;
                        Object obj4 = swipeAction.f;
                        String str = swipeAction.f53505a;
                        if (obj4 instanceof o97.y) {
                            yVarA = (o97.y) obj4;
                        } else if (obj4 instanceof o97.z) {
                            yVarA = o97.y.a(((zkh.i) ((o97.z) obj4)).f323000a, null, null, clickData, 47);
                        } else {
                            Object obj5 = ((RowDelegate.Model) obj3).u;
                            if (obj5 instanceof o97.y) {
                                yVarA = o97.y.a((o97.y) obj5, str, null, null, 59);
                            } else if (obj5 instanceof o97.z) {
                                yVarA = o97.y.a(((zkh.i) ((o97.z) obj5)).f323000a, str, null, clickData, 43);
                            }
                        }
                        if (yVarA != null) {
                            int i322 = k.f193077a[clickData.f54885c.ordinal()];
                            if (i322 == 1) {
                                l0VarM2 = nVar14.M2(((RowDelegate.Model) obj3).f53228a, yVarA);
                            } else {
                                if (i322 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                l0VarM2 = new k0(((RowDelegate.Model) obj3).f53228a, yVarA);
                            }
                            nVar14.K2(l0VarM2);
                        }
                        return Unit.f186387a;
                    case 16:
                        ReferralContactDelegate.Model model12 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr17 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model12, "it");
                        n nVar15 = (n) globalSearchScreen.d();
                        nVar15.getClass();
                        Intrinsics.checkNotNullParameter(model12, "model");
                        o97.y yVarL213 = n.L2(model12.f53167l);
                        if (yVarL213 != null) {
                            nVar15.K2(nVar15.M2(model12.f53161a, yVarL213));
                        }
                        return Unit.f186387a;
                    case 17:
                        RowDelegate.Model model13 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr18 = GlobalSearchScreen.B0;
                        h hVarD3 = globalSearchScreen.d();
                        Intrinsics.h(model13);
                        n nVar16 = (n) hVarD3;
                        nVar16.getClass();
                        Intrinsics.checkNotNullParameter(model13, "model");
                        o97.y yVarL214 = n.L2(model13.u);
                        if (yVarL214 != null) {
                            nVar16.K2(nVar16.M2(model13.f53228a, yVarL214));
                        }
                        return Unit.f186387a;
                    case 18:
                        RowDelegate.Model model14 = (RowDelegate.Model) obj2;
                        KProperty[] kPropertyArr19 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model14, "model");
                        n nVar17 = (n) globalSearchScreen.d();
                        nVar17.getClass();
                        Intrinsics.checkNotNullParameter(model14, "model");
                        o97.y yVarL215 = n.L2(model14.u);
                        RowDelegate.Model.c cVar = model14.k;
                        pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                        Object obj6 = pfVar != null ? pfVar.f : null;
                        String str2 = obj6 instanceof String ? (String) obj6 : null;
                        if (yVarL215 != null && str2 != null) {
                            nVar17.K2(nVar17.M2(model14.f53228a, o97.y.a(yVarL215, str2, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 19:
                        NewsDelegate.Model model15 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr20 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model15, "model");
                        n nVar18 = (n) globalSearchScreen.d();
                        nVar18.getClass();
                        Intrinsics.checkNotNullParameter(model15, "model");
                        o97.y yVarL216 = n.L2(model15.k);
                        if (yVarL216 != null) {
                            nVar18.K2(nVar18.M2(model15.f52833a, yVarL216));
                        }
                        return Unit.f186387a;
                    case 20:
                        NewsDelegate.Model model16 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr21 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model16, "model");
                        n nVar19 = (n) globalSearchScreen.d();
                        nVar19.getClass();
                        Intrinsics.checkNotNullParameter(model16, "model");
                        o97.y yVarL217 = n.L2(model16.k);
                        if (yVarL217 != null) {
                            nVar19.K2(new k0(model16.f52833a, yVarL217));
                        }
                        return Unit.f186387a;
                    case 21:
                        NewsDelegate.Model model17 = (NewsDelegate.Model) obj2;
                        KProperty[] kPropertyArr22 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model17, "model");
                        n nVar20 = (n) globalSearchScreen.d();
                        nVar20.getClass();
                        Intrinsics.checkNotNullParameter(model17, "model");
                        o97.y yVarL218 = n.L2(model17.k);
                        if (yVarL218 != null) {
                            nVar20.K2(new k0(model17.f52833a, yVarL218));
                        }
                        return Unit.f186387a;
                    case 22:
                        SmallCardDelegate.Model model18 = (SmallCardDelegate.Model) obj2;
                        KProperty[] kPropertyArr23 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model18, "model");
                        n nVar21 = (n) globalSearchScreen.d();
                        nVar21.getClass();
                        Intrinsics.checkNotNullParameter(model18, "model");
                        o97.y yVarL219 = n.L2(model18.f53364p);
                        if (yVarL219 != null) {
                            nVar21.K2(nVar21.M2(model18.f53355a, yVarL219));
                        }
                        return Unit.f186387a;
                    case 23:
                        IconDelegate.Model model19 = (IconDelegate.Model) obj2;
                        KProperty[] kPropertyArr24 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model19, "model");
                        n nVar22 = (n) globalSearchScreen.d();
                        nVar22.getClass();
                        Intrinsics.checkNotNullParameter(model19, "model");
                        o97.y yVarL220 = n.L2(model19.i);
                        if (yVarL220 != null) {
                            nVar22.K2(nVar22.M2(model19.f52483a, yVarL220));
                        }
                        return Unit.f186387a;
                    case 24:
                        ReferralContactDelegate.Model model20 = (ReferralContactDelegate.Model) obj2;
                        KProperty[] kPropertyArr25 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model20, "model");
                        n nVar23 = (n) globalSearchScreen.d();
                        nVar23.getClass();
                        Intrinsics.checkNotNullParameter(model20, "model");
                        o97.y yVarL221 = n.L2(model20.f53167l);
                        if (yVarL221 != null) {
                            nVar23.K2(nVar23.M2(model20.f53161a, yVarL221));
                        }
                        return Unit.f186387a;
                    case 25:
                        LargeActionButtonDelegate.Model model21 = (LargeActionButtonDelegate.Model) obj2;
                        KProperty[] kPropertyArr26 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model21, "model");
                        n nVar24 = (n) globalSearchScreen.d();
                        nVar24.getClass();
                        Intrinsics.checkNotNullParameter(model21, "model");
                        o97.y yVarL222 = n.L2(model21.i);
                        if (yVarL222 != null) {
                            nVar24.K2(new k0(model21.f52613a, yVarL222));
                        }
                        return Unit.f186387a;
                    case 26:
                        um0 model22 = (um0) obj2;
                        KProperty[] kPropertyArr27 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model22, "model");
                        n nVar25 = (n) globalSearchScreen.d();
                        nVar25.getClass();
                        Intrinsics.checkNotNullParameter(model22, "model");
                        o97.y yVarL223 = n.L2(model22.d);
                        if (yVarL223 != null) {
                            nVar25.K2(new k0(model22.f166695a, o97.y.a(yVarL223, model22.f166696b.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 27:
                        um0 model23 = (um0) obj2;
                        KProperty[] kPropertyArr28 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(model23, "model");
                        n nVar26 = (n) globalSearchScreen.d();
                        nVar26.getClass();
                        Intrinsics.checkNotNullParameter(model23, "model");
                        o97.y yVarL224 = n.L2(model23.d);
                        if (yVarL224 != null) {
                            nVar26.K2(new k0(model23.f166695a, o97.y.a(yVarL224, model23.f166697c.f, null, null, 59)));
                        }
                        return Unit.f186387a;
                    case 28:
                        ip0.y data4 = (ip0.y) obj2;
                        KProperty[] kPropertyArr29 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data4, "model");
                        n nVar27 = (n) globalSearchScreen.d();
                        nVar27.getClass();
                        Intrinsics.checkNotNullParameter(data4, "data");
                        o97.y yVarL225 = n.L2(data4.f167226b.f58324n);
                        if (yVarL225 != null) {
                            nVar27.K2(new k0(data4.f167226b.f58316a, yVarL225));
                        }
                        return Unit.f186387a;
                    default:
                        ty0.a data5 = (ty0.a) obj2;
                        KProperty[] kPropertyArr30 = GlobalSearchScreen.B0;
                        Intrinsics.checkNotNullParameter(data5, "data");
                        n nVar28 = (n) globalSearchScreen.d();
                        nVar28.getClass();
                        Intrinsics.checkNotNullParameter(data5, "data");
                        o97.y yVarL226 = n.L2(data5.d);
                        if (yVarL226 != null) {
                            nVar28.K2(new k0(data5.f275445a, yVarL226));
                        }
                        return Unit.f186387a;
                }
            }
        });
        String str = this.u0;
        if (str != null) {
            e3(str);
        }
        ViewController.P2(this, ((n) d()).E, new l97.f(this, null, 1), 3);
        ViewController.P2(this, t1.d(((n) d()).F, 1000L), new g(this, null), 3);
    }

    public final void d3(efm.r rVar, Function1 function1) {
        ViewController.P2(this, rd0.e.b(rVar), new b2(2, function1, kotlin.jvm.internal.s.class, "suspendConversion0", "bind$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), 3);
    }

    public final void e3(String str) {
        a2 a2Var = this.y0;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        ScreenContentRecyclerView recyclerView = f3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.y0 = com.revolut.kompot.navigable.a.g2(this, rd0.e.b(x.c(recyclerView, 7)), null, new im9.h(this, str, continuation, 26), 3);
    }

    public final m f3() {
        ViewBinding value = this.f74628s0.getValue(this, B0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final l97.h R2() {
        return (l97.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    public final void h3(GlobalSearchSessionContext globalSearchSessionContext, String str) {
        AnalyticsContext.INSTANCE.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(globalSearchSessionContext));
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d.f(context).n0().i(D2(), str);
        this.L = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1 A[PHI: r17
      0x01c1: PHI (r17v1 java.util.Iterator) = (r17v0 java.util.Iterator), (r17v3 java.util.Iterator) binds: [B:104:0x01c8, B:100:0x01bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i3(l97.r r24) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen.i3(l97.r):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
