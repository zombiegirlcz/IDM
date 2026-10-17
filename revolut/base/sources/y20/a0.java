package y20;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends gim.c {
    public t u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uvl.c f310447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f310448x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f310447w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f310448x |= Integer.MIN_VALUE;
        return uvl.c.d(this.f310447w, null, this);
    }
}
