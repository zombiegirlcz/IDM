package di5;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f114915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114916x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.f114915w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114916x |= Integer.MIN_VALUE;
        return this.f114915w.j(this);
    }
}
