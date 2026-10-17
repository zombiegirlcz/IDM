package kbm;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends a {
    public final jbm.b d;

    public g(String str, jbm.b bVar) {
        super(str);
        this.d = bVar;
    }

    @Override // kbm.c
    public final b getEventType() {
        return b.STATE_TRANSITION;
    }

    public final String toString() {
        jbm.b bVar = this.d;
        return this.f182635b + ": CircuitBreaker '" + this.f182634a + "' changed state from " + bVar.b() + " to " + bVar.c();
    }
}
