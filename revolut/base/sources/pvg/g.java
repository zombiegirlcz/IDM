package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240133c;
    public final jo3.b d;

    public g(String accountTypesCombined, String currency, jo3.b totalValue, boolean z) {
        Intrinsics.checkNotNullParameter(accountTypesCombined, "accountTypesCombined");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        this.f240131a = accountTypesCombined;
        this.f240132b = z;
        this.f240133c = currency;
        this.d = totalValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f240131a, gVar.f240131a) && this.f240132b == gVar.f240132b && Intrinsics.f(this.f240133c, gVar.f240133c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.c(this.f240131a.hashCode() * 31, 31, this.f240132b), 31, this.f240133c);
    }
}
