package czh;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public final /* synthetic */ k A;
    public int B;
    public xi0.b u;
    public wd6.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wd6.h f110242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f110243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f110244y;
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
        return this.A.b(null, null, null, null, false, this);
    }
}
