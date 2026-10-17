package qt0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f248891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f248892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f248893c;

    public c(float f, float f4, Object obj2) {
        this.f248891a = f;
        this.f248892b = f4;
        this.f248893c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f248891a, cVar.f248891a) == 0 && Float.compare(this.f248892b, cVar.f248892b) == 0 && Intrinsics.f(this.f248893c, cVar.f248893c);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f248892b, Float.hashCode(this.f248891a) * 31, 31);
        Object obj2 = this.f248893c;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }
}
