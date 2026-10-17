package com.revolut.feature.payees.impl.ui.payees_select;

import a0e.m;
import ack.f;
import an9.n;
import an9.r;
import an9.v;
import cli.g;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import fmc.z;
import hx7.e;
import im9.c;
import im9.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements r {

    @NotNull
    private static final v Companion = new v();
    public final PayeesSelectScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f79032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f4h.a f79033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f79034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f79036t;
    public final z1 u;

    public b(an9.y stateMapper, PayeesSelectScreenContract$InputData inputData, i payeesInteractor, f4h.a payeesRecipientMapper, z juniorPayeesSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payeesInteractor, "payeesInteractor");
        Intrinsics.checkNotNullParameter(payeesRecipientMapper, "payeesRecipientMapper");
        Intrinsics.checkNotNullParameter(juniorPayeesSettingsInteractor, "juniorPayeesSettingsInteractor");
        this.o = inputData;
        this.f79032p = payeesInteractor;
        this.f79033q = payeesRecipientMapper;
        this.f79034r = juniorPayeesSettingsInteractor;
        this.f79035s = e.a(this, new f(this, 29));
        this.f79036t = d.b(this, new n(c.NONE, null, h0.f322473a, new Data(null, null, true, 3, null), inputData.f79024a), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.u = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.q(nim.a.v(q.Q(t1.g(this.u, 200L), new m(continuation, this, 24)), new amf.i(9))), null, null, new af4.e(this, continuation, 26), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79035s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f79036t;
    }
}
