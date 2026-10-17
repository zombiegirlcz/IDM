package exe;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.v = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f130397w |= Integer.MIN_VALUE;
        return l.c(this.v, null, null, this);
    }
}
