package l2b;

import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f191734b;

    public /* synthetic */ b(f fVar, int i) {
        this.f191733a = i;
        this.f191734b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f191733a) {
            case 0:
                Boolean isAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isAvailable, "isAvailable");
                boolean zBooleanValue = isAvailable.booleanValue();
                f fVar = this.f191734b;
                if (zBooleanValue) {
                    return d0.m(f.b(new BridgeDestination(new FeatureCommand(((c3b.a) fVar.f191738c).b(new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7))))));
                }
                d0 d0VarH = fVar.h();
                kxj.e eVar = new kxj.e(new l0g.a(fVar, 26), 23);
                d0VarH.getClass();
                i iVar = new i(d0VarH, eVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                Boolean isAvailableToOnboard = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isAvailableToOnboard, "isAvailableToOnboard");
                boolean zBooleanValue2 = isAvailableToOnboard.booleanValue();
                f fVar2 = this.f191734b;
                if (zBooleanValue2) {
                    return fVar2.g(gc0.c.f(((c3b.a) fVar2.f191738c).b(new FinishCommand(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7))));
                }
                d0 d0VarH2 = fVar2.h();
                kxj.e eVar2 = new kxj.e(new b(fVar2, 3), 27);
                d0VarH2.getClass();
                pfm.a aVar = new pfm.a(d0VarH2, eVar2, 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 2:
                od0.i optionalAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount, "optionalAccount");
                String strC = f.c((TradingAccount) optionalAccount.f224257a);
                return f.b(strC != null ? new BridgeDestination(b3f.b.b(this.f191734b.d, new TransferSubjectId.Portfolio(strC), WealthAccountType.MARGIN, null, null, 12)) : null);
            case 3:
                od0.i optionalAccount2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount2, "optionalAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalAccount2.f224257a;
                f fVar3 = this.f191734b;
                if (tradingAccount == null || !com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                    return fVar3.g(null);
                }
                String strD = f.d(tradingAccount);
                return fVar3.g(strD.length() > 0 ? new FeatureCommand(new CfdTradingFeatureConfig.HomeScreen(strD, null)) : null);
            default:
                od0.i optionalAccount3 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalAccount3, "optionalAccount");
                TradingAccount tradingAccount2 = (TradingAccount) optionalAccount3.f224257a;
                f fVar4 = this.f191734b;
                if (tradingAccount2 == null || !com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount2)) {
                    return fVar4.g(null);
                }
                String strD2 = f.d(tradingAccount2);
                return fVar4.g(strD2.length() > 0 ? b3f.b.b(fVar4.d, new TransferSubjectId.Portfolio(strD2), WealthAccountType.MARGIN, null, null, 12) : null);
        }
    }
}
