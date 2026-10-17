package skm;

/* JADX INFO: loaded from: classes13.dex */
public final class s0 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f264007a;

    public s0(r0 r0Var) {
        this.f264007a = r0Var;
    }

    @Override // skm.k
    public final void a(Throwable th10) {
        this.f264007a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f264007a + ']';
    }
}
