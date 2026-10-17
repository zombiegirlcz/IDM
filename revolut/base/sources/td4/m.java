package td4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ReferralFlagDetails;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        TextLocalisedClause textLocalisedClause;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ManualUnderwritingReferralFlag manualUnderwritingReferralFlag = domainState.f269925b;
        jv3.b bVar = domainState.f269924a;
        int i = l.f269933a[bVar.ordinal()];
        if (i == 1) {
            list = manualUnderwritingReferralFlag.f66478g.f66465a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = manualUnderwritingReferralFlag.f66478g.f66466b;
        }
        List<ReferralFlagDetails> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ReferralFlagDetails referralFlagDetails : list2) {
            arrayList.add(new ListCellDelegate.Model(referralFlagDetails.f66485a, new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextClause(referralFlagDetails.f66485a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlClause(0, 30, (Integer) null, (Object) null, referralFlagDetails.f66486b), false, null, null, 0, 0, 0, 0, 4064));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        List list3 = manualUnderwritingReferralFlag.f66478g.f66466b;
        if (bVar == jv3.b.MANDATORY && !list3.isEmpty()) {
            CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("view-id-show-additional-documents", new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_button_title, null, null, 14), 0, false, null, null, null, 2044);
            yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
            arrayList = d0.F0(model, arrayList);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_title, null, null, 14);
        int i2 = l.f269933a[bVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(list.size() > 1 ? R$string.credit_manual_underwriting_upload_screen_bottom_sheet_multiple_documents_description : R$string.credit_manual_underwriting_upload_screen_bottom_sheet_single_document_description, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_optional_documents_description, null, null, 14);
        }
        return new j(textLocalisedClause2, textLocalisedClause, new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_button, null, null, 14), arrayList);
    }
}
