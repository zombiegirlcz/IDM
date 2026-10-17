package ir9;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f168023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168024x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f168023w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168024x |= Integer.MIN_VALUE;
        return this.f168023w.e(null, this);
    }
}
