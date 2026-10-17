package zyh;

import android.os.Parcelable;
import aw0.e;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import bw0.m;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit;
import com.revolut.feature_crypto_order_flow.api.navigation.AccountBalanceLimitBottomSheetControllerProvider$InputData;
import com.revolut.feature_crypto_order_flow.impl.exchange.mappers.CryptoExchangeAmountInputMapper$HintDialogReason;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import gim.i;
import grl.k9;
import ix0.d0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yji.n;
import zhm.u;
import zhm.v;
import zrd.q;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ vzh.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vzh.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CryptoExchangeAmountInputMapper$HintDialogReason reason;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i;
        int i2;
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.e;
        m mVar = model.e;
        Object obj3 = mVar != null ? mVar.e : null;
        d dVar = cVar.f326463l;
        bzh.b bVar = obj3 instanceof bzh.b ? (bzh.b) obj3 : null;
        if (bVar != null && (reason = bVar.f20028a) != null) {
            boolean z = reason instanceof CryptoExchangeAmountInputMapper$HintDialogReason.AccountBalanceLimitError;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                n.P2(cVar, new AccountBalanceLimitBottomSheetController(new AccountBalanceLimitBottomSheetControllerProvider$InputData(((CryptoExchangeAmountInputMapper$HintDialogReason.AccountBalanceLimitError) reason).f96758a)), bottom_dialog, null, 2);
            } else {
                boolean z3 = reason instanceof CryptoExchangeAmountInputMapper$HintDialogReason.CryptoTradeUsageLimitError;
                if (z3) {
                    azh.a aVar2 = cVar.f326464m;
                    CryptoExchangeContract$AmountInputMapper$Params$CryptoTradeUsageLimit usageLimit = ((CryptoExchangeAmountInputMapper$HintDialogReason.CryptoTradeUsageLimitError) reason).f96760a;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(usageLimit, "usageLimit");
                    kyh.a aVar3 = usageLimit.f96680a;
                    int[] iArr = azh.b.f11459a;
                    int i3 = iArr[aVar3.ordinal()];
                    if (i3 == 1) {
                        i = R$string.crypto_defi_swap_amount_input_error_exceeds_limit_daily_title;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.crypto_defi_swap_amount_input_error_exceeds_limit_monthly_title;
                    }
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i, null, null, 14);
                    int i5 = iArr[usageLimit.f96680a.ordinal()];
                    if (i5 == 1) {
                        i2 = R$string.crypto_defi_swap_amount_input_error_exceeds_limit_daily_limit;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.crypto_defi_swap_amount_input_error_exceeds_limit_monthly_limit;
                    }
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i2, null, null, 14);
                    ej0.b bVar2 = usageLimit.e;
                    lw0.a aVar4 = new lw0.a(textLocalisedClause3, null, null, null, false, 30);
                    e eVar = new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_defi_swap_amount_input_error_exceeds_limit_add_maximum, u.c(d0.a(bVar2.f126704b, null)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                    t0 t0Var = new t0((Clause) textLocalisedClause4, (Image) null, 0, false, 30);
                    dj0.d dVar2 = usageLimit.f96681b;
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                    o9 o9Var = o9.NON_SENSITIVE;
                    List listK = v.k(new eii.b(new CellDetailsDelegate.Model("CRYPTO_TRADE_USAGE_LIMIT_USAGE_ROW", t0Var, new CompositeClause(v.k(new MoneyClause(dVar2, defaults, null, o9Var, 4), new MoneyClause(usageLimit.f96682c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712)), new eii.b(new CellDetailsDelegate.Model("CRYPTO_TRADE_USAGE_LIMIT_MAXIMUM_TRADE_ROW", new t0((Clause) new TextLocalisedClause(R$string.crypto_defi_swap_amount_input_error_exceeds_limit_maximum_to_add, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(usageLimit.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), u5l.a.e(bVar2, null), null, null, null, 0, null, false, false, null, null, 30704)));
                    k9 k9Var = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    cVar.N2(new RowActionsBottomSheetController(new eii.c(aVar4, eVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null)), bottom_dialog, new q(cVar, 21));
                } else {
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    boolean z4 = reason instanceof CryptoExchangeAmountInputMapper$HintDialogReason.CryptoLowerLimitError;
                    if (z4) {
                        textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_marketorder_crypto_limit_lower_dialog_title, null, null, 14);
                    } else {
                        if (!(reason instanceof CryptoExchangeAmountInputMapper$HintDialogReason.CryptoUpperLimitError)) {
                            if (z) {
                                throw new IllegalStateException("AccountBalanceLimitError is handled by AccountBalanceLimitBottomSheetController");
                            }
                            if (z3) {
                                throw new IllegalStateException("CryptoTradeUsageLimitError is handled by RowActionsBottomSheetController");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_title, null, null, 14);
                    }
                    TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
                    Intrinsics.checkNotNullParameter(reason, "reason");
                    if (z4) {
                        textLocalisedClause2 = new TextLocalisedClause(R$string.cryptobuysell_marketorder_crypto_limit_lower_dialog_message, u.c(dVar.a(((CryptoExchangeAmountInputMapper$HintDialogReason.CryptoLowerLimitError) reason).f96759a)), null, 12);
                    } else {
                        if (!(reason instanceof CryptoExchangeAmountInputMapper$HintDialogReason.CryptoUpperLimitError)) {
                            if (z) {
                                throw new IllegalStateException("AccountBalanceLimitError is handled by AccountBalanceLimitBottomSheetController");
                            }
                            if (z3) {
                                throw new IllegalStateException("CryptoTradeUsageLimitError is handled by RowActionsBottomSheetController");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(R$string.cryptobuysell_marketorder_crypto_limit_higher_dialog_message, u.c(dVar.a(((CryptoExchangeAmountInputMapper$HintDialogReason.CryptoUpperLimitError) reason).f96761a)), null, 12);
                    }
                    lw0.a aVar5 = new lw0.a(textLocalisedClause5, textLocalisedClause2, null, null, false, 28);
                    e eVar2 = new e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    k9 k9Var2 = k9.Crypto;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    n.P2(cVar, new ActionsBottomSheetController(new dii.a(aVar5, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24)), bottom_dialog, null, 2);
                }
            }
        }
        return Unit.f186387a;
    }
}
