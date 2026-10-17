package lk6;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public b0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f196265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f196266x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f196265w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f196266x |= Integer.MIN_VALUE;
        return b0.I2(this.f196265w, this);
    }
}
