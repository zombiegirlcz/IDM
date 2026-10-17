package pc1;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import nii.z;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efc.b f234780a;

    public b(efc.b cardReaderServerErrorMessageProvider) {
        Intrinsics.checkNotNullParameter(cardReaderServerErrorMessageProvider, "cardReaderServerErrorMessageProvider");
        this.f234780a = cardReaderServerErrorMessageProvider;
    }

    public static y0 a(dj0.d amount, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        if (str != null) {
            arrayList.add(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            arrayList.add(new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_send_receipt, null, new Click(30, (Integer) null, (Object) null, "receipt_id", false), 10));
        }
        return new y0(null, new j0((Clause) new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_approved, null, null, 14), (Clause) new CompositeClause(arrayList, null, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_new_payment, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_done, null, null, 14)), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 5);
    }

    public static y0 b() {
        return new y0(null, new z(new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_cancelled, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_cancelled_payment_tip, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_new_payment, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_done, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
    }

    public static y0 c(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return f(new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_card_wait_failed_description, null, null, 14), amount);
    }

    public static y0 e(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return f(new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_reader_diconnected_description, null, null, 14), amount);
    }

    public static y0 f(TextLocalisedClause textLocalisedClause, dj0.d dVar) {
        return new y0(null, new z(new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_failed, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), textLocalisedClause, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
    }

    public static y0 h() {
        return new y0(null, new z(new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_payment_failed_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_result_terminal_update_is_required_description, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_result_terminal_update_is_required_primary_button, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_result_terminal_update_is_required_secondary_button, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
    }

    public static y0 i(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return f(new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_unsupported_card_description, null, null, 14), amount);
    }

    public final y0 d(String str, dj0.d amount, Throwable th10, Custom custom) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_payment_declined, u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8)), null, 12);
        TextLocalisedClause textLocalisedClauseG = g(th10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(textLocalisedClauseG);
        if (str != null) {
            arrayList.add(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            arrayList.add(new TextLocalisedClause(R$string.merchant_card_reader_flow_transaction_send_receipt, null, new Click(30, (Integer) null, (Object) null, "receipt_id", false), 10));
        }
        return new y0(null, new z(textLocalisedClause, new CompositeClause(arrayList, null, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_common_action_cancel, null, null, 14), null, null, true, null, null, null, null, null, null, 32468), false, 5);
    }

    public final TextLocalisedClause g(Throwable th10) {
        ServerError serverError;
        TextLocalisedClause fallbackClause = new TextLocalisedClause(R$string.merchant_card_reader_transaction_flow_event_payment_failed_generic_description, null, null, 14);
        Intrinsics.checkNotNullParameter(fallbackClause, "fallbackClause");
        ServerErrorException serverErrorException = th10 instanceof ServerErrorException ? (ServerErrorException) th10 : null;
        if (serverErrorException != null && (serverError = serverErrorException.f) != null) {
            TextLocalisedClause textLocalisedClauseA = this.f234780a.f125318a.a(serverError.f51362a, "error.api.description.%d");
            if (textLocalisedClauseA != null) {
                return textLocalisedClauseA;
            }
        }
        return fallbackClause;
    }
}
