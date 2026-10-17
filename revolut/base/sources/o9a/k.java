package o9a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f223158a;

    public k(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f223158a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f223158a, ((k) obj2).f223158a);
    }

    public final int hashCode() {
        return this.f223158a.hashCode();
    }
}
