package vvh;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r1e.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f292543w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r1e.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f292543w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
