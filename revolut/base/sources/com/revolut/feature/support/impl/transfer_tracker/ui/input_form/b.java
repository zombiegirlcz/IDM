package com.revolut.feature.support.impl.transfer_tracker.ui.input_form;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import fb.c;
import hba.k;
import hee.j;
import hee.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import mra.d;
import oki.h;
import sde.e;
import wsg.n;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements o {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f89418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f89419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f89420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f89421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jee.a f89422t;
    public final n60.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f89423w;

    public b(cli.n stateMapper, e transferTrackerInteractor, gte.a featureToggleInteractor, n walletInteractor, w80.b amountFormatter, hee.a modalControllersFactory, j60.a bottomSheetDialog, jee.a dialogMapper, n60.a keyboardControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transferTrackerInteractor, "transferTrackerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(modalControllersFactory, "modalControllersFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "bottomSheetDialog");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        this.o = transferTrackerInteractor;
        this.f89418p = featureToggleInteractor;
        this.f89419q = walletInteractor;
        this.f89420r = amountFormatter;
        this.f89421s = bottomSheetDialog;
        this.f89422t = dialogMapper;
        this.u = keyboardControllerExtension;
        this.v = d.b(this, new j(new Data(null, null, true, 3, null), "", null, null, false, false), stateMapper, null, false, 12);
        this.f89423w = hx7.e.a(this, new c(modalControllersFactory, this, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r8.J2(r9, r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b r8, com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r9, gim.c r10) {
        /*
            sde.e r0 = r8.o
            boolean r1 = r10 instanceof hee.r
            if (r1 == 0) goto L15
            r1 = r10
            hee.r r1 = (hee.r) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            hee.r r1 = new hee.r
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f151704y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L4a
            if (r3 == r6) goto L44
            if (r3 == r5) goto L40
            if (r3 != r4) goto L38
            com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r8 = r1.f151703x
            com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b r9 = r1.f151702w
            tde.n r0 = r1.v
            yhm.o.b(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L8e
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            yhm.o.b(r10)
            goto L70
        L44:
            com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r9 = r1.u
            yhm.o.b(r10)
            goto L58
        L4a:
            yhm.o.b(r10)
            r1.u = r9
            r1.A = r6
            java.lang.Object r10 = r0.b(r9, r1)
            if (r10 != r2) goto L58
            goto L8a
        L58:
            tde.p r10 = (tde.p) r10
            tde.m r3 = tde.m.f269992a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r10, r3)
            r6 = 0
            if (r3 == 0) goto L73
            r1.u = r6
            r1.v = r6
            r1.A = r5
            java.lang.Object r8 = r8.J2(r9, r1)
            if (r8 != r2) goto L70
            goto L8a
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L73:
            boolean r3 = r10 instanceof tde.n
            if (r3 == 0) goto L9f
            r1.u = r6
            r3 = r10
            tde.n r3 = (tde.n) r3
            r1.v = r3
            r1.f151702w = r8
            r1.f151703x = r9
            r1.A = r4
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r2) goto L8b
        L8a:
            return r2
        L8b:
            r7 = r0
            r0 = r10
            r10 = r7
        L8e:
            com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent r10 = (com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent) r10
            tde.n r0 = (tde.n) r0
            kq2.l r0 = r0.f269993a
            hee.l r1 = new hee.l
            r1.<init>(r9, r10, r0)
            r8.C2(r1)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L9f:
            tde.o r8 = tde.o.f269994a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r10, r8)
            if (r8 == 0) goto Laf
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unknown inbound transfer type status returned"
            r8.<init>(r9)
            throw r8
        Laf:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b.I2(com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b, com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(nim.a.w(osg.b.d(this.f89419q), new h0() { // from class: hee.s
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((xi0.b) obj2).f306286a;
            }
        })), null, null, new k(this, (Continuation) null, 11), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hee.t
            if (r0 == 0) goto L13
            r0 = r6
            hee.t r0 = (hee.t) r0
            int r1 = r0.f151706x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151706x = r1
            goto L18
        L13:
            hee.t r0 = new hee.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151706x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f151706x = r3
            sde.e r6 = r4.o
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent r6 = (com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent) r6
            hee.k r0 = new hee.k
            r0.<init>(r5, r6)
            r4.C2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b.J2(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f89423w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
