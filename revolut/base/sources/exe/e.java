package exe;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130396w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, gim.c cVar) {
        super(cVar);
        this.v = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f130396w |= Integer.MIN_VALUE;
        return l.b(this.v, null, this);
    }
}
