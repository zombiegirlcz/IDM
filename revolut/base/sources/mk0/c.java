package mk0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f206139w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f206139w |= Integer.MIN_VALUE;
        return o.k(this.v, this);
    }
}
