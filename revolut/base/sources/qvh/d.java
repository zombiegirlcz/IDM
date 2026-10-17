package qvh;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f249700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f249701x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f249700w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f249701x |= Integer.MIN_VALUE;
        return g.I2(this.f249700w, null, this);
    }
}
