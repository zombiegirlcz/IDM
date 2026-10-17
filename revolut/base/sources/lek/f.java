package lek;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f194570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f194571x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, gim.c cVar) {
        super(cVar);
        this.f194570w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f194571x |= Integer.MIN_VALUE;
        return this.f194570w.d(null, this);
    }
}
