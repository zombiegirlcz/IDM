package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import j7b.i;
import j7b.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q5b.b;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f82597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f82598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82599r;

    public a(n stateMapper, CobrandedCardsPlanHubRewardsScreenContract$InputData inputData, b cobrandedCardsPlansInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        this.o = cobrandedCardsPlansInteractor;
        this.f82597p = new vii.b();
        this.f82598q = d.b(this, new i(new Data(null, null, true, 3, null), h0.f322473a, inputData.f82592a), stateMapper, null, false, 12);
        this.f82599r = e.a(this, new j2c.n(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f82597p, new iw6.l(continuation, this, 7)), new j3f.d(29)), null, null, new iug.j(this, continuation, 29), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82599r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f82598q;
    }
}
