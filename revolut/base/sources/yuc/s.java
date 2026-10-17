package yuc;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f316992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f316993x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, gim.c cVar) {
        super(cVar);
        this.f316992w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f316993x |= Integer.MIN_VALUE;
        return this.f316992w.K2(null, this);
    }
}
