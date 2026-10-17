package efl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f125359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f125360b;

    public a(dj0.d value, xi0.b currency) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f125359a = value;
        this.f125360b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f125359a, aVar.f125359a) && Intrinsics.f(this.f125360b, aVar.f125360b);
    }

    public final int hashCode() {
        return this.f125360b.hashCode() + (this.f125359a.hashCode() * 31);
    }
}
