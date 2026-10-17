package com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup;

import aj6.u;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import cvi.i;
import dkb.f;
import dkb.j;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vii.b;
import vkm.q;
import yjb.c;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements f {

    @NotNull
    public static final dkb.h Companion = new dkb.h();
    public final ugc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f83197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f83198q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f83199r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83200s;

    public a(ugc.a savingsChallengeInteractor, c savingsChallengeBottomSheetControllerFactory, j stateMapper) {
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeBottomSheetControllerFactory, "savingsChallengeBottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsChallengeInteractor;
        this.f83197p = savingsChallengeBottomSheetControllerFactory;
        this.f83198q = new b();
        this.f83199r = d.b(this, new dkb.d(0, new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
        this.f83200s = e.a(this, new dgj.h(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.b1(this, rd0.e.e(nim.a.v(q.Q(this.f83198q, new i(continuation, this, 20)), new dg3.d(18)), h0.f322473a, new u(3, 1, continuation)), null, new dkb.i(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83200s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f83199r;
    }
}
