package pze;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public zve.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b f240994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f240995x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, gim.c cVar) {
        super(cVar);
        this.f240994w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f240995x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.J2(this.f240994w, null, this);
    }
}
