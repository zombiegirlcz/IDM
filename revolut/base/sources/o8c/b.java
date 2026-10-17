package o8c;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f222994w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, gim.c cVar) {
        super(cVar);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f222994w |= Integer.MIN_VALUE;
        return this.v.Z2(null, null, null, this);
    }
}
