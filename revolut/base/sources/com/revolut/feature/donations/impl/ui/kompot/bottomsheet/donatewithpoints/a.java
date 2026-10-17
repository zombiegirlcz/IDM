package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints;

import aa6.c;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import eul.f;
import fag.o0;
import fb6.i;
import fb6.n;
import fb6.p;
import fb6.r;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import sa6.t;
import sc6.b;
import vkm.q;
import vkm.q0;
import vkm.t0;
import ya6.w;
import ya6.z;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements i {

    @NotNull
    public static final p Companion = new p();
    public final DonateWithPointsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f71999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f72000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mb6.k f72001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f72002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f72003t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(DonateWithPointsContract$InputData inputData, k revPointsInteractor, c donationsInteractor, mb6.k donationsAcceptTermsInputDataFactory, b confirmDonationDialogMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(donationsAcceptTermsInputDataFactory, "donationsAcceptTermsInputDataFactory");
        Intrinsics.checkNotNullParameter(confirmDonationDialogMapper, "confirmDonationDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f71999p = revPointsInteractor;
        this.f72000q = donationsInteractor;
        this.f72001r = donationsAcceptTermsInputDataFactory;
        this.f72002s = confirmDonationDialogMapper;
        this.f72003t = d.b(this, new fb6.d(0, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), !Intrinsics.f(inputData.f71994a, inputData.f71995b) ? new Data(null, null, true, 3, null) : null), stateMapper, null, false, 12);
        this.u = e.a(this, new f(this, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof fb6.s
            if (r0 == 0) goto L13
            r0 = r6
            fb6.s r0 = (fb6.s) r0
            int r1 = r0.f133463y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133463y = r1
            goto L18
        L13:
            fb6.s r0 = new fb6.s
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f133461w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133463y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.kompot.navigable.vc.modal.a r5 = r0.v
            com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a r0 = r0.u
            yhm.o.b(r6)
            r4 = r6
            r6 = r5
            r5 = r0
            r0 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.revolut.kompot.navigable.vc.modal.a r6 = r5.u
            mb6.k r2 = r5.f72001r
            r0.u = r5
            r0.v = r6
            r0.f133463y = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData r0 = (com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData) r0
            com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$ModalStep$AcceptTerms r1 = new com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$ModalStep$AcceptTerms
            r1.<init>(r0)
            oki.h.x2(r5, r6, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a.I2(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        DonateWithPointsContract$InputData donateWithPointsContract$InputData = this.o;
        String currency = donateWithPointsContract$InputData.f71994a.f306286a;
        String charityId = donateWithPointsContract$InputData.f71996c;
        t tVar = (t) this.f72000q;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        z zVar = (z) tVar.f261345a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = zVar.k.b(new w(currency, charityId), loadingStrategy);
        Continuation continuation = null;
        l.a1(this, new q0(dVarB, new r(this, continuation, 3), 1), null, null, new r(this, continuation, 0), 3);
        l.a1(this, new q0(nim.a.v(rd0.e.b(this.f71999p.c(true)), new o0(15)), new r(this, continuation, 3), 1), null, null, new r(this, continuation, 1), 3);
        if (Intrinsics.f(donateWithPointsContract$InputData.f71994a, donateWithPointsContract$InputData.f71995b)) {
            return;
        }
        l.a1(this, q.Q(new t0(this.f72003t.B(new o0(16)), 1), new f5h.b(continuation, this, 2)), null, null, new r(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f72003t;
    }
}
