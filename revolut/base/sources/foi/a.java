package foi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136988b;

    public a(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f136987a = name;
        this.f136988b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136987a, aVar.f136987a) && this.f136988b == aVar.f136988b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136988b) + (this.f136987a.hashCode() * 31);
    }
}
