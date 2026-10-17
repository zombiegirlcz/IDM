package rfa;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.post_activation.impl.ui.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f253743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.post_activation.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f253743w |= Integer.MIN_VALUE;
        return com.revolut.feature.post_activation.impl.ui.flow.a.J2(this.v, this);
    }
}
