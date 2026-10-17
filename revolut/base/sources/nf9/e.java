package nf9;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f214879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f214880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f214879w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f214880x |= Integer.MIN_VALUE;
        return this.f214879w.b(this);
    }
}
