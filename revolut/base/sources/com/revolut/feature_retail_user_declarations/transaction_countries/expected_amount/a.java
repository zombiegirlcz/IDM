package com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import sci.f;
import sci.g;
import sci.k;
import w80.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements g {
    public final ExpectedAmountControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f97767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f97768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f97769r;

    public a(k mapper, ExpectedAmountControllerContract$InputData inputData, b amountFormatter) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f97767p = amountFormatter;
        this.f97768q = d.b(this, new f(0L, yci.a.YEARLY), mapper, null, false, 12);
        this.f97769r = e.a(this, new s42.f(this, 26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f97769r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f97768q;
    }
}
