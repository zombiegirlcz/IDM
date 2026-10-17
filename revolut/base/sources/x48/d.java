package x48;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends v13.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f302803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302804b;

    public d(String name, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f302803a = currency;
        this.f302804b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302803a, dVar.f302803a) && Intrinsics.f(this.f302804b, dVar.f302804b);
    }

    public final int hashCode() {
        return this.f302804b.hashCode() + (this.f302803a.hashCode() * 31);
    }
}
