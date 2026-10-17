package xb9;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f304028w |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a.I2(this.v, this);
    }
}
