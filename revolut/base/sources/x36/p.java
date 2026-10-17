package x36;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f302675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302676x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y yVar, gim.c cVar) {
        super(cVar);
        this.f302675w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f302676x |= Integer.MIN_VALUE;
        return y.I2(this.f302675w, null, this);
    }
}
