package c7e;

import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pcd.x;
import rp0.k1;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f21965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p8e.a f21966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o7e.n f21967n;
    public final g6e.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w5i.b f21968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f21969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l93.f f21970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f21971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g6e.d f21972t;
    public final xua.a u;
    public final g9e.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zja.a f21973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l61.a f21974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f21975y;

    public n(j60.a bottomDialogExtension, p8e.a memberActionsDialogFactory, o7e.n billActionsDialogFactory, g6e.g subaccountsNavigationProvider, w5i.b moveMoneyAccountEligibilityChecker, b subaccountDialogMapper, l93.f revolutCardsInteractor, k1 shotDialogDisplayer, g6e.d subaccountInteractor, xua.a recurringPaymentInteractor, g9e.b unlinkCardFromSubaccountFlowFactory, zja.a productArticleInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(memberActionsDialogFactory, "memberActionsDialogFactory");
        Intrinsics.checkNotNullParameter(billActionsDialogFactory, "billActionsDialogFactory");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAccountEligibilityChecker, "moveMoneyAccountEligibilityChecker");
        Intrinsics.checkNotNullParameter(subaccountDialogMapper, "subaccountDialogMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(unlinkCardFromSubaccountFlowFactory, "unlinkCardFromSubaccountFlowFactory");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f21965l = bottomDialogExtension;
        this.f21966m = memberActionsDialogFactory;
        this.f21967n = billActionsDialogFactory;
        this.o = subaccountsNavigationProvider;
        this.f21968p = moveMoneyAccountEligibilityChecker;
        this.f21969q = subaccountDialogMapper;
        this.f21970r = revolutCardsInteractor;
        this.f21971s = shotDialogDisplayer;
        this.f21972t = subaccountInteractor;
        this.u = recurringPaymentInteractor;
        this.v = unlinkCardFromSubaccountFlowFactory;
        this.f21973w = productArticleInteractor;
        this.f21974x = userCompanyInteractor;
    }

    @Override // yji.n
    public final void H2() {
        yji.n.j2(this, rd0.e.b(m70.a.g(hng.g.b(((ang.b) this.f21974x).f7765a), null, null, 3)), null, new c1i.f(this, (Continuation) null, 17), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.cards.models.card.PocketWithSubaccount r13, gim.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof c7e.j
            if (r0 == 0) goto L13
            r0 = r14
            c7e.j r0 = (c7e.j) r0
            int r1 = r0.f21959y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21959y = r1
            goto L18
        L13:
            c7e.j r0 = new c7e.j
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f21957w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21959y
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r5 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.revolut.feature.product_article.api.models.ProductArticleParams r13 = r0.v
            com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination r0 = r0.u
            yhm.o.b(r14)
        L2c:
            r4 = r13
            goto L66
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            yhm.o.b(r14)
            com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination r14 = new com.revolut.feature.card_payment_method.api.declaration.LinkCardToPocketNavigationDestination
            com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData r2 = new com.revolut.feature.card_payment_method.api.declaration.LinkCardFlowInputData
            w33.a r4 = w33.a.PreselectNone
            r2.<init>(r13, r4)
            r14.<init>(r2)
            com.revolut.feature.product_article.api.models.ProductArticleParams r13 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.subaccount.impl.product.eventhandler.SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey r4 = com.revolut.feature.subaccount.impl.product.eventhandler.SubaccountProductActionsHandler$CardPaymentMethodRemoteStoriesKey.LINK_CARD_TO_POCKET
            r2.<init>(r4)
            r13.<init>(r2)
            r0.u = r14
            r0.v = r13
            r0.f21959y = r3
            zja.a r2 = r12.f21973w
            kka.h r2 = (kka.h) r2
            java.lang.Object r0 = r2.e(r13, r5, r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            r4 = r0
            r0 = r14
            r14 = r4
            goto L2c
        L66:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 == 0) goto L88
            com.revolut.feature.product_article.api.navigation.ProductArticleDestination r3 = new com.revolut.feature.product_article.api.navigation.ProductArticleDestination
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r6 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r0)
            com.revolut.retail.core.navigation.FeatureCommand r10 = zh9.u0.f(r0)
            r11 = 6
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r10 = 0
            r11 = 248(0xf8, float:3.48E-43)
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r3
        L88:
            r12.A2(r0)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c7e.n.Z2(com.revolut.feature.cards.models.card.PocketWithSubaccount, gim.c):java.lang.Object");
    }

    public final void b3(GroupMemberClickData memberData) {
        Intrinsics.checkNotNullParameter(memberData, "memberData");
        x xVar = memberData.f98696a;
        String userId = memberData.f98698c.f116408a;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (Intrinsics.f(xVar.f234903a, userId)) {
            return;
        }
        boolean z = this.f21975y;
        this.f21966m.getClass();
        this.f21965l.x(p8e.a.a(memberData, z));
    }
}
