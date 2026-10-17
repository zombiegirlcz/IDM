package fi6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.a f135292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135293x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r10.a aVar, gim.c cVar) {
        super(cVar);
        this.f135292w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135293x |= Integer.MIN_VALUE;
        return this.f135292w.V(null, this);
    }
}
