package e6b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.CobrandedCardsCardOrderContext;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public CobrandedCardsCardOrderContext u;
    public CobrandedCardsCardConfiguration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f122965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r10.f f122966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f122967y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r10.f fVar, gim.c cVar) {
        super(cVar);
        this.f122966x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f122965w = obj2;
        this.f122967y |= Integer.MIN_VALUE;
        return this.f122966x.x0((CobrandedCardsCardOrderContext) null, (CobrandedCardsCardConfiguration) null, this);
    }
}
