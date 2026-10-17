package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class a4 extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b4 f129193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b4 b4Var, gim.c cVar) {
        super(cVar);
        this.f129193w = b4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129194x |= Integer.MIN_VALUE;
        return this.f129193w.a(this);
    }
}
