package y19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310332b;

    public b(String title, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f310331a = title;
        this.f310332b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310331a, bVar.f310331a) && Intrinsics.f(this.f310332b, bVar.f310332b);
    }

    public final int hashCode() {
        return this.f310332b.hashCode() + (this.f310331a.hashCode() * 31);
    }
}
