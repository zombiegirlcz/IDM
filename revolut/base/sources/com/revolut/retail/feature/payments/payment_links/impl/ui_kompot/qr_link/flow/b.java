package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow;

import ang.f;
import d8l.d;
import gvc.m;
import h1c.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import zjh.j;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements h8k.b {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f102220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f102221q;

    public b(f userInteractor, j optOutInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(optOutInteractor, "optOutInteractor");
        this.o = userInteractor;
        this.f102220p = optOutInteractor;
        this.f102221q = d.a(this, new c(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 9), new h56.a(this, 9));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102221q;
    }
}
