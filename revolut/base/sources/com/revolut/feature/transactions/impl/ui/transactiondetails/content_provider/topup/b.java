package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup;

import kotlin.jvm.internal.Intrinsics;
import sri.m;
import x2k.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f92103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f92104b;

    public b(e paymentsBankTransferNaviCommandProvider, m navigator) {
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f92103a = paymentsBankTransferNaviCommandProvider;
        this.f92104b = navigator;
    }
}
