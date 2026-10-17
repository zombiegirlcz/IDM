package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class j2 extends gim.c {
    public Integer u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l2 f114006w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, gim.c cVar) {
        super(cVar);
        this.f114006w = l2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114007x |= Integer.MIN_VALUE;
        return this.f114006w.a(this);
    }
}
