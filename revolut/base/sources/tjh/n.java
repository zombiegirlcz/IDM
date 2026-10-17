package tjh;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.c {
    public h0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f271759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f271760x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f271759w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f271760x |= Integer.MIN_VALUE;
        return h0.s3(this.f271759w, null, this);
    }
}
