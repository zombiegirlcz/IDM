package nea;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f214424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f214425b;

    public d(wi0.b countryCode, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f214424a = currency;
        this.f214425b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f214424a, dVar.f214424a) && Intrinsics.f(this.f214425b, dVar.f214425b);
    }

    public final int hashCode() {
        return this.f214425b.f297794a.hashCode() + (this.f214424a.hashCode() * 31);
    }
}
