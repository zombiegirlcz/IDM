package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f129214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129215x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f129214w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129215x |= Integer.MIN_VALUE;
        return this.f129214w.f(this);
    }
}
