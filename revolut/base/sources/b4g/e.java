package b4g;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public String u;
    public s7g.c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f12326x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12327y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f12326x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f12325w = obj2;
        this.f12327y |= Integer.MIN_VALUE;
        return this.f12326x.b(null, null, this);
    }
}
