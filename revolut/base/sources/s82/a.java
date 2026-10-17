package s82;

import hrf.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f260875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f260876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f260877c;

    public a(long j2, long j3, f direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f260875a = j2;
        this.f260876b = j3;
        this.f260877c = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f260875a == aVar.f260875a && this.f260876b == aVar.f260876b && this.f260877c == aVar.f260877c;
    }

    public final int hashCode() {
        return this.f260877c.hashCode() + a0.d.c(Long.hashCode(this.f260875a) * 31, 31, this.f260876b);
    }
}
