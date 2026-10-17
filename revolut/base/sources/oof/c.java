package oof;

import tof.r1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public int A;
    public r1 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f227097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f227098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f227099y;
    public final /* synthetic */ com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c cVar, gim.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f227099y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, null, this);
    }
}
