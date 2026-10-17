package j54;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public it3.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f171544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f171545x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, gim.c cVar) {
        super(cVar);
        this.f171544w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f171545x |= Integer.MIN_VALUE;
        return this.f171544w.Z2(null, null, null, null, this);
    }
}
