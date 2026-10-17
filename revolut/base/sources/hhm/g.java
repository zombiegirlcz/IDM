package hhm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f152432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f152434c;

    public g(Object obj2, long j2, TimeUnit timeUnit) {
        this.f152432a = obj2;
        this.f152433b = j2;
        mfm.f.b(timeUnit, "unit is null");
        this.f152434c = timeUnit;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            g gVar = (g) obj2;
            if (mfm.f.a(this.f152432a, gVar.f152432a) && this.f152433b == gVar.f152433b && mfm.f.a(this.f152434c, gVar.f152434c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f152432a;
        int iHashCode = obj2 != null ? obj2.hashCode() : 0;
        long j2 = this.f152433b;
        return this.f152434c.hashCode() + (((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Timed[time=");
        sb6.append(this.f152433b);
        sb6.append(", unit=");
        sb6.append(this.f152434c);
        sb6.append(", value=");
        return com.revolut.data.database.models.openbanking.d.t(sb6, this.f152432a, "]");
    }
}
