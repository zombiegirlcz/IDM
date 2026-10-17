package cuj;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f109063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f109064x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f109063w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f109064x |= Integer.MIN_VALUE;
        return y.J2(this.f109063w, null, this);
    }
}
