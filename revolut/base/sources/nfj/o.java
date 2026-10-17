package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public boolean u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f215003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f215004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f215005y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f215004x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f215003w = obj2;
        this.f215005y |= Integer.MIN_VALUE;
        return this.f215004x.b(this, null, false);
    }
}
