package bwb;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f19295w |= Integer.MIN_VALUE;
        return this.v.c(null, null, null, null, null, this);
    }
}
