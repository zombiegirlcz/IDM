package com.revolut.feature.junior.isa.impl.ui.jisa_details;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kbb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okf.m;
import oki.h;
import ox5.r;
import pa8.e;
import pa8.j;
import pa8.o;
import vii.b;
import vkm.j2;
import vkm.q;
import yji.l;
import z98.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements j {
    public final JuniorIsaDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f76794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f76795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f76796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f76797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76798t;
    public final b u;

    public a(o stateMapper, JuniorIsaDetailsScreenContract$InputData inputData, hj8.a juniorProfileInteractor, d juniorIsaInteractor, c juniorConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaInteractor, "juniorIsaInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        this.o = inputData;
        this.f76794p = juniorProfileInteractor;
        this.f76795q = juniorIsaInteractor;
        this.f76796r = juniorConfigInteractor;
        this.f76797s = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f76798t = hx7.e.a(this, new p5f.c(this, 6));
        this.u = new b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.u, new m(continuation, this, 21)), null, null, new r(this, continuation, 18), 3);
    }

    public final com.revolut.feature.junior_profile.api.models.a I2() {
        Object content = ((e) ((j2) this.f76797s.f22677a).getValue()).f234437a.getContent();
        if (content != null) {
            return (com.revolut.feature.junior_profile.api.models.a) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76798t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f76797s;
    }
}
