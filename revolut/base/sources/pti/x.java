package pti;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.c {
    public z u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f239765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f239766x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.f239765w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f239766x |= Integer.MIN_VALUE;
        return this.f239765w.b(null, this);
    }
}
