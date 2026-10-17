package gal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f142194b;

    public b(dj0.d money, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f142193a = name;
        this.f142194b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f142193a, bVar.f142193a) && Intrinsics.f(this.f142194b, bVar.f142194b);
    }

    public final int hashCode() {
        return this.f142194b.hashCode() + (this.f142193a.hashCode() * 31);
    }
}
