package yb5;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f312199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f312200x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f312199w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f312200x |= Integer.MIN_VALUE;
        return this.f312199w.i(null, null, this);
    }
}
