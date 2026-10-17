package t7i;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public fo3.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f268730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f268731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f268732y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f268731x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f268730w = obj2;
        this.f268732y |= Integer.MIN_VALUE;
        return this.f268731x.c(null, null, this);
    }
}
