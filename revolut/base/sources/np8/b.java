package np8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp8.b f218155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f218156c;

    public b(String userId, dp8.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f218154a = userId;
        this.f218155b = bVar;
        this.f218156c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218154a, bVar.f218154a) && Intrinsics.f(this.f218155b, bVar.f218155b) && this.f218156c == bVar.f218156c;
    }

    public final int hashCode() {
        int iHashCode = this.f218154a.hashCode() * 31;
        dp8.b bVar = this.f218155b;
        return Boolean.hashCode(this.f218156c) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
