package ml5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f206637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f206638x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f206637w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f206638x |= Integer.MIN_VALUE;
        return this.f206637w.e(null, this);
    }
}
