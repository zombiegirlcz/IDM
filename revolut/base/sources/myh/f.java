package myh;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f210515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd6.e f210516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f210517c;
    public final xi0.b d;

    public f(wd6.h orderType, wd6.e exchangeMode, b topMoney, xi0.b topCurrency) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(topMoney, "topMoney");
        Intrinsics.checkNotNullParameter(topCurrency, "topCurrency");
        this.f210515a = orderType;
        this.f210516b = exchangeMode;
        this.f210517c = topMoney;
        this.d = topCurrency;
        if (orderType == wd6.h.LIMIT || orderType == wd6.h.STOP) {
            return;
        }
        throw new IllegalArgumentException(("StopLimit config only supports LIMIT or STOP order types, got: " + orderType).toString());
    }

    @Override // myh.h
    public final wd6.e a() {
        return this.f210516b;
    }

    @Override // myh.h
    public final c b() {
        return this.f210517c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f210515a == fVar.f210515a && this.f210516b == fVar.f210516b && Intrinsics.f(this.f210517c, fVar.f210517c) && Intrinsics.f(this.d, fVar.d);
    }

    @Override // myh.h
    public final xi0.b getCurrency() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(y.g(this.f210516b, this.f210515a.hashCode() * 31, 31), 31, this.f210517c.f210508a);
    }

    @Override // myh.h
    public final wd6.h t() {
        return this.f210515a;
    }
}
