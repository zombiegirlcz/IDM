package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.c {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21714y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.f21714y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21713x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f21714y.V2(false, this);
    }
}
