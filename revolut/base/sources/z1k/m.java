package z1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f318876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f318878c;
    public final xi0.b d;

    public m(String countryName, wi0.b countryCode, xi0.b defaultCurrency, xi0.b localCurrency) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(localCurrency, "localCurrency");
        this.f318876a = countryCode;
        this.f318877b = countryName;
        this.f318878c = defaultCurrency;
        this.d = localCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f318876a, mVar.f318876a) && Intrinsics.f(this.f318877b, mVar.f318877b) && Intrinsics.f(this.f318878c, mVar.f318878c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f318878c, p.a.c(this.f318876a.f297794a.hashCode() * 31, 31, this.f318877b), 31);
    }
}
