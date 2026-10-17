package com.revolut.feature.rev_points.giftcards.impl.ui.flow.home;

import bxb.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$ModalStep;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$PagerItem;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreenContract$InputData;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.uservouchers.RevPointsGiftcardsUserVouchersScreen;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import md6.s;
import nyb.k;
import oki.h;
import pwb.e;
import pwb.f;
import pwb.o;
import pwb.p;
import yji.l;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements e {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f83680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jwb.a f83681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f83682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f83683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f83684t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public c(d stateMapper, RevPointsGiftcardsHomePagerFlowContract$InputData inputData, k revPointsInteractor, t pricingPlanInteractor, jwb.a revPointsGiftcardsConfigInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsConfigInteractor, "revPointsGiftcardsConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = revPointsInteractor;
        this.f83680p = pricingPlanInteractor;
        this.f83681q = revPointsGiftcardsConfigInteractor;
        this.f83682r = productArticleInteractor;
        final int i = 0;
        final int i2 = 1;
        this.f83683s = mra.d.b(this, new f(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), inputData.f83672a.getF70838b(), v.k(new RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover(false), RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards.f83676a)), stateMapper, null, false, 12);
        this.f83684t = s.b(this, new Function2(this) { // from class: pwb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c f240389b;

            {
                this.f240389b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        RevPointsGiftcardsHomePagerFlowContract$PagerItem page = (RevPointsGiftcardsHomePagerFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        boolean z = page instanceof RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover;
                        final com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar = this.f240389b;
                        if (z) {
                            RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = new RevPointsGiftcardsHomeScreen(new RevPointsGiftcardsHomeScreenContract$InputData(((RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover) page).f83675a));
                            final int i3 = 0;
                            Function1 block = new Function1() { // from class: pwb.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i3) {
                                        case 0:
                                            vwb.h it8 = (vwb.h) obj4;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            cVar.C2(new h(((vwb.g) it8).f292692a));
                                            return Unit.f186387a;
                                        default:
                                            bxb.f result = (bxb.f) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result instanceof bxb.g;
                                            com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = cVar;
                                            if (z3) {
                                                cVar2.C2(new g(((bxb.g) result).f19651a));
                                            } else {
                                                if (!(result instanceof f.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cVar2.I2("HOME_TABS_DISCOVER_ID");
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            revPointsGiftcardsHomeScreen.H = block;
                            return revPointsGiftcardsHomeScreen;
                        }
                        if (!(page instanceof RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = new RevPointsGiftcardsUserVouchersScreen();
                        final int i5 = 1;
                        Function1 block2 = new Function1() { // from class: pwb.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i5) {
                                    case 0:
                                        vwb.h it8 = (vwb.h) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        cVar.C2(new h(((vwb.g) it8).f292692a));
                                        return Unit.f186387a;
                                    default:
                                        bxb.f result = (bxb.f) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof bxb.g;
                                        com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = cVar;
                                        if (z3) {
                                            cVar2.C2(new g(((bxb.g) result).f19651a));
                                        } else {
                                            if (!(result instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar2.I2("HOME_TABS_DISCOVER_ID");
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        revPointsGiftcardsUserVouchersScreen.H = block2;
                        return revPointsGiftcardsUserVouchersScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        RevPointsGiftcardsHomePagerFlowContract$ModalStep step = (RevPointsGiftcardsHomePagerFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean z3 = step instanceof RevPointsGiftcardsHomePagerFlowContract$ModalStep.Balance;
                        com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = this.f240389b;
                        if (z3) {
                            return cVar2.e1(new hub.c(e0.GIFT_CARDS));
                        }
                        if (step instanceof RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding) {
                            return cVar2.e1(new ProductArticleDescriptor(((RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding) step).f83674a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        this.u = hx7.e.a(this, new Function2(this) { // from class: pwb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c f240389b;

            {
                this.f240389b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        RevPointsGiftcardsHomePagerFlowContract$PagerItem page = (RevPointsGiftcardsHomePagerFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        boolean z = page instanceof RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover;
                        final com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar = this.f240389b;
                        if (z) {
                            RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen = new RevPointsGiftcardsHomeScreen(new RevPointsGiftcardsHomeScreenContract$InputData(((RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover) page).f83675a));
                            final int i3 = 0;
                            Function1 block = new Function1() { // from class: pwb.n
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i3) {
                                        case 0:
                                            vwb.h it8 = (vwb.h) obj4;
                                            Intrinsics.checkNotNullParameter(it8, "it");
                                            cVar.C2(new h(((vwb.g) it8).f292692a));
                                            return Unit.f186387a;
                                        default:
                                            bxb.f result = (bxb.f) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            boolean z3 = result instanceof bxb.g;
                                            com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = cVar;
                                            if (z3) {
                                                cVar2.C2(new g(((bxb.g) result).f19651a));
                                            } else {
                                                if (!(result instanceof f.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cVar2.I2("HOME_TABS_DISCOVER_ID");
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block, "block");
                            revPointsGiftcardsHomeScreen.H = block;
                            return revPointsGiftcardsHomeScreen;
                        }
                        if (!(page instanceof RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RevPointsGiftcardsUserVouchersScreen revPointsGiftcardsUserVouchersScreen = new RevPointsGiftcardsUserVouchersScreen();
                        final int i5 = 1;
                        Function1 block2 = new Function1() { // from class: pwb.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i5) {
                                    case 0:
                                        vwb.h it8 = (vwb.h) obj4;
                                        Intrinsics.checkNotNullParameter(it8, "it");
                                        cVar.C2(new h(((vwb.g) it8).f292692a));
                                        return Unit.f186387a;
                                    default:
                                        bxb.f result = (bxb.f) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        boolean z3 = result instanceof bxb.g;
                                        com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = cVar;
                                        if (z3) {
                                            cVar2.C2(new g(((bxb.g) result).f19651a));
                                        } else {
                                            if (!(result instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cVar2.I2("HOME_TABS_DISCOVER_ID");
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block2, "block");
                        revPointsGiftcardsUserVouchersScreen.H = block2;
                        return revPointsGiftcardsUserVouchersScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        RevPointsGiftcardsHomePagerFlowContract$ModalStep step = (RevPointsGiftcardsHomePagerFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean z3 = step instanceof RevPointsGiftcardsHomePagerFlowContract$ModalStep.Balance;
                        com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.c cVar2 = this.f240389b;
                        if (z3) {
                            return cVar2.e1(new hub.c(e0.GIFT_CARDS));
                        }
                        if (step instanceof RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding) {
                            return cVar2.e1(new ProductArticleDescriptor(((RevPointsGiftcardsHomePagerFlowContract$ModalStep.Onboarding) step).f83674a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f83684t;
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarB = rd0.e.b(this.o.b());
        h0 h0Var = h0.f322473a;
        Continuation continuation = null;
        l.b1(this, rd0.e.n(dVarB, h0Var), null, new o(this, continuation, 1), 3);
        l.a1(this, rd0.e.n(rd0.e.b(this.f83680p.p()), h0Var), null, null, new o(this, continuation, 0), 3);
        l2(new p(this, continuation, 0), new yi5.b(26));
    }

    public final void I2(String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        boolean zF = Intrinsics.f(tabId, "HOME_TABS_DISCOVER_ID");
        y yVar = this.f83683s;
        if (zF) {
            H2(yVar, new pui.a(21));
        } else if (Intrinsics.f(tabId, "HOME_TABS_MY_CARDS_ID")) {
            H2(yVar, new pui.a(22));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f83683s;
    }
}
