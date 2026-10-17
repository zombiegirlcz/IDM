package hi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152542b;

    public b(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f152541a = id10;
        this.f152542b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f152541a, bVar.f152541a) && this.f152542b == bVar.f152542b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152542b) + (this.f152541a.hashCode() * 31);
    }
}
