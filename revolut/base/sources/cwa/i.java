package cwa;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public String u;
    public yva.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f109594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109595y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f109594x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109593w = obj2;
        this.f109595y |= Integer.MIN_VALUE;
        return this.f109594x.f(null, this);
    }
}
