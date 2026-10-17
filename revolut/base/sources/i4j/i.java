package i4j;

import g2e.t;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f158520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f158520w |= Integer.MIN_VALUE;
        return this.v.q(null, null, null, null, null, this);
    }
}
