package q7c;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f242837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f242839y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.f242839y = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242838x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f242839y.b(null, null, null, null, this);
    }
}
