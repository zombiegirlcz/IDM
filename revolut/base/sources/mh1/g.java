package mh1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public final /* synthetic */ k A;
    public int B;
    public k u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f205353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f205354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f205355y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.A = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, this);
    }
}
