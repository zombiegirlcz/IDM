package com.revolut.feature.store.impl.ui.brand_detail.flow;

import ang.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsCheckoutController$InputData;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$ModalStep;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$PagerItem;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.discount.StoreBrandDetailDiscountScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.msi.StoreBrandDetailMsiScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreenContract$InputData;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import eub.i;
import ffk.t;
import h30.q;
import java.time.Instant;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jgk.v;
import jwb.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import md6.s;
import mqc.p;
import nyb.k;
import nyb.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import q03.m;
import q2e.a0;
import q2e.g;
import q2e.g0;
import q2e.h0;
import q2e.i0;
import q2e.j0;
import q2e.k0;
import q2e.q0;
import q2e.s0;
import q2e.t0;
import q2e.w;
import t1e.j;
import t3e.b;
import vkm.j2;
import yji.l;
import zh9.u0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends h implements g {

    @NotNull
    public static final w Companion = new w();
    public final g2e.g A;
    public final q2e.a B;
    public final t0 C;
    public final vii.b D;
    public final vii.b E;
    public final vii.b F;
    public final q G;
    public final q H;
    public final q I;
    public final q J;
    public boolean K;
    public Boolean L;
    public String M;
    public final vii.b N;
    public final vii.b O;
    public final vii.b P;
    public final vii.b Q;
    public final vii.b R;
    public final vii.b S;
    public final y T;
    public final ali.b U;
    public final com.revolut.kompot.navigable.vc.modal.a V;
    public final StoreBrandDetailFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l2e.a f88663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f88664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mub.b f88665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f88666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f88667t;
    public final i u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f88668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v f88669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mre.c f88670y;
    public final c70.a z;

    public c(StoreBrandDetailFlowContract$InputData inputData, l2e.a storeBrandsInteractor, q storeAvailabilityInteractor, mub.b revPointsPillExtension, e revPointsGiftCardsInteractor, k revPointsInteractor, i revPointsOptInInteractor, f userInteractor, t pricingPlanInteractor, v planTermsNavigationFactory, mre.c termsNavigationFactory, c70.a clipboard, g2e.g sessionExpiryRepository, q2e.a campaignsSharedState, t0 termsStateMapper, vii.b voucherProductGroupDetailsLoader, vii.b revPointsAccountFlow, vii.b megaOfferLoader, q earnScreenComponentBuilder, q redeemScreenComponentBuilder, q discountScreenComponentBuilder, q msiScreenComponentBuilder, d stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsPillExtension, "revPointsPillExtension");
        Intrinsics.checkNotNullParameter(revPointsGiftCardsInteractor, "revPointsGiftCardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planTermsNavigationFactory, "planTermsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(sessionExpiryRepository, "sessionExpiryRepository");
        Intrinsics.checkNotNullParameter(campaignsSharedState, "campaignsSharedState");
        Intrinsics.checkNotNullParameter(termsStateMapper, "termsStateMapper");
        Intrinsics.checkNotNullParameter(voucherProductGroupDetailsLoader, "voucherProductGroupDetailsLoader");
        Intrinsics.checkNotNullParameter(revPointsAccountFlow, "revPointsAccountFlow");
        Intrinsics.checkNotNullParameter(megaOfferLoader, "megaOfferLoader");
        Intrinsics.checkNotNullParameter(earnScreenComponentBuilder, "earnScreenComponentBuilder");
        Intrinsics.checkNotNullParameter(redeemScreenComponentBuilder, "redeemScreenComponentBuilder");
        Intrinsics.checkNotNullParameter(discountScreenComponentBuilder, "discountScreenComponentBuilder");
        Intrinsics.checkNotNullParameter(msiScreenComponentBuilder, "msiScreenComponentBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f88663p = storeBrandsInteractor;
        this.f88664q = storeAvailabilityInteractor;
        this.f88665r = revPointsPillExtension;
        this.f88666s = revPointsGiftCardsInteractor;
        this.f88667t = revPointsInteractor;
        this.u = revPointsOptInInteractor;
        this.v = userInteractor;
        this.f88668w = pricingPlanInteractor;
        this.f88669x = planTermsNavigationFactory;
        this.f88670y = termsNavigationFactory;
        this.z = clipboard;
        this.A = sessionExpiryRepository;
        this.B = campaignsSharedState;
        this.C = termsStateMapper;
        this.D = voucherProductGroupDetailsLoader;
        this.E = revPointsAccountFlow;
        this.F = megaOfferLoader;
        this.G = earnScreenComponentBuilder;
        this.H = redeemScreenComponentBuilder;
        this.I = discountScreenComponentBuilder;
        this.J = msiScreenComponentBuilder;
        this.N = new vii.b();
        this.O = new vii.b();
        this.P = new vii.b();
        this.Q = new vii.b();
        this.R = new vii.b();
        this.S = new vii.b();
        aim.e eVarB = u.b();
        StoreMegaOffer storeMegaOffer = inputData.f88652b;
        StoreMegaOffer storeMegaOffer2 = inputData.f88652b;
        if ((storeMegaOffer != null ? storeMegaOffer.f : null) != null) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Earn.f88658a);
        }
        if ((storeMegaOffer2 != null ? storeMegaOffer2.f88550g : null) != null) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Redeem.f88660a);
        }
        if ((storeMegaOffer2 != null ? storeMegaOffer2.f88551h : null) != null) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Msi.f88659a);
        }
        if ((storeMegaOffer2 != null ? storeMegaOffer2.i : null) != null) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Discount.f88657a);
        }
        aim.e eVarA = u.a(eVarB);
        j2 j2Var = campaignsSharedState.f241559a;
        Data data = new Data(null, null, true, 3, null);
        j2Var.getClass();
        j2Var.g(null, data);
        campaignsSharedState.f241561c.setValue(null);
        j2 j2Var2 = campaignsSharedState.e;
        s0 s0Var = new s0(null, null, null, null);
        j2Var2.getClass();
        j2Var2.g(null, s0Var);
        String strR2 = R2(inputData.f88653c, eVarA, storeMegaOffer2 != null);
        Data data2 = storeMegaOffer2 != null ? new Data(storeMegaOffer2, null, false, 6, null) : new Data(null, null, true, 3, null);
        boolean z = (storeMegaOffer2 != null ? storeMegaOffer2.f : null) != null;
        boolean z3 = (storeMegaOffer2 != null ? storeMegaOffer2.f88550g : null) != null;
        boolean z4 = (storeMegaOffer2 != null ? storeMegaOffer2.f88551h : null) != null;
        boolean z6 = (storeMegaOffer2 != null ? storeMegaOffer2.i : null) != null;
        Data data3 = new Data(null, null, true, 3, null);
        RevPoints.INSTANCE.getClass();
        RevPoints revPointsA = RevPoints.Companion.a(0L);
        Data data4 = new Data(null, null, false, 7, null);
        Data data5 = new Data(null, null, true, 3, null);
        b.a.Companion.getClass();
        boolean z11 = z3;
        q2e.h hVar = new q2e.h(eVarA, strR2, data2, data3, revPointsA, null, data4, z11, z, z4, z6, data5, b.a.f267736h, tvb.c.GLOBAL, false, null);
        final int i = 0;
        this.T = mra.d.b(this, hVar, stateMapper, null, false, 12);
        this.U = s.b(this, new Function2(this) { // from class: q2e.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241628b;

            {
                this.f241628b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.f241628b;
                        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = cVar.o;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        StoreBrandDetailFlowContract$PagerItem page = (StoreBrandDetailFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Earn) {
                            StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = new StoreBrandDetailEarnScreen(new StoreBrandDetailEarnScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.G);
                            t block = new t(cVar, 5);
                            Intrinsics.checkNotNullParameter(block, "block");
                            storeBrandDetailEarnScreen.H = block;
                            return storeBrandDetailEarnScreen;
                        }
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Redeem) {
                            StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = new StoreBrandDetailRedeemScreen(new StoreBrandDetailRedeemScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.H);
                            t block2 = new t(cVar, 6);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            storeBrandDetailRedeemScreen.H = block2;
                            return storeBrandDetailRedeemScreen;
                        }
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Msi) {
                            StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = new StoreBrandDetailMsiScreen(new StoreBrandDetailMsiScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.J);
                            t block3 = new t(cVar, 7);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            storeBrandDetailMsiScreen.H = block3;
                            return storeBrandDetailMsiScreen;
                        }
                        if (!(page instanceof StoreBrandDetailFlowContract$PagerItem.Discount)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StoreBrandDetailDiscountScreen storeBrandDetailDiscountScreen = new StoreBrandDetailDiscountScreen(new StoreBrandDetailDiscountScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.I);
                        t block4 = new t(cVar, 8);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        storeBrandDetailDiscountScreen.H = block4;
                        return storeBrandDetailDiscountScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        StoreBrandDetailFlowContract$ModalStep step = (StoreBrandDetailFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof StoreBrandDetailFlowContract$ModalStep.Checkout)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StoreBrandDetailFlowContract$ModalStep.Checkout checkout = (StoreBrandDetailFlowContract$ModalStep.Checkout) step;
                        uvb.a aVar = new uvb.a(new RevPointsGiftcardsCheckoutController$InputData(checkout.f88654a, checkout.f88655b, checkout.f88656c));
                        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar2 = this.f241628b;
                        ViewController viewControllerE1 = cVar2.e1(aVar);
                        pth.m block5 = new pth.m(cVar2, step, 28);
                        Intrinsics.checkNotNullParameter(block5, "block");
                        viewControllerE1.H = block5;
                        return viewControllerE1;
                }
            }
        });
        final int i2 = 1;
        this.V = hx7.e.a(this, new Function2(this) { // from class: q2e.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241628b;

            {
                this.f241628b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.f241628b;
                        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = cVar.o;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        StoreBrandDetailFlowContract$PagerItem page = (StoreBrandDetailFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Earn) {
                            StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = new StoreBrandDetailEarnScreen(new StoreBrandDetailEarnScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.G);
                            t block = new t(cVar, 5);
                            Intrinsics.checkNotNullParameter(block, "block");
                            storeBrandDetailEarnScreen.H = block;
                            return storeBrandDetailEarnScreen;
                        }
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Redeem) {
                            StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = new StoreBrandDetailRedeemScreen(new StoreBrandDetailRedeemScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.H);
                            t block2 = new t(cVar, 6);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            storeBrandDetailRedeemScreen.H = block2;
                            return storeBrandDetailRedeemScreen;
                        }
                        if (page instanceof StoreBrandDetailFlowContract$PagerItem.Msi) {
                            StoreBrandDetailMsiScreen storeBrandDetailMsiScreen = new StoreBrandDetailMsiScreen(new StoreBrandDetailMsiScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.J);
                            t block3 = new t(cVar, 7);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            storeBrandDetailMsiScreen.H = block3;
                            return storeBrandDetailMsiScreen;
                        }
                        if (!(page instanceof StoreBrandDetailFlowContract$PagerItem.Discount)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StoreBrandDetailDiscountScreen storeBrandDetailDiscountScreen = new StoreBrandDetailDiscountScreen(new StoreBrandDetailDiscountScreenContract$InputData(storeBrandDetailFlowContract$InputData.f88651a, storeBrandDetailFlowContract$InputData.f88652b, storeBrandDetailFlowContract$InputData.d), cVar.I);
                        t block4 = new t(cVar, 8);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        storeBrandDetailDiscountScreen.H = block4;
                        return storeBrandDetailDiscountScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        StoreBrandDetailFlowContract$ModalStep step = (StoreBrandDetailFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof StoreBrandDetailFlowContract$ModalStep.Checkout)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        StoreBrandDetailFlowContract$ModalStep.Checkout checkout = (StoreBrandDetailFlowContract$ModalStep.Checkout) step;
                        uvb.a aVar = new uvb.a(new RevPointsGiftcardsCheckoutController$InputData(checkout.f88654a, checkout.f88655b, checkout.f88656c));
                        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar2 = this.f241628b;
                        ViewController viewControllerE1 = cVar2.e1(aVar);
                        pth.m block5 = new pth.m(cVar2, step, 28);
                        Intrinsics.checkNotNullParameter(block5, "block");
                        viewControllerE1.H = block5;
                        return viewControllerE1;
                }
            }
        });
    }

    public static final Object I2(c cVar, StoreCampaignOffer storeCampaignOffer, gim.i iVar) throws Throwable {
        t1e.k kVarA = storeCampaignOffer.a();
        if (kVarA instanceof t1e.e) {
            Object objN2 = cVar.N2(storeCampaignOffer, ((t1e.e) kVarA).f267257a.d, iVar);
            return objN2 == fim.a.COROUTINE_SUSPENDED ? objN2 : Unit.f186387a;
        }
        if (kVarA instanceof t1e.h) {
            Object objS2 = cVar.S2(storeCampaignOffer, iVar);
            return objS2 == fim.a.COROUTINE_SUSPENDED ? objS2 : Unit.f186387a;
        }
        if (kVarA instanceof t1e.f) {
            Object objO2 = cVar.O2(storeCampaignOffer, iVar);
            return objO2 == fim.a.COROUTINE_SUSPENDED ? objO2 : Unit.f186387a;
        }
        if (!(kVarA instanceof t1e.i) && !(kVarA instanceof t1e.g) && !(kVarA instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objP2 = cVar.P2(storeCampaignOffer, iVar);
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    public static String R2(BrandDetailTab brandDetailTab, aim.e eVar, boolean z) {
        PagerItem pagerItem;
        StoreBrandDetailFlowContract$PagerItem.Earn earn = StoreBrandDetailFlowContract$PagerItem.Earn.f88658a;
        if (brandDetailTab == null) {
            pagerItem = null;
        } else if (brandDetailTab.equals(BrandDetailTab.Earn.f88609a)) {
            pagerItem = earn;
        } else if (brandDetailTab.equals(BrandDetailTab.Redeem.f88611a)) {
            pagerItem = StoreBrandDetailFlowContract$PagerItem.Redeem.f88660a;
        } else if (brandDetailTab.equals(BrandDetailTab.Msi.f88610a)) {
            pagerItem = StoreBrandDetailFlowContract$PagerItem.Msi.f88659a;
        } else {
            if (!brandDetailTab.equals(BrandDetailTab.Discount.f88608a)) {
                throw new NoWhenBranchMatchedException();
            }
            pagerItem = StoreBrandDetailFlowContract$PagerItem.Discount.f88657a;
        }
        if (pagerItem != null && (eVar == null || !eVar.isEmpty())) {
            Iterator<E> it8 = eVar.iterator();
            while (it8.hasNext()) {
                if (((StoreBrandDetailFlowContract$PagerItem) it8.next()).getF64253b().equals(pagerItem.getF64253b())) {
                    return pagerItem.getF64253b();
                }
            }
        }
        if (brandDetailTab != null && !z) {
            return "STORE_BRAND_DETAIL_SELECTED_TAB_PENDING";
        }
        StoreBrandDetailFlowContract$PagerItem storeBrandDetailFlowContract$PagerItem = (StoreBrandDetailFlowContract$PagerItem) d0.d0(eVar);
        return storeBrandDetailFlowContract$PagerItem != null ? storeBrandDetailFlowContract$PagerItem.getF64253b() : earn.getF64253b();
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.U;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 1;
        l.a1(this, vkm.q.Q(this.F, new a0(continuation, this, i)), null, null, new b(this, null), 3);
        l.a1(this, rd0.e.b(((lzb.a) this.f88665r).Z2()), null, null, new h0(this, null), 3);
        this.K = this.f88664q.F0();
        int i2 = 2;
        l.a1(this, vkm.q.Q(this.E, new a0(continuation, this, i2)), null, null, new g0(this, null), 3);
        q2a.a aVar = new q2a.a(9);
        y yVar = this.T;
        l.a1(this, new pkg.e((Flow[]) d0.d1(zhm.v.k(L2(yVar.B(aVar), this.N), L2(yVar.B(new q2a.a(10)), this.O), L2(yVar.B(new q2a.a(11)), this.R), L2(yVar.B(new q2a.a(12)), this.S), L2(yVar.B(new q2a.a(13)), this.P), L2(yVar.B(new q2a.a(14)), this.Q))).toArray(new Flow[0]), this, 7), null, null, new q2e.d0(this, null), 3);
        l.a1(this, this.B.f241563h, null, null, new pnb.b(this, continuation, 27), 3);
        l.a1(this, this.v.j(w4l.h.f294642c), null, null, new j0(this, null), 3);
        l.a1(this, vkm.q.Q(vkm.q.Q(yVar.B(new q2a.a(i)), new a0(continuation, this, 3)), new a0(continuation, this, 4)), null, null, new k0(this, null), 3);
        l.a1(this, rd0.e.b(((o) this.u).f(false)), null, null, new q0(this, null), 3);
        l.a1(this, yVar.B(new q2e.t(this, i2)), null, null, new i0(this, continuation, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.store.api.model.StoreCampaignOffer r20, gim.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.c.J2(com.revolut.feature.store.api.model.StoreCampaignOffer, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.V;
    }

    public final void K2(Throwable th10) {
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        l.a1(this, X1(new mii.h(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), "checkout_error")), null, null, new p(2, 22, null), 3);
    }

    public final wkm.l L2(Flow flow, vii.b bVar) {
        Continuation continuation = null;
        return vkm.q.Q(vkm.q.Q(flow, new x(continuation, bVar, 19)), new a0(continuation, this, 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void M2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        Object obj2 = clickData.d;
        int i = 16;
        int i2 = 6;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -1574677295:
                if (str.equals("CLICK_ID_REDEEM_TERMS")) {
                    Pair pair = obj2 instanceof Pair ? (Pair) obj2 : null;
                    if (pair != null) {
                        Object obj3 = pair.f186385a;
                        VoucherProductTermsAndConditions voucherProductTermsAndConditions = obj3 instanceof VoucherProductTermsAndConditions ? (VoucherProductTermsAndConditions) obj3 : null;
                        if (voucherProductTermsAndConditions != null) {
                            Object obj4 = pair.f186386b;
                            String str2 = obj4 instanceof String ? (String) obj4 : null;
                            String str3 = voucherProductTermsAndConditions.f83653a;
                            if (str3 == null || C1(u0.c(new WebViewFeatureConfig(str3, new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_details_terms_and_conditions_key, null, null, 14), 0, false, true, false, 130972))) == null) {
                                C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsTermsAndConditions(voucherProductTermsAndConditions, str2), null));
                            }
                        } else {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "StoreTermsClause", j6.a.q("Invalid parcel.first for CLICK_ID_REDEEM_TERMS: expected VoucherProductTermsAndConditions, got ", obj3 != null ? obj3.getClass().getSimpleName() : null), null, h0Var);
                        }
                    } else {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "StoreTermsClause", j6.a.q("Invalid parcel for CLICK_ID_REDEEM_TERMS: expected Pair, got ", obj2 != null ? obj2.getClass().getSimpleName() : null), null, h0Var2);
                    }
                    break;
                }
                break;
            case -1477818645:
                if (str.equals("CLICK_ID_STORE_TERMS_SINGLE")) {
                    String str4 = obj2 instanceof String ? (String) obj2 : null;
                    if (str4 == null) {
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "StoreTermsClause", j6.a.q("Invalid parcel for CLICK_ID_STORE_TERMS_SINGLE: expected String, got ", obj2 != null ? obj2.getClass().getSimpleName() : null), null, h0Var3);
                    } else {
                        C1(u0.c(new WebViewFeatureConfig(str4, null, 0, false, true, false, 114590)));
                    }
                    break;
                }
                break;
            case -568043487:
                if (str.equals("CLICK_ID_REVPOINTS_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new prl.k(this, TermsScope.X, continuation, i), new whi.b(6));
                    break;
                }
                break;
            case 1066021175:
                if (str.equals("CLICK_ID_PAID_PLAN_TERMS")) {
                    n2(new m(this, continuation, i2), new whi.b(6));
                    break;
                }
                break;
            case 1116216060:
                if (str.equals("CLICK_ID_STORE_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new prl.k(this, TermsScope.i0, continuation, i), new whi.b(6));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(com.revolut.feature.store.api.model.StoreCampaignOffer r9, com.revolut.feature.store.api.model.StoreCampaignLocation r10, gim.c r11) {
        /*
            r8 = this;
            java.lang.String r0 = "geo:0,0?q="
            boolean r1 = r11 instanceof q2e.n0
            if (r1 == 0) goto L15
            r1 = r11
            q2e.n0 r1 = (q2e.n0) r1
            int r2 = r1.f241606x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f241606x = r2
            goto L1a
        L15:
            q2e.n0 r1 = new q2e.n0
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f241606x
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            com.revolut.feature.store.api.model.StoreCampaignLocation r10 = r1.u
            yhm.o.b(r11)
            goto L41
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r11)
            r1.u = r10
            r1.f241606x = r4
            java.lang.Object r9 = r8.J2(r9, r1)
            if (r9 != r2) goto L41
            return r2
        L41:
            com.revolut.kompot.common.ExternalDestination$ImplicitActivity r1 = new com.revolut.kompot.common.ExternalDestination$ImplicitActivity     // Catch: android.content.ActivityNotFoundException -> L6d
            java.lang.String r2 = "android.intent.action.VIEW"
            double r3 = r10.f88445a     // Catch: android.content.ActivityNotFoundException -> L6d
            double r9 = r10.f88446b     // Catch: android.content.ActivityNotFoundException -> L6d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: android.content.ActivityNotFoundException -> L6d
            r11.<init>(r0)     // Catch: android.content.ActivityNotFoundException -> L6d
            r11.append(r3)     // Catch: android.content.ActivityNotFoundException -> L6d
            java.lang.String r0 = ","
            r11.append(r0)     // Catch: android.content.ActivityNotFoundException -> L6d
            r11.append(r9)     // Catch: android.content.ActivityNotFoundException -> L6d
            java.lang.String r9 = r11.toString()     // Catch: android.content.ActivityNotFoundException -> L6d
            android.net.Uri r4 = android.net.Uri.parse(r9)     // Catch: android.content.ActivityNotFoundException -> L6d
            r6 = 0
            r7 = 494(0x1ee, float:6.92E-43)
            r3 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: android.content.ActivityNotFoundException -> L6d
            r8.C1(r1)     // Catch: android.content.ActivityNotFoundException -> L6d
            goto L72
        L6d:
            r0 = move-exception
            r9 = r0
            r8.K2(r9)
        L72:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.c.N2(com.revolut.feature.store.api.model.StoreCampaignOffer, com.revolut.feature.store.api.model.StoreCampaignLocation, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(com.revolut.feature.store.api.model.StoreCampaignOffer r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q2e.o0
            if (r0 == 0) goto L13
            r0 = r6
            q2e.o0 r0 = (q2e.o0) r0
            int r1 = r0.f241608x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241608x = r1
            goto L18
        L13:
            q2e.o0 r0 = new q2e.o0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241608x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.store.api.model.StoreCampaignOffer r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f241608x = r3
            java.lang.Object r6 = r4.J2(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            t1e.d0 r6 = (t1e.d0) r6
            java.lang.String r0 = r6.f267254a
            if (r0 == 0) goto L76
            java.lang.String r5 = r5.f88447a
            java.time.Instant r1 = r6.f267256c
            r4.Q2(r5, r1)
            com.revolut.kompot.common.ExternalDestination$Browser r5 = new com.revolut.kompot.common.ExternalDestination$Browser
            r1 = 0
            r5.<init>(r0, r1)
            r4.C1(r5)
            java.lang.String r5 = r6.f267255b
            if (r5 == 0) goto L73
            q1l.e r6 = new q1l.e
            r0 = 9
            r6.<init>(r0)
            c70.a r0 = r4.z
            java.lang.String r1 = "Promo code"
            r2 = 0
            r0.c(r1, r5, r2, r6)
            q2a.a r5 = new q2a.a
            r6 = 6
            r5.<init>(r6)
            cli.y r6 = r4.T
            r4.H2(r6, r5)
        L73:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L76:
            java.lang.String r5 = r5.f88447a
            java.lang.String r6 = "Webhook shouldn't be null! campaignId: "
            java.lang.String r5 = j6.a.q(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.c.O2(com.revolut.feature.store.api.model.StoreCampaignOffer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(com.revolut.feature.store.api.model.StoreCampaignOffer r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q2e.p0
            if (r0 == 0) goto L13
            r0 = r6
            q2e.p0 r0 = (q2e.p0) r0
            int r1 = r0.f241610x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241610x = r1
            goto L18
        L13:
            q2e.p0 r0 = new q2e.p0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241610x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.store.api.model.StoreCampaignOffer r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f241610x = r3
            java.lang.Object r6 = r4.J2(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            t1e.d0 r6 = (t1e.d0) r6
            java.lang.String r0 = r6.f267254a
            if (r0 == 0) goto L58
            java.lang.String r5 = r5.f88447a
            java.time.Instant r6 = r6.f267256c
            r4.Q2(r5, r6)
            com.revolut.kompot.common.ExternalDestination$Browser r5 = new com.revolut.kompot.common.ExternalDestination$Browser
            r6 = 0
            r5.<init>(r0, r6)
            r4.C1(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L58:
            java.lang.String r5 = r5.f88447a
            java.lang.String r6 = "Webhook shouldn't be null! campaignId: "
            java.lang.String r5 = j6.a.q(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.c.P2(com.revolut.feature.store.api.model.StoreCampaignOffer, gim.c):java.lang.Object");
    }

    public final void Q2(String campaignId, Instant instant) {
        this.M = campaignId;
        H2(this.T, new q2e.v(0, instant));
        this.B.f241561c.setValue(instant);
        ue0.c cVar = this.A.f139986a;
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        if (instant == null || !instant.isAfter(Instant.now())) {
            cVar.I0(g2e.g.a(campaignId));
            return;
        }
        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, g2e.g.a(campaignId), Long.valueOf(instant.toEpochMilli()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(com.revolut.feature.store.api.model.StoreCampaignOffer r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q2e.r0
            if (r0 == 0) goto L13
            r0 = r6
            q2e.r0 r0 = (q2e.r0) r0
            int r1 = r0.f241617x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241617x = r1
            goto L18
        L13:
            q2e.r0 r0 = new q2e.r0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241617x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.store.api.model.StoreCampaignOffer r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f241617x = r3
            java.lang.Object r6 = r4.J2(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            t1e.d0 r6 = (t1e.d0) r6
            java.lang.String r0 = r6.f267254a
            if (r0 == 0) goto L58
            java.lang.String r5 = r5.f88447a
            java.time.Instant r6 = r6.f267256c
            r4.Q2(r5, r6)
            com.revolut.kompot.common.ExternalDestination$Browser r5 = new com.revolut.kompot.common.ExternalDestination$Browser
            r6 = 0
            r5.<init>(r0, r6)
            r4.C1(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L58:
            java.lang.String r5 = r5.f88447a
            java.lang.String r6 = "Webhook shouldn't be null! campaignId: "
            java.lang.String r5 = j6.a.q(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.c.S2(com.revolut.feature.store.api.model.StoreCampaignOffer, gim.c):java.lang.Object");
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.T;
    }
}
