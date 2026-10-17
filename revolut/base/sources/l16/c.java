package l16;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f191475b;

    public c(String accountId, xi0.b fiatCurrency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f191474a = accountId;
        this.f191475b = fiatCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191474a, cVar.f191474a) && Intrinsics.f(this.f191475b, cVar.f191475b);
    }

    public final int hashCode() {
        return this.f191475b.hashCode() + (this.f191474a.hashCode() * 31);
    }
}
