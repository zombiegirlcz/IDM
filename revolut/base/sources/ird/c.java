package ird;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f168042a;

    public c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f168042a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f168042a, ((c) obj2).f168042a);
    }

    public final int hashCode() {
        return this.f168042a.hashCode();
    }
}
