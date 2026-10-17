package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f257651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257652y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, gim.c cVar) {
        super(cVar);
        this.f257651x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257650w = obj2;
        this.f257652y |= Integer.MIN_VALUE;
        return this.f257651x.e(null, this);
    }
}
