package ndh;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.c {
    public c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f214368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214369x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f214368w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214369x |= Integer.MIN_VALUE;
        return this.f214368w.b3(null, null, this);
    }
}
