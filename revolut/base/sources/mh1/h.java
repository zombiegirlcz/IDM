package mh1;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public j1j.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f205356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f205357x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.f205356w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f205357x |= Integer.MIN_VALUE;
        return this.f205356w.b(null, this);
    }
}
