package yxb;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f317617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, gim.c cVar) {
        super(cVar);
        this.v = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f317617w |= Integer.MIN_VALUE;
        return this.v.r(null, this);
    }
}
