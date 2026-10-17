package tt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f274213b;

    public e(dj0.d totalLimit, f fVar) {
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        this.f274212a = totalLimit;
        this.f274213b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f274212a, eVar.f274212a) && Intrinsics.f(this.f274213b, eVar.f274213b);
    }

    public final int hashCode() {
        int iHashCode = this.f274212a.hashCode() * 31;
        f fVar = this.f274213b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
