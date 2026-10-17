package s36;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f259426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f259427x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f259426w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f259427x |= Integer.MIN_VALUE;
        return this.f259426w.b(this);
    }
}
