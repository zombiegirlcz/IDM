package w64;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f295374w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f295374w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b.P2(this.v, null, this);
    }
}
