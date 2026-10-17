package x7i;

import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.c {
    public OrderMode.Threshold u;
    public OrderQuote v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f303242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f303243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f303244y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f303243x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f303242w = obj2;
        this.f303244y |= Integer.MIN_VALUE;
        return this.f303243x.a(null, null, this);
    }
}
