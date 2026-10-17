package cie;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends gim.c {
    public nie.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24517w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24518x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, gim.c cVar) {
        super(cVar);
        this.f24517w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f24518x |= Integer.MIN_VALUE;
        return com.revolut.feature.tab.accounts.impl.ui.tab.d.I2(this.f24517w, null, this);
    }
}
