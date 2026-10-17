package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions;

import bbd.c;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q5b.b;
import q7b.f;
import q7b.g;
import q7b.i;
import q7b.j;
import q7b.k;
import q7b.l;
import vkm.j2;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f82605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sfk.a f82606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f82607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f82608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f82609t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, b cobrandedCardsPlansInteractor, c transactionsPagingSource, sfk.a pricingPlanChangeObservable) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        Intrinsics.checkNotNullParameter(transactionsPagingSource, "transactionsPagingSource");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        this.o = cobrandedCardsPlansInteractor;
        this.f82605p = transactionsPagingSource;
        this.f82606q = pricingPlanChangeObservable;
        this.f82607r = new vii.b();
        this.f82608s = q.c(new l(null));
        this.f82609t = d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new q34.a(20));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(q.Q(this.f82607r, new j((Continuation) null, this, 0)), new q75.n(6)), null, null, new k(this, null, 0), 3);
        yji.l.a1(this, rd0.e.d(rd0.e.b(this.f82606q.a()), h0.f322473a), null, null, new i(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        c cVar = this.f82605p;
        yji.l.a1(this, cVar.j(250L), null, null, new k(this, null, 1), 3);
        yji.l.b1(this, cVar.n(this.f82608s), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f82609t;
    }
}
