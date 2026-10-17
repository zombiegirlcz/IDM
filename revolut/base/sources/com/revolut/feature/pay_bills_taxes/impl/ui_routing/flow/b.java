package com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow;

import ang.f;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vo1.c;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements vh9.a {
    public final PayBillsAndTaxesNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f78801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f78802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f78803r;

    public b(PayBillsAndTaxesNavigation$InputData inputData, c billsFeatureChecker, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f78801p = billsFeatureChecker;
        this.f78802q = userInteractor;
        this.f78803r = d.a(this, new vh9.b(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78803r;
    }
}
