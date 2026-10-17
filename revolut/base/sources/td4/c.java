package td4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.OptionalDocumentsContent;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ReferralFlagDetails;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private c() {
    }

    public static a a(OptionalDocumentsContent optionalDocumentsContent) {
        return optionalDocumentsContent == null ? new a(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_description, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_button_title, null, null, 14)) : new a(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_title_placeholder, u.c(optionalDocumentsContent.f66482a), null, 12), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_description_placeholder, u.c(optionalDocumentsContent.f66483b), null, 12), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_button_title_placeholder, u.c(optionalDocumentsContent.f66484c), null, 12));
    }

    public static ArrayList b(List list) {
        List<ReferralFlagDetails> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ReferralFlagDetails referralFlagDetails : list2) {
            arrayList.add(new ListCellDelegate.Model(referralFlagDetails.f66485a, new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextClause(referralFlagDetails.f66485a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlClause(0, 30, (Integer) null, (Object) null, referralFlagDetails.f66486b), false, null, null, 0, 0, 0, 0, 4064));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, 28);
        return arrayList;
    }

    public static LargeActionButtonDelegate.Model c() {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("view-id-got-it", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_button, null, null, 14), false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i, i2, i2);
        return model;
    }
}
