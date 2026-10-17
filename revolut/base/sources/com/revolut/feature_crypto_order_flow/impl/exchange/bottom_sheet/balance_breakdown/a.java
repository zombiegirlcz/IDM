package com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tki.d;
import vvc.s;
import vyh.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements d {
    public final vyh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f96741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96742q;

    public a(vyh.a inputData, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f96741p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f96742q = hx7.e.a(this, new s(this, 3));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96742q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f96741p;
    }
}
