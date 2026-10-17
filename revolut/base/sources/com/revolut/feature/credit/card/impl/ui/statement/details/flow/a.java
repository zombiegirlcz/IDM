package com.revolut.feature.credit.card.impl.ui.statement.details.flow;

import al4.n;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$Step;
import cp5.d;
import kj4.c;
import kotlin.jvm.internal.Intrinsics;
import kv4.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditCardStatementDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f69688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f69689q;

    public a(CreditCardStatementDetailsFlowContract$InputData inputData, n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.o = inputData;
        this.f69688p = creditCardInteractor;
        c cVar = new c(this, 18);
        this.f69689q = d.a(this, CreditCardStatementDetailsFlowContract$Step.Details.f69679a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69689q;
    }
}
