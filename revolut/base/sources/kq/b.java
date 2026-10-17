package kq;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f188269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f188270x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, gim.c cVar) {
        super(cVar);
        this.f188269w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f188270x |= Integer.MIN_VALUE;
        return this.f188269w.b(0, this);
    }
}
