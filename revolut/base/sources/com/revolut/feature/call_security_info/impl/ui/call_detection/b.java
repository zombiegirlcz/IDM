package com.revolut.feature.call_security_info.impl.ui.call_detection;

import cli.y;
import cu2.c;
import eh3.s;
import eu2.e;
import eu2.g;
import eu2.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements e {
    public final y80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f64372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f64373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wt2.c f64374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f64375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f64376t;

    public b(i stateMapper, y80.a permissionProvider, s70.a intentProvider, c callDetectionRepository, wt2.c productArticleConfiguration) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(callDetectionRepository, "callDetectionRepository");
        Intrinsics.checkNotNullParameter(productArticleConfiguration, "productArticleConfiguration");
        this.o = permissionProvider;
        this.f64372p = intentProvider;
        this.f64373q = callDetectionRepository;
        this.f64374r = productArticleConfiguration;
        this.f64375s = hx7.e.a(this, new s(this, 29));
        this.f64376t = d.b(this, new eu2.d(false, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.g(this.f64373q.f108801b), null, null, new a2g.q(this, (Continuation) null, 18), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f64375s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.f64376t, new g(this, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f64376t;
    }
}
