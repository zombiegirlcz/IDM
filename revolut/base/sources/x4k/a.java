package x4k;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b9k.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b9k.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302880w |= Integer.MIN_VALUE;
        return b9k.f.c(this.v, null, this);
    }
}
