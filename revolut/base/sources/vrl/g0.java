package vrl;

import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f291634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4l.a f291635c;

    public /* synthetic */ g0(l0 l0Var, l4l.a aVar, int i) {
        this.f291633a = i;
        this.f291634b = l0Var;
        this.f291635c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f291633a) {
            case 0:
                Optional accountPocketsOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(accountPocketsOptional, "accountPocketsOptional");
                if (!accountPocketsOptional.isPresent()) {
                    return zi0.c.i(Optional.empty());
                }
                Object obj3 = accountPocketsOptional.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                Pair pair = (Pair) obj3;
                TradingAccount tradingAccount = (TradingAccount) pair.f186385a;
                List list = (List) pair.f186386b;
                l0 l0Var = this.f291634b;
                return nim.a.v(ybl.l.d(l0Var.f), new sc7.b(tradingAccount, l0Var, this.f291635c, list, 22));
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair2.f186386b;
                return Optional.of(new xdf.h(this.f291634b.f291651g.h(n2l.b.f211584a, tradingLegalEntityInformation.f105106a, null), this.f291635c, list2));
        }
    }
}
