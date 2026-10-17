package wqj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f299466b;

    public e(String walletId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f299465a = walletId;
        this.f299466b = currency;
    }

    public final String a() {
        return a0.d.s("budget_overview_", this.f299465a, "_", this.f299466b.f306286a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f299465a, eVar.f299465a) && Intrinsics.f(this.f299466b, eVar.f299466b);
    }

    public final int hashCode() {
        return this.f299466b.hashCode() + (this.f299465a.hashCode() * 31);
    }
}
