package s36;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public wd6.e u;
    public t36.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t36.e f259443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f259445y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f259445y = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259444x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f259445y.b(null, null, this);
    }
}
