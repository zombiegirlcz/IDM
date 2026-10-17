package zzb;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.preferences.RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.c0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends oki.h implements dli.b {
    public final RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c0 f326665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q06.l f326666q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f326667r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f326668s;

    public t(v stateMapper, RevPointsPostOnboardingPersonalisationPreferencesScreenContract$InputData inputData, c0 revPointsPersonalisationInteractor, q06.l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationInteractor, "revPointsPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = inputData;
        this.f326665p = revPointsPersonalisationInteractor;
        this.f326666q = deeplinkRouter;
        this.f326667r = new vii.b();
        this.f326668s = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f326667r, new z6e.g(continuation, this, 25)), h0.f322473a), null, null, new zt4.l(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f326668s;
    }
}
