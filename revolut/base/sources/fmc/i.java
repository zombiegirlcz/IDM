package fmc;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f136342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f136343x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f136342w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f136343x |= Integer.MIN_VALUE;
        return this.f136342w.a(false, this);
    }
}
