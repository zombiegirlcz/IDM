package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2;

import a94.d;
import a94.l;
import c84.t;
import e84.e;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OutstandingDebtsV2FlowContract$InputData f67462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f67463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f67464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a94.a f67465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f67466t;
    public final qki.d u;
    public final i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OutstandingDebtsV2FlowContract$InputData input, e pluginControllerResolver, c actionPathInteractor, xw3.a debtsInteractor, d debtTypeMapper, a94.a debtDetailsDialogMapper, n walletInteractor) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        Intrinsics.checkNotNullParameter(debtTypeMapper, "debtTypeMapper");
        Intrinsics.checkNotNullParameter(debtDetailsDialogMapper, "debtDetailsDialogMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f67462p = input;
        this.f67463q = actionPathInteractor;
        this.f67464r = debtTypeMapper;
        this.f67465s = debtDetailsDialogMapper;
        this.f67466t = walletInteractor;
        this.u = hx7.e.b(this, new OutstandingDebtsV2FlowContract$State(null, null));
        this.v = d8l.d.a(this, new a09.b(this, 24));
    }

    @Override // yki.j
    public final void M0() {
        n2(new a01.e(this, null, 14), new whi.b(6));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
