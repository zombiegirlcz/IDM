package szh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.move_money.MoveMoneyContract$MoveMoneyResultPayload;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public CryptoOrderDraft u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f266813w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public OrderQuote f266814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AccountWrapper f266815y;
    public MoveMoneyContract$MoveMoneyResultPayload z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.b3(null, this);
    }
}
