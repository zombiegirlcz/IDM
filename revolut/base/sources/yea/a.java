package yea;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f312831a;

    public a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f312831a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312831a, ((a) obj2).f312831a);
    }

    public final int hashCode() {
        return this.f312831a.hashCode();
    }
}
