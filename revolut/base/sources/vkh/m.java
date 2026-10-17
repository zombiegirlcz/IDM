package vkh;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289952w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, gim.c cVar) {
        super(cVar);
        this.v = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289952w |= Integer.MIN_VALUE;
        return q.y2(this.v, this);
    }
}
