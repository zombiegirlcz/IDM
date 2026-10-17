package vli;

import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lhi.r;
import lhi.s;
import wp5.y;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f290453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f290454b;

    public d(gte.a featureToggleInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f290453a = navigator;
        this.f290454b = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "cryptocurrency-volatility");
    }

    public final FeatureCommand b(String str, jf0.c cVar) {
        s sVar;
        String strE = cVar.e(3);
        String strE2 = cVar.e(2);
        wd6.c cVar2 = wd6.c.CRYPTO_ONLY;
        if (d0.W(strE)) {
            xi0.b.Companion.getClass();
            return gc0.c.f(new CryptoAssetDetailsFeatureConfig.AssetDetails(xi0.a.a(strE2), (BuyFundingCurrencyPrefill) null, 6));
        }
        r rVar = s.Companion;
        Locale locale = Locale.UK;
        String string = v0.a.j(locale, "UK", strE, locale, "toUpperCase(...)");
        rVar.getClass();
        Intrinsics.checkNotNullParameter(string, "string");
        s[] sVarArrValues = s.values();
        int length = sVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                sVar = null;
                break;
            }
            sVar = sVarArrValues[i];
            if (Intrinsics.f(sVar.name(), string)) {
                break;
            }
            i++;
        }
        int i2 = sVar == null ? -1 : c.f290452a[sVar.ordinal()];
        gte.a aVar = this.f290454b;
        if (i2 == 1) {
            xi0.b.Companion.getClass();
            xi0.b bVarA = xi0.a.a(strE2);
            xi0.b bVarA2 = xi0.a.a(str);
            return ((jte.d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(new StartUpPocket.CurrencyAccount(bVarA2), new StartUpPocket.CurrencyAccount(bVarA), null, null, 60), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.Buy(bVarA2, bVarA, null, cVar2, null, null, false, null, 4084));
        }
        if (i2 != 2) {
            xi0.b.Companion.getClass();
            return gc0.c.f(new CryptoAssetDetailsFeatureConfig.AssetDetails(xi0.a.a(strE2), (BuyFundingCurrencyPrefill) null, 6));
        }
        xi0.b.Companion.getClass();
        xi0.b bVarA3 = xi0.a.a(strE2);
        xi0.b bVarA4 = xi0.a.a(str);
        return ((jte.d) aVar).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(new StartUpPocket.CurrencyAccount(bVarA3), new StartUpPocket.CurrencyAccount(bVarA4), null, null, 60), (Set) null, 6), null)) : new FeatureCommand(new ExchangeFeatureConfig.Sell(bVarA3, bVarA4, null, null, cVar2, null, null, 4076));
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(b((String) r0.h("baseCurrency", cVar.d), cVar)), new q06.b(new MainScreenTab("crypto"), null));
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.c(new b7c.b(this, deeplink, (String) r0.h("baseCurrency", deeplink.d), z), 2), new vif.c(new vjk.b(10), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
