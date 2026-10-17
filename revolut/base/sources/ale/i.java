package ale;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.c {
    public j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f6255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f6255w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f6256x |= Integer.MIN_VALUE;
        return this.f6255w.b3(null, this);
    }
}
