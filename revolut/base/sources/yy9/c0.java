package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f317873w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f317874x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f317875y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.f317874x = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317873w = obj2;
        this.f317875y |= Integer.MIN_VALUE;
        return this.f317874x.c(null, this);
    }
}
