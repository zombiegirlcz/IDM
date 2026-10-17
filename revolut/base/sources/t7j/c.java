package t7j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f268743a;

    public c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f268743a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f268743a, ((c) obj2).f268743a);
    }

    public final int hashCode() {
        return this.f268743a.hashCode();
    }
}
