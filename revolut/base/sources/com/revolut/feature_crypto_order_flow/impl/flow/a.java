package com.revolut.feature_crypto_order_flow.impl.flow;

import com.revolut.feature_crypto_order_flow.api.navigation.CryptoExchangeFlowInputData;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import com.revolut.feature_crypto_order_flow.impl.flow.CryptoExchangeFlowContract$Step;
import cp5.d;
import dzh.b;
import hsc.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rp0.g1;
import wsg.n;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final wj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iva.a f96769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f96770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1 f96771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f96772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f96773t;

    public a(CryptoExchangeFlowInputData inputData, wj0.a idempotencyKeyHolder, iva.a recurringBuysNavigationProvider, n walletInteractor, g1 shotDialogDisplayer, c cryptoScaPromptShotDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        this.o = idempotencyKeyHolder;
        this.f96769p = recurringBuysNavigationProvider;
        this.f96770q = walletInteractor;
        this.f96771r = shotDialogDisplayer;
        this.f96772s = cryptoScaPromptShotDialogProvider;
        xi0.b bVar = inputData.f96716b;
        this.f96773t = d.a(this, new CryptoExchangeFlowContract$Step.CryptoExchangeStep(new CryptoExchangeScreenContract$InputData(inputData.f96715a, bVar, inputData.f96717c, inputData.e, inputData.d, inputData.f96718g)), f0.f322471a, new a8a.a(this, inputData, 21));
    }

    @Override // yji.l
    public final void I1() {
        this.o.a("payments_exchange");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96773t;
    }
}
