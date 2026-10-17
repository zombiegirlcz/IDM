package cfa;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public io3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f23662w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23663x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f23662w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23663x |= Integer.MIN_VALUE;
        return this.f23662w.c(null, this);
    }
}
