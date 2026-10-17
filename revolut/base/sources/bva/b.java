package bva;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f18971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18972x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f18971w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18972x |= Integer.MIN_VALUE;
        return this.f18971w.a(null, this);
    }
}
