package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.c {
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f A;
    public int B;
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f u;
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b68.a f21718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f21719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f21720y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.J2(this.A, this);
    }
}
