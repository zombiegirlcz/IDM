package vvj;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f292559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f292559w |= Integer.MIN_VALUE;
        return this.v.b(this, null, null);
    }
}
