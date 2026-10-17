package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f233052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f233053x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f233052w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f233053x |= Integer.MIN_VALUE;
        return this.f233052w.b(null, this);
    }
}
