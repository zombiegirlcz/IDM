package kbm;

import java.time.Duration;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends a {
    public final Duration d;

    public h(String str, Duration duration) {
        super(str);
        this.d = duration;
    }

    @Override // kbm.c
    public final b getEventType() {
        return b.SUCCESS;
    }

    public final String toString() {
        long millis = this.d.toMillis();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f182635b);
        sb6.append(": CircuitBreaker '");
        sb6.append(this.f182634a);
        sb6.append("' recorded a successful call. Elapsed time: ");
        return a0.d.j(millis, " ms", sb6);
    }
}
