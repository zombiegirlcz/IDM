package hi5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f152495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152496x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f152495w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152496x |= Integer.MIN_VALUE;
        return this.f152495w.b3(null, this);
    }
}
