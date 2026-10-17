package wf6;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f296995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f296995w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
