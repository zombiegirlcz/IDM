package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public gim.i u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f257656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f257657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f257658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, gim.c cVar) {
        super(cVar);
        this.f257657x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f257656w = obj2;
        this.f257658y |= Integer.MIN_VALUE;
        return this.f257657x.g(null, null, this);
    }
}
