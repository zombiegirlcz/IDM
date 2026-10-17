package k09;

import u09.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.c {
    public q u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f179991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179992x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f179991w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179992x |= Integer.MIN_VALUE;
        return g.Z2(this.f179991w, null, this);
    }
}
