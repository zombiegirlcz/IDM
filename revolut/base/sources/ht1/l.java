package ht1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import hu1.j0;
import ip0.zj;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.n;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155217a;

    public /* synthetic */ l(int i) {
        this.f155217a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f155217a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30));
                zj zjVar = zj.REGULAR;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.blik_home_section_code_error_description, null, null, 14);
                List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_retry, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.blik_home_section_code_error_action, null, null, 14));
                m70.a.t(t0.f186434a);
                List listC = u.c(new FullScreenStateDelegate.Model("BLIK_CODE_ERROR_LIST_ID", textLocalisedClause, null, regular, zjVar, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, false, 0, 0, 32708));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                Throwable th10 = (Throwable) obj2;
                if (((StakingPocket) obj3) == null) {
                    return th10;
                }
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 7:
                Throwable error = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (str == null) {
                    return error;
                }
                return null;
            case 8:
                Throwable error2 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (tradingLegalEntityInformation == null) {
                    return error2;
                }
                return null;
            case 9:
                Throwable error3 = (Throwable) obj2;
                InstrumentTicker instrumentTicker = (InstrumentTicker) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (instrumentTicker == null) {
                    return error3;
                }
                return null;
            case 10:
                Throwable error4 = (Throwable) obj2;
                OrderQuoteResult orderQuoteResult = (OrderQuoteResult) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (orderQuoteResult == null) {
                    return error4;
                }
                return null;
            case 11:
                Throwable error5 = (Throwable) obj2;
                AutoTopUpStatus autoTopUpStatus = (AutoTopUpStatus) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (autoTopUpStatus == null) {
                    return error5;
                }
                return null;
            case 12:
                Throwable error6 = (Throwable) obj2;
                Optional optional = (Optional) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (optional == null) {
                    return error6;
                }
                return null;
            case 13:
                Throwable error7 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (nVar == null) {
                    return error7;
                }
                return null;
            case 14:
                Throwable th11 = (Throwable) obj2;
                if (((TradingLegalEntityInformation) obj3) == null) {
                    return th11;
                }
                return null;
            case 15:
                Throwable th12 = (Throwable) obj2;
                if (((FiatExchangeOrderQuoteResult) obj3) == null) {
                    return th12;
                }
                return null;
            case 16:
                Throwable th13 = (Throwable) obj2;
                if (((TradingLegalEntityInformation) obj3) == null) {
                    return th13;
                }
                return null;
            case 17:
                Throwable th14 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th14;
                }
                return null;
            case 18:
                Throwable th15 = (Throwable) obj2;
                if (((OrderQuoteResult) obj3) == null) {
                    return th15;
                }
                return null;
            case 19:
                Throwable th16 = (Throwable) obj2;
                if (((Optional) obj3) == null) {
                    return th16;
                }
                return null;
            case 20:
                Throwable th17 = (Throwable) obj2;
                if (((FreeTradesIncentiveContract$FreeTradesLimit) obj3) == null) {
                    return th17;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((hve.a) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((StoredMethod) obj3, "<unused var>");
                return Unit.f186387a;
            case 22:
                Throwable error8 = (Throwable) obj2;
                au3.m mVar = (au3.m) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (mVar == null) {
                    return error8;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Throwable error9 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list == null) {
                    return error9;
                }
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Throwable error10 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list2 == null) {
                    return error10;
                }
                return null;
            default:
                Throwable error11 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list3 == null) {
                    return error11;
                }
                return null;
        }
    }

    public /* synthetic */ l(j0 j0Var) {
        this.f155217a = 2;
    }
}
