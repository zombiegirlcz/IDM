package qn9;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f247877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f247878b;

    public e(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f247877a = locale;
        this.f247878b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f247877a, eVar.f247877a) && Intrinsics.f(this.f247878b, eVar.f247878b);
    }

    public final int hashCode() {
        return this.f247878b.hashCode() + (this.f247877a.hashCode() * 31);
    }
}
