package com.revolut.feature.subaccount.impl.ui.add_money.flow;

import g6e.d;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n1.y;
import n68.x;
import oki.h;
import she.g;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements n7e.b {
    public final SubaccountAddMoneyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f88994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n7e.h f88995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f88996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f88997s;

    public b(SubaccountAddMoneyFlowContract$InputData inputData, d subaccountInteractor, n7e.h routeResolver, g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(routeResolver, "routeResolver");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.o = inputData;
        this.f88994p = subaccountInteractor;
        this.f88995q = routeResolver;
        this.f88996r = productAccountDestinationResolver;
        this.f88997s = d8l.d.a(this, new r(this, 22));
    }

    @Override // yki.j
    public final void M0() {
        l2(new x(this, null, 2), new y(this, 27));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88997s;
    }
}
