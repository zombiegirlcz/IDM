package xqa;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t1j.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f308138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t1j.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f308138w |= Integer.MIN_VALUE;
        return this.v.n(null, null, this);
    }
}
