package ubd;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public final /* synthetic */ i A;
    public int B;
    public String u;
    public Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Long f278831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public sbd.h f278832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f278833y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.A = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(null, null, null, null, this);
    }
}
