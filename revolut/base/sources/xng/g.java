package xng;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f307488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f307489b;

    public g(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f307488a = currency;
        this.f307489b = locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f307488a, gVar.f307488a) && Intrinsics.f(this.f307489b, gVar.f307489b);
    }

    public final int hashCode() {
        return this.f307489b.hashCode() + (this.f307488a.hashCode() * 31);
    }
}
