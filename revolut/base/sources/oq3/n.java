package oq3;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.c {
    public lq3.b u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f227727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f227728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227729y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f227728x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227727w = obj2;
        this.f227729y |= Integer.MIN_VALUE;
        return this.f227728x.d(null, this);
    }
}
