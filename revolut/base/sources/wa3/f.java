package wa3;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ie.a f295803w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f295804x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ie.a aVar, gim.c cVar) {
        super(cVar);
        this.f295803w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f295804x |= Integer.MIN_VALUE;
        return this.f295803w.e(false, this);
    }
}
