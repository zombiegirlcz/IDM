package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends gim.c {
    public od0.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zjh.i f129335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(zjh.i iVar, gim.c cVar) {
        super(cVar);
        this.f129335w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129336x |= Integer.MIN_VALUE;
        return this.f129335w.n(this);
    }
}
