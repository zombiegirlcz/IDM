package a32;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public xi0.b u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f1006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1007y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, gim.c cVar) {
        super(cVar);
        this.f1006x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1005w = obj2;
        this.f1007y |= Integer.MIN_VALUE;
        return this.f1006x.a(this);
    }
}
