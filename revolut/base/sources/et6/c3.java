package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r10.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r10.v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129208w |= Integer.MIN_VALUE;
        return this.v.v(this);
    }
}
