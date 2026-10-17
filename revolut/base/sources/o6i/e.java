package o6i;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f222612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f222613x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f222612w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f222613x |= Integer.MIN_VALUE;
        return this.f222612w.d(null, this);
    }
}
