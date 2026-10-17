package s8a;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public int A;
    public com.revolut.domain.interactors.transactions.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f260944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f260946y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f260946y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, false, this);
    }
}
