package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f1 f129217w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129218x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, gim.c cVar) {
        super(cVar);
        this.f129217w = f1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129218x |= Integer.MIN_VALUE;
        return this.f129217w.a(null, this);
    }
}
