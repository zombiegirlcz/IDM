package jl8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zq.a f175651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f175652x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zq.a aVar, gim.c cVar) {
        super(cVar);
        this.f175651w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f175652x |= Integer.MIN_VALUE;
        return this.f175651w.E(null, null, this);
    }
}
