package com.revolut.feature.staking.impl.stakingdetails.v2;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mre.c;
import oki.h;
import vvc.s;
import vwd.e;
import vwd.i;
import yi5.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements e {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f88158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f88159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88160r;

    public a(StakingProduct stakingProduct, n stateMapper, f userInteractor, c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = userInteractor;
        this.f88158p = termsNavigationFactory;
        this.f88159q = d.b(this, new vwd.f(stakingProduct, null), stateMapper, null, false, 12);
        this.f88160r = hx7.e.a(this, new s(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        l2(new i(this, null, 1), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88160r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f88159q;
    }
}
