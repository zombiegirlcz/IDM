package com.revolut.feature.donations.impl.ui.kompot.flow.overview;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlowContract$ModalStep;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlowContract$Page;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.contributions.ContributionsTabScreen;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import efm.r;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lxb.f;
import m1c.e0;
import m1c.f1;
import md6.s;
import mra.d;
import n68.x;
import naf.j;
import nb6.m;
import nb6.q;
import nyb.i0;
import nyb.k;
import od0.i;
import oki.h;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements nb6.c {
    public final i0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f72020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f72021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a31.a f72022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zja.a f72023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f72024t;
    public final ali.b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(i0 revPointsProductEligibilityInteractor, k revPointsInteractor, q donateWithRevPointsDialogDescriptorProvider, a31.a donationsAvailabilityInteractor, zja.a productArticleInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(donateWithRevPointsDialogDescriptorProvider, "donateWithRevPointsDialogDescriptorProvider");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = revPointsProductEligibilityInteractor;
        this.f72020p = revPointsInteractor;
        this.f72021q = donateWithRevPointsDialogDescriptorProvider;
        this.f72022r = donationsAvailabilityInteractor;
        this.f72023s = productArticleInteractor;
        final int i = 0;
        CharitiesOverviewFlowContract$Page.Charities charities = CharitiesOverviewFlowContract$Page.Charities.f72018a;
        final int i2 = 1;
        this.f72024t = d.b(this, new nb6.d(new Data(null, null, true, 3, null), charities.getF70838b(), v.k(charities, CharitiesOverviewFlowContract$Page.Contributions.f72019a)), stateMapper, null, false, 12);
        this.u = s.b(this, new Function2(this) { // from class: nb6.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.overview.b f214003b;

            {
                this.f214003b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CharitiesOverviewFlowContract$Page item = (CharitiesOverviewFlowContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        boolean zF = Intrinsics.f(item, CharitiesOverviewFlowContract$Page.Charities.f72018a);
                        com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar = this.f214003b;
                        if (!zF) {
                            if (!Intrinsics.f(item, CharitiesOverviewFlowContract$Page.Contributions.f72019a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ContributionsTabScreen contributionsTabScreen = new ContributionsTabScreen();
                            m mVar = new m(bVar, 1);
                            Intrinsics.checkNotNullParameter(mVar, "<set-?>");
                            contributionsTabScreen.H = mVar;
                            return contributionsTabScreen;
                        }
                        CharitiesTabScreen charitiesTabScreen = new CharitiesTabScreen();
                        p pVar = new p(1, bVar, com.revolut.feature.donations.impl.ui.kompot.flow.overview.b.class, "postResult", "postResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 0);
                        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
                        charitiesTabScreen.H = pVar;
                        return charitiesTabScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CharitiesOverviewFlowContract$ModalStep step = (CharitiesOverviewFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean zF2 = Intrinsics.f(step, CharitiesOverviewFlowContract$ModalStep.DonateWithRevPointsIntro.f72016a);
                        com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar2 = this.f214003b;
                        if (zF2) {
                            bVar2.f72021q.getClass();
                            return bVar2.e1(new hub.c(e0.DONATIONS));
                        }
                        if (step instanceof CharitiesOverviewFlowContract$ModalStep.ProductArticle) {
                            return bVar2.e1(new ProductArticleDescriptor(((CharitiesOverviewFlowContract$ModalStep.ProductArticle) step).f72017a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        this.v = e.a(this, new Function2(this) { // from class: nb6.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.overview.b f214003b;

            {
                this.f214003b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        CharitiesOverviewFlowContract$Page item = (CharitiesOverviewFlowContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(item, "item");
                        boolean zF = Intrinsics.f(item, CharitiesOverviewFlowContract$Page.Charities.f72018a);
                        com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar = this.f214003b;
                        if (!zF) {
                            if (!Intrinsics.f(item, CharitiesOverviewFlowContract$Page.Contributions.f72019a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ContributionsTabScreen contributionsTabScreen = new ContributionsTabScreen();
                            m mVar = new m(bVar, 1);
                            Intrinsics.checkNotNullParameter(mVar, "<set-?>");
                            contributionsTabScreen.H = mVar;
                            return contributionsTabScreen;
                        }
                        CharitiesTabScreen charitiesTabScreen = new CharitiesTabScreen();
                        p pVar = new p(1, bVar, com.revolut.feature.donations.impl.ui.kompot.flow.overview.b.class, "postResult", "postResult(Lcom/revolut/kompot/common/IOData$Output;)V", 0, 0);
                        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
                        charitiesTabScreen.H = pVar;
                        return charitiesTabScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        CharitiesOverviewFlowContract$ModalStep step = (CharitiesOverviewFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean zF2 = Intrinsics.f(step, CharitiesOverviewFlowContract$ModalStep.DonateWithRevPointsIntro.f72016a);
                        com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar2 = this.f214003b;
                        if (zF2) {
                            bVar2.f72021q.getClass();
                            return bVar2.e1(new hub.c(e0.DONATIONS));
                        }
                        if (step instanceof CharitiesOverviewFlowContract$ModalStep.ProductArticle) {
                            return bVar2.e1(new ProductArticleDescriptor(((CharitiesOverviewFlowContract$ModalStep.ProductArticle) step).f72017a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.donations.impl.ui.kompot.flow.overview.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof nb6.o
            if (r0 == 0) goto L13
            r0 = r7
            nb6.o r0 = (nb6.o) r0
            int r1 = r0.f214005x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214005x = r1
            goto L18
        L13:
            nb6.o r0 = new nb6.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214005x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = r0.u
            yhm.o.b(r7)
            goto L54
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.donations.impl.articles.DonationsArticles r4 = com.revolut.feature.donations.impl.articles.DonationsArticles.INTRO
            r2.<init>(r4)
            r7.<init>(r2)
            zja.a r6 = r6.f72023s
            r0.u = r7
            r0.f214005x = r3
            kka.h r6 = (kka.h) r6
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r6 = r6.e(r7, r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r5 = r7
            r7 = r6
            r6 = r5
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            return r6
        L5d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.donations.impl.ui.kompot.flow.overview.b.I2(com.revolut.feature.donations.impl.ui.kompot.flow.overview.b, gim.c):java.lang.Object");
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        r rVarJust;
        a31.a aVar = this.f72022r;
        Continuation continuation = null;
        if (aVar.f() && ((jla.h) aVar.f955b).d(y96.c.f311753c.a(), null) == bla.c.ENABLED) {
            f1 product = f1.DONATIONS;
            i0 i0Var = this.o;
            i0Var.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            f fVar = i0Var.f220799b;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            rVarJust = pd.b.r(fVar.d.e(product, w4l.h.f294642c), new m(this, 0));
        } else {
            i.Companion.getClass();
            rVarJust = r.just(new Data(i.f224256b, null, false, 6, null));
            Intrinsics.h(rVarJust);
        }
        l.a1(this, rd0.e.b(rVarJust), null, null, new j(this, continuation, 1), 3);
        l2(new x(this, continuation, 6), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f72024t;
    }
}
