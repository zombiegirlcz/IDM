package com.revolut.feature.security_hub.impl.ui.secure_account;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dce.l0;
import dej.m;
import dfj.x2;
import ghl.c;
import gvc.g;
import gvc.k;
import gvc.o;
import ha3.x;
import hx7.e;
import java.util.Map;
import kdh.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import mra.d;
import oki.h;
import w4l.i;
import wtc.j;
import wtc.t;
import yji.l;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements gvc.h {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f85631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f85632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f85633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x2 f85634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f85635t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, otc.b securityHubType, f cardInteractor, b deviceInteractor, j lostDeviceInteractor, t securityHubCardInteractor, x2 esimInteractor) {
        Map mapK;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(deviceInteractor, "deviceInteractor");
        Intrinsics.checkNotNullParameter(lostDeviceInteractor, "lostDeviceInteractor");
        Intrinsics.checkNotNullParameter(securityHubCardInteractor, "securityHubCardInteractor");
        Intrinsics.checkNotNullParameter(esimInteractor, "esimInteractor");
        this.o = cardInteractor;
        this.f85631p = deviceInteractor;
        this.f85632q = lostDeviceInteractor;
        this.f85633r = securityHubCardInteractor;
        this.f85634s = esimInteractor;
        int i = k.f147134a[securityHubType.ordinal()];
        if (i == 1) {
            Boolean bool = Boolean.FALSE;
            mapK = r0.k(new Pair("EXPANDABLE_LOADING_CELL_ID_DEVICE_TITLE", bool), new Pair("EXPANDABLE_LOADING_CELL_ID_CARDS_TITLE", bool), new Pair("EXPANDABLE_LOADING_CELL_ID_ESIMS_TITLE", bool));
        } else if (i == 2) {
            mapK = q0.c(new Pair("EXPANDABLE_LOADING_CELL_ID_DEVICE_TITLE", Boolean.TRUE));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mapK = r0.g();
        }
        this.f85635t = d.b(this, new g(mapK, 503), stateMapper, null, false, 12);
        this.u = e.a(this, new c(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        f fVar = this.o;
        Continuation continuation = null;
        l.a1(this, mo3.a.g(rd0.e.b(kli.a.h(f.d(fVar, null, true, 5), ((x) fVar).y())), null, null, 3), null, null, new o(this, continuation, 0), 3);
        l.a1(this, mo3.a.g(rd0.e.b(this.f85631p.j0(true, true)), null, null, 3), null, null, new o(this, continuation, 1), 3);
        x2 x2Var = this.f85634s;
        x2Var.getClass();
        Object loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rd0.e.n(!((efj.d) x2Var.f114151b).a() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.m(rd0.e.b(x2Var.f114152c.j0(loadingStrategy.equals(loadingStrategy), false)), x2Var.f114150a.f(m.MOBILE_PLAN)), new l0(x2Var, 10)), h0.f322473a), null, null, new o(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85635t;
    }
}
