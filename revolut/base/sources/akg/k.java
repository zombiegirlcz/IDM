package akg;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f5941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5942x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.f5941w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f5942x |= Integer.MIN_VALUE;
        return this.f5941w.b(false, this);
    }
}
