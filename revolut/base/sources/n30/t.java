package n30;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends gim.c {
    public v30.c0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f211664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211665x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.f211664w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f211665x |= Integer.MIN_VALUE;
        return this.f211664w.c(null, this);
    }
}
