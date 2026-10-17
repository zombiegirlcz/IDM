package vkm;

/* JADX INFO: loaded from: classes14.dex */
public final class l2 extends gim.c {
    public m2 u;
    public wkm.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f290065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m2 f290066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f290067y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, gim.c cVar) {
        super(cVar);
        this.f290066x = m2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f290065w = obj2;
        this.f290067y |= Integer.MIN_VALUE;
        return this.f290066x.a(this);
    }
}
