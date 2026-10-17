package aem;

/* JADX INFO: loaded from: classes23.dex */
public final class v0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, gim.c cVar) {
        super(cVar);
        this.v = w0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f3786w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
