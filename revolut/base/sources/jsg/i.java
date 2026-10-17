package jsg;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f178178w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f178178w |= Integer.MIN_VALUE;
        return com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.O2(this.v, this);
    }
}
