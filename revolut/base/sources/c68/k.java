package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21708w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f21708w |= Integer.MIN_VALUE;
        return this.v.Q2(this);
    }
}
