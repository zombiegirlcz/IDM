package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f113924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f113925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, gim.c cVar) {
        super(cVar);
        this.f113924w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f113925x |= Integer.MIN_VALUE;
        return this.f113924w.a(0, this);
    }
}
