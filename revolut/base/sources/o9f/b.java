package o9f;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f223258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223259x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f223258w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f223259x |= Integer.MIN_VALUE;
        return this.f223258w.b(null, null, null, this);
    }
}
