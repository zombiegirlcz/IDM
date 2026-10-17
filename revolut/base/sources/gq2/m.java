package gq2;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f145537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f145538x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f145537w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f145538x |= Integer.MIN_VALUE;
        return this.f145537w.I2(null, null, this);
    }
}
