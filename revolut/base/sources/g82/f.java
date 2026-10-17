package g82;

import do3.n;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f141244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f141245x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f141244w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f141245x |= Integer.MIN_VALUE;
        return g.I2(this.f141244w, this);
    }
}
