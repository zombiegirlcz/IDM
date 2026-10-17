package com.revolut.feature.junior.isa.impl.ui.jisa_national_number;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import s9b.n;
import ta8.i;
import ta8.j;
import ta8.p;
import vii.b;
import vkm.j2;
import vkm.q;
import yji.l;
import z98.d;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements j {
    public final JuniorIsaNationalNumberScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f76806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f76807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f76808r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76809s;

    public a(JuniorIsaNationalNumberScreenContract$InputData inputData, d juniorIsaInteractor, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorIsaInteractor, "juniorIsaInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f76806p = juniorIsaInteractor;
        this.f76807q = new b();
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.f76808r = mra.d.b(this, new i(data, "", false, false), stateMapper, null, false, 12);
        this.f76809s = e.a(this, new t5e.j(18));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f76807q, new n(continuation, this, 24)), null, null, new t9h.b(this, continuation, 3), 3);
    }

    public final String I2() {
        s98.d dVar;
        List list = (List) ((i) ((j2) this.f76808r.f22677a).getValue()).f269160a.getContent();
        String str = (list == null || (dVar = (s98.d) d0.d0(list)) == null) ? null : dVar.f261126c;
        return str == null ? "" : str;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76809s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f76808r;
    }
}
