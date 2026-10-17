package vd1;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f287774a;

    public d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f287774a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f287774a, ((d) obj2).f287774a);
    }

    public final int hashCode() {
        return this.f287774a.hashCode();
    }
}
