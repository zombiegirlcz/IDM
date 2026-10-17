package ne5;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f214413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f214413w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214414x |= Integer.MIN_VALUE;
        return c.g(this.f214413w, null, false, this);
    }
}
