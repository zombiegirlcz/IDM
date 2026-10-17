package jsg;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.c {
    public com.revolut.feature.voluntary.offboarding.impl.ui.flow.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.voluntary.offboarding.impl.ui.flow.e f178179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f178180x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.voluntary.offboarding.impl.ui.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.f178179w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f178180x |= Integer.MIN_VALUE;
        return com.revolut.feature.voluntary.offboarding.impl.ui.flow.e.P2(this.f178179w, this);
    }
}
