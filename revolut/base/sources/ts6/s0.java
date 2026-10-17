package ts6;

import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$Details$Destination;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import et6.h1;
import et6.q1;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements er6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f274023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f274024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.a f274025c;
    public final gr6.e d;
    public final et6.u0 e;
    public final hr6.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f274026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gr6.j f274027h;
    public final q1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gr6.m f274028j;
    public final r10.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zjh.i f274029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sri.m f274030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f73.c f274031n;
    public final Lazy o;

    public s0(l93.f cardsInteractor, l80.e dateProvider, gr6.a freelancerAccountDetailsInteractor, gr6.e freelancerAvailabilityInteractor, et6.u0 freelancerCapabilitiesInteractor, hr6.l freelancerCommandFactory, t0 freelancerDeeplinkHandler, h1 freelancerInteractor, gr6.j freelancerInviteCampaignInteractor, q1 freelancerJoinCampaignInteractor, gr6.m freelancerPocketsInteractor, r10.d freelancerTaxHubCalendarEventsInteractor, zjh.i freelancerTaxPocketsInteractor, sri.m navigator, jf1.a proMerchantTogglesInteractor, f73.b revolutCardNaviCommandFactory, f73.c revolutCardsNavigationFactory, gte.a featureToggleInteractor, ipj.a freelancerRevolutShopDeeplinkHandler) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCapabilitiesInteractor, "freelancerCapabilitiesInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerDeeplinkHandler, "freelancerDeeplinkHandler");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerInviteCampaignInteractor, "freelancerInviteCampaignInteractor");
        Intrinsics.checkNotNullParameter(freelancerJoinCampaignInteractor, "freelancerJoinCampaignInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerTaxHubCalendarEventsInteractor, "freelancerTaxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(freelancerTaxPocketsInteractor, "freelancerTaxPocketsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(revolutCardNaviCommandFactory, "revolutCardNaviCommandFactory");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(freelancerRevolutShopDeeplinkHandler, "freelancerRevolutShopDeeplinkHandler");
        this.f274023a = cardsInteractor;
        this.f274024b = dateProvider;
        this.f274025c = freelancerAccountDetailsInteractor;
        this.d = freelancerAvailabilityInteractor;
        this.e = freelancerCapabilitiesInteractor;
        this.f = freelancerCommandFactory;
        this.f274026g = freelancerInteractor;
        this.f274027h = freelancerInviteCampaignInteractor;
        this.i = freelancerJoinCampaignInteractor;
        this.f274028j = freelancerPocketsInteractor;
        this.k = freelancerTaxHubCalendarEventsInteractor;
        this.f274029l = freelancerTaxPocketsInteractor;
        this.f274030m = navigator;
        this.f274031n = revolutCardsNavigationFactory;
        this.o = yhm.j.b(new ts1.h(3));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ts6.s0 r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ts6.q0
            if (r0 == 0) goto L13
            r0 = r9
            ts6.q0 r0 = (ts6.q0) r0
            int r1 = r0.f274018w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274018w = r1
            goto L18
        L13:
            ts6.q0 r0 = new ts6.q0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274018w
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L84
        L3a:
            yhm.o.b(r9)
            goto L4e
        L3e:
            yhm.o.b(r9)
            gr6.e r9 = r8.d
            r0.f274018w = r5
            et6.l0 r9 = (et6.l0) r9
            java.lang.Object r9 = r9.l(r0)
            if (r9 != r1) goto L4e
            goto Lbe
        L4e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5b
            com.revolut.retail.core.navigation.NaviCommand r8 = r8.h()
            return r8
        L5b:
            zjh.i r9 = r8.f274029l
            w4l.h r2 = w4l.h.f294642c
            akg.n r9 = r9.j(r2)
            tq0.j r2 = new tq0.j
            r7 = 9
            r2.<init>(r7)
            jhi.b r9 = mo3.a.g(r9, r6, r2, r5)
            tc6.d r2 = new tc6.d
            r5 = 14
            r2.<init>(r3, r5, r6)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r5, r2)
            r0.f274018w = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L84
            goto Lbe
        L84:
            od0.i r9 = (od0.i) r9
            boolean r2 = r9.d()
            if (r2 == 0) goto Lb0
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r0 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r1 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            com.revolut.feature.tab.accounts.models.ProductAccountId r3 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            java.lang.Object r9 = r9.c()
            es6.d r9 = (es6.d) r9
            java.lang.String r9 = r9.f128867b
            com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$ProTax r4 = com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType.ProTax.INSTANCE
            r3.<init>(r9, r4)
            r1.<init>(r3, r2)
            r0.<init>(r1, r6)
            r9 = 12
            com.revolut.retail.core.navigation.FeatureCommand r8 = jbb.a.a(r8, r0, r6, r6, r9)
            return r8
        Lb0:
            hr6.k r9 = hr6.k.PRO_TAX
            java.util.Set r9 = zhm.y0.b(r9)
            r0.f274018w = r3
            java.lang.Object r8 = r8.o(r9, r0)
            if (r8 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.b(ts6.s0, gim.c):java.lang.Object");
    }

    public static rfm.u j(lr6.d dVar) {
        rfm.u uVarG = efm.k.g(new FreelancerBizFeatureConfig.AccountRestrictionPrompts(dVar));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }

    public static rfm.d l(s0 s0Var, TabAccountsInitialPayload.Action action, int i) {
        Continuation continuation = null;
        if ((i & 2) != 0) {
            action = null;
        }
        s0Var.getClass();
        return ofm.q.L(skm.p0.f264003c, new tqh.j(s0Var, action, continuation, 5));
    }

    public static rfm.d m(s0 s0Var, FeatureConfig featureConfig) {
        s0Var.getClass();
        return ofm.q.L(skm.p0.f264003c, new tqh.j(s0Var, featureConfig, null, 4));
    }

    public static rfm.d n(s0 s0Var, String str, NaviCommand naviCommand, int i) {
        Continuation continuation = null;
        String str2 = (i & 1) != 0 ? null : str;
        s0Var.getClass();
        return ofm.q.L(skm.p0.f264003c, new sma.f(s0Var, str2, naviCommand, continuation, 25));
    }

    public static /* synthetic */ rfm.m r(s0 s0Var, Function1 function1, Function0 function0) {
        return s0Var.q(function0, function1, new d(s0Var, 5));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return t0.a(deeplink);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.core.navigation.feature.FeatureConfig r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ts6.f
            if (r0 == 0) goto L13
            r0 = r6
            ts6.f r0 = (ts6.f) r0
            int r1 = r0.f274004x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274004x = r1
            goto L18
        L13:
            ts6.f r0 = new ts6.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274004x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.feature.FeatureConfig r5 = r0.u
            yhm.o.b(r6)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f274004x = r3
            r6 = 0
            java.lang.Object r6 = r4.d(r6, r6, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            if (r5 == 0) goto L4d
            com.revolut.retail.core.navigation.FeatureCommand r5 = gc0.c.f(r5)
            com.revolut.retail.core.navigation.CompositeCommand r5 = com.revolut.retail.core.navigation.a.c(r6, r5)
            return r5
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.c(com.revolut.retail.core.navigation.feature.FeatureConfig, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ts6.h
            if (r0 == 0) goto L13
            r0 = r8
            ts6.h r0 = (ts6.h) r0
            int r1 = r0.f274008x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274008x = r1
            goto L18
        L13:
            ts6.h r0 = new ts6.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274008x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload r7 = r0.u
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            if (r6 != 0) goto L6e
            w4l.h r6 = w4l.h.f294642c
            gr6.m r8 = r5.f274028j
            et6.i2 r8 = (et6.i2) r8
            akg.n r6 = r8.b(r6)
            tpi.g r8 = new tpi.g
            r2 = 25
            r8.<init>(r2)
            akg.n r6 = nim.a.v(r6, r8)
            tq0.j r8 = new tq0.j
            r2 = 10
            r8.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r8, r3)
            r0.u = r7
            r0.f274008x = r3
            java.lang.Object r8 = vkm.q.x(r6, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            od0.i r8 = (od0.i) r8
            java.lang.Object r6 = r8.f224257a
            io3.d r6 = (io3.d) r6
            if (r6 == 0) goto L6d
            java.lang.String r6 = r6.f163145a
            goto L6e
        L6d:
            r6 = r4
        L6e:
            if (r6 == 0) goto L8a
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r0 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r1 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.PRO
            com.revolut.feature.tab.accounts.models.ProductAccountId r3 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            r3.<init>(r6, r4)
            r1.<init>(r3, r2)
            r0.<init>(r1, r7)
            r6 = 12
            com.revolut.retail.core.navigation.FeatureCommand r6 = jbb.a.a(r8, r0, r4, r4, r6)
            return r6
        L8a:
            com.revolut.retail.core.navigation.NaviCommand r6 = r5.h()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.d(java.lang.String, com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ts6.r0
            if (r0 == 0) goto L13
            r0 = r7
            ts6.r0 r0 = (ts6.r0) r0
            int r1 = r0.f274019w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274019w = r1
            goto L1a
        L13:
            ts6.r0 r0 = new ts6.r0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274019w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L61
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            boolean r7 = ts6.t0.b(r6)
            if (r7 == 0) goto L3d
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$FreelancerIneligibility r6 = com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig.FreelancerIneligibility.f73201a
            goto L64
        L3d:
            efm.k r6 = r5.i(r6)
            ts6.d r7 = new ts6.d
            r2 = 1
            r7.<init>(r5, r2)
            ts5.o r2 = new ts5.o
            r4 = 5
            r2.<init>(r4, r7)
            rfm.m r7 = new rfm.m
            r4 = 0
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f274019w = r3
            java.lang.Object r7 = nim.a.i(r7, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r6 = r7
            com.revolut.kompot.common.ParcelableDestination r6 = (com.revolut.kompot.common.ParcelableDestination) r6
        L64:
            r7 = 0
            if (r6 == 0) goto L6d
            q06.h r0 = new q06.h
            r0.<init>(r6, r7)
            return r0
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!t0.a(deeplink)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (t0.b(deeplink)) {
            rfm.u uVarG = efm.k.g(FreelancerBizFeatureConfig.FreelancerIneligibility.f73201a);
            Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
            return p(uVarG);
        }
        rfm.m mVar = new rfm.m(i(deeplink), new ts5.o(5, new d(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return p(mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, com.revolut.retail.core.navigation.NaviCommand r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ts6.g
            if (r0 == 0) goto L13
            r0 = r7
            ts6.g r0 = (ts6.g) r0
            int r1 = r0.f274006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274006x = r1
            goto L18
        L13:
            ts6.g r0 = new ts6.g
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274006x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.NaviCommand r6 = r0.u
            yhm.o.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f274006x = r3
            r7 = 0
            java.lang.Object r7 = r4.d(r5, r7, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            if (r6 == 0) goto L49
            com.revolut.retail.core.navigation.CompositeCommand r5 = com.revolut.retail.core.navigation.a.c(r7, r6)
            return r5
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.g(java.lang.String, com.revolut.retail.core.navigation.NaviCommand, gim.c):java.lang.Object");
    }

    public final NaviCommand h() {
        return (NaviCommand) this.o.getValue();
    }

    public final efm.k i(jf0.c deeplink) {
        final int i = 2;
        String strE = deeplink.e(2);
        final int i2 = 10;
        int i3 = 11;
        final int i5 = 3;
        if (Intrinsics.f(strE, "cards")) {
            String strE2 = deeplink.e(3);
            if (!Intrinsics.f(strE2, "tokenise")) {
                return strE2.length() > 0 ? r(this, new kotlin.jvm.internal.h0() { // from class: ts6.m
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                    }
                }, new tml.a(this, strE2, i3)) : r(this, new kotlin.jvm.internal.h0() { // from class: ts6.o
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                    }
                }, new Function0(this) { // from class: ts6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s0 f273990b;

                    {
                        this.f273990b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                            case 1:
                                return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                            case 2:
                                s0 s0Var = this.f273990b;
                                efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                                ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                                d0VarFirstOrError.getClass();
                                rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                                return jVar;
                            case 3:
                                return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                            case 4:
                                return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                            case 5:
                                s0 s0Var2 = this.f273990b;
                                efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                                ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                                d0VarFirstOrError2.getClass();
                                rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                                Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                                return jVar2;
                            case 6:
                                return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                            case 7:
                                return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                            case 8:
                                return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                            case 9:
                                s0 s0Var3 = this.f273990b;
                                rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                                Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                                return jVar3;
                            default:
                                return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                        }
                    }
                });
            }
            final int i6 = 9;
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.n
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                            return jVar;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                            return jVar2;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        if (Intrinsics.f(strE, "topup-method")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.o0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73323c);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                            return jVar;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                            return jVar2;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        if (Intrinsics.f(strE, "inbound-blocked")) {
            return j(lr6.d.INBOUND_BLOCKED);
        }
        if (Intrinsics.f(strE, "outbound-blocked")) {
            return j(lr6.d.OUTBOUND_BLOCKED);
        }
        if (Intrinsics.f(strE, "inbound-outbound-blocked")) {
            return j(lr6.d.INBOUND_OUTBOUND_BLOCKED);
        }
        if (Intrinsics.f(strE, "account-closed")) {
            return j(lr6.d.ACCOUNT_CLOSED);
        }
        final int i21 = 5;
        if (Intrinsics.f(strE, "auto-topup")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.l
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73323c);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i21) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                            return jVar;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                            return jVar2;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        final int i22 = 4;
        if (Intrinsics.f(strE, "card-order")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.y
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i22) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                            return jVar;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                            return jVar2;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        final int i32 = 1;
        if (Intrinsics.f(strE, "create-sale")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.v
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73323c);
                }
            }, new b(deeplink, this, i32));
        }
        final int i33 = 6;
        if (Intrinsics.f(strE, "sale")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.u
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(deeplink, this, i33));
        }
        if (Intrinsics.f(strE, "settings")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.g0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(deeplink, this, i5));
        }
        final int i43 = 7;
        if (Intrinsics.f(strE, "processing-fees")) {
            return r(this, new tpi.g(23), new b(this, deeplink, i43));
        }
        Continuation continuation = null;
        if (Intrinsics.f(strE, "referrals")) {
            String strE3 = deeplink.e(3);
            if (Intrinsics.f(strE3, "upsell")) {
                return ofm.q.L(skm.p0.f264003c, new f0(this, null));
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Referral type ", strE3, " is not supported."));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException, h0Var);
            return l(this, null, 3);
        }
        if (Intrinsics.f(strE, "email-confirm")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.t
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(deeplink, this, 12));
        }
        final int i59 = 0;
        if (Intrinsics.f(strE, "items")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.r
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i59) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError.getClass();
                            rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                            return jVar;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar2 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                            return jVar2;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        if (Intrinsics.f(strE, "join")) {
            rfm.j jVar = new rfm.j(te0.w.o0(skm.p0.f264003c, new i(this, continuation, i59)), new ts5.o(i22, new c(this, deeplink, i59)), i);
            Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
            return jVar;
        }
        boolean zF = Intrinsics.f(strE, "cashback");
        rfm.h hVar = rfm.h.f253943a;
        if (zF) {
            String strE4 = deeplink.e(3);
            if (Intrinsics.f(strE4, "details")) {
                return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.q
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                    }
                }, new Function0(this) { // from class: ts6.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s0 f273990b;

                    {
                        this.f273990b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i32) {
                            case 0:
                                return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                            case 1:
                                return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                            case 2:
                                s0 s0Var = this.f273990b;
                                efm.d0 d0VarFirstOrError = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                                ts5.o oVar = new ts5.o(11, new d(s0Var, 4));
                                d0VarFirstOrError.getClass();
                                rfm.j jVar2 = new rfm.j(d0VarFirstOrError, oVar, 2);
                                Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
                                return jVar2;
                            case 3:
                                return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                            case 4:
                                return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                            case 5:
                                s0 s0Var2 = this.f273990b;
                                efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                                ts5.o oVar2 = new ts5.o(12, new d(s0Var2, 6));
                                d0VarFirstOrError2.getClass();
                                rfm.j jVar22 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                                Intrinsics.checkNotNullExpressionValue(jVar22, "flatMapMaybe(...)");
                                return jVar22;
                            case 6:
                                return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                            case 7:
                                return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                            case 8:
                                return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                            case 9:
                                s0 s0Var3 = this.f273990b;
                                rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                                Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                                return jVar3;
                            default:
                                return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                        }
                    }
                });
            }
            if (Intrinsics.f(strE4, "booster")) {
                return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.p
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                    }
                }, new b(deeplink, this, i59));
            }
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        if (Intrinsics.f(strE, "partner-confirm")) {
            efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((et6.g) this.f274025c).d(w4l.h.f294642c), null, null, 3), kotlin.coroutines.g.f186406a).firstOrError();
            ts5.o oVar = new ts5.o(i33, new c(this, deeplink, i32));
            d0VarFirstOrError.getClass();
            rfm.j jVar2 = new rfm.j(d0VarFirstOrError, oVar, i);
            Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
            return ue0.e.B(jVar2, new d(this, i));
        }
        if (Intrinsics.f(strE, "learn")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.w
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i5) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar22 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar22, "flatMapMaybe(...)");
                            return jVar22;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError22 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar22 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError22.getClass();
                            rfm.j jVar222 = new rfm.j(d0VarFirstOrError22, oVar22, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar222, "flatMapMaybe(...)");
                            return jVar222;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        if (Intrinsics.f(strE, "move-money")) {
            return r(this, new tpi.g(22), new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i43) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar22 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar22, "flatMapMaybe(...)");
                            return jVar22;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError22 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar22 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError22.getClass();
                            rfm.j jVar222 = new rfm.j(d0VarFirstOrError22, oVar22, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar222, "flatMapMaybe(...)");
                            return jVar222;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        final int i66 = 8;
        if (Intrinsics.f(strE, "plug-in")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.a0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(deeplink, this, i66));
        }
        if (Intrinsics.f(strE, "pockets")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.d0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(this, deeplink, i21));
        }
        if (Intrinsics.f(strE, "tax-hub")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.k0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(this, deeplink, i));
        }
        if (Intrinsics.f(strE, "plugin-details")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.b0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i66) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar22 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar22, "flatMapMaybe(...)");
                            return jVar22;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError22 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar22 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError22.getClass();
                            rfm.j jVar222 = new rfm.j(d0VarFirstOrError22, oVar22, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar222, "flatMapMaybe(...)");
                            return jVar222;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        if (Intrinsics.f(strE, "perks")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.c0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(this, deeplink, i22));
        }
        if (Intrinsics.f(strE, "close-account")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.j
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new ts1.h(2));
        }
        if (Intrinsics.f(strE, "payment")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.z
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new b(deeplink, this, 11));
        }
        if (Intrinsics.f(strE, "shop")) {
            return q(new b(this, deeplink, 10), new kotlin.jvm.internal.h0() { // from class: ts6.j0
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new d(this, i43));
        }
        if (Intrinsics.f(strE, "analytics")) {
            return r(this, new kotlin.jvm.internal.h0() { // from class: ts6.k
                @Override // kotlin.jvm.internal.h0, wim.p
                public final Object get(Object obj2) {
                    return Boolean.valueOf(((FreelancerPermissions) obj2).f73321a);
                }
            }, new Function0(this) { // from class: ts6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ s0 f273990b;

                {
                    this.f273990b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i33) {
                        case 0:
                            return ofm.q.L(skm.p0.f264003c, new tqh.j(this.f273990b, null, 3));
                        case 1:
                            return s0.m(this.f273990b, zh9.u0.d(new FreelancerBizFeatureConfig.Cashback(0)));
                        case 2:
                            s0 s0Var = this.f273990b;
                            efm.d0 d0VarFirstOrError2 = m70.a.g(s0Var.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar2 = new ts5.o(11, new d(s0Var, 4));
                            d0VarFirstOrError2.getClass();
                            rfm.j jVar22 = new rfm.j(d0VarFirstOrError2, oVar2, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar22, "flatMapMaybe(...)");
                            return jVar22;
                        case 3:
                            return s0.n(this.f273990b, null, zh9.u0.f(new LearnKompotFeatureConfig.Home.Destination(u09.v.PRO)), 3);
                        case 4:
                            return ofm.q.L(skm.p0.f264003c, new i(this.f273990b, null, 2));
                        case 5:
                            s0 s0Var2 = this.f273990b;
                            efm.d0 d0VarFirstOrError22 = m70.a.g(s0Var2.f274026g.b(), null, null, 3).firstOrError();
                            ts5.o oVar22 = new ts5.o(12, new d(s0Var2, 6));
                            d0VarFirstOrError22.getClass();
                            rfm.j jVar222 = new rfm.j(d0VarFirstOrError22, oVar22, 2);
                            Intrinsics.checkNotNullExpressionValue(jVar222, "flatMapMaybe(...)");
                            return jVar222;
                        case 6:
                            return s0.n(this.f273990b, null, zh9.u0.f(new AnalyticsFeatureConfig$Details$Destination(AnalyticsAccount.Pro.All.f99196a, yld.d.CASHFLOW)), 3);
                        case 7:
                            return s0.n(this.f273990b, null, zh9.u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.ProAll.f104860a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.MOVE, 0L, null, 240), (Set) null, 4), null)), 3);
                        case 8:
                            return s0.n(this.f273990b, null, zh9.u0.f(FreelancerBizFeatureConfig.ManageEcommercePlugin.f73215a), 3);
                        case 9:
                            s0 s0Var3 = this.f273990b;
                            rfm.j jVar3 = new rfm.j(new ufm.i(ue0.e.F(l93.f.j(s0Var3.f274023a, b93.d.FREELANCER, 2), zhm.f0.f322471a), new ts5.o(7, new tpi.g(24)), 1), new ts5.o(8, new d(s0Var3, 3)), 2);
                            Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                            return jVar3;
                        default:
                            return s0.m(this.f273990b, new CardsScreenFeatureConfig(null, null, b93.d.FREELANCER, null, CardScreenAction.Idle.f65329a, 11));
                    }
                }
            });
        }
        kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
        m70.a.c(t0Var);
        if (!Intrinsics.f(strE, "")) {
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        HashMap map = deeplink.d;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return k(Boolean.parseBoolean((String) map.getOrDefault("skip_intro", "")) ? u0.SKIP_INTRO : u0.SHOW_INTRO);
    }

    public final rfm.j k(u0 u0Var) {
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((et6.g) this.f274025c).d(w4l.j.f294644c), null, null, 3), kotlin.coroutines.g.f186406a).firstOrError();
        ts5.o oVar = new ts5.o(1, new tkm.d(this, u0Var, 19));
        d0VarFirstOrError.getClass();
        rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ts6.p0
            if (r0 == 0) goto L13
            r0 = r7
            ts6.p0 r0 = (ts6.p0) r0
            int r1 = r0.f274017x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274017x = r1
            goto L18
        L13:
            ts6.p0 r0 = new ts6.p0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274017x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ts6.s0 r6 = r0.u
            yhm.o.b(r7)
            goto L4b
        L38:
            yhm.o.b(r7)
            r0.u = r5
            r0.f274017x = r4
            hr6.l r7 = r5.f
            ct6.m r7 = (ct6.m) r7
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            r6 = r5
        L4b:
            com.revolut.kompot.common.StackDestination r7 = (com.revolut.kompot.common.StackDestination) r7
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r7)
            r2 = 0
            r0.u = r2
            r0.f274017x = r3
            java.lang.Object r6 = r6.g(r2, r7, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.s0.o(java.util.Set, gim.c):java.lang.Object");
    }

    public final pfm.z p(efm.k kVar) {
        ts5.o oVar = new ts5.o(2, new d(this, 0));
        dfm.c cVar = mfm.f.d;
        rfm.m mVar = new rfm.m(new rfm.y(kVar, cVar, oVar, cVar, mfm.f.f205043c), new ts5.o(3, new tpi.g(21)), 1);
        Boolean bool = Boolean.FALSE;
        rfm.f0 f0VarP = mVar.p(bool);
        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
        return ue0.e.F(f0VarP, bool);
    }

    public final rfm.m q(Function0 function0, Function1 function1, Function1 function12) {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(((et6.g) this.f274026g.f129238c).d(loadingStrategy), kotlin.coroutines.g.f186406a), null, new tq0.j(8), 1).firstOrError();
        ts5.o oVar = new ts5.o(10, new toh.h(function1, 1, function0, this));
        d0VarFirstOrError.getClass();
        rfm.j jVar = new rfm.j(d0VarFirstOrError, oVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return ue0.e.B(jVar, function12);
    }
}
