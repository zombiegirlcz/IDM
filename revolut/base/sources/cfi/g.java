package cfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23708b;

    public g(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f23707a = id10;
        this.f23708b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f23707a, gVar.f23707a) && Intrinsics.f(this.f23708b, gVar.f23708b);
    }

    public final int hashCode() {
        return this.f23708b.hashCode() + (this.f23707a.hashCode() * 31);
    }
}
