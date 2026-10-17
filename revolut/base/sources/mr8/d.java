package mr8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f208080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f208081b;

    public d(c code, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f208080a = code;
        this.f208081b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f208080a == dVar.f208080a && Intrinsics.f(this.f208081b, dVar.f208081b);
    }

    public final int hashCode() {
        int iHashCode = this.f208080a.hashCode() * 31;
        dj0.d dVar = this.f208081b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
