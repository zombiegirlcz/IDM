package i4j;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f158509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f158510x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f158509w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f158510x |= Integer.MIN_VALUE;
        return this.f158509w.c(null, null, null, this);
    }
}
