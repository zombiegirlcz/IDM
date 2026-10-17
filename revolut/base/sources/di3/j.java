package di3;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public pi3.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f114888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114889x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f114888w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114889x |= Integer.MIN_VALUE;
        return this.f114888w.g(null, null, this);
    }
}
