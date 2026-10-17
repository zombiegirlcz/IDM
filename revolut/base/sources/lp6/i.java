package lp6;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f198941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f198941w |= Integer.MIN_VALUE;
        return this.v.e(null, null, 0, null, null, null, null, this);
    }
}
