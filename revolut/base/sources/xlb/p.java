package xlb;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.c {
    public List u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e f306994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f306995x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.f306994w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f306995x |= Integer.MIN_VALUE;
        return this.f306994w.L2(this, null, false);
    }
}
