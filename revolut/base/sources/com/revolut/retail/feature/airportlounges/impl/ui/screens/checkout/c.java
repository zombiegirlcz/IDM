package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import au6.a3;
import axi.b0;
import axi.l;
import axi.n;
import axi.u;
import cli.g;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.api.AirportLoungesApi$Toggles;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ModalStep;
import dwi.r;
import dwi.s;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.k;
import oki.h;
import svi.d0;
import svi.e0;
import svi.f0;
import svi.i0;
import vkm.j2;
import vkm.q;
import vkm.v1;
import wli.x;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements n {
    public final x A;
    public final rga.c B;
    public final vii.b C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final AirportLoungePassCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fxi.c f99055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f99056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qvi.d f99057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f99058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gxi.c f99059t;
    public final gte.a u;
    public final s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final fyi.d f99060w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f99061x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sfk.a f99062y;
    public final tga.k z;

    public c(AirportLoungePassCheckoutScreenContract$InputData inputData, cli.n stateMapper, fxi.c dialogsMapper, r checkoutInteractor, qvi.d termsAndConditionsInteractor, k revPointsInteractor, gxi.c checkoutRevPayScreenModelExtension, gte.a featureToggleInteractor, s loungePassesInteractor, fyi.d qrCodeGenerator, b0 selectedUserProfileCountryProvider, sfk.a pricingPlanChangeObservable, tga.k pricingPlanUpgradeEntryPointItemProvider, x deeplinkHandler, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(termsAndConditionsInteractor, "termsAndConditionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(checkoutRevPayScreenModelExtension, "checkoutRevPayScreenModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(loungePassesInteractor, "loungePassesInteractor");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(selectedUserProfileCountryProvider, "selectedUserProfileCountryProvider");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.o = inputData;
        this.f99055p = dialogsMapper;
        this.f99056q = checkoutInteractor;
        this.f99057r = termsAndConditionsInteractor;
        this.f99058s = revPointsInteractor;
        this.f99059t = checkoutRevPayScreenModelExtension;
        this.u = featureToggleInteractor;
        this.v = loungePassesInteractor;
        this.f99060w = qrCodeGenerator;
        this.f99061x = selectedUserProfileCountryProvider;
        this.f99062y = pricingPlanChangeObservable;
        this.z = pricingPlanUpgradeEntryPointItemProvider;
        this.A = deeplinkHandler;
        this.B = priceQuoteTraceIdHolder;
        this.C = new vii.b();
        this.D = mra.d.b(this, new l(inputData.f99047b, inputData.f99048c, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.E = e.a(this, new av8.n(this, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof axi.x
            if (r0 == 0) goto L13
            r0 = r9
            axi.x r0 = (axi.x) r0
            int r1 = r0.f10979x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10979x = r1
            goto L18
        L13:
            axi.x r0 = new axi.x
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10979x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            svi.k r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2e
            goto L6c
        L2e:
            r8 = move-exception
            goto L74
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2e
            goto L52
        L3c:
            yhm.o.b(r9)
            dwi.s r9 = r8.v     // Catch: java.lang.Exception -> L2e
            efm.r r9 = r9.a(r5, r5)     // Catch: java.lang.Exception -> L2e
            efm.r r9 = m70.a.g(r9, r6, r6, r3)     // Catch: java.lang.Exception -> L2e
            r0.f10979x = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r9 = nim.a.c(r9, r0)     // Catch: java.lang.Exception -> L2e
            if (r9 != r1) goto L52
            goto L68
        L52:
            svi.k r9 = (svi.k) r9     // Catch: java.lang.Exception -> L2e
            r0.u = r9     // Catch: java.lang.Exception -> L2e
            r0.f10979x = r4     // Catch: java.lang.Exception -> L2e
            fyi.d r8 = r8.f99060w     // Catch: java.lang.Exception -> L2e
            jhi.k r8 = r8.b()     // Catch: java.lang.Exception -> L2e
            jhi.b r8 = mo3.a.g(r8, r6, r6, r3)     // Catch: java.lang.Exception -> L2e
            java.lang.Object r8 = vkm.q.x(r8, r0)     // Catch: java.lang.Exception -> L2e
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            r7 = r9
            r9 = r8
            r8 = r7
        L6c:
            fyi.e r9 = (fyi.e) r9     // Catch: java.lang.Exception -> L2e
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Exception -> L2e
            r0.<init>(r8, r9)     // Catch: java.lang.Exception -> L2e
            return r0
        L74:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "AirportLoungePassCheckoutScreenModel - preloading of pass or loungePassQrCode failed"
            rd0.d.a(r0, r6, r1, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c.I2(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final void I1() {
        boolean zC = ((jte.d) this.u).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2.f80975c);
        Continuation continuation = null;
        String strA = zC ? this.B.a("lounges_checkout_price_quote") : null;
        this.f99059t.d3(new o7.d(this, 7));
        axi.s sVar = new axi.s(continuation, this, strA, 1);
        vii.b bVar = this.C;
        yji.l.a1(this, q.Q(bVar, sVar), null, null, new axi.r(this, continuation, 2), 3);
        yji.l.a1(this, rd0.e.b(this.f99062y.a()), null, null, new u(this, null), 3);
        if (zC) {
            yji.l.a1(this, q.Q(new a35.d(this.D.B(new ax9.a(7)), 26), new axi.s(continuation, this, strA, 0)), null, null, new axi.r(this, continuation, 0), 3);
        } else {
            yji.l.a1(this, q.Q(bVar, new a3(continuation, this, 5)), null, null, new axi.r(this, continuation, 1), 3);
        }
    }

    public final void J2() {
        e0 e0Var;
        d0 d0Var;
        gxi.e eVar;
        AirportLoungesApi$Toggles.AirportLoungesAny2Any airportLoungesAny2Any = AirportLoungesApi$Toggles.AirportLoungesAny2Any.f98909c;
        gte.a aVar = this.u;
        if (((jte.d) aVar).c(airportLoungesAny2Any)) {
            gxi.b bVarC3 = this.f99059t.c3();
            if (bVarC3 instanceof gxi.a) {
                h.v2(this.E, new AirportLoungePassCheckoutScreenContract$ModalStep.RevPayPocketSelection(((gxi.a) bVarC3).f147746a), ModalDestination.Style.POPUP.f98311a);
                return;
            }
        }
        boolean zC = ((jte.d) aVar).c(airportLoungesAny2Any);
        y yVar = this.D;
        String str = (!zC || (eVar = (gxi.e) ((l) ((j2) yVar.f22677a).getValue()).f10955h.getContent()) == null) ? null : eVar.f147748a.f84376a;
        String idempotencyKey = this.o.f99046a;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        int i = ((l) j2Var.getValue()).f10951a;
        i0 i0Var = (i0) ((l) j2Var2.getValue()).f10953c.getContent();
        f0 f0Var = (i0Var == null || (e0Var = i0Var.f265922b.f265912g) == null || (d0Var = ((l) j2Var2.getValue()).f) == null) ? null : new f0(d0Var.f265894b, e0Var.f265898a, d0Var.f265893a);
        r rVar = this.f99056q;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        yji.l.a1(this, rd0.e.d(t1.E(new v1(new dwi.q(rVar, idempotencyKey, i, str, f0Var, null))), h0.f322473a), null, null, new axi.y(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // cli.z
    public final g getState() {
        return this.D;
    }
}
