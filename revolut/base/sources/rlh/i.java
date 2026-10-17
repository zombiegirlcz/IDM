package rlh;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public rgf.m u;
    public rgf.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f255056w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f255057x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f255058y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f255057x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f255056w = obj2;
        this.f255058y |= Integer.MIN_VALUE;
        return j.I2(this.f255057x, null, null, null, this);
    }
}
