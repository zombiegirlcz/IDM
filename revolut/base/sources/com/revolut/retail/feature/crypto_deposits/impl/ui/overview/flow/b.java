package com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow;

import cq6.k;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import zbj.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements dcj.b {
    public final CryptoDepositsOverviewFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f100109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f100110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f100111r;

    public b(CryptoDepositsOverviewFlowContract$InputData inputData, c stepSelector, g0 cryptoDepositsOverviewDelegatesContainer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stepSelector, "stepSelector");
        Intrinsics.checkNotNullParameter(cryptoDepositsOverviewDelegatesContainer, "cryptoDepositsOverviewDelegatesContainer");
        this.o = inputData;
        this.f100109p = stepSelector;
        this.f100110q = cryptoDepositsOverviewDelegatesContainer;
        this.f100111r = d.a(this, new cwj.h(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 15), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100111r;
    }
}
