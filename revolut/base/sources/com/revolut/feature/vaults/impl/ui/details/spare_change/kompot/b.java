package com.revolut.feature.vaults.impl.ui.details.spare_change.kompot;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import hcj.o;
import hx7.e;
import ip0.v7;
import iqg.g;
import iqg.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.q;
import xvh.c;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements i {
    public final SpareChangeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f94747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f94748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f94749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f94751t;

    public b(n stateMapper, SpareChangeScreenContract$InputData inputData, c autoInvestInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.o = inputData;
        this.f94747p = autoInvestInteractor;
        this.f94748q = vaultsInteractor;
        this.f94749r = new vii.b();
        this.f94750s = e.a(this, new in1.a(this, 7));
        this.f94751t = d.b(this, new g(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f94749r, new o(continuation, this, 27)), null, null, new iqg.o(this, continuation, 1), 3);
        l.a1(this, v7.w(this.f94751t.B(new iqg.l(this, 0))), null, null, new a(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94750s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94751t;
    }
}
