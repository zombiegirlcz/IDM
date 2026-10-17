package te8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public boolean u;
    public ff8.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f270058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f270059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f270060y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f270059x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f270058w = obj2;
        this.f270060y |= Integer.MIN_VALUE;
        return this.f270059x.c(false, this);
    }
}
