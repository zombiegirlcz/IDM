package com.revolut.feature.shops.impl.ui.home;

import android.os.Parcelable;
import aw0.n6;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$Destination;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import com.revolut.feature.shops.api.model.ShopsLockedProductOffer;
import com.revolut.feature.shops.api.model.ShopsProductOffer;
import com.revolut.feature.shops.api.model.ShopsPurchase;
import com.revolut.feature.shops.api.model.ShopsSoldOutProductOffer;
import com.revolut.feature.shops.api.model.ShopsWaitlistOffer;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.FeatureCommand;
import dfj.e0;
import egk.e;
import exe.j;
import fed.a0;
import ffk.t;
import fjd.c0;
import fjd.n;
import fjd.o;
import fjd.u;
import fjd.w;
import fnc.s;
import grl.k9;
import h4g.g;
import hha.w0;
import i4b.f;
import java.util.Iterator;
import java.util.List;
import jid.d;
import jid.p;
import jid.t;
import jid.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.r;
import nyb.k;
import oki.h;
import rp0.g1;
import skm.a2;
import vkm.j2;
import vkm.q;
import whi.b;
import wli.x;
import y21.c;
import yji.l;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements u {
    public final d A;
    public final x B;
    public final c C;
    public final g1 D;
    public final ShopsCombinedHomeScreenContract$InputData E;
    public final f F;
    public final n G;
    public final p H;
    public final wid.c I;
    public final s70.a J;
    public final ihm.f K;
    public a2 L;
    public a2 M;
    public a2 N;
    public boolean O;
    public final com.revolut.kompot.navigable.vc.modal.a P;
    public final y Q;
    public final r10.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f4h.a f87195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pjd.a f87196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f87197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f87198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f87199t;
    public final fn2.c u;
    public final wn.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f87200w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f87201x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sfk.a f87202y;
    public final s z;

    public a(cli.n stateMapper, r10.f shopsHomeLayoutInteractor, f4h.a shopsCategoryTabsInteractor, pjd.a shopsTermsNavigationMapper, v shopsLocationInteractor, k revPointsInteractor, g shopsFeatureAvailabilityInteractor, fn2.c shopsPerkActivationInteractor, wn.a adsTrackingControllerModelExtension, t pricingPlanInteractor, e pricingPlanUiInteractor, sfk.a pricingPlanChangeObservable, s shopsAdvertisingInfoInteractor, d shopsDiscoverMorePagingInteractor, x deeplinkHandler, c optOutRepository, g1 shotDialogDisplayer, ShopsCombinedHomeScreenContract$InputData inputData, f legalEntityContextProvider, n screenCache, p shopsItemsBidInteractor, wid.c auctionCountdownTicker, s70.a intentProvider) {
        Data data;
        List list;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shopsHomeLayoutInteractor, "shopsHomeLayoutInteractor");
        Intrinsics.checkNotNullParameter(shopsCategoryTabsInteractor, "shopsCategoryTabsInteractor");
        Intrinsics.checkNotNullParameter(shopsTermsNavigationMapper, "shopsTermsNavigationMapper");
        Intrinsics.checkNotNullParameter(shopsLocationInteractor, "shopsLocationInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsPerkActivationInteractor, "shopsPerkActivationInteractor");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanUiInteractor, "pricingPlanUiInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(shopsAdvertisingInfoInteractor, "shopsAdvertisingInfoInteractor");
        Intrinsics.checkNotNullParameter(shopsDiscoverMorePagingInteractor, "shopsDiscoverMorePagingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(screenCache, "screenCache");
        Intrinsics.checkNotNullParameter(shopsItemsBidInteractor, "shopsItemsBidInteractor");
        Intrinsics.checkNotNullParameter(auctionCountdownTicker, "auctionCountdownTicker");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = shopsHomeLayoutInteractor;
        this.f87195p = shopsCategoryTabsInteractor;
        this.f87196q = shopsTermsNavigationMapper;
        this.f87197r = shopsLocationInteractor;
        this.f87198s = revPointsInteractor;
        this.f87199t = shopsFeatureAvailabilityInteractor;
        this.u = shopsPerkActivationInteractor;
        this.v = adsTrackingControllerModelExtension;
        this.f87200w = pricingPlanInteractor;
        this.f87201x = pricingPlanUiInteractor;
        this.f87202y = pricingPlanChangeObservable;
        this.z = shopsAdvertisingInfoInteractor;
        this.A = shopsDiscoverMorePagingInteractor;
        this.B = deeplinkHandler;
        this.C = optOutRepository;
        this.D = shotDialogDisplayer;
        this.E = inputData;
        this.F = legalEntityContextProvider;
        this.G = screenCache;
        this.H = shopsItemsBidInteractor;
        this.I = auctionCountdownTicker;
        this.J = intentProvider;
        this.K = v0.a.d("create(...)");
        this.P = hx7.e.a(this, new fgj.g(this, 7));
        Data data2 = screenCache.f135577a;
        data2 = data2 == null ? new Data(null, null, false, 7, null) : data2;
        String str = inputData.f87184a;
        str = str == null ? screenCache.f135578b : str;
        ShopsCategory shopsCategory = null;
        Object obj2 = null;
        shopsCategory = null;
        shopsCategory = null;
        if (str != null && (data = screenCache.f135577a) != null && (list = (List) data.getContent()) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((ShopsCategory) next).f87040a, str)) {
                    obj2 = next;
                    break;
                }
            }
            shopsCategory = (ShopsCategory) obj2;
        }
        this.Q = mra.d.b(this, new o(data2, shopsCategory, 16287), stateMapper, null, false, 12);
    }

    public static ActionsBottomSheetController I2(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 20);
        k9 value = k9.Shops;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, new aw0.e(false, null, null, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), new AnalyticsProduct.Retail(value), null, null, 24));
    }

    public static void K2(a aVar, String category, boolean z, int i) {
        int i2 = 2;
        boolean z3 = (i & 2) != 0 ? false : z;
        a0 a0Var = new a0(26);
        a2 a2Var = aVar.L;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        r10.f fVar = aVar.o;
        co3.a aVar2 = aVar.G.f135579c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        aVar.L = l.a1(aVar, q.Q(new vkm.y(new g2d.c(i2, 18, continuation), new j(new e0(q.g(((ivb.l) ((lvb.e) fVar.c).f200357a).f168819b), 1), 27)), new g9d.f((Continuation) null, fVar, z3, category, aVar2)), null, null, new f23.y(aVar, a0Var, continuation, 3), 3);
    }

    @Override // yji.l
    public final void I1() {
        ShopsCategory shopsCategory;
        String str;
        y yVar = this.Q;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        boolean z = ((o) j2Var.getValue()).f.getContent() != null;
        L2();
        boolean zE = this.f87199t.e();
        H2(yVar, new cmc.a(zE, 25));
        Continuation continuation = null;
        if (zE) {
            l.a1(this, rd0.e.b(this.f87198s.b()), null, null, new fjd.x(this, continuation, 8), 3);
        }
        boolean z3 = ((o) j2Var2.getValue()).f135585j;
        w4l.h hVar = w4l.h.f294642c;
        t tVar = this.f87200w;
        if (z3) {
            vkm.d dVarB = rd0.e.b(tVar.x());
            h0 h0Var = h0.f322473a;
            l.a1(this, rd0.e.n(dVarB, h0Var), null, null, new fjd.x(this, continuation, 2), 3);
            l.a1(this, rd0.e.n(rd0.e.b(nim.a.w(((oid.e) this.z.f136657b).d.e(Unit.f186387a, hVar), new oh3.a(7))), h0Var), null, null, new fjd.x(this, continuation, 3), 3);
        }
        l.a1(this, yVar.B(new kotlin.jvm.internal.h0() { // from class: fjd.b0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((o) obj2).f135580a;
            }
        }), null, null, new fjd.x(this, continuation, 6), 3);
        c cVar = this.C;
        cVar.getClass();
        l.a1(this, rd0.e.b(cVar.b(SecuritySettings.PERSONALIZED_THIRD_PARTY_PROMOTION, hVar)), null, null, new c0(this, null), 3);
        l.a1(this, rd0.e.b(tVar.n()), null, null, new fjd.x(this, continuation, 1), 3);
        l.a1(this, rd0.e.b(this.f87202y.a()), null, null, new fjd.x(this, continuation, 7), 3);
        l.a1(this, this.F.j(new md6.q(md6.p.SHOPS, false)), null, null, new fjd.x(this, continuation, 0), 3);
        this.L = l.a1(this, rd0.e.b(((oid.e) this.f87195p.f132229b).d.e(Unit.f186387a, hVar)), null, null, new fjd.x(this, continuation, 5), 3);
        l.a1(this, this.H.d, null, null, new fjd.a0(this, null, 1), 3);
        if (!z || (shopsCategory = ((o) j2Var2.getValue()).f135583g) == null || (str = shopsCategory.f87040a) == null) {
            return;
        }
        K2(this, str, false, 6);
    }

    public final void J2(Object obj2) {
        w0 w0Var;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shops.impl.model.ShopsContextParcelWrapper");
        mid.k kVar = (mid.k) obj2;
        w0 w0Var2 = null;
        zn.d dVar = obj2 instanceof zn.d ? (zn.d) obj2 : null;
        if (dVar != null) {
            this.v.Z2(dVar);
        }
        ShopsContext shopsContext = kVar.f205719a;
        if (shopsContext instanceof ShopsDeeplinkOffer) {
            n2(new fjd.y(this, shopsContext, null, 0), new b(6));
            return;
        }
        if (shopsContext instanceof ShopsCampaignOffer) {
            C1(new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(new ShopsFeatureConfig$CampaignCheckout$Destination((ShopsCampaignDetails) shopsContext), yhi.b.BOTTOM_DIALOG, (Integer) null, 12))));
            return;
        }
        if (shopsContext instanceof ShopsFrozenOffer) {
            n2(new fjd.y(this, shopsContext, null, 1), new b(6));
            return;
        }
        boolean z = shopsContext instanceof ShopsSoldOutProductOffer;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.P;
        if (z) {
            h.v2(aVar, ShopsCombinedHomeScreenContract$ModalStep.SoldOutDialog.f87191a, bottom_dialog);
            return;
        }
        if (shopsContext instanceof ShopsWaitlistOffer) {
            h.v2(aVar, ShopsCombinedHomeScreenContract$ModalStep.ComingSoonDialog.f87186a, bottom_dialog);
            return;
        }
        if (shopsContext instanceof ShopsProductOffer) {
            ShopsProductOffer shopsProductOffer = (ShopsProductOffer) shopsContext;
            P2(shopsProductOffer.f87062a, shopsProductOffer.f87063b);
            return;
        }
        if (!(shopsContext instanceof ShopsLockedProductOffer)) {
            if (shopsContext instanceof ShopsPurchase) {
                h.v2(aVar, new ShopsCombinedHomeScreenContract$ModalStep.PurchaseItemDialog((ShopsPurchase) shopsContext), bottom_dialog);
                return;
            } else {
                if (!(shopsContext instanceof ShopsAuction)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.v2(aVar, new ShopsCombinedHomeScreenContract$ModalStep.BidAuction(((ShopsAuction) shopsContext).f87010a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                return;
            }
        }
        r rVar = (r) d0.u0(((ShopsLockedProductOffer) shopsContext).f87055c);
        if (rVar != null) {
            int i = gid.b.f144125b;
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            switch (gid.a.f144123a[rVar.ordinal()]) {
                case 1:
                    w0Var = w0.STANDARD;
                    break;
                case 2:
                    w0Var = w0.PLUS;
                    break;
                case 3:
                    w0Var = w0.PREMIUM;
                    break;
                case 4:
                    w0Var = w0.METAL;
                    break;
                case 5:
                    w0Var = w0.ULTRA;
                    break;
                case 6:
                    w0Var = w0.PRIVATE;
                    break;
                case 7:
                    w0Var = w0.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            w0Var2 = w0Var;
        }
        if (w0Var2 != null) {
            h.v2(aVar, new ShopsCombinedHomeScreenContract$ModalStep.LockedDialog(w0Var2), bottom_dialog);
            H2(this.Q, new fg8.y(shopsContext, w0Var2, 14));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.P;
    }

    public final void L2() {
        a2 a2Var = this.N;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.N = l2(new fjd.e0(this, null), new yi5.b(26));
    }

    public final void M2(String str) {
        if (Intrinsics.f(str, "SHOPS_COMBINED_NEARBY_NEARBY_MAP")) {
            jid.t tVar = ((o) ((j2) this.Q.f22677a).getValue()).f135581b;
            if (tVar instanceof t.b) {
                h.v2(this.P, ShopsCombinedHomeScreenContract$ModalStep.LocationPermissions.f87187a, ModalDestination.Style.POPUP.f98311a);
            } else {
                if (tVar instanceof jid.s) {
                    if (((jid.s) tVar).f174452a) {
                        this.O = true;
                        C1(new ExternalDestination.ByIntent(((s70.b) this.J).c(), null));
                        return;
                    }
                    return;
                }
                if (tVar instanceof jid.r) {
                    C2(new fjd.q(((jid.r) tVar).f174451a));
                } else if (!Intrinsics.f(tVar, t.a.f174453a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final void N2(Object obj2) {
        mid.n nVar = obj2 instanceof mid.n ? (mid.n) obj2 : null;
        if (nVar != null) {
            String str = nVar.f205729a;
            String str2 = nVar.f205731c;
            if (Intrinsics.f(nVar.f205730b, "MY_ITEMS")) {
                C2(new fjd.r(str2, str));
            } else {
                C2(new fjd.p(str2, str));
            }
        }
    }

    public final void O2(String selectedId, boolean z) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        a2 a2Var = this.L;
        ShopsCategory shopsCategory = null;
        Object obj2 = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.Q;
        List list = (List) ((o) ((j2) yVar.f22677a).getValue()).f.getContent();
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((ShopsCategory) next).f87040a, selectedId)) {
                    obj2 = next;
                    break;
                }
            }
            shopsCategory = (ShopsCategory) obj2;
        }
        if (shopsCategory != null) {
            String str = shopsCategory.f87040a;
            H2(yVar, new w(shopsCategory, 0));
            List list2 = (List) ((o) ((j2) yVar.f22677a).getValue()).f.getContent();
            if (list2 != null) {
                Data categories = new Data(list2, null, false, 6, null);
                n nVar = this.G;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(categories, "categories");
                nVar.f135577a = categories;
                nVar.f135578b = str;
            }
            K2(this, str, z, 4);
        }
    }

    public final void P2(String str, String str2) {
        y yVar = this.Q;
        if (((o) ((j2) yVar.f22677a).getValue()).k != null) {
            H2(yVar, new fj5.e(7));
        }
        C1(new RevPointsExclusiveStoreProductDestination(str2 != null ? new ExclusiveStoreInputData.Onboarding(str, new ExclusiveStoreInputData.ArticleReference.ReferenceId(str2)) : new ExclusiveStoreInputData.Checkout(str)));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow nearestEndTimeFlow = this.Q.B(new fj5.e(6));
        wid.c cVar = this.I;
        Continuation continuation = null;
        l.b1(this, cVar.a(nearestEndTimeFlow), null, new fjd.x(this, continuation, 4), 3);
        Intrinsics.checkNotNullParameter(nearestEndTimeFlow, "nearestEndTimeFlow");
        l.b1(this, q.Q(q.q(nearestEndTimeFlow), new bbg.c0(continuation, true, (Object) cVar, 8)), null, new fjd.a0(this, null, 0), 3);
        if (this.O) {
            this.O = false;
            L2();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.Q;
    }
}
