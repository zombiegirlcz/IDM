package bra;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o7.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17973w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o7.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f17973w |= Integer.MIN_VALUE;
        return this.v.m(null, this);
    }
}
