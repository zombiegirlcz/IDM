package s7d;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f260668w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f260668w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
