package ml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f206524b;

    public g(String id10, f fVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f206523a = id10;
        this.f206524b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f206523a, gVar.f206523a) && this.f206524b == gVar.f206524b;
    }

    public final int hashCode() {
        int iHashCode = this.f206523a.hashCode() * 31;
        f fVar = this.f206524b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "MediaUpload(id=" + this.f206523a + ", type=" + this.f206524b + ")";
    }
}
