package r7e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252199a;

    public b(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f252199a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f252199a, ((b) obj2).f252199a);
    }

    public final int hashCode() {
        return this.f252199a.hashCode();
    }
}
