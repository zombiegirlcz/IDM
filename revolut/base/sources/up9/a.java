package up9;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f281918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f281919b;

    public a(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f281918a = locale;
        this.f281919b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281918a, aVar.f281918a) && Intrinsics.f(this.f281919b, aVar.f281919b);
    }

    public final int hashCode() {
        return this.f281919b.hashCode() + (this.f281918a.hashCode() * 31);
    }
}
