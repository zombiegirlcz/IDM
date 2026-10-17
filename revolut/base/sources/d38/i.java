package d38;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f110938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f110938w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110939x |= Integer.MIN_VALUE;
        return j.b(this.f110938w, false, this);
    }
}
