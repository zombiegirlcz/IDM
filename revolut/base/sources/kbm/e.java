package kbm;

import java.time.Duration;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends a {
    public final /* synthetic */ int d;
    public final Throwable e;
    public final Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, Duration duration, Throwable th10, int i) {
        super(str);
        this.d = i;
        this.e = th10;
        this.f = duration;
    }

    @Override // kbm.c
    public final b getEventType() {
        switch (this.d) {
            case 0:
                return b.ERROR;
            default:
                return b.IGNORED_ERROR;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' recorded an error: '" + this.e.toString() + "'. Elapsed time: " + this.f.toMillis() + " ms";
            default:
                return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' recorded an error which has been ignored: '" + this.e.toString() + "'. Elapsed time: " + this.f.toMillis() + " ms";
        }
    }
}
