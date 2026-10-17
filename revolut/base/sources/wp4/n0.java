package wp4;

import aw0.ka;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 implements jki.p {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3i.b f299082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vj4.b f299083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f90.b f299084c;

    public n0(n3i.b externalCardsMapper, vj4.b autopaySourceMapper, f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        Intrinsics.checkNotNullParameter(autopaySourceMapper, "autopaySourceMapper");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f299082a = externalCardsMapper;
        this.f299083b = autopaySourceMapper;
        this.f299084c = pluralFormatter;
    }

    public static ResourceImage b() {
        return new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static Clause c(CreditCardAutopayPayment.PaymentAmount paymentAmount) {
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.StatementBalance) {
            return new TextLocalisedClause(R$string.credit_schedule_payment_set_amount_statement_balance, null, null, 14);
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.MinRepayment) {
            return new TextLocalisedClause(R$string.credit_schedule_payment_set_amount_minimum_amount, null, null, 14);
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Fixed) {
            return sx4.f.b(3, null, null, ((CreditCardAutopayPayment.PaymentAmount.Fixed) paymentAmount).f70712a);
        }
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported) {
            throw new IllegalStateException("Unsupported payment amount");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CellDetailsActionDelegate.Model d(CreditCardAutopayPayment.PaymentAmount paymentAmount, boolean z) {
        if (paymentAmount instanceof CreditCardAutopayPayment.PaymentAmount.Unsupported) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_amount, null, null, 14);
        if (!z) {
            return new CellDetailsActionDelegate.Model("id_set_amount", textLocalisedClause, 0, null, c(paymentAmount), null, false, false, null, null, null, 0, 0, 0, 0, 4194148);
        }
        return new CellDetailsActionDelegate.Model("id_set_amount", textLocalisedClause, 0, b(), c(paymentAmount), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static CellDetailsDelegate.Model e(Instant instant) {
        if (instant == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("id_cell_date_info_action", new t0((Clause) new TextLocalisedClause(R$string.credit_card_autopay_payment_details_next_payment, null, null, 14), (Image) null, 0, false, 30), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static CellDetailsActionDelegate.Model g() {
        return new CellDetailsActionDelegate.Model("id_setup_back_up_card", new TextLocalisedClause(R$string.credit_management_backup_card, null, null, 14), R$drawable.uikit_icn_16_info_outline, new ResourceImage(R$drawable.uikit_icn_24_plus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.credit_management_set_up, null, null, 14), false, false, null, null, 0, 0, 32736);
    }

    public static CellDetailsSwitcherDelegate.Model h(boolean z, nb5.d dVar) {
        CellDetailsSwitcherDelegate.Model model = new CellDetailsSwitcherDelegate.Model("id_switch_auto_pay", new TextLocalisedClause(R$string.credit_management_auto_pay, null, null, 14), dVar == nb5.d.ACTIVE, true, 0, "AutoPaySwitcher", null, null, 4048);
        if (z) {
            return model;
        }
        return null;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new s((List) iii.c.f(domainState.f299048a, new wnc.x(25), new wm9.k(11), new j0(this, 0)));
    }

    public final CellDetailsActionDelegate.Model f(CreditCardAutopayPayment.PaymentDay paymentDay, Instant instant) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_auto_pay_management_day, null, null, 14);
        if (!paymentDay.f70718c) {
            return new CellDetailsActionDelegate.Model("id_set_date", textLocalisedClause, 0, null, i(paymentDay, instant), null, false, false, null, null, null, 0, 0, 0, 0, 4194148);
        }
        return new CellDetailsActionDelegate.Model("id_set_date", textLocalisedClause, 0, b(), i(paymentDay, instant), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public final Clause i(CreditCardAutopayPayment.PaymentDay paymentDay, Instant instant) {
        nb5.b bVar = paymentDay.f70716a;
        int i = paymentDay.f70717b;
        int i2 = m0.f299080c[bVar.ordinal()];
        if (i2 == 1) {
            return new TextClause(this.f299084c.a("{0,ordinal}", Integer.valueOf(i)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (i2 == 2) {
            return (i != 0 || instant == null) ? new TextLocalisedClause(R$string.credit_card_direct_debit_confirmation_item_days_before_due_date, zhm.u.c(Integer.valueOf(i)), null, 12) : new TextLocalisedClause(R$string.credit_card_auto_pay_management_day_statement_due_date, zhm.u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayOfMonth(true), null, null, 12)), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
