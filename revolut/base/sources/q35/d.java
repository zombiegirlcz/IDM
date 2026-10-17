package q35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f241803b;

    public d(String userId, int i) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f241802a = userId;
        this.f241803b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f241802a, dVar.f241802a) && this.f241803b == dVar.f241803b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241803b) + (this.f241802a.hashCode() * 31);
    }
}
