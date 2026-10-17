package kbm;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends a {
    public d(String str) {
        super(str);
    }

    @Override // kbm.c
    public final b getEventType() {
        return b.NOT_PERMITTED;
    }

    public final String toString() {
        return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' recorded a call which was not permitted.";
    }
}
