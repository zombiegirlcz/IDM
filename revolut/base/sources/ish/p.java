package ish;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public dsh.t u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, gim.c cVar) {
        super(cVar);
        this.f168276w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168277x |= Integer.MIN_VALUE;
        return this.f168276w.e(null, null, this);
    }
}
