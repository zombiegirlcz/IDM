package i93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f159557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f159558b;

    public g(e type, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f159557a = type;
        this.f159558b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f159557a == gVar.f159557a && Intrinsics.f(this.f159558b, gVar.f159558b);
    }

    public final int hashCode() {
        int iHashCode = this.f159557a.hashCode() * 31;
        dj0.d dVar = this.f159558b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
