package wf6;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f296977w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f296977w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
