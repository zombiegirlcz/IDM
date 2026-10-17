package b77;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.giro.api.R$string;
import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_creditor, null, null, 14);
        FormState formState = domainState.f12923b;
        Set set = domainState.f12924c;
        g gVar = domainState.f12922a;
        Biller.Details details = formState.f74553a.k;
        if (details == null || (str = details.f61152b) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        g gVar2 = g.CREATE;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_CREDITOR_SELECTOR", textClause, textLocalisedClause3, null, false, null, false, null, null, null, null, resourceImage, null, false, null, null, false, gVar == gVar2, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33820680, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_consumer_id, null, null, 14);
        String str2 = formState.f74554b;
        dj0.d dVar = formState.e;
        LocalDate localDate = formState.d;
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_CONSUMER_ID", new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause4, new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_consumer_id_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, set.contains("ID_CONSUMER_ID"), gVar == gVar2, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -393232, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_start_date, null, null, 14);
        long jF = oc.c.F(formState.f74555c);
        TimeClause.Format.DateLong dateLong = TimeClause.Format.DateLong.f57962b;
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("ID_START_DATE", new TimeClause(jF, dateLong, null, null, 12), textLocalisedClause5, null, false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, false, gVar == gVar2, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33820680, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("ID_END_DATE", localDate != null ? new TimeClause(oc.c.F(localDate), dateLong, null, null, 12) : null, new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_end_date, null, null, 14), null, false, null, false, new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_optional, null, null, 14), null, null, null, localDate == null ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(R$drawable.uikit_icn_24_cross_circled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground_30), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, set.contains("ID_END_DATE"), false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33689736, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_single_transaction_limit, null, null, 14);
        TextClause textClause2 = dVar != null ? new TextClause(String.valueOf(dVar.f115082a / cp5.d.k(dVar.f115083b)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        if (dVar != null) {
            TextClause textClause3 = new TextClause(cp5.d.J(dVar.f115083b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(v.k(textClause3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        } else {
            compositeClause = null;
        }
        InputTextDelegate.Model model5 = new InputTextDelegate.Model("ID_SINGLE_TRANSACTION_LIMIT", textClause2, textLocalisedClause6, null, false, new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_form_label_optional, null, null, 14), compositeClause, null, null, null, null, false, null, null, set.contains("ID_SINGLE_TRANSACTION_LIMIT"), false, 2, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539099528, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        List listK = v.k(model, model2, model3, model4, model5);
        boolean zIsEmpty = set.isEmpty();
        int[] iArr = q.f12935a;
        int i = iArr[gVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R.string.common_action_continue, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.giro_direct_debits_edit_direct_debit_action_title, null, null, 14);
        }
        int i2 = iArr[gVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.giro_direct_debits_add_direct_debit_title, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.giro_direct_debits_edit_direct_debit_title, null, null, 14);
        }
        return new k(textLocalisedClause, textLocalisedClause2, listK, zIsEmpty);
    }
}
