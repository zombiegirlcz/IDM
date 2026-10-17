package ifj;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public boolean u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f161021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f161022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f161023y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.f161022x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161021w = obj2;
        this.f161023y |= Integer.MIN_VALUE;
        return this.f161022x.c(false, this);
    }
}
