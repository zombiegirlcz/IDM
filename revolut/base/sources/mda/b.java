package mda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f204551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f204552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dda.a f204553c;

    public b(xi0.b currency, wi0.b country, dda.a accountDetails) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        this.f204551a = currency;
        this.f204552b = country;
        this.f204553c = accountDetails;
    }

    @Override // mda.c
    public final wi0.b a() {
        return this.f204552b;
    }

    @Override // mda.c
    public final xi0.b b() {
        return this.f204551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f204551a, bVar.f204551a) && Intrinsics.f(this.f204552b, bVar.f204552b) && Intrinsics.f(this.f204553c, bVar.f204553c);
    }

    public final int hashCode() {
        return this.f204553c.hashCode() + p.a.c(this.f204551a.hashCode() * 31, 31, this.f204552b.f297794a);
    }
}
