package vgf;

import com.revolut.feature.unified_transactions.models.UnifiedTransaction;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends gim.c {
    public UnifiedTransaction u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289069x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, gim.c cVar) {
        super(cVar);
        this.f289068w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289069x |= Integer.MIN_VALUE;
        return com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a.I2(this.f289068w, null, this);
    }
}
