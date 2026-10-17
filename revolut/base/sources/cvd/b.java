package cvd;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f109332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f109332w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109333x |= Integer.MIN_VALUE;
        return this.f109332w.a(null, this);
    }
}
