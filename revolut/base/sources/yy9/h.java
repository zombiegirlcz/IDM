package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f317893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317894x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f317893w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317894x |= Integer.MIN_VALUE;
        return this.f317893w.a(null, this);
    }
}
