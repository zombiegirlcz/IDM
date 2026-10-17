package ute;

import com.revolut.domain.models.topup.TopUpContext;
import dj0.d;
import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f283096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283098c;
    public final String d;
    public final l e;
    public final TopUpContext f;

    public a(d amount, String cardBrand, String paymentToken, String lastFour, l pocketType, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f283096a = amount;
        this.f283097b = cardBrand;
        this.f283098c = paymentToken;
        this.d = lastFour;
        this.e = pocketType;
        this.f = topUpContext;
    }

    public final d a() {
        return this.f283096a;
    }

    public final String b() {
        return this.f283097b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f283098c;
    }

    public final l e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283096a, aVar.f283096a) && Intrinsics.f(this.f283097b, aVar.f283097b) && Intrinsics.f(this.f283098c, aVar.f283098c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final TopUpContext f() {
        return this.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + t61.a.c(this.e, p.a.c(p.a.c(p.a.c(this.f283096a.hashCode() * 31, 31, this.f283097b), 31, this.f283098c), 31, this.d), 31);
    }
}
