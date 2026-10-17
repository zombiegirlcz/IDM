package mw2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f209314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f209315x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f209314w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f209315x |= Integer.MIN_VALUE;
        return this.f209314w.e(null, this);
    }
}
