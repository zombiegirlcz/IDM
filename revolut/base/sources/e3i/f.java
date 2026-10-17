package e3i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ TPSLAmountController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TPSLAmountController tPSLAmountController, Continuation continuation) {
        super(2, continuation);
        this.u = tPSLAmountController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        int i;
        int i2;
        y yVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.u.k3();
        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = sVar.o;
        k inputError = ((j) ((j2) sVar.f122321x.f22677a).getValue()).f122302h;
        if (inputError != null) {
            BigDecimal percentage = sVar.I2(inputError);
            if (tPSLAmountControllerContract$InputData.i == r0i.c.TP_SL) {
                Intrinsics.h(percentage);
                h3i.d dVar = sVar.f122318s;
                int i3 = r.f122313c[tPSLAmountControllerContract$InputData.f96977a.ordinal()];
                if (i3 == 1) {
                    int i5 = r.f122312b[inputError.ordinal()];
                    if (i5 == 1) {
                        ((h3i.e) dVar).getClass();
                        Intrinsics.checkNotNullParameter(percentage, "percentage");
                        yVar = h3i.e.a(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_errors_take_profit_exceeds_limit, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_price_entry_bottom_sheet_take_profit_subtitle_exceeds_limit, zhm.u.c((percentage.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : percentage.stripTrailingZeros()).toPlainString()), null, 12));
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((h3i.e) dVar).getClass();
                        Intrinsics.checkNotNullParameter(percentage, "percentage");
                        yVar = h3i.e.a(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_errors_take_profit_below_minimum, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_price_entry_bottom_sheet_take_profit_subtitle_below_minimum, zhm.u.c((percentage.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : percentage.stripTrailingZeros()).toPlainString()), null, 12));
                    }
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = r.f122312b[inputError.ordinal()];
                    if (i6 == 1) {
                        ((h3i.e) dVar).getClass();
                        Intrinsics.checkNotNullParameter(percentage, "percentage");
                        yVar = h3i.e.a(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_errors_stop_loss_exceeds_limit, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_price_entry_bottom_sheet_stop_loss_subtitle_exceeds_limit, zhm.u.c((percentage.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : percentage.stripTrailingZeros()).toPlainString()), null, 12));
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((h3i.e) dVar).getClass();
                        Intrinsics.checkNotNullParameter(percentage, "percentage");
                        yVar = h3i.e.a(new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_errors_stop_loss_below_minimum, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_price_entry_bottom_sheet_stop_loss_subtitle_below_minimum, zhm.u.c((percentage.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : percentage.stripTrailingZeros()).toPlainString()), null, 12));
                    }
                }
            } else {
                h3i.a aVar2 = sVar.f122319t;
                BigDecimal percentage2 = sVar.I2(inputError);
                Intrinsics.checkNotNullExpressionValue(percentage2, "getErrorPercentage(...)");
                wd6.e exchangeMode = tPSLAmountControllerContract$InputData.f96982j;
                r0i.c orderType = tPSLAmountControllerContract$InputData.i;
                xi0.b currency = tPSLAmountControllerContract$InputData.d;
                ((h3i.c) aVar2).getClass();
                Intrinsics.checkNotNullParameter(inputError, "inputError");
                Intrinsics.checkNotNullParameter(percentage2, "percentage");
                Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                Intrinsics.checkNotNullParameter(currency, "currency");
                int i21 = h3i.b.f149133a[orderType.ordinal()];
                if (i21 == 1) {
                    z = false;
                } else {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException(("Wrong order type: " + orderType + " is not supported by StopLimitErrorDialogProviderImpl").toString());
                    }
                    z = true;
                }
                TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.fx_orders_settings_stop_price, null, null, 14) : new TextLocalisedClause(R$string.fx_orders_settings_limit_price, null, null, 14);
                int[] iArr = h3i.b.f149134b;
                int i22 = iArr[inputError.ordinal()];
                if (i22 == 1) {
                    i = R$string.fx_orders_take_profit_stop_loss_errors_take_profit_exceeds_limit;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.fx_orders_take_profit_stop_loss_errors_take_profit_below_minimum;
                }
                int i32 = h3i.b.f149135c[exchangeMode.ordinal()];
                if (i32 == 1) {
                    int i33 = iArr[inputError.ordinal()];
                    if (i33 == 1) {
                        i2 = z ? R$string.fx_orders_price_entry_errors_exceeds_limits_upper_limit_message : R$string.fx_orders_price_entry_errors_exceeds_limits_lower_limit_message;
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = z ? R$string.fx_orders_price_entry_errors_below_minimum_lower_limit_message : R$string.fx_orders_price_entry_errors_below_minimum_upper_limit_message;
                    }
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i43 = iArr[inputError.ordinal()];
                    if (i43 == 1) {
                        i2 = z ? R$string.fx_orders_price_entry_errors_exceeds_limits_lower_limit_message : R$string.fx_orders_price_entry_errors_exceeds_limits_upper_limit_message;
                    } else {
                        if (i43 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = z ? R$string.fx_orders_price_entry_errors_below_minimum_upper_limit_message : R$string.fx_orders_price_entry_errors_below_minimum_lower_limit_message;
                    }
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
                String plainString = (percentage2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : percentage2.stripTrailingZeros()).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, zhm.v.k(textLocalisedClause, new TextClause(plainString, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14);
                int i59 = R$attr.uikit_dp16;
                yVar = new y(zhm.u.c(new LargeActionButtonDelegate.Model("LIMIT_EXCEEDED_DIALOG_BUTTON_ID", defaultFilledButton, null, textLocalisedClause4, false, null, null, i59, R$attr.uikit_dp24, i59, i59, 496)), new rp0.t(textLocalisedClause2, textLocalisedClause3, null, 28), null, null, null, null, 1020);
            }
            sVar.f122317r.x(yVar);
        }
        return Unit.f186387a;
    }
}
