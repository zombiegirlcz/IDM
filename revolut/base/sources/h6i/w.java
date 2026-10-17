package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public Object A;
    public AccountWrapper B;
    public /* synthetic */ Object C;
    public final /* synthetic */ e0 D;
    public int E;
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b6i.j f149732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OrderQuote f149733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public OrderMode f149734y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.D = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return e0.a(this.D, null, null, null, null, null, null, this);
    }
}
