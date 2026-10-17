package o3b;

import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 extends gim.c {
    public r2b.a u;
    public TradingOrderExitStrategies v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f221743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0 f221744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f221745y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.f221744x = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f221743w = obj2;
        this.f221745y |= Integer.MIN_VALUE;
        return n0.I2(this.f221744x, null, null, this);
    }
}
