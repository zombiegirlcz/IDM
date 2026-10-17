package mq4;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f207872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f207873x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x xVar, gim.c cVar) {
        super(cVar);
        this.f207872w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f207873x |= Integer.MIN_VALUE;
        return this.f207872w.I2(null, null, null, this);
    }
}
