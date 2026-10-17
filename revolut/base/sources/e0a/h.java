package e0a;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f121495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121496x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f121495w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121496x |= Integer.MIN_VALUE;
        return this.f121495w.c3(null, this);
    }
}
