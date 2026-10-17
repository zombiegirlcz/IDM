package ww4;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f300611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f300612x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f300611w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f300612x |= Integer.MIN_VALUE;
        return this.f300611w.a(null, this);
    }
}
