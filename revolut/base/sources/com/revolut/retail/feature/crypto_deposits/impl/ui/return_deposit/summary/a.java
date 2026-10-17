package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import hp5.i;
import hp5.o;
import hx7.e;
import j4h.m;
import j82.q;
import jcj.g;
import jcj.l;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import mra.d;
import oki.h;
import tfm.n4;
import wsg.n;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements l {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jcj.a f100130p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ReturnCryptoDepositSummaryScreenContract$InputData f100131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fbj.a f100132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f100133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f100134t;

    public a(jcj.p mapper, p interactor, jcj.a dialogProvider, ReturnCryptoDepositSummaryScreenContract$InputData inputData, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.o = interactor;
        this.f100130p = dialogProvider;
        this.f100131q = inputData;
        this.f100132r = cryptoDepositsInteractor;
        this.f100133s = d.b(this, new g(inputData.f100127b, new Data(null, null, true, 3, null), inputData.f100128c), mapper, null, false, 12);
        this.f100134t = e.a(this, new jch.p(this, 2));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f100134t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ReturnCryptoDepositSummaryScreenContract$InputData returnCryptoDepositSummaryScreenContract$InputData = this.f100131q;
        b currency = returnCryptoDepositSummaryScreenContract$InputData.f100126a;
        String addressId = returnCryptoDepositSummaryScreenContract$InputData.f100128c.f71059a;
        String transactionId = returnCryptoDepositSummaryScreenContract$InputData.f100127b.f272581b;
        p pVar = this.o;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionGroupId");
        n4 n4VarE = ((n) pVar.f207710c).J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        n4 n4VarE2 = pd.b.r(n4VarE, new m(pVar, currency, 26)).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE2, "refCount(...)");
        ap5.b bVar = (ap5.b) pVar.f207709b;
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        o oVar = (o) bVar.f8094a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        yji.l.b1(this, rd0.e.b(nim.a.w(kli.a.i(nim.a.w(oVar.k.e(new i(addressId, transactionId), w4l.i.f294643c), new j7b.l(28)), n4VarE2, n4VarE), new j7b.l(29))), null, new q(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f100133s;
    }
}
