package c68;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.c {
    public com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21722x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, gim.c cVar) {
        super(cVar);
        this.f21721w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f21722x |= Integer.MIN_VALUE;
        return this.f21721w.X2(this);
    }
}
