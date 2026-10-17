package com.revolut.retail.feature.payments.payment_links.impl.ui.details;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkDetailsContract$InputData f102185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k61.a f102186b;

    public a(PaymentLinkDetailsContract$InputData inputData, k61.a transferInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.f102185a = inputData;
        this.f102186b = transferInteractor;
    }
}
