package com.revolut.feature.rev_points.impl.ui.challenges.home;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$Action;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$ModalStep;
import com.revolut.feature.rev_points.models.ChallengeId;
import com.revolut.kompot.common.ModalDestination;
import dz6.n;
import eul.f;
import ewh.x;
import exe.j;
import ezb.g;
import ezb.p;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1c.l0;
import mra.d;
import nyb.k;
import oki.h;
import pyb.c;
import q06.l;
import vkm.q;
import w4l.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements ezb.h {
    public final RevPointsChallengesHomeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f83784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gzb.a f83785q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f83786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pyb.a f83787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f83788t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83789w;

    public b(p stateMapper, RevPointsChallengesHomeScreenContract$InputData inputData, k revPointsInteractor, gzb.a challengeCompletedDialogMapper, c challengeClaimDialogMapper, pyb.a activationDialogMapper, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(challengeCompletedDialogMapper, "challengeCompletedDialogMapper");
        Intrinsics.checkNotNullParameter(challengeClaimDialogMapper, "challengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(activationDialogMapper, "activationDialogMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = inputData;
        this.f83784p = revPointsInteractor;
        this.f83785q = challengeCompletedDialogMapper;
        this.f83786r = challengeClaimDialogMapper;
        this.f83787s = activationDialogMapper;
        this.f83788t = deeplinkRouter;
        this.u = new vii.b(i.f294643c);
        this.v = d.b(this, new g(0), stateMapper, null, false, 12);
        this.f83789w = e.a(this, new f(this, 10));
    }

    public static boolean I2(l0 l0Var, ChallengeId challengeId) {
        if (challengeId instanceof ChallengeId.Campaign) {
            return Intrinsics.f(l0Var.f201390l, ((ChallengeId.Campaign) challengeId).f83940a);
        }
        if (challengeId instanceof ChallengeId.UniqueId) {
            return Intrinsics.f(l0Var.f201384a, ((ChallengeId.UniqueId) challengeId).f83941a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new n(continuation, this, 23)), null, null, new ew1.d(this, continuation, 14), 3);
        RevPointsChallengesHomeScreenContract$Action revPointsChallengesHomeScreenContract$Action = this.o.f83782a;
        if (revPointsChallengesHomeScreenContract$Action instanceof RevPointsChallengesHomeScreenContract$Action.OpenChallengeDetails) {
            yji.l.a1(this, q.P(new j(new dfj.f(this.v.B(new x(14)), 20), 1), 1), null, null, new a(this, null), 3);
        } else if (revPointsChallengesHomeScreenContract$Action != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void J2(String str) {
        h.v2(this.f83789w, new RevPointsChallengesHomeScreenContract$ModalStep.ChallengeDetails(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83789w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
