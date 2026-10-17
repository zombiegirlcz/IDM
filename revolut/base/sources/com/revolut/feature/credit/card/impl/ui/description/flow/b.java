package com.revolut.feature.credit.card.impl.ui.description.flow;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import zhf.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements zq4.b {
    public final CreditCardBeDrivenDescriptionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lal.a f69219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f69220q;

    public b(CreditCardBeDrivenDescriptionFlowContract$InputData inputData, lal.a creditCardInfoInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInfoInteractor, "creditCardInfoInteractor");
        this.o = inputData;
        this.f69219p = creditCardInfoInteractor;
        this.f69220q = d.a(this, new zo2.h(this, 4));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new f(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69220q;
    }
}
