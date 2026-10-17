package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade;

import b9k.f;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import iw5.j;
import java.util.ArrayList;
import java.util.List;
import kgm.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l3d.h0;
import nfj.l1;
import ny5.g;
import okf.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ou6.o;
import ox5.c0;
import ox5.f0;
import ox5.i;
import ox5.i0;
import ox5.j0;
import ox5.k0;
import ox5.l;
import ox5.n;
import ox5.x0;
import px5.e;
import rp0.l0;
import sh5.d;
import skm.a2;
import tv5.a;
import vkm.j2;
import vkm.q;
import zh9.u0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements n {

    @NotNull
    public static final f0 Companion = new f0();
    public final c A;
    public final gte.a B;
    public final xv5.c C;
    public final mk0.a D;
    public final d E;
    public final ow5.b F;
    public final j G;
    public String H;
    public boolean I;
    public final j2 J;
    public a2 K;
    public a2 L;
    public final com.revolut.kompot.navigable.vc.modal.a M;
    public final y N;
    public final CryptoTradeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tv5.b f71566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f71567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final my5.d f71568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f71569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h0 f71570t;
    public final l0 u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f71571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yud.g f71572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x8h.g f71573y;
    public final t70.b z;

    static {
        Intrinsics.checkNotNullParameter("CRYPTO_TRADE_WATCHLIST_SECTION_SHOW_UP_TO", "id");
    }

    public b(x0 stateMapper, CryptoTradeFlowContract$InputData flowInputData, tv5.b currencyDiscoveryInteractor, g rateTilesPresentationModel, my5.d cryptoSortingPresentationModel, i tradeItemsMapper, h0 watchlistInteractor, l0 popupMenuDialogDisplayer, f topMoversPresentationModel, e watchlistLimitPopupMenuProvider, yud.g stakingInteractor, x8h.g collectionsInteractor, t70.b currenciesLocalization, c trendingInteractor, gte.a featureToggleInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, mk0.a personalisationStorage, d cryptoFcaDisclaimerWidget, ow5.b cryptoIsraelExpansionChecker, j headerMediator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(rateTilesPresentationModel, "rateTilesPresentationModel");
        Intrinsics.checkNotNullParameter(cryptoSortingPresentationModel, "cryptoSortingPresentationModel");
        Intrinsics.checkNotNullParameter(tradeItemsMapper, "tradeItemsMapper");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(topMoversPresentationModel, "topMoversPresentationModel");
        Intrinsics.checkNotNullParameter(watchlistLimitPopupMenuProvider, "watchlistLimitPopupMenuProvider");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(trendingInteractor, "trendingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(cryptoIsraelExpansionChecker, "cryptoIsraelExpansionChecker");
        Intrinsics.checkNotNullParameter(headerMediator, "headerMediator");
        this.o = flowInputData;
        this.f71566p = currencyDiscoveryInteractor;
        this.f71567q = rateTilesPresentationModel;
        this.f71568r = cryptoSortingPresentationModel;
        this.f71569s = tradeItemsMapper;
        this.f71570t = watchlistInteractor;
        this.u = popupMenuDialogDisplayer;
        this.v = topMoversPresentationModel;
        this.f71571w = watchlistLimitPopupMenuProvider;
        this.f71572x = stakingInteractor;
        this.f71573y = collectionsInteractor;
        this.z = currenciesLocalization;
        this.A = trendingInteractor;
        this.B = featureToggleInteractor;
        this.C = cryptoCommodityBaseCurrencyInteractor;
        this.D = personalisationStorage;
        this.E = cryptoFcaDisclaimerWidget;
        this.F = cryptoIsraelExpansionChecker;
        this.G = headerMediator;
        this.J = q.c("");
        this.M = hx7.e.a(this, new or4.i(this, 12));
        Double d = (Double) personalisationStorage.a(new tk0.c("CRYPTO_TRADE_WATCHLIST_SECTION_SHOW_UP_TO"));
        this.N = mra.d.b(this, new l(d != null ? (int) d.doubleValue() : 3, 32511), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new i0(this, null, 0), new yi5.b(26));
    }

    public final void I2(Object obj2) {
        boolean z = obj2 instanceof zv5.a;
        CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData = this.o;
        if (z) {
            xi0.a aVar = xi0.b.Companion;
            String str = ((zv5.a) obj2).f325574a;
            aVar.getClass();
            C1(u0.c(new CryptoCommodityDetailsFeatureConfig(xi0.a.a(str), null, null, cryptoTradeFlowContract$InputData.f71552a, 30)));
            return;
        }
        if (!(obj2 instanceof j1h.a)) {
            if (obj2 instanceof ifd.g) {
                n2(new j0(this, (ifd.g) obj2, null), new whi.b(6));
                return;
            }
            return;
        }
        vel.f fVar = ((j1h.a) obj2).f170462a;
        vel.d dVar = fVar instanceof vel.d ? (vel.d) fVar : null;
        String str2 = dVar != null ? dVar.f288352a.f306286a : null;
        if (str2 != null) {
            xi0.b.Companion.getClass();
            C1(u0.c(new CryptoAssetDetailsFeatureConfig.AssetDetails(xi0.a.a(str2), cryptoTradeFlowContract$InputData.f71552a, 2)));
        }
    }

    public final Data J2(Data data, String str) {
        cw5.a aVar = (cw5.a) data.getContent();
        if (aVar == null) {
            return data;
        }
        List list = aVar.f109531a;
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                xi0.b bVar = (xi0.b) obj2;
                String str2 = bVar.f306286a;
                String strA = this.z.a(bVar);
                if (d0.J(str2, str, true) || d0.J(strA, str, true)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        return new Data(new cw5.a(list, aVar.f109532b, aVar.f109533c), null, false, 6, null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.M;
    }

    public final void K2() {
        a2 a2Var = this.L;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.L = yji.l.b1(this, new t38.e(boh.f.e(u0.m(rd0.e.b(((xv5.h) this.f71566p).a(a.b.f274717a)), new o9a.e(rd0.e.b(this.f71568r.c()), 26)), new c0(this, 5)), 24, new vkm.y(new k0(this, null), t1.d(this.J, 300L)), new l1(this, continuation, 22)), null, new ox5.l0(this, continuation, 0), 3);
    }

    public final void L2() {
        a2 a2Var = this.K;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.K = yji.l.b1(this, q.Q(q.q(this.N.B(new o(25))), new m(continuation, this, 11)), null, new ox5.l0(this, continuation, 1), 3);
    }

    public final void M2(String str) {
        int i;
        int i2 = ((l) ((j2) this.N.f22677a).getValue()).i;
        boolean z = this.I;
        ((qx5.a) this.f71571w).getClass();
        PopupMenuItem.Cell cell = new PopupMenuItem.Cell("CRYPTO_TRADE_WATCHLIST_SHOW_UP_TO", new TextLocalisedClause(R$string.crypto_home_widgets_context_menu_show_up_to_title, null, null, 14), new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_down : R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_24_menu, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, null, 1008);
        EnumEntries enumEntriesA = st5.b.a();
        ArrayList<st5.b> arrayList = new ArrayList();
        for (Object obj2 : enumEntriesA) {
            if (((st5.b) obj2) != st5.b.NO_LIMIT) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (st5.b bVar : arrayList) {
            PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
            String strN = a0.d.n("CRYPTO_TRADE_WATCHLIST_LIMIT_", bVar.b());
            switch (qx5.b.f250023a[bVar.ordinal()]) {
                case 1:
                    i = R$string.crypto_home_widgets_context_menu_option_one;
                    break;
                case 2:
                    i = R$string.crypto_home_widgets_context_menu_option_two;
                    break;
                case 3:
                    i = R$string.crypto_home_widgets_context_menu_option_three;
                    break;
                case 4:
                    i = R$string.crypto_home_widgets_context_menu_option_five;
                    break;
                case 5:
                    i = R$string.crypto_home_widgets_context_menu_option_ten;
                    break;
                case 6:
                    throw new IllegalStateException(new UnsupportedOperationException("NO_LIMIT is not supported in getLimitTitle").toString());
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(PopupMenuItem.Companion.a(companion, strN, new TextLocalisedClause(i, null, null, 14), bVar.b() == i2, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        }
        List listC = u.c(cell);
        l0.f(this.u, str, zi0.c.c(z ? v.k(listC, arrayList2) : u.c(listC), null, null), null, null, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, ((lx5.b) this.G).e, null, new ox5.l0(this, continuation, 3), 3);
        yji.l.b1(this, this.N.B(new o(24)), null, new ox5.l0(this, continuation, 4), 3);
        K2();
        n2(new i0(this, continuation, 2), new whi.b(6));
        yji.l.b1(this, rd0.e.b(this.f71568r.c()), null, new ox5.l0(this, continuation, 9), 3);
        yji.l.b1(this, rd0.e.b(this.u.f256113c), null, new ox5.l0(this, continuation, 5), 3);
    }

    public final void W0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String string = d0.F0(query).toString();
        y yVar = this.N;
        H2(yVar, new bba.q(J2(((l) ((j2) yVar.f22677a).getValue()).f, string), string, 5));
        this.J.setValue(string);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
