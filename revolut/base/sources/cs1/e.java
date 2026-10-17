package cs1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f108434a;

    public e(xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f108434a = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f108434a, ((e) obj2).f108434a);
    }

    public final int hashCode() {
        return this.f108434a.hashCode();
    }
}
