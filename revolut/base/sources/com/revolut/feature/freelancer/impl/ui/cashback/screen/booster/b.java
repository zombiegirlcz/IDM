package com.revolut.feature.freelancer.impl.ui.cashback.screen.booster;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import io3.l;
import jr6.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import li2.f;
import lv6.k;
import lv6.p;
import mra.d;
import oki.h;
import tof.b8;
import tof.cc;
import tof.i7;
import tof.q7;
import tof.xa;
import tof.y6;
import vkm.q;
import vkm.z1;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements p {
    public final gr6.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f73751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f73752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q7 f73753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q7 f73754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f73755t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(gr6.h freelancerCashbackInteractor, m freelancerDialogFactory, whf.b transactionsContentProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCashbackInteractor;
        this.f73751p = freelancerDialogFactory;
        this.f73752q = transactionsContentProvider;
        i7.c cVar = i7.Companion;
        l lVar = l.MERCHANT;
        i7[] i7VarArr = {new xa(lVar), new cc(u.c(y6.REWARD)), new b8(uof.c.BOOSTER)};
        cVar.getClass();
        this.f73753r = i7.c.a(i7VarArr);
        this.f73754s = i7.c.a(new xa(lVar), new cc(u.c(y6.CARD_PAYMENT)), i7.j.f272816a);
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f73755t = z1VarB;
        this.u = d.b(this, new k(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new lp2.c(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f73755t, new f(continuation, this, 14)), null, new lph.h(this, continuation, 8), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
