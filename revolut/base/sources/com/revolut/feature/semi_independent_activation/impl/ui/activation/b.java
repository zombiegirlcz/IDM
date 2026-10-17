package com.revolut.feature.semi_independent_activation.impl.ui.activation;

import com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$Step;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p0d.e;
import til.m;
import til.n;
import til.o;
import til.p;
import til.q;
import til.r;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements q0d.b {
    public final SemiIndependentActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f85975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f85976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f85977r;

    public b(SemiIndependentActivationFlowContract$InputData inputData, e invitationInteractor, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invitationInteractor, "invitationInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.o = inputData;
        this.f85975p = invitationInteractor;
        this.f85976q = workflowFlowProvider;
        this.f85977r = d.a(this, new SemiIndependentActivationFlowContract$Step.Details(inputData.f85970a), f0.f322471a, new pu4.d(this, 19));
    }

    public final void I2(r rVar) {
        if ((rVar instanceof p) || (rVar instanceof o)) {
            return;
        }
        if (!Intrinsics.f(rVar, n.f271581a) && !Intrinsics.f(rVar, q.f271586a)) {
            throw new NoWhenBranchMatchedException();
        }
        h.D2(this.f85977r);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85977r;
    }
}
