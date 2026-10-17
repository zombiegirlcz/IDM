package w1j;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f293871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f293872x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f293871w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f293872x |= Integer.MIN_VALUE;
        return this.f293871w.a(null, this);
    }
}
