package fsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f137724a;

    public d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f137724a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f137724a, ((d) obj2).f137724a);
    }

    public final int hashCode() {
        return this.f137724a.hashCode();
    }
}
