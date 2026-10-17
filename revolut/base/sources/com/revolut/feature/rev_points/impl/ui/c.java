package com.revolut.feature.rev_points.impl.ui;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nyb.m0;
import oki.h;
import syb.e;
import vkm.q;
import vkm.t1;
import vkm.z1;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements syb.c {
    public final RevPointsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pyb.c f83775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pyb.a f83776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f83777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f83778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1 f83779t;
    public final i u;

    public c(RevPointsFlowContract$InputData inputData, pyb.c revPointsChallengeClaimDialogMapper, pyb.a revPointsChallengeActivationDialogMapper, m0 revPointsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsChallengeClaimDialogMapper, "revPointsChallengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsChallengeActivationDialogMapper, "revPointsChallengeActivationDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        this.o = inputData;
        this.f83775p = revPointsChallengeClaimDialogMapper;
        this.f83776q = revPointsChallengeActivationDialogMapper;
        this.f83777r = revPointsTransactionsInteractor;
        z1 z1VarB = q.b(1, 5, null);
        this.f83778s = z1VarB;
        this.f83779t = q.g(z1VarB);
        this.u = d.a(this, new suf.a(this, 11));
    }

    public final void I2() {
        i iVar = this.u;
        if (iVar.d() == null) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.n();
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
