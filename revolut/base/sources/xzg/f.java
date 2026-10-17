package xzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f309986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f309987c;

    public f(dj0.d dVar, dj0.d dVar2, String collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        this.f309985a = collectionId;
        this.f309986b = dVar;
        this.f309987c = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f309985a, fVar.f309985a) && Intrinsics.f(this.f309986b, fVar.f309986b) && Intrinsics.f(this.f309987c, fVar.f309987c);
    }

    public final int hashCode() {
        int iHashCode = this.f309985a.hashCode() * 31;
        dj0.d dVar = this.f309986b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f309987c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
