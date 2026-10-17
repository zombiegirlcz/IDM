package wem;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f296831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f296832x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f296831w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f296832x |= Integer.MIN_VALUE;
        return this.f296831w.d(0, this);
    }
}
