package h17;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f148472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f148472w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b.I2(this.v, this);
    }
}
