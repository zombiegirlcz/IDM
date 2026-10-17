package com.revolut.feature.apm.payid.impl.flow;

import cu8.r0;
import d8l.d;
import imk.p0;
import j2c.n;
import ja2.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final PayIdFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f62706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q12.a f62707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f62708r;

    public a(PayIdFlowContract$InputData payIdFlowContract$InputData, r0 kycRequiredActionTransformer, q12.a apmErrorProvider) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(apmErrorProvider, "apmErrorProvider");
        this.o = payIdFlowContract$InputData;
        this.f62706p = kycRequiredActionTransformer;
        this.f62707q = apmErrorProvider;
        this.f62708r = d.a(this, new n(this, 21));
    }

    @Override // yki.j
    public final void M0() {
        l2(new p0(this, null, 21), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62708r;
    }
}
