package i52;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f158554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f158554w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a.I2(this.v, this);
    }
}
