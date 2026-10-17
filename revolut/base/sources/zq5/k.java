package zq5;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public wk5.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f324388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f324389x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f324388w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f324389x |= Integer.MIN_VALUE;
        return this.f324388w.c(null, null, this);
    }
}
