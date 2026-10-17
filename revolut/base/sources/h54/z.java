package h54;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149504w |= Integer.MIN_VALUE;
        return this.v.Z2(this);
    }
}
