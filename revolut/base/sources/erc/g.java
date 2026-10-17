package erc;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.flow.a f128640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128641y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.salary_switch.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f128640x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128639w = obj2;
        this.f128641y |= Integer.MIN_VALUE;
        return com.revolut.feature.salary_switch.impl.ui.flow.a.J2(this.f128640x, this);
    }
}
