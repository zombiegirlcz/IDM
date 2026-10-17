package x7i;

import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public boolean A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ l D;
    public int E;
    public MoveMoneyOrderInfo u;
    public OrderQuote v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f303228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f303229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n7i.h f303230y;
    public n7i.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.D = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.C = obj2;
        this.E |= Integer.MIN_VALUE;
        return this.D.c3(null, null, false, null, null, this);
    }
}
