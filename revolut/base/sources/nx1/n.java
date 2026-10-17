package nx1;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public n02.b u;
    public y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f220067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f220068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220069y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, gim.c cVar) {
        super(cVar);
        this.f220068x = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220067w = obj2;
        this.f220069y |= Integer.MIN_VALUE;
        return this.f220068x.a(null, null, this);
    }
}
