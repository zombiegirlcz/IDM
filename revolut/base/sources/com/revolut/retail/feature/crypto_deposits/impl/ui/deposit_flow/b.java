package com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow;

import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.CryptoDepositFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xb4.e;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements xbj.b {
    public final CryptoDepositInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fbj.a f100056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uj5.b f100057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f100058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100059s;

    public b(CryptoDepositInput input, fbj.a cryptoDepositsInteractor, uj5.b restrictedActionNavigationProvider, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = input;
        this.f100056p = cryptoDepositsInteractor;
        this.f100057q = restrictedActionNavigationProvider;
        this.f100058r = productArticleInteractor;
        this.f100059s = d.a(this, new x2g.b(this, 17));
    }

    public final void I2() {
        CryptoDepositInput cryptoDepositInput = this.o;
        boolean z = cryptoDepositInput instanceof CryptoDepositInput.Overview;
        i iVar = this.f100059s;
        if (z) {
            h.u2(this, iVar, new CryptoDepositFlowContract$Step.Overview(cryptoDepositInput), null, 6);
        } else if (cryptoDepositInput instanceof CryptoDepositInput.DeFi) {
            h.u2(this, iVar, new CryptoDepositFlowContract$Step.Overview(cryptoDepositInput), null, 6);
        } else {
            if (!(cryptoDepositInput instanceof CryptoDepositInput.DirectDeposit)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(this, iVar, new CryptoDepositFlowContract$Step.DirectDeposit((CryptoDepositInput.DirectDeposit) cryptoDepositInput), null, 6);
        }
    }

    @Override // yki.j
    public final void M0() {
        if (this.o instanceof CryptoDepositInput.DeFi) {
            I2();
        } else {
            l2(new e(this, null, 1), new yi5.b(26)).k(new x8h.d(this, 23));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100059s;
    }
}
