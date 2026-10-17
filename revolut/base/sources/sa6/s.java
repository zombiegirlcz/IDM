package sa6;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.c {
    public int A;
    public String u;
    public ba6.b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ba6.u f261342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f261343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f261344y;
    public final /* synthetic */ t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, gim.c cVar) {
        super(cVar);
        this.z = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f261344y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, null, false, null, this);
    }
}
