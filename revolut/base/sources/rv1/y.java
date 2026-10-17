package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f257685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257686x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f257685w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f257686x |= Integer.MIN_VALUE;
        return this.f257685w.c(null, this);
    }
}
