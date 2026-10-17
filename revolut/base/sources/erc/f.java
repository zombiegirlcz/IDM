package erc;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128638w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.salary_switch.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f128638w |= Integer.MIN_VALUE;
        return com.revolut.feature.salary_switch.impl.ui.flow.a.I2(this.v, null, this);
    }
}
