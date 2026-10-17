package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b9k.f f129257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129258x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b9k.f fVar, gim.c cVar) {
        super(cVar);
        this.f129257w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129258x |= Integer.MIN_VALUE;
        return this.f129257w.B(null, null, null, this);
    }
}
