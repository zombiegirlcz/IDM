package s54;

import hs3.k;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.banner.a f259921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f259922x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar, gim.c cVar) {
        super(cVar);
        this.f259921w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f259922x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.banner.a.P2(this.f259921w, null, this);
    }
}
