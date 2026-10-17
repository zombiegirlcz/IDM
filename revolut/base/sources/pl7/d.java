package pl7;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f237280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f237280w |= Integer.MIN_VALUE;
        return h.c(this.v, this);
    }
}
