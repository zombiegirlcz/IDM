package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21707x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.f21706w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21707x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.I2(this.f21706w, this);
    }
}
