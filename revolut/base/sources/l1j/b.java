package l1j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191547a;

    public b(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f191547a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f191547a, ((b) obj2).f191547a);
    }

    public final int hashCode() {
        return this.f191547a.hashCode();
    }
}
