package un8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public final /* synthetic */ h A;
    public int B;
    public String u;
    public in8.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f281362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f281363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f281364y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.A = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.d(null, null, this);
    }
}
