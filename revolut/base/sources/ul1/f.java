package ul1;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.aani.impl.ui.c f280850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.apm.aani.impl.ui.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f280850w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f280851x |= Integer.MIN_VALUE;
        return this.f280850w.J2(false, this);
    }
}
