package k9;

import p9.h0;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends m9.i {
    public static final int k = m9.h.c(f.class);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f182181j;

    public e(m9.a aVar, s9.g gVar, h0 h0Var, x9.o oVar, cnm.c cVar, m9.c cVar2) {
        super(aVar, gVar, h0Var, oVar, cVar);
        this.f182181j = k;
    }

    @Override // m9.i
    public final m9.i k(long j2) {
        return new e(this, j2, this.f182181j);
    }

    public e(e eVar, long j2, int i) {
        super(eVar, j2);
        this.f182181j = i;
    }
}
