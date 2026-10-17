package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradingAccount f3614b;

    public /* synthetic */ f1(TradingAccount tradingAccount, int i) {
        this.f3613a = i;
        this.f3614b = tradingAccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f3613a) {
            case 0:
                Map investments = (Map) obj2;
                Intrinsics.checkNotNullParameter(investments, "investments");
                return new Pair(this.f3614b, investments);
            default:
                return new Pair(this.f3614b, (wel.e) obj2);
        }
    }
}
