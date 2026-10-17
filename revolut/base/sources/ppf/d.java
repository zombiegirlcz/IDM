package ppf;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.sa;
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
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ak0;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import prf.g;
import qv0.i;
import yof.k;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements k {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f238602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f238603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f238604c;
    public static final int d;
    public static final int e;

    public static final class a {
        private a() {
        }
    }

    static {
        int i = R$drawable.uikit_icn_24_pencil;
        f238602a = i;
        f238603b = R$drawable.uikit_icn_24_plus;
        int i2 = R$attr.uikit_colorAccent;
        f238604c = i2;
        d = i;
        e = i2;
    }

    public final sa b(boolean z) {
        if (z) {
            return null;
        }
        return new sa("ID_TRANSFER_REVIEW_APP_FRAUD_WARNING", (Clause) new TextLocalisedClause(R$string.transfer_app_fraud_warning_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transfer_app_fraud_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
    }

    public final TextDelegate.Model c(g countryData, String str) {
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        if (t1.q(countryData)) {
            return d();
        }
        if (str != null) {
            return f(str);
        }
        return null;
    }

    public final TextDelegate.Model d() {
        return new TextDelegate.Model("ID_TRANSFER_REVIEW_DISCLAIMER_US", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.transfer_disclaimer_us_text, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }

    public final List e() {
        gu guVar = new gu("ID_TRANSFER_REVIEW_LOADING_ITEM", R$attr.uikit_dp24, R$attr.uikit_dp0, 24);
        nb0 nb0Var = pb0.Companion;
        pb0[] elements = {nb0.b(nb0Var, "ID_TRANSFER_REVIEW_LOADING_ITEM", false, 0, false, 30), nb0.b(nb0Var, "ID_TRANSFER_REVIEW_LOADING_ITEM", false, 0, false, 30), nb0.b(nb0Var, "ID_TRANSFER_REVIEW_LOADING_ITEM", false, 0, false, 30)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return i2b.a.q(guVar, listL);
    }

    public final TextDelegate.Model f(String quoteDisclaimerText) {
        Intrinsics.checkNotNullParameter(quoteDisclaimerText, "quoteDisclaimerText");
        return new TextDelegate.Model("ID_TRANSFER_REVIEW_QUOTE_DISCLAIMER", new TextClause(quoteDisclaimerText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }

    public final i g(Clause label, String str, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        int i = f238604c;
        if (str == null || d0.W(str)) {
            return new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_REFERENCE", label, 0, z ? new ResourceImage(f238603b, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, new TextLocalisedClause(R.string.common_action_add, null, null, 14), false, false, null, null, 0, 0, 32736);
        }
        return new CellDetailsNoteDelegate.Model("ID_TRANSFER_REVIEW_REFERENCE", label, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, z ? new ResourceImage(f238602a, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, z ? new TextLocalisedClause(R.string.common_action_edit, null, null, 14) : null, null, null, null, 0, 130676);
    }

    public final List h(TransferScheduleData scheduleData) {
        CellDetailsActionDelegate.Model model;
        CellDetailsActionDelegate.Model model2;
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        long j2 = scheduleData.f104285a;
        CellDetailsActionDelegate.Model model3 = null;
        int i = e;
        if (j2 != 0) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_field_title_schedule_date, null, null, 14);
            TimeClause.Format.INSTANCE.getClass();
            model = new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_DATE", textLocalisedClause, 0, new ResourceImage(d, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12), false, false, null, null, 0, 0, 32736);
        } else {
            model = null;
        }
        TransferScheduleEndsOn transferScheduleEndsOn = scheduleData.f104287c;
        if (transferScheduleEndsOn instanceof TransferScheduleEndsOn.Never) {
            model2 = null;
        } else {
            model2 = new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_END_DATE", new TextLocalisedClause(com.revolut.feature.transfer.core.api.R$string.transfer_schedule_ends_on_title, null, null, 14), 0, new ResourceImage(d, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), epf.b.d(transferScheduleEndsOn), false, false, null, null, 0, 0, 32736);
        }
        jli.c cVar = scheduleData.f104286b;
        if (cVar != jli.c.PERIOD_SELECTION_NONE) {
            model3 = new CellDetailsActionDelegate.Model("ID_TRANSFER_REVIEW_SCHEDULED_PERIOD", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_field_title_schedule_recurring_mode, null, null, 14), 0, new ResourceImage(d, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246), epf.b.e(cVar), false, false, null, null, 0, 0, 32736);
        }
        CellDetailsActionDelegate.Model[] elements = {model, model2, model3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final CellDetailsSwitcherDelegate.Model i(TransferTrustData trustData) {
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        if (!com.revolut.feature.transfer.models.transfer.a.a(trustData.f92305b)) {
            return null;
        }
        CellDetailsSwitcherDelegate.Model model = new CellDetailsSwitcherDelegate.Model("ID_TRANSFER_TRUST", new TextLocalisedClause(R$string.transfer_trust_widget_title, null, null, 14), trustData.f92306c, true, R$drawable.uikit_icn_16_info_outline, null, null, null, 4064);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
