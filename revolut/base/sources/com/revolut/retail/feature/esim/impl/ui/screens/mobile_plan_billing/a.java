package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import dfj.c0;
import dfj.s3;
import fjj.q;
import fjj.t;
import hjj.e;
import hjj.f;
import ijj.u;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nyb.k;
import oki.h;
import prk.o;
import q7c.g;
import vii.b;
import vkm.j2;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements q {
    public final y A;
    public final EsimMobilePlanBillingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f101098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f101099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s3 f101100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f101101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f101102t;
    public final c0 u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f101103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f101104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f101105y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(EsimMobilePlanBillingScreenContract$InputData inputData, n stateMapper, e pocketMapper, g paymentMethodsInteractor, s3 esimSubscriptionsInteractor, f paymentUpdateDialogsBuilder, k revPointsInteractor, c0 giftingInteractor, gte.a featureToggleInteractor, u cancellationConfirmationControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(paymentUpdateDialogsBuilder, "paymentUpdateDialogsBuilder");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(giftingInteractor, "giftingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cancellationConfirmationControllerProvider, "cancellationConfirmationControllerProvider");
        this.o = inputData;
        this.f101098p = pocketMapper;
        this.f101099q = paymentMethodsInteractor;
        this.f101100r = esimSubscriptionsInteractor;
        this.f101101s = paymentUpdateDialogsBuilder;
        this.f101102t = revPointsInteractor;
        this.u = giftingInteractor;
        this.v = featureToggleInteractor;
        this.f101103w = cancellationConfirmationControllerProvider;
        this.f101104x = new b();
        this.f101105y = vkm.q.a(0, 1, ukm.f.DROP_OLDEST);
        this.z = hx7.e.a(this, new fgj.g(this, 8));
        this.A = d.b(this, new fjj.k(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a r10, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket r11, gim.c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof fjj.s
            if (r0 == 0) goto L13
            r0 = r12
            fjj.s r0 = (fjj.s) r0
            int r1 = r0.f135669x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135669x = r1
            goto L18
        L13:
            fjj.s r0 = new fjj.s
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135669x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket r11 = r0.u
            yhm.o.b(r12)
            goto L65
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r12)
            dfj.s3 r12 = r10.f101100r
            com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData r2 = r10.o
            java.lang.String r6 = r2.f101093a
            java.lang.String r7 = r11.f84376a
            r0.u = r11
            r0.f135669x = r3
            nfj.a2 r12 = r12.f114105a
            r5 = r12
            nfj.s2 r5 = (nfj.s2) r5
            r5.getClass()
            n8a.r r4 = new n8a.r
            r8 = 0
            r9 = 12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5d:
            if (r12 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L62:
            if (r12 != r1) goto L65
            return r1
        L65:
            cli.y r12 = r10.A
            dmj.f0 r0 = new dmj.f0
            r0.<init>(r11, r3)
            r10.H2(r12, r0)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a.I2(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        t tVar = new t(3, this, continuation);
        b bVar = this.f101104x;
        l.a1(this, o.w("EsimMobilePlanBillingScreenModel", "loadSubscriptionTillFinish", vkm.q.Q(bVar, tVar)), null, null, new fjj.u(2, this, continuation), 3);
        l.a1(this, vkm.q.Q(bVar, new t(1, this, continuation)), null, null, new fjj.y(this, null), 3);
        l.a1(this, t1.d(this.f101105y, 250L), null, null, new a2g.q(this, continuation, 22), 3);
        l.a1(this, vkm.q.Q(bVar, new t(2, this, continuation)), null, null, new fjj.u(1, this, continuation), 3);
        if (((jte.d) this.v).c(EsimApi$Toggles.EsimGifting.f100175c)) {
            int i = 0;
            l.a1(this, vkm.q.Q(bVar, new t(i, this, continuation)), null, null, new fjj.u(i, this, continuation), 3);
        } else {
            H2(this.A, new fj5.e(21));
        }
    }

    public final void J2(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) {
        EsimGiftRecipient esimGiftRecipient;
        dej.z1 z1Var;
        String str = this.o.f101093a;
        y yVar = this.A;
        Optional optional = (Optional) ((fjj.k) ((j2) yVar.f22677a).getValue()).e.getContent();
        String str2 = null;
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
        } else {
            esimGiftRecipient = null;
        }
        dej.t1 t1Var = (dej.t1) ((fjj.k) ((j2) yVar.f22677a).getValue()).f135658b.getContent();
        if (t1Var != null && (z1Var = t1Var.f113662s) != null) {
            str2 = z1Var.f113698b;
        }
        C2(new fjj.l(str, esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, esimGiftRecipient, str2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
