package dam;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.c {
    public s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f112587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112588x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f112587w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112588x |= Integer.MIN_VALUE;
        return this.f112587w.I(this);
    }
}
