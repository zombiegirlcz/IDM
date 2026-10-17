package t38;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.c {
    public io3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f267696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267697x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f267696w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267697x |= Integer.MIN_VALUE;
        return this.f267696w.i3(null, this);
    }
}
