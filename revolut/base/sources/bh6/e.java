package bh6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15238c;

    public e(String currency, String accountNumber, String sortCode) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sortCode, "sortCode");
        this.f15236a = currency;
        this.f15237b = accountNumber;
        this.f15238c = sortCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f15236a, eVar.f15236a) && Intrinsics.f(this.f15237b, eVar.f15237b) && Intrinsics.f(this.f15238c, eVar.f15238c);
    }

    public final int hashCode() {
        return this.f15238c.hashCode() + p.a.c(this.f15236a.hashCode() * 31, 31, this.f15237b);
    }
}
