package b9c;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f13700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f13701b;

    public d(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f13700a = locale;
        this.f13701b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f13700a, dVar.f13700a) && Intrinsics.f(this.f13701b, dVar.f13701b);
    }

    public final int hashCode() {
        return this.f13701b.hashCode() + (this.f13700a.hashCode() * 31);
    }
}
