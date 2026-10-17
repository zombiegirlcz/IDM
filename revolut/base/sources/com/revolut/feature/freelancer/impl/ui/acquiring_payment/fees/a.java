package com.revolut.feature.freelancer.impl.ui.acquiring_payment.fees;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import xif.k;
import xu6.e;
import xu6.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements e {
    public final zu6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f73717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73718q;

    public a(zu6.a dialogFactory, FreelancerAcquiringPaymentFeesScreenContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f73717p = d.b(this, new xu6.d(inputData.f73713a), stateMapper, null, false, 12);
        this.f73718q = hx7.e.a(this, new k(this, 25));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73718q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73717p;
    }
}
