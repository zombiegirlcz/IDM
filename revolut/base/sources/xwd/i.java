package xwd;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f309350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f309351b;

    public i(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f309350a = locale;
        this.f309351b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f309350a, iVar.f309350a) && Intrinsics.f(this.f309351b, iVar.f309351b);
    }

    public final int hashCode() {
        return this.f309351b.hashCode() + (this.f309350a.hashCode() * 31);
    }
}
