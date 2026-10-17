package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f182832w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f182832w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
