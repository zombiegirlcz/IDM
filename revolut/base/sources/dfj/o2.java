package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class o2 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v2 f114058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114059x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(v2 v2Var, gim.c cVar) {
        super(cVar);
        this.f114058w = v2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114059x |= Integer.MIN_VALUE;
        return this.f114058w.d(null, null, this);
    }
}
