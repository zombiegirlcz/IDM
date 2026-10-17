package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public tji.f u;
    public q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f256781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f256782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f256783y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, gim.c cVar) {
        super(cVar);
        this.f256782x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f256781w = obj2;
        this.f256783y |= Integer.MIN_VALUE;
        return this.f256782x.i(null, null, this);
    }
}
