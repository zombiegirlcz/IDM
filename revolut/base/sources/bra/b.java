package bra;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f17965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17966x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.f17965w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17966x |= Integer.MIN_VALUE;
        return d.a(this.f17965w, null, false, this);
    }
}
