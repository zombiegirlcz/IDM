package com.revolut.feature_retail_user_declarations.transaction_countries.flow;

import com.revolut.feature_retail_user_declarations.transaction_countries.TransactionCountriesInputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.flow.TransactionCountriesFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u7k.w;
import uci.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final TransactionCountriesInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f97772q;

    public a(TransactionCountriesInputData inputData, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f97771p = workflowInteractor;
        w wVar = new w(this, 10);
        this.f97772q = d.a(this, TransactionCountriesFlowContract$Step.CountrySelection.f97770a, f0.f322471a, wVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97772q;
    }
}
