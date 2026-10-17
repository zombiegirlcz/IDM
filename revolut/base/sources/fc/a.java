package fc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f133565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f133566b;

    public a(ic.a aVar, HashMap map) {
        this.f133565a = aVar;
        this.f133566b = map;
    }

    public final long a(wb.e eVar, long j2, int i) {
        long jB = j2 - this.f133565a.b();
        b bVar = (b) this.f133566b.get(eVar);
        long j3 = bVar.f133567a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * ((long) r12)))), jB), bVar.f133568b);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f133565a.equals(aVar.f133565a) && this.f133566b.equals(aVar.f133566b);
    }

    public final int hashCode() {
        return ((this.f133565a.hashCode() ^ 1000003) * 1000003) ^ this.f133566b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f133565a + ", values=" + this.f133566b + "}";
    }
}
