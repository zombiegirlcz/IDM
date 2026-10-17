package xfb;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f305213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f305214x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, gim.c cVar) {
        super(cVar);
        this.f305213w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f305214x |= Integer.MIN_VALUE;
        return this.f305213w.f(null, this);
    }
}
