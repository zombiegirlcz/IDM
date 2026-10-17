package o3a;

import gim.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f221712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b bVar, c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f221712w |= Integer.MIN_VALUE;
        return this.v.a(null, null, null, this);
    }
}
