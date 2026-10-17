package mda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f204549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f204550b;

    public a(wi0.b country, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f204549a = currency;
        this.f204550b = country;
    }

    @Override // mda.c
    public final wi0.b a() {
        return this.f204550b;
    }

    @Override // mda.c
    public final xi0.b b() {
        return this.f204549a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f204549a, aVar.f204549a) && Intrinsics.f(this.f204550b, aVar.f204550b);
    }

    public final int hashCode() {
        return this.f204550b.f297794a.hashCode() + (this.f204549a.hashCode() * 31);
    }
}
