package p6i;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public String u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f233326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233327y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, gim.c cVar) {
        super(cVar);
        this.f233326x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233325w = obj2;
        this.f233327y |= Integer.MIN_VALUE;
        return this.f233326x.c(null, this, null);
    }
}
