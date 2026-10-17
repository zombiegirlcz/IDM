package com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow;

import ang.f;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xb4.e;
import xti.k;
import xw9.c;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements xw9.b {
    public final PaymentProfileLazyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f79647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f79648q;

    public b(PaymentProfileLazyFlowContract$InputData inputData, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f79647p = userInteractor;
        this.f79648q = d.a(this, new k(11));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 14), new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79648q;
    }
}
