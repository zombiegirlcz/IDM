package com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import h60.d;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vii.b;
import vkm.q;
import wli.x;
import y4f.o;
import yhm.j;
import yji.l;
import yq0.e;
import ytj.f;
import ytj.i;
import ytj.k;
import ytj.t;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements k {

    @NotNull
    public static final f Companion = new f();
    public final stj.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f101579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f101580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f101581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f101582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f101583t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public a(ChallengeDetailsScreenContract$InputData inputData, stj.h interactor, x deeplinkHandler, d animationControllerExtension, gte.a featureToggleInteractor, t stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(animationControllerExtension, "animationControllerExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f101579p = deeplinkHandler;
        this.f101580q = animationControllerExtension;
        this.f101581r = featureToggleInteractor;
        this.f101582s = new b();
        this.f101583t = j.b(new e(this, 11));
        i iVar = new i();
        this.u = hx7.e.a(this, new yi3.d(this, 20));
        Data data = new Data(null, null, true, 3, null);
        RewardsHubChallengeDetailsParams rewardsHubChallengeDetailsParams = inputData.f101573a;
        this.v = mra.d.b(this, new ytj.j(data, rewardsHubChallengeDetailsParams.f99251a, rewardsHubChallengeDetailsParams.f99252b, false, false), stateMapper, iVar, false, 8);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f101582s, new o(continuation, this, 16)), null, new ytj.h(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
