package cmm;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes14.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25322c;

    public a(int i) {
        this.f25320a = i;
    }

    public static void b(a aVar, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            j3 = 0;
        }
        synchronized (aVar) {
            try {
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j3 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j5 = aVar.f25321b + j2;
                aVar.f25321b = j5;
                long j16 = aVar.f25322c + j3;
                aVar.f25322c = j16;
                if (j16 > j5) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final synchronized long a() {
        return this.f25321b - this.f25322c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f25320a + ", total=" + this.f25321b + ", acknowledged=" + this.f25322c + ", unacknowledged=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
