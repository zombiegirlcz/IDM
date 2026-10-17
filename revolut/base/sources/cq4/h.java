package cq4;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public BackendFlowDestination u;
    public FeatureCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f107999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a f108000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f108001y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar, gim.c cVar) {
        super(cVar);
        this.f108000x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f107999w = obj2;
        this.f108001y |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a.I2(this.f108000x, null, this);
    }
}
