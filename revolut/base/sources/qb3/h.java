package qb3;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends com.revolut.feature.cash_topup.impl.ui.amount.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f244088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f244089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244090c;
    public final dj0.d d;
    public final fb3.d e;
    public final dj0.d f;

    public h(dj0.d pocketBalance, xi0.b currency, String amountString, dj0.d amountMoney, fb3.d limits, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f244088a = pocketBalance;
        this.f244089b = currency;
        this.f244090c = amountString;
        this.d = amountMoney;
        this.e = limits;
        this.f = dVar;
    }

    public static h a(h hVar, String str, dj0.d dVar, dj0.d dVar2, int i) {
        dj0.d pocketBalance = hVar.f244088a;
        xi0.b currency = hVar.f244089b;
        if ((i & 4) != 0) {
            str = hVar.f244090c;
        }
        String amountString = str;
        if ((i & 8) != 0) {
            dVar = hVar.d;
        }
        dj0.d amountMoney = dVar;
        fb3.d limits = hVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(amountMoney, "amountMoney");
        Intrinsics.checkNotNullParameter(limits, "limits");
        return new h(pocketBalance, currency, amountString, amountMoney, limits, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f244088a, hVar.f244088a) && Intrinsics.f(this.f244089b, hVar.f244089b) && Intrinsics.f(this.f244090c, hVar.f244090c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + v7.c(p.a.c(h30.l.j(this.f244089b, this.f244088a.hashCode() * 31, 31), 31, this.f244090c), 31, this.d)) * 31;
        dj0.d dVar = this.f;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
