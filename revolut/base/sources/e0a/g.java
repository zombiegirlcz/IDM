package e0a;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f121491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121492x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f121491w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121492x |= Integer.MIN_VALUE;
        return i.Z2(this.f121491w, this);
    }
}
