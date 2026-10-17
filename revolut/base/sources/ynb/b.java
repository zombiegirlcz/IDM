package ynb;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f315389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f315389w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315390x |= Integer.MIN_VALUE;
        return c.Z2(this.f315389w, null, this);
    }
}
