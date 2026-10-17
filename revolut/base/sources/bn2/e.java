package bn2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f17000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17001x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f17000w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f17001x |= Integer.MIN_VALUE;
        return this.f17000w.a(null, this);
    }
}
