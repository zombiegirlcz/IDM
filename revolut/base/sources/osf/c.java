package osf;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public bsf.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f229326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f229327x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f229326w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f229327x |= Integer.MIN_VALUE;
        return g.c3(this.f229326w, null, this);
    }
}
