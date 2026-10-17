package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public zve.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f121608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121609x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f121608w = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121609x |= Integer.MIN_VALUE;
        return this.f121608w.a(null, this);
    }
}
