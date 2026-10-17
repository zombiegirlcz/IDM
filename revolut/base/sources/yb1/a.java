package yb1;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f312157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f312158b;

    public a(Locale locale, b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f312157a = locale;
        this.f312158b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f312157a, aVar.f312157a) && Intrinsics.f(this.f312158b, aVar.f312158b);
    }

    public final int hashCode() {
        return this.f312158b.hashCode() + (this.f312157a.hashCode() * 31);
    }
}
