package bn4;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f17095w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17096x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.f17095w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17096x |= Integer.MIN_VALUE;
        return this.f17095w.v(this);
    }
}
