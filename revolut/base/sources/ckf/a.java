package ckf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f24826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24827b;

    public a(String accountId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f24826a = currency;
        this.f24827b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24826a, aVar.f24826a) && Intrinsics.f(this.f24827b, aVar.f24827b);
    }

    public final int hashCode() {
        return this.f24827b.hashCode() + (this.f24826a.hashCode() * 31);
    }
}
