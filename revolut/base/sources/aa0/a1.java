package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2722a;

    public a1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f2722a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && Intrinsics.f(this.f2722a, ((a1) obj2).f2722a);
    }

    public final int hashCode() {
        return this.f2722a.hashCode();
    }
}
