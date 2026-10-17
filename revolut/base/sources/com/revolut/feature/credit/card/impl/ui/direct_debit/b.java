package com.revolut.feature.credit.card.impl.ui.direct_debit;

import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$Step;
import hx7.e;
import ir4.f;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements f {
    public final lb5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3j.b f69271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f69272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f69273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f69274s;

    public b(lb5.b creditCardAutoPayInteractor, d3j.b beneficiaryInteractor, sf0.h serverErrorParser, CreditCardDirectDebitV3FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(creditCardAutoPayInteractor, "creditCardAutoPayInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = creditCardAutoPayInteractor;
        this.f69271p = beneficiaryInteractor;
        this.f69272q = serverErrorParser;
        this.f69273r = e.b(this, new CreditCardDirectDebitV3FlowContract$State(inputData.f69262a, inputData.f69263b, null));
        in1.a aVar = new in1.a(this, 9);
        this.f69274s = cp5.d.a(this, CreditCardDirectDebitV3FlowContract$Step.SetAccount.f69269a, f0.f322471a, aVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f69273r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69274s;
    }
}
