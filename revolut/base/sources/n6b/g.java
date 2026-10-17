package n6b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public CobrandedCardsPlan u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f212763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212764x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f212763w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212764x |= Integer.MIN_VALUE;
        return this.f212763w.a(null, null, this);
    }
}
