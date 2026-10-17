package t3f;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public int A;
    public Object u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f267758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f267760y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, gim.c cVar) {
        super(cVar);
        this.z = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f267760y = obj2;
        this.A |= Integer.MIN_VALUE;
        return o.c(this.z, this);
    }
}
