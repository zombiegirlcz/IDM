package ag4;

import cv3.s;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b f4784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4785x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b bVar, gim.c cVar) {
        super(cVar);
        this.f4784w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f4785x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.b.P2(this.f4784w, null, this);
    }
}
