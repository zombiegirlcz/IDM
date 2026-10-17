package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f121658w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121659x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f121658w = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121659x |= Integer.MIN_VALUE;
        return this.f121658w.l(null, null, this);
    }
}
