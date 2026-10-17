package od1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f224259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f224260b;

    public a(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f224259a = locale;
        this.f224260b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f224259a, aVar.f224259a) && Intrinsics.f(this.f224260b, aVar.f224260b);
    }

    public final int hashCode() {
        return this.f224260b.hashCode() + (this.f224259a.hashCode() * 31);
    }
}
