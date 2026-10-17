package db9;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i4b.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f112683w |= Integer.MIN_VALUE;
        return this.v.f(this);
    }
}
