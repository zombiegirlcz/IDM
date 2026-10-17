package uwd;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f283622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f283623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f283624y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f283623x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f283622w = obj2;
        this.f283624y |= Integer.MIN_VALUE;
        return this.f283623x.g(this);
    }
}
