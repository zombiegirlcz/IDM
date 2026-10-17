package t38;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.c {
    public io3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f267692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f267692w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267693x |= Integer.MIN_VALUE;
        return this.f267692w.g3(null, this);
    }
}
