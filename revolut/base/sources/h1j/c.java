package h1j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148579a;

    public c(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f148579a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f148579a, ((c) obj2).f148579a);
    }

    public final int hashCode() {
        return this.f148579a.hashCode();
    }
}
