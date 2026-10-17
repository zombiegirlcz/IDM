package com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import rbh.k;
import rl8.d;
import s2k.b;
import x2k.e;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final r2k.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f102007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final IndiaWithdrawalFlowContract$InputData f102008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f102009r;

    public a(r2k.b indiaWithdrawalInteractor, e paymentsBankTransferNaviCommandProvider, IndiaWithdrawalFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(indiaWithdrawalInteractor, "indiaWithdrawalInteractor");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = indiaWithdrawalInteractor;
        this.f102007p = paymentsBankTransferNaviCommandProvider;
        this.f102008q = inputData;
        d dVar = new d(this, 27);
        this.f102009r = cp5.d.a(this, IndiaWithdrawalFlowContract$Step.Initial.f102006a, f0.f322471a, dVar);
    }

    public static final void I2(a aVar) {
        l.a1(aVar, aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.withdraw_no_accounts_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new s1k.b(aVar, null, 2), 3);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 26), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102009r;
    }
}
