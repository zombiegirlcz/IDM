package n33;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class r2 implements u {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f211793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f73.b f211794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4b.f f211795c;
    public final r d;
    public final w e;
    public final mm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cu8.r0 f211796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hr6.l f211797h;
    public final et6.h1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ffk.t f211798j;
    public final ic8.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mre.c f211799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uq8.a f211800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f211801n;
    public final q78.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v60.i f211802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.j f211803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.j f211804r;

    public r2(t70.g localization, f73.b revolutCardNavigationCommandFactory, i4b.f cardsScreenStoryNavigator, r presentationModel, w state, mm.d actionsDispatcher, cu8.r0 kycRequiredActionTransformer, hr6.l freelancerCommandFactory, et6.h1 freelancerInteractor, ffk.t pricingPlanInteractor, ic8.a juniorCardCommandsFactory, mre.c termsNavigationFactory, uq8.a juniorTransferCommandFactory, gte.a featureToggleInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(cardsScreenStoryNavigator, "cardsScreenStoryNavigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(juniorCardCommandsFactory, "juniorCardCommandsFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f211793a = localization;
        this.f211794b = revolutCardNavigationCommandFactory;
        this.f211795c = cardsScreenStoryNavigator;
        this.d = presentationModel;
        this.e = state;
        this.f = actionsDispatcher;
        this.f211796g = kycRequiredActionTransformer;
        this.f211797h = freelancerCommandFactory;
        this.i = freelancerInteractor;
        this.f211798j = pricingPlanInteractor;
        this.k = juniorCardCommandsFactory;
        this.f211799l = termsNavigationFactory;
        this.f211800m = juniorTransferCommandFactory;
        this.f211801n = featureToggleInteractor;
        this.o = juniorAccountDestinationResolver;
        v60.i iVar = new v60.i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.f211802p = iVar;
        this.f211803q = p.a.D("toSerialized(...)");
        this.f211804r = p.a.D("toSerialized(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n33.r2 r10, psg.a r11, kc8.a r12, gim.c r13) {
        /*
            n33.w r0 = r10.e
            boolean r1 = r13 instanceof n33.p2
            if (r1 == 0) goto L16
            r1 = r13
            n33.p2 r1 = (n33.p2) r1
            int r2 = r1.f211784y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f211784y = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            n33.p2 r1 = new n33.p2
            r1.<init>(r10, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r6.f211782w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.f211784y
            r8 = 2
            r3 = 1
            r9 = 0
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L39
            if (r2 != r8) goto L31
            com.revolut.retail.core.navigation.CompositeCommand r10 = r6.v
            yhm.o.b(r13)
            goto L93
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            psg.a r11 = r6.u
            yhm.o.b(r13)
            goto L73
        L3f:
            yhm.o.b(r13)
            r13 = r0
            n33.s2 r13 = (n33.s2) r13
            te0.e r2 = r13.w0()
            java.lang.Object r2 = r2.get()
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper r2 = (com.revolut.feature.card_order_new.api.CardOrderAccountWrapper) r2
            boolean r4 = r2 instanceof com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Junior
            if (r4 == 0) goto Lab
            int[] r2 = n33.o2.f211778c
            int r12 = r12.ordinal()
            r12 = r2[r12]
            if (r12 == r3) goto La0
            if (r12 != r8) goto L9a
            r12 = r3
            java.lang.String r3 = r11.f239485b
            r6.u = r11
            r6.f211784y = r12
            q78.e r2 = r10.o
            r5 = 0
            r7 = 14
            r4 = 0
            java.lang.Object r13 = u68.b.b(r2, r3, r4, r5, r6, r7)
            if (r13 != r1) goto L73
            goto L91
        L73:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            n33.s2 r0 = (n33.s2) r0
            te0.e r12 = r0.C0()
            java.lang.Object r12 = te0.w.O(r12)
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            com.revolut.retail.core.navigation.CompositeCommand r12 = com.revolut.retail.core.navigation.a.c(r13, r12)
            r6.u = r9
            r6.v = r12
            r6.f211784y = r8
            java.lang.Object r13 = r10.f(r11, r6)
            if (r13 != r1) goto L92
        L91:
            return r1
        L92:
            r10 = r12
        L93:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            com.revolut.retail.core.navigation.CompositeCommand r10 = com.revolut.retail.core.navigation.a.c(r10, r13)
            return r10
        L9a:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        La0:
            te0.e r10 = r13.C0()
            java.lang.Object r10 = te0.w.O(r10)
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            return r10
        Lab:
            boolean r10 = r2 instanceof com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Regular
            if (r10 == 0) goto Lb0
            return r9
        Lb0:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n33.r2.a(n33.r2, psg.a, kc8.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FeatureCommand c(ft3.a1 a1Var) {
        return new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(a1Var, new ft3.g(null, 0 == true ? 1 : 0, 3), null, null, null, null, null, null, null, null, 2044));
    }

    public final pfm.a b(boolean z, boolean z3, Function1 function1) {
        t0 t0Var = (t0) this.d;
        efm.d0 d0VarFirstOrError = m70.a.h(sh3.a.c(t0Var.f211823j, null, com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) t0Var.i).w0().get()), null, 5), new mig.a(21), new n0c.v(29), null, 4).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        i2 i2Var = new i2(17, new kxj.f(this, function1, z, z3));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, i2Var, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pi3.h d() {
        te0.e eVarZ0 = ((s2) this.e).z0();
        od0.i.Companion.getClass();
        return (pi3.h) ((od0.i) te0.w.M(eVarZ0, od0.i.f224256b)).f224257a;
    }

    public final String e(String str) {
        if (((jte.d) this.f211801n).c(CardOrderFeatureApi$Toggles.DecommissionDesignsForPlanId.f64946c)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(psg.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof n33.q2
            if (r0 == 0) goto L13
            r0 = r6
            n33.q2 r0 = (n33.q2) r0
            int r1 = r0.f211789w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211789w = r1
            goto L18
        L13:
            n33.q2 r0 = new n33.q2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211789w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            goto L46
        L27:
            r5 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            uq8.a r6 = r4.f211800m     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r5.f239484a     // Catch: java.lang.Exception -> L27
            r2 = 0
            rfm.j r5 = r6.a(r5, r2)     // Catch: java.lang.Exception -> L27
            r0.f211789w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = nim.a.i(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L46
            return r1
        L46:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6     // Catch: java.lang.Exception -> L27
            return r6
        L49:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n33.r2.f(psg.a, gim.c):java.lang.Object");
    }

    public final pfm.a g(h93.l0 l0Var, n2 n2Var) {
        String str;
        w wVar = this.e;
        if (n2Var == null || (str = n2Var.f211770b) == null) {
            te0.e eVarA0 = ((s2) wVar).A0();
            od0.i.Companion.getClass();
            str = (String) ((od0.i) te0.w.M(eVarA0, od0.i.f224256b)).f224257a;
        }
        pfm.a aVar = new pfm.a(this.f211794b.h(xfa.b.CARDS_TAB_FULL_SCREEN, com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) wVar).w0().get()), e(str), ((t0) this.d).c(), e93.v.GET_PHYSICAL_CARD, n2Var != null ? n2Var.f211769a : d(), l0Var), new i2(15, new g2(this, 10)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a h(h93.l0 l0Var, n2 n2Var) {
        String str;
        w wVar = this.e;
        if (n2Var == null || (str = n2Var.f211770b) == null) {
            te0.e eVarA0 = ((s2) wVar).A0();
            od0.i.Companion.getClass();
            str = (String) ((od0.i) te0.w.M(eVarA0, od0.i.f224256b)).f224257a;
        }
        pfm.a aVar = new pfm.a(n63.i.a(this.f211794b, xfa.b.CARDS_TAB_FULL_SCREEN, com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) wVar).w0().get()), e(str), ((t0) this.d).c(), n2Var != null ? n2Var.f211769a : d(), l0Var, 24), new i2(2, new g2(this, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a i(e13.a flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        s2 s2Var = (s2) this.e;
        efm.d0 d0VarFirstOrError = te0.w.a0(s2Var.k.getValue(s2Var, s2.f211807p[9]).c(te0.s.f270018a), new v0(6)).firstOrError();
        i2 i2Var = new i2(10, new k2(flowType, this));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(new ufm.i(d0VarFirstOrError, i2Var, 0), new i2(11, new g2(this, 11)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a j(e13.a flowType) {
        ufm.b bVarC;
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.d0 d0VarFirstOrError = m70.a.g(rd0.e.c(((et6.g) this.i.f129238c).d(loadingStrategy), kotlin.coroutines.g.f186406a), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        int i = o2.f211777b[flowType.ordinal()];
        r rVar = this.d;
        f73.b bVar = this.f211794b;
        if (i == 2 || i == 3) {
            bVarC = bVar.c(xfa.b.CARDS_TAB_FULL_SCREEN, ((t0) rVar).c(), flowType == e13.a.PHYSICAL);
        } else {
            bVarC = efm.d0.m(f73.b.b(bVar, b93.e.FREELANCER_DISPOSABLE, AccountId.Personal.f51414a, xfa.b.CARDS_TAB_FULL_SCREEN, null, false, ((t0) rVar).c(), null, false, null, null, null, null, 8088));
            Intrinsics.checkNotNullExpressionValue(bVarC, "just(...)");
        }
        pfm.a aVar = new pfm.a(te0.w.H0(d0VarFirstOrError, bVarC), new i2(0, new g2(this, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a k(h93.l0 l0Var) {
        pfm.a aVar = new pfm.a(new ufm.i(this.f211794b.f(xfa.b.CARDS_TAB_FULL_SCREEN, com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) this.e).w0().get()), ((t0) this.d).c(), l0Var), new i2(4, new n09.j0(l0Var, this, 21)), 0), new i2(5, new g2(this, 6)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a l(h93.l0 l0Var) {
        zn3.a aVarD = ((t0) this.d).d();
        return b(aVarD == zn3.a.ONBOARDING, true, new j2(aVarD, this, l0Var, 1));
    }

    public final pfm.a m(h93.l0 l0Var) {
        zn3.a aVarD = ((t0) this.d).d();
        return b(aVarD == zn3.a.ONBOARDING, false, new j2(aVarD, this, l0Var, 0));
    }
}
