package kic;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.details.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184210w |= Integer.MIN_VALUE;
        return com.revolut.feature.rewards.impl.ui.details.flow.b.K2(this.v, this);
    }
}
