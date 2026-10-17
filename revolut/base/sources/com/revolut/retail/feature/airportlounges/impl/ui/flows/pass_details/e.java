package com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import cu8.r0;
import dwi.a0;
import dwi.d0;
import dwi.i0;
import dwi.s;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qp7.g;
import qwd.o;
import qwi.f;
import qwi.j;
import svi.q;
import vkm.j2;
import wli.x;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements qwi.b {
    public static final long B;

    @NotNull
    private static final f Companion = new f();
    public final i A;
    public final AirportLoungePassDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f99014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dwi.a f99015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f99016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mwi.a f99017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qvi.c f99018t;
    public final a0 u;
    public final t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final eyi.b f99019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qvi.d f99020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f99021y;
    public final qki.d z;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        B = kotlin.time.c.g(5, pkm.e.SECONDS);
    }

    public e(AirportLoungePassDetailsFlowContract$InputData inputData, s airportLoungePassesInteractor, dwi.a passDetailsInteractor, r0 kycRequiredActionTransformer, mwi.a checkoutControllerResolver, qvi.c passWelcomeInteractor, a0 disclaimerInteractor, t pricingPlanInteractor, eyi.b promptBuilder, qvi.d termsAndConditionsInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(airportLoungePassesInteractor, "airportLoungePassesInteractor");
        Intrinsics.checkNotNullParameter(passDetailsInteractor, "passDetailsInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(checkoutControllerResolver, "checkoutControllerResolver");
        Intrinsics.checkNotNullParameter(passWelcomeInteractor, "passWelcomeInteractor");
        Intrinsics.checkNotNullParameter(disclaimerInteractor, "disclaimerInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(promptBuilder, "promptBuilder");
        Intrinsics.checkNotNullParameter(termsAndConditionsInteractor, "termsAndConditionsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f99014p = airportLoungePassesInteractor;
        this.f99015q = passDetailsInteractor;
        this.f99016r = kycRequiredActionTransformer;
        this.f99017s = checkoutControllerResolver;
        this.f99018t = passWelcomeInteractor;
        this.u = disclaimerInteractor;
        this.v = pricingPlanInteractor;
        this.f99019w = promptBuilder;
        this.f99020x = termsAndConditionsInteractor;
        this.f99021y = deeplinkHandler;
        this.z = hx7.e.b(this, new AirportLoungePassDetailsFlowContract$State(false, null, false, false, null, null));
        this.A = d8l.d.a(this, new qm2.c(this, 16));
    }

    public static final void I2(e eVar) {
        qki.d dVar = eVar.z;
        if (((AirportLoungePassDetailsFlowContract$State) ((j2) dVar.f22677a).getValue()).d) {
            return;
        }
        AirportLoungesDisclaimer airportLoungesDisclaimer = ((AirportLoungePassDetailsFlowContract$State) ((j2) dVar.f22677a).getValue()).e;
        eVar.H2(dVar, new o(14));
        if (airportLoungesDisclaimer != null) {
            eVar.l2(new c(eVar, airportLoungesDisclaimer, null), new yi5.b(26));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e r8, gim.c r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof qwi.h
            if (r0 == 0) goto L16
            r0 = r9
            qwi.h r0 = (qwi.h) r0
            int r1 = r0.f249957x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f249957x = r1
            goto L1b
        L16:
            qwi.h r0 = new qwi.h
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249957x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Set r8 = r0.u
            java.util.Set r8 = (java.util.Set) r8
            yhm.o.b(r9)
            goto L67
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            qki.d r9 = r8.z
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State r9 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State) r9
            java.util.Set r9 = r9.f
            if (r9 != 0) goto L4b
            goto L86
        L4b:
            r2 = r9
            java.util.Set r2 = (java.util.Set) r2
            r0.u = r2
            r0.f249957x = r3
            qu4.s r2 = new qu4.s
            r3 = 10
            w4l.i r5 = w4l.i.f294643c
            r2.<init>(r8, r5, r4, r3)
            long r5 = com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.B
            java.lang.Object r8 = skm.h2.e(r5, r2, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r7 = r9
            r9 = r8
            r8 = r7
        L67:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L6c
            goto L86
        L6c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L72:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L72
            return r0
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.J2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof qwi.k
            if (r0 == 0) goto L13
            r0 = r6
            qwi.k r0 = (qwi.k) r0
            int r1 = r0.f249959w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249959w = r1
            goto L18
        L13:
            qwi.k r0 = new qwi.k
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249959w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L48
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            dwi.s r5 = r5.f99014p
            efm.r r5 = r5.a(r4, r4)
            r6 = 3
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r2, r6)
            r0.f249959w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            svi.k r6 = (svi.k) r6
            boolean r5 = r6 instanceof svi.j
            if (r5 == 0) goto L53
            svi.j r6 = (svi.j) r6
            boolean r4 = r6.f265927g
            goto L64
        L53:
            boolean r5 = r6 instanceof svi.l
            if (r5 == 0) goto L5c
            svi.l r6 = (svi.l) r6
            boolean r4 = r6.f265938g
            goto L64
        L5c:
            svi.k$a r5 = svi.k.a.f265929a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L69
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        L69:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.K2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e r7, gim.c r8) {
        /*
            qki.d r0 = r7.z
            boolean r1 = r8 instanceof qwi.l
            if (r1 == 0) goto L15
            r1 = r8
            qwi.l r1 = (qwi.l) r1
            int r2 = r1.f249960w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f249960w = r2
            goto L1a
        L15:
            qwi.l r1 = new qwi.l
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f249960w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2a
            yhm.o.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            java.lang.Object r8 = r0.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State r8 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State) r8
            java.util.Set r8 = r8.f
            if (r8 == 0) goto L46
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L46:
            r1.f249960w = r5
            qu4.s r8 = new qu4.s
            r3 = 10
            w4l.h r5 = w4l.h.f294642c
            r8.<init>(r7, r5, r4, r3)
            long r5 = com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.B
            java.lang.Object r8 = skm.h2.e(r5, r8, r1)
            if (r8 != r2) goto L5a
            return r2
        L5a:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L64
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r4 = zhm.d0.i1(r8)
        L64:
            imk.e r8 = new imk.e
            r1 = 29
            r8.<init>(r1, r4)
            r7.H2(r0, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.L2(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        d0 d0Var = (d0) this.f99018t;
        Continuation continuation = null;
        l.a1(this, rd0.e.b(m70.a.g(kli.a.h(pd.b.r(((hwi.a0) d0Var.f120416a).e.f(Unit.f186387a, false), new dug.a(d0Var, 10)), this.v.v(w4l.h.f294642c)), null, new qsk.d(18), 1)), new qg4.d(this, continuation, 26), null, new qwi.i(this, null), 2);
        l.a1(this, rd0.e.b(((i0) this.f99020x).a()), null, null, new g(this, continuation, 15), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new j(this, null, 0), new qwi.d(this, 0));
    }

    public final WrapperFlowImpl M2(PromptContentDelegate.Model model) {
        WrapperFlowImpl wrapperFlowImplB = gc0.c.b(new FullScreenPromptScreen(new d67.f(model, null, null, true)), new an4.b(this, 8));
        wrapperFlowImplB.l2(new qwi.g(0, 0, e.class, this, "completeWelcomeSequence", "completeWelcomeSequence()V"));
        return wrapperFlowImplB;
    }

    public final void N2(boolean z) {
        AirportLoungePassDetailsFlowContract$InputData airportLoungePassDetailsFlowContract$InputData = this.o;
        if (!(airportLoungePassDetailsFlowContract$InputData instanceof AirportLoungePassDetailsFlowContract$InputData.PassDetails)) {
            if (!Intrinsics.f(airportLoungePassDetailsFlowContract$InputData, AirportLoungePassDetailsFlowContract$InputData.Checkout.f98984a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new d(z, this, null), new yi5.b(26));
            return;
        }
        q qVar = ((AirportLoungePassDetailsFlowContract$InputData.PassDetails) airportLoungePassDetailsFlowContract$InputData).f98985a;
        i iVar = this.A;
        if (qVar != null) {
            h.u2(this, iVar, new AirportLoungePassDetailsFlowContract$Step.PassList(null, qVar, 1), null, 6);
        } else if (z) {
            h.u2(this, iVar, new AirportLoungePassDetailsFlowContract$Step.PassList(null, null, 3), null, 6);
        } else {
            h.u2(this, iVar, new AirportLoungePassDetailsFlowContract$Step.PassDetails(null), null, 6);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
