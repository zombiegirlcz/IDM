package qwd;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f249856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249857b;

    public i(Locale locale, xi0.b currency) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f249856a = locale;
        this.f249857b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f249856a, iVar.f249856a) && Intrinsics.f(this.f249857b, iVar.f249857b);
    }

    public final int hashCode() {
        return this.f249857b.hashCode() + (this.f249856a.hashCode() * 31);
    }
}
