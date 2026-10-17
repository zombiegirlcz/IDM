package myh;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f210512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f210513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f210514c;
    public final wd6.h d;

    public e(wd6.e exchangeMode, b money, xi0.b currency) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f210512a = exchangeMode;
        this.f210513b = money;
        this.f210514c = currency;
        this.d = wd6.h.RECURRING;
    }

    @Override // myh.h
    public final wd6.e a() {
        return this.f210512a;
    }

    @Override // myh.h
    public final c b() {
        return this.f210513b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f210512a == eVar.f210512a && Intrinsics.f(this.f210513b, eVar.f210513b) && Intrinsics.f(this.f210514c, eVar.f210514c);
    }

    @Override // myh.h
    public final xi0.b getCurrency() {
        return this.f210514c;
    }

    public final int hashCode() {
        return this.f210514c.hashCode() + v7.c(this.f210512a.hashCode() * 31, 31, this.f210513b.f210508a);
    }

    @Override // myh.h
    public final wd6.h t() {
        return this.d;
    }
}
