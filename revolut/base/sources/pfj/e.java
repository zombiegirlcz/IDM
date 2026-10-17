package pfj;

import kotlin.time.b;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f235607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235608b;

    public e(long j2, long j3) {
        this.f235607a = j2;
        this.f235608b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return kotlin.time.b.d(this.f235607a, eVar.f235607a) && kotlin.time.b.d(this.f235608b, eVar.f235608b);
    }

    public final int hashCode() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f235608b) + (Long.hashCode(this.f235607a) * 31);
    }
}
