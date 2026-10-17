package jzh;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f179827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f179827w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179828x |= Integer.MIN_VALUE;
        return this.f179827w.f(null, this);
    }
}
