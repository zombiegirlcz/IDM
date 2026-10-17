package etj;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129417w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129417w |= Integer.MIN_VALUE;
        Object objE = this.v.e(null, null, this);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : new yhm.m(objE);
    }
}
