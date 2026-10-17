package adg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f3346b;

    public h(int i, i guestType) {
        Intrinsics.checkNotNullParameter(guestType, "guestType");
        this.f3345a = i;
        this.f3346b = guestType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f3345a == hVar.f3345a && this.f3346b == hVar.f3346b;
    }

    public final int hashCode() {
        return this.f3346b.hashCode() + (Integer.hashCode(this.f3345a) * 31);
    }
}
