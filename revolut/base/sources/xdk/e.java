package xdk;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public eim.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f304495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f304496x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f304495w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f304496x |= Integer.MIN_VALUE;
        return g.c3(this.f304495w, null, null, null, null, this);
    }
}
