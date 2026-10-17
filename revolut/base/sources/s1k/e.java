package s1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f259150a;

    public e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f259150a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f259150a, ((e) obj2).f259150a);
    }

    public final int hashCode() {
        return this.f259150a.hashCode();
    }
}
