package v73;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f286546w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f286546w |= Integer.MIN_VALUE;
        return o.Z2(this.v, null, this);
    }
}
