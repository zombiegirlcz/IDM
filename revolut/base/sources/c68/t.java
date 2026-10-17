package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends gim.c {
    public int A;
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f u;
    public b68.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f21723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f21724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f21725y;
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21725y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.Y2(this);
    }
}
