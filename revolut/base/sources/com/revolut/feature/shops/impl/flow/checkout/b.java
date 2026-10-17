package com.revolut.feature.shops.impl.flow.checkout;

import eub.e;
import gvc.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements hid.b {
    public final ModalCheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f87091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f87092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f87093r;

    public b(ModalCheckoutFlowContract$InputData inputData, e revPointsCountryOptInPolicyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsCountryOptInPolicyInteractor, "revPointsCountryOptInPolicyInteractor");
        this.o = inputData;
        this.f87091p = revPointsCountryOptInPolicyInteractor;
        this.f87092q = d8l.d.a(this, new hfb.d(this, 7));
        this.f87093r = hx7.e.b(this, new ModalCheckoutFlowContract$FlowState(false));
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 21), new yi5.b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f87093r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87092q;
    }
}
