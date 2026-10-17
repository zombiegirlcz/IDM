package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review;

import cli.g;
import cli.y;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import gs.n;
import ip0.qn0;
import ip0.v7;
import iuf.a0;
import iuf.b0;
import iuf.d;
import iuf.l;
import iuf.s;
import iuf.v;
import iuf.w;
import iuf.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kuf.e;
import oki.h;
import tga.k;
import vkm.j2;
import vkm.q;
import yi5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements s {
    public final ManualTransferReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f92488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final luf.a f92489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kuf.d f92490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f92491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i5k.a f92492t;
    public final j60.a u;
    public final yof.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f92493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vrf.h f92494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f92495y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(ManualTransferReviewScreenContract$InputData inputData, d interactor, luf.a transferDataObserver, kuf.d transferExtension, e transferResultExtension, i5k.a appFraudCheckExtension, j60.a bottomDialogExtension, yof.a recipientTrustMapper, k pricingPlanUpgradeEntryPointItemProvider, vrf.h sectionFactory, v stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f92488p = interactor;
        this.f92489q = transferDataObserver;
        this.f92490r = transferExtension;
        this.f92491s = transferResultExtension;
        this.f92492t = appFraudCheckExtension;
        this.u = bottomDialogExtension;
        this.v = recipientTrustMapper;
        this.f92493w = pricingPlanUpgradeEntryPointItemProvider;
        this.f92494x = sectionFactory;
        this.f92495y = mra.d.b(this, new l(null, inputData.f92484a, inputData.f92485b, null, null, null, f0.f322471a), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new in1.a(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new a0(1, this, continuation), new b(26));
        l2(new a0(2, this, continuation), new b(26));
        isd.a aVar = new isd.a(28);
        y yVar = this.f92495y;
        yji.l.a1(this, q.Q(v7.w(yVar.B(aVar)), new w(1, this, continuation)), null, null, new x(1, this, continuation), 3);
        yji.l.a1(this, mo3.a.g(q.Q(q.q(yVar.B(new isd.a(27))), new w(0, this, continuation)), null, new qn0(28), 1), null, null, new x(0, this, continuation), 3);
    }

    public final ManualTransferData I2() {
        ManualTransferData manualTransferData = ((l) ((j2) this.f92495y.f22677a).getValue()).f168569c;
        if (manualTransferData != null) {
            return manualTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void T1(long j2) {
        isd.a aVar = new isd.a(25);
        y yVar = this.f92495y;
        Continuation continuation = null;
        yji.l.b1(this, q.Q(v7.w(yVar.B(aVar)), new n(continuation, this, 1)), null, new x(2, this, continuation), 3);
        yji.l.b1(this, q.Q(new ie7.h(q.q(yVar.B(new isd.a(26))), this, 5), new b0(null, this.f92494x, 0)), null, new x(3, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f92495y;
    }
}
