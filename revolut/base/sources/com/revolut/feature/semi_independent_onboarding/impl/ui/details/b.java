package com.revolut.feature.semi_independent_onboarding.impl.ui.details;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import dt4.p;
import dz6.n;
import e0b.c;
import e1d.e;
import e1d.j;
import i1d.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r10.t;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements e {
    public final o7.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f85990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f85991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i1d.a f85992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f85993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85994t;
    public final vii.b u;

    public b(j stateMapper, o7.b semiIndependentOnboardingInvitationInteractor, t semiIndependentOnboardingDetailsInteractor, d guardianInvitationResultExtension, i1d.a promptInputDataProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(semiIndependentOnboardingInvitationInteractor, "semiIndependentOnboardingInvitationInteractor");
        Intrinsics.checkNotNullParameter(semiIndependentOnboardingDetailsInteractor, "semiIndependentOnboardingDetailsInteractor");
        Intrinsics.checkNotNullParameter(guardianInvitationResultExtension, "guardianInvitationResultExtension");
        Intrinsics.checkNotNullParameter(promptInputDataProvider, "promptInputDataProvider");
        this.o = semiIndependentOnboardingInvitationInteractor;
        this.f85990p = semiIndependentOnboardingDetailsInteractor;
        this.f85991q = guardianInvitationResultExtension;
        this.f85992r = promptInputDataProvider;
        this.f85993s = mra.d.b(this, new e1d.d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f85994t = hx7.e.a(this, new p(this, 20));
        this.u = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new n(continuation, this, 3)), null, null, new c(this, continuation, 5), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85994t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85993s;
    }
}
