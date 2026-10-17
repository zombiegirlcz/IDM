package com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown;

import cli.y;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownInputData;
import hcj.o;
import hx7.e;
import i69.p;
import ibg.g;
import ih5.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oh5.d;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final CryptoBalanceBreakdownInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f70879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f70880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f70881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70882s;

    public a(CryptoBalanceBreakdownInputData inputData, d cryptoBalanceBreakdownInteractor, ih5.d stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoBalanceBreakdownInteractor, "cryptoBalanceBreakdownInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f70879p = cryptoBalanceBreakdownInteractor;
        this.f70880q = new vii.b();
        this.f70881r = mra.d.b(this, new ih5.a(0), stateMapper, null, false, 12);
        this.f70882s = e.a(this, new p(this, 17));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70882s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f70880q, new o(continuation, this, 23)), null, new g(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70881r;
    }
}
