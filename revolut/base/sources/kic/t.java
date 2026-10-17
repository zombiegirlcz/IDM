package kic;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.details.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184215w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184215w |= Integer.MIN_VALUE;
        return this.v.Q2(this);
    }
}
