package ji5;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public zg4.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f174350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f174351x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f174350w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f174351x |= Integer.MIN_VALUE;
        return e.b(this.f174350w, null, this);
    }
}
