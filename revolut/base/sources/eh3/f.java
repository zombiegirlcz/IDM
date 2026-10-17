package eh3;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public vii.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ twg.c f125712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125713x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(twg.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f125712w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125713x |= Integer.MIN_VALUE;
        return this.f125712w.H(null, this);
    }
}
