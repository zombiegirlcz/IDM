package g5k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public String u;
    public wi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f140807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f140808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ fkg.a f140809y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fkg.a aVar, gim.c cVar) {
        super(cVar);
        this.f140809y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f140808x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f140809y.p(null, this);
    }
}
