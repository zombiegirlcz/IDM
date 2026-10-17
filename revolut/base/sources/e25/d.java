package e25;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f122031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f122032x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f122031w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f122032x |= Integer.MIN_VALUE;
        return this.f122031w.e3(this);
    }
}
