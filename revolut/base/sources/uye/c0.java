package uye;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f284264x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, gim.c cVar) {
        super(cVar);
        this.f284263w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f284264x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup.flow.i.K2(this.f284263w, null, this);
    }
}
