package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f142799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f142800c;
    public final double d;
    public final Long e;
    public final ImmutableSet f;

    public o5(int i, long j2, long j3, double d, Long l2, Set set) {
        this.f142798a = i;
        this.f142799b = j2;
        this.f142800c = j3;
        this.d = d;
        this.e = l2;
        this.f = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj2;
        return this.f142798a == o5Var.f142798a && this.f142799b == o5Var.f142799b && this.f142800c == o5Var.f142800c && Double.compare(this.d, o5Var.d) == 0 && Objects.equal(this.e, o5Var.e) && Objects.equal(this.f, o5Var.f);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f142798a), Long.valueOf(this.f142799b), Long.valueOf(this.f142800c), Double.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("maxAttempts", this.f142798a).add("initialBackoffNanos", this.f142799b).add("maxBackoffNanos", this.f142800c).add("backoffMultiplier", this.d).add("perAttemptRecvTimeoutNanos", this.e).add("retryableStatusCodes", this.f).toString();
    }
}
