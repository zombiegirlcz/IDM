package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class x3 extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y3 f226752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226753y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(y3 y3Var, gim.c cVar) {
        super(cVar);
        this.f226752x = y3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        this.f226751w = obj2;
        this.f226753y |= Integer.MIN_VALUE;
        Object objJ = this.f226752x.j(null, this);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : new yhm.m(objJ);
    }
}
