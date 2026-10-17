package p0l;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static String b(pxk.b bVar) {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(bVar.f240627a, " ", bVar.f240628b);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listO;
        LocalDate localDate;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_header_description, null, null, 14);
        pxk.b bVar = domainState.f231552a;
        do3.n nVar = domainState.f231553b;
        if (bVar == null || nVar == null || (localDate = nVar.f116413j) == null) {
            if (nVar != null && nVar.f116413j == null) {
                IllegalStateException illegalStateException = new IllegalStateException("birthdayDate is null");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            List listC = zhm.u.c(new pb0("LOADING_APPLICANT_CELL"));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            List listK = zhm.v.k(new t10("LOADING_DOCUMENT_TITLE", p10.f165755a), new pb0("LOADING_DOCUMENT_FIRST_SECTION"), new pb0("LOADING_DOCUMENT_SECOND_SECTION"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            listO = i2b.a.o(listC, listK);
        } else {
            List listC2 = zhm.u.c(new RowDelegate.Model("APPLICANT_CELL", new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, bVar.f240629c, (String) null, b(bVar), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4055), null, null, false, null, false, 62), new TextClause(b(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(bVar.f240629c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_applicant_cell, null, null, 14), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            pxk.b bVar2 = domainState.f231552a;
            TextClause textClause = new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(nVar.f116410c, " ", nVar.e), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            long jLongValue = Long.valueOf(jli.b.b(localDate)).longValue();
            TimeClause.Format.DateEditable dateEditable = TimeClause.Format.DateEditable.f57960b;
            List listK2 = zhm.v.k(new PlainTextDelegate.Model("DOCUMENT_TITLE", (Clause) null, (Clause) new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_document_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), new ListCellDelegate.Model("DOCUMENT_FIRST_SECTION", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_document_first_section, zhm.v.k(new CompositeClause(zhm.v.k(textClause, textClause2, new TimeClause(jLongValue, dateEditable, null, null, 12)), null, null, null, 14), new CompositeClause(zhm.v.k(new TextClause(b(bVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(jli.b.b(bVar2.d), dateEditable, null, null, 12)), null, null, null, 14)), null, 12), false, null, null, 0, 0, 0, 0, 4084), new ListCellDelegate.Model("DOCUMENT_SECOND_SECTION", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_document_second_section, null, null, 14), false, null, null, 0, 0, 0, 0, 4084));
            yp0.b.k(listK2, 0, 0, 0, 0, 31);
            List listO2 = i2b.a.o(listC2, listK2);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("PRIMARY_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_twin_button_primary, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, 0, R$attr.uikit_dp8, 0, 0, 13);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("SECONDARY_BUTTON", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_approval_flow_power_of_attorney_twin_button_secondary, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 12);
            listO = i2b.a.o(listO2, i2b.a.r(model, model2));
        }
        return new k(textLocalisedClause, textLocalisedClause2, listO);
    }
}
