package wng;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f298841a;

    public a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f298841a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f298841a, ((a) obj2).f298841a);
    }

    public final int hashCode() {
        return this.f298841a.hashCode();
    }
}
