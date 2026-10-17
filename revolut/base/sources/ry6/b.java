package ry6;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import sr6.l;
import yp0.r;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public b(qy6.b clauseFactory) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
    }

    public static List a(Integer num, Integer num2) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_LIMITS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_recurring_section_end_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LIST_ID_LIMITS_INPUT_SELECTED_LIMIT_OPTION", new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_picker_end_after_number_of_invoices_short, null, null, 14), null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_LIMITS_INPUT_TEXT_AFTER", new TextClause(strValueOf, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, num2 != null ? new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_schedule_recurring_input_end_already_sent, num2, (List) null, (Style) null, 28) : null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, false, n.w(6), false, false, false, null, null, 0, -1075839116, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputDualTextDelegate.Model model3 = new InputDualTextDelegate.Model("LIST_ID_LIMITS_INPUT_DUAL_INPUT", modelA, model2, new InputDualTextView.b.a(0), 40);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        return v.k(model, model3);
    }

    public static List b() {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_LIMITS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_recurring_section_end_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LIST_ID_LIMITS_INPUT_SELECTED_LIMIT_OPTION", new TextLocalisedClause(R$string.freelancer_sale_invoice_schedule_recurring_picker_end_never, null, null, 14), null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return v.k(model, modelA);
    }

    public final List c(Integer num, l period) {
        Intrinsics.checkNotNullParameter(period, "period");
        String strValueOf = null;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("LIST_ID_RECURRING_PERIOD_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_settings_payment_schedules_recurring_section_repeat_every_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        if (num != null) {
            strValueOf = String.valueOf(num.intValue());
        }
        if (strValueOf == null) {
            strValueOf = "";
        }
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_RECURRING_PERIOD_INPUT_TEXT_INTERVAL", new TextClause(strValueOf, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, false, n.w(6), false, false, false, null, null, 0, -1075838988, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("LIST_ID_RECURRING_PERIOD_INPUT_TEXT_PERIOD", qy6.b.a(period), null, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -4, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        InputDualTextDelegate.Model model3 = new InputDualTextDelegate.Model("LIST_ID_RECURRING_PERIOD_INPUT_TEXT", model2, modelA, new InputDualTextView.b.a(0), 40);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        return v.k(model, model3);
    }
}
