package n6i;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.c {
    public String u;
    public djb.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f212815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f212816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f212817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f212816x = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212815w = obj2;
        this.f212817y |= Integer.MIN_VALUE;
        return this.f212816x.c(null, this, null);
    }
}
