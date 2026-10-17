package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import axd.e;
import axi.l;
import axi.q;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import fxi.f;
import fxi.g;
import fxi.h;
import gxi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f99063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f99064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f99065c;
    public final j d;
    public final gte.a e;

    public d(g navBarItemsMapper, f itemsMapper, h priceBreakdownItemsMapper, j paymentMethodItemsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navBarItemsMapper, "navBarItemsMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(priceBreakdownItemsMapper, "priceBreakdownItemsMapper");
        Intrinsics.checkNotNullParameter(paymentMethodItemsMapper, "paymentMethodItemsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f99063a = navBarItemsMapper;
        this.f99064b = itemsMapper;
        this.f99065c = priceBreakdownItemsMapper;
        this.d = paymentMethodItemsMapper;
        this.e = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(t1.u(domainState.k, domainState.f10953c, domainState.d), new ax9.a(this, 14), new e(1), new a15.n(this, domainState, 27));
    }
}
