package f0h;

import kotlin.jvm.internal.Intrinsics;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f131122a;

    public a(b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f131122a = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f131122a, ((a) obj2).f131122a);
    }

    public final int hashCode() {
        return this.f131122a.hashCode();
    }
}
