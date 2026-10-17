package rcb;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f253248w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f253248w |= Integer.MIN_VALUE;
        return this.v.Z2(null, this);
    }
}
