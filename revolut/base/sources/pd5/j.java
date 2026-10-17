package pd5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f235111a;

    public j(xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f235111a = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f235111a, ((j) obj2).f235111a);
    }

    public final int hashCode() {
        return this.f235111a.hashCode();
    }
}
