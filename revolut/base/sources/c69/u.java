package c69;

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
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CompositeClause compositeClause;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        DirectDebitData directDebitData = domainState.f21729b;
        Biller biller = directDebitData.f78095a;
        h hVar = domainState.f21728a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_institution, null, null, 14);
        TextClause textClause = new TextClause(com.revolut.feature.apm.bills.billers.api.model.a.b(biller), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        h hVar2 = h.CREATE;
        InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INSTITUTE", textClause, textLocalisedClause, null, false, null, false, null, null, null, null, hVar == hVar2 ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, null, false, null, null, false, hVar == hVar2, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33820680, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("LIST_ID_REFERENCE", new TextClause(directDebitData.f78096b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_reference, null, null, 14), null, false, null, false, new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_optional, null, null, 14), null, null, null, null, null, false, null, null, false, hVar == hVar2, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -262280, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LocalDate localDate = directDebitData.d;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_end_date, null, null, 14);
        TimeClause timeClause = localDate != null ? new TimeClause(oc.c.F(localDate), TimeClause.Format.DateLong.f57962b, null, null, 12) : null;
        boolean z = localDate == null;
        h hVar3 = h.ADJUST_LIMITS;
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("LIST_ID_END_DATE", timeClause, textLocalisedClause2, null, false, null, false, new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_optional, null, null, 14), null, null, null, hVar == hVar3 ? null : z ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(R$drawable.uikit_icn_24_cross_circled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground_30), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, hVar != hVar3, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33820808, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        dj0.d dVar = directDebitData.e;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_single_transaction_limit, null, null, 14);
        TextClause textClause2 = dVar != null ? new TextClause(String.valueOf(dVar.f115082a / cp5.d.k(dVar.f115083b)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        if (dVar != null) {
            TextClause textClause3 = new TextClause(cp5.d.J(dVar.f115083b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(zhm.v.k(textClause3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        } else {
            compositeClause = null;
        }
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("LIST_ID_SINGLE_TXN_LIMIT", textClause2, textLocalisedClause3, null, false, new TextLocalisedClause(R$string.masav_direct_debits_add_direct_debit_optional, null, null, 14), compositeClause, null, null, null, null, false, null, null, false, false, 2, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -538968456, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        return new t(zhm.v.k(model, model2, model3, model4));
    }
}
