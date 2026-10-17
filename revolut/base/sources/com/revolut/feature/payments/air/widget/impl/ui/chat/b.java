package com.revolut.feature.payments.air.widget.impl.ui.chat;

import cli.g;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import pgk.f;
import po9.e;
import po9.k;
import po9.p;
import po9.x;
import rlm.o;
import vkm.q;
import y50.d;
import yhm.j;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final no9.a f79116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f79117n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f79118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f79119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f79120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f79121s;

    public b(no9.a paymentWidgetInteractor, c recipientResolver, x transactionResolver, a mapper, o json) {
        Intrinsics.checkNotNullParameter(paymentWidgetInteractor, "paymentWidgetInteractor");
        Intrinsics.checkNotNullParameter(recipientResolver, "recipientResolver");
        Intrinsics.checkNotNullParameter(transactionResolver, "transactionResolver");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f79116m = paymentWidgetInteractor;
        this.f79117n = recipientResolver;
        this.o = transactionResolver;
        this.f79118p = mapper;
        this.f79119q = json;
        this.f79120r = new vii.b();
        this.f79121s = j.b(new f(this, 15));
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        n.l2(this, q.Q(this.f79120r, new p(continuation, this, 0)), null, new o0(this, continuation, 25), 3);
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new e(this);
    }

    @Override // y50.d
    public final g d3() {
        return (g) this.f79121s.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        o oVar = this.f79119q;
        oVar.getClass();
        return (k) oVar.b(k.Companion.serializer(), rawData);
    }
}
