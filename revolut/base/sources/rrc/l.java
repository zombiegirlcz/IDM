package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public tji.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f256784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, gim.c cVar) {
        super(cVar);
        this.f256784w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256785x |= Integer.MIN_VALUE;
        return this.f256784w.j(null, null, this);
    }
}
