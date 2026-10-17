package d8b;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f112188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f112189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f112190y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f112189x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112188w = obj2;
        this.f112190y |= Integer.MIN_VALUE;
        return this.f112189x.i(null, null, this);
    }
}
