package gug;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b f146941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146942y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar, gim.c cVar) {
        super(cVar);
        this.f146941x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146940w = obj2;
        this.f146942y |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b.I2(this.f146941x, null, this);
    }
}
