package kbm;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends a {
    public final /* synthetic */ int d;
    public final float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(float f, int i, String str) {
        super(str);
        this.d = i;
        this.e = f;
    }

    @Override // kbm.c
    public final b getEventType() {
        switch (this.d) {
            case 0:
                return b.FAILURE_RATE_EXCEEDED;
            default:
                return b.SLOW_CALL_RATE_EXCEEDED;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' exceeded failure rate threshold. Current failure rate: " + this.e;
            default:
                return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' exceeded slow call rate threshold. Current slow call rate: " + this.e;
        }
    }
}
