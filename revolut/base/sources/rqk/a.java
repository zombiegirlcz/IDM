package rqk;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ jx0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256572w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jx0.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256572w |= Integer.MIN_VALUE;
        return this.v.u(this, null, null);
    }
}
