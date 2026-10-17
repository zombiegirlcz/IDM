package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import lx1.d;
import vv9.c;
import z6k.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestDetailsContract$InputData f102152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f102153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f102154c;
    public final d d;
    public final d3j.b e;
    public final o f;

    public a(MoneyRequestDetailsContract$InputData inputData, c moneyRequestInteractor, f userInteractor, d apmContactsInteractor, d3j.b beneficiaryInteractor, o itemizationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(itemizationInteractor, "itemizationInteractor");
        this.f102152a = inputData;
        this.f102153b = moneyRequestInteractor;
        this.f102154c = userInteractor;
        this.d = apmContactsInteractor;
        this.e = beneficiaryInteractor;
        this.f = itemizationInteractor;
    }
}
