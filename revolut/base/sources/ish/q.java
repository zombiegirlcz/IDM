package ish;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168278w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168279x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, gim.c cVar) {
        super(cVar);
        this.f168278w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168279x |= Integer.MIN_VALUE;
        return this.f168278w.f(null, null, this);
    }
}
