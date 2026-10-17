package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.flow;

import c84.t;
import kotlin.jvm.internal.Intrinsics;
import my3.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements m94.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OutstandingDebtsV3FlowContract$InputData f67518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yw3.a f67519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f67520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f67521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(OutstandingDebtsV3FlowContract$InputData inputData, yw3.a interactor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67518p = inputData;
        this.f67519q = interactor;
        this.f67521s = d8l.d.a(this, new m84.e(this, 1));
    }

    @Override // yki.j
    public final void M0() {
        l2(new d(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67521s;
    }
}
