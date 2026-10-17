package sw4;

import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public CreditCardWidgetContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f266094w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f266095x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, gim.c cVar) {
        super(cVar);
        this.f266094w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f266095x |= Integer.MIN_VALUE;
        return this.f266094w.k(null, this);
    }
}
