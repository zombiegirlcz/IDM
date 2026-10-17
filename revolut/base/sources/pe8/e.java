package pe8;

import kotlin.time.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f235339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235340b;

    public e(long j2, long j3) {
        this.f235339a = j2;
        this.f235340b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return kotlin.time.b.d(this.f235339a, eVar.f235339a) && kotlin.time.b.d(this.f235340b, eVar.f235340b);
    }

    public final int hashCode() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f235340b) + (Long.hashCode(this.f235339a) * 31);
    }
}
