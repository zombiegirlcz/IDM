package e0a;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public w u;
    public w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f121526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121527y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f121526x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121525w = obj2;
        this.f121527y |= Integer.MIN_VALUE;
        return this.f121526x.c3(null, this);
    }
}
