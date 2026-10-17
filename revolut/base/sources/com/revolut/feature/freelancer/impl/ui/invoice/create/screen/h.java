package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import cli.n;
import cli.o;
import ieg.z;
import ix6.e0;
import kotlin.jvm.internal.Intrinsics;
import zjh.j;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv6.a f73856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f73857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvoiceCreateScreenContract$InputData f73858c;
    public final lx6.d d;
    public final j e;

    public h(xv6.a cardBannerFactory, l80.e dateProvider, InvoiceCreateScreenContract$InputData inputData, lx6.d itemMapper, j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(cardBannerFactory, "cardBannerFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f73856a = cardBannerFactory;
        this.f73857b = dateProvider;
        this.f73858c = inputData;
        this.d = itemMapper;
        this.e = legalEntityDisclaimerMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e0) iii.c.f(domainState.f73839c, new iwk.b(8), new iui.b(21), new z(this, domainState, 11));
    }
}
