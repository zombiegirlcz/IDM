package hj3;

import kotlin.time.b;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152665b;

    public h(long j2, long j3) {
        this.f152664a = j2;
        this.f152665b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return kotlin.time.b.d(this.f152664a, hVar.f152664a) && kotlin.time.b.d(this.f152665b, hVar.f152665b);
    }

    public final int hashCode() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f152665b) + (Long.hashCode(this.f152664a) * 31);
    }
}
