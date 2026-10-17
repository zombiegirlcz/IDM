package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends gim.c {
    public int A;
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f u;
    public b68.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f21715w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f21716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f21717y;
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21717y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.W2(this);
    }
}
