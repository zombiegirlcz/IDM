package io.reactivex.rxjava3.schedulers;

import com.revolut.data.database.models.openbanking.d;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class Timed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f163121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f163122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f163123c;

    public Timed(Object obj2, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(obj2, "value is null");
        this.f163121a = obj2;
        this.f163122b = j2;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f163123c = timeUnit;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof Timed) {
            Timed timed = (Timed) obj2;
            if (Objects.equals(this.f163121a, timed.f163121a) && this.f163122b == timed.f163122b && Objects.equals(this.f163123c, timed.f163123c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f163121a.hashCode() * 31;
        long j2 = this.f163122b;
        return this.f163123c.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Timed[time=");
        sb6.append(this.f163122b);
        sb6.append(", unit=");
        sb6.append(this.f163123c);
        sb6.append(", value=");
        return d.t(sb6, this.f163121a, "]");
    }
}
