package gcm;

import com.google.common.base.Preconditions;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Random f142583a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f142584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f142585c;
    public final double d;
    public long e;

    public b1() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f142584b = TimeUnit.MINUTES.toNanos(2L);
        this.f142585c = 1.6d;
        this.d = 0.2d;
        this.e = nanos;
    }

    public final long a() {
        long j2 = this.e;
        double d = j2;
        this.e = Math.min((long) (this.f142585c * d), this.f142584b);
        double d5 = this.d;
        double d6 = (-d5) * d;
        double d10 = d5 * d;
        Preconditions.checkArgument(d10 >= d6);
        return j2 + ((long) ((this.f142583a.nextDouble() * (d10 - d6)) + d6));
    }
}
