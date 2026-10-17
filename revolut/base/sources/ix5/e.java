package ix5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.c, px5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoTradeFlowContract$InputData f169359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f169360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f169361c = this;
    public final e4m.e d = e4m.b.b(new if2.g(4));

    public e(d dVar, CryptoTradeFlowContract$InputData cryptoTradeFlowContract$InputData) {
        this.f169360b = dVar;
        this.f169359a = cryptoTradeFlowContract$InputData;
    }

    @Override // px5.b
    public final px5.a b() {
        return new a(this.f169360b, this.f169361c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
