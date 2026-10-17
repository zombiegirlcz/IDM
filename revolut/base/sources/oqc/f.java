package oqc;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.brazil.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f227887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.salary_switch.impl.ui.brazil.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f227887w |= Integer.MIN_VALUE;
        return com.revolut.feature.salary_switch.impl.ui.brazil.flow.b.I2(this.v, this);
    }
}
