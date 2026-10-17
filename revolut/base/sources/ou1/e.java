package ou1;

import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public BlikFlowContract$Step u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.blik.impl.ui.flow.a f229770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f229771x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.apm.blik.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f229770w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f229771x |= Integer.MIN_VALUE;
        return this.f229770w.Q2(null, this);
    }
}
