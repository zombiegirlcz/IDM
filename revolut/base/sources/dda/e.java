package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f113173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113175c;
    public final wi0.b d;
    public final m e;

    public e(xi0.b currency, String type, String name, wi0.b country, m emptyState) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        this.f113173a = currency;
        this.f113174b = type;
        this.f113175c = name;
        this.d = country;
        this.e = emptyState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f113173a, eVar.f113173a) && Intrinsics.f(this.f113174b, eVar.f113174b) && Intrinsics.f(this.f113175c, eVar.f113175c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    @Override // dda.f
    public final wi0.b getCountry() {
        return this.d;
    }

    @Override // dda.f
    public final xi0.b getCurrency() {
        return this.f113173a;
    }

    @Override // dda.f
    public final String getName() {
        return this.f113175c;
    }

    @Override // dda.f
    public final String getType() {
        return this.f113174b;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f113173a.hashCode() * 31, 31, this.f113174b), 31, this.f113175c), 31, this.d.f297794a);
    }
}
