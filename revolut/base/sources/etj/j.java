package etj;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129425w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129425w |= Integer.MIN_VALUE;
        return o.c(this.v, null, null, false, this);
    }
}
