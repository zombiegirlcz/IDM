package z5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f319618b;

    public e(String title, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f319617a = title;
        this.f319618b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f319617a, eVar.f319617a) && Intrinsics.f(this.f319618b, eVar.f319618b);
    }

    public final int hashCode() {
        int iHashCode = this.f319617a.hashCode() * 31;
        d dVar = this.f319618b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
