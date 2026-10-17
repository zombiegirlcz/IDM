package mtl;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f208925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f208926x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f208925w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f208926x |= Integer.MIN_VALUE;
        return p.I2(this.f208925w, null, this);
    }
}
