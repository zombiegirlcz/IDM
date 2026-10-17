package i97;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f159593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f159594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, gim.c cVar) {
        super(cVar);
        this.f159593w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f159594x |= Integer.MIN_VALUE;
        return l.b(this.f159593w, null, this);
    }
}
