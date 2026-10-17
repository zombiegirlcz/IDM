package eig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126637b;

    public n(String id10, String providerName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.f126636a = id10;
        this.f126637b = providerName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f126636a, nVar.f126636a) && Intrinsics.f(this.f126637b, nVar.f126637b);
    }

    public final int hashCode() {
        return this.f126637b.hashCode() + (this.f126636a.hashCode() * 31);
    }
}
