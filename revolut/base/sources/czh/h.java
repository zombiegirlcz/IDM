package czh;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public final /* synthetic */ k A;
    public int B;
    public xi0.b u;
    public wd6.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wd6.h f110245w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.d f110246x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f110247y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.A = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, null, false, this);
    }
}
