package oh6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225316b;

    public b(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225315a = id10;
        this.f225316b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f225315a, bVar.f225315a) && Intrinsics.f(this.f225316b, bVar.f225316b);
    }

    public final int hashCode() {
        return this.f225316b.hashCode() + (this.f225315a.hashCode() * 31);
    }
}
