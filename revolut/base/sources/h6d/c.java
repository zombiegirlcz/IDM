package h6d;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.feature.shared.beneficiary.common.R$string;
import com.revolut.feature.shared.beneficiary.common.cop.ConfirmationOfPayeeButtonAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f149611a;

    public c(ConfirmationOfPayeeScreenContract$InputData inputData, g6d.c copUtils) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(copUtils, "copUtils");
        this.f149611a = inputData;
    }

    public static n6 a(int i, LargeActionButton.ButtonStyle.DefaultFilledButton style, ConfirmationOfPayeeButtonAction action) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(action, "action");
        return m6.c(n6.Companion, new TextLocalisedClause(i, null, null, 14), style, null, null, false, null, null, action, 508);
    }

    public static lw0.a b(TextLocalisedClause title, Clause clause, lw0.c image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        return new lw0.a(title, clause, image, null, false, 24);
    }

    public static /* synthetic */ lw0.a c(c cVar, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        lw0.c cVar2 = new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6));
        cVar.getClass();
        return b(textLocalisedClause, textLocalisedClause2, cVar2);
    }

    public static cii.b d(lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        boolean z = false;
        int i = 6;
        List listK = v.k(new RowDelegate.Model("ID_CHECK_DETAILS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_users_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.cop_confirmation_not_matched_check_details_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cop_confirmation_not_matched_check_details_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_SCAM_WARNING", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.cop_confirmation_not_matched_scam_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cop_confirmation_not_matched_scam_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, a(R$string.beneficiary_creation_cop_action_edit_details, LargeActionButton.ButtonStyle.f58725a, ConfirmationOfPayeeButtonAction.EditInfo.f86055a), a(R$string.beneficiary_creation_cop_action_keep_input, LargeActionButton.ButtonStyle.f58726b, ConfirmationOfPayeeButtonAction.KeepInfo.f86056a), null, null, null, 121), listK, header);
    }

    public static cii.b f(lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new cii.b(new aw0.h(false, a(R$string.beneficiary_creation_cop_action_edit_details, LargeActionButton.ButtonStyle.f58725a, ConfirmationOfPayeeButtonAction.EditInfo.f86055a), a(R$string.beneficiary_creation_cop_action_keep_input, LargeActionButton.ButtonStyle.f58726b, ConfirmationOfPayeeButtonAction.KeepInfo.f86056a), null, null, null, 121), f0.f322471a, header);
    }

    public static cii.b g(c cVar, TextLocalisedClause description) {
        TextLocalisedClause title = new TextLocalisedClause(R$string.cop_confirmation_cant_check_title, null, null, 14);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return f(c(cVar, title, description));
    }

    public final cii.b e(TextLocalisedClause textLocalisedClause) {
        BeneficiaryCreationType personal;
        ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData = this.f149611a;
        ConfirmationResult result = confirmationOfPayeeScreenContract$InputData.f86044a;
        BeneficiaryCreationType beneficiaryCreationType = confirmationOfPayeeScreenContract$InputData.f86045b;
        Intrinsics.checkNotNullParameter(result, "result");
        String str = result.f;
        String str2 = result.d;
        String str3 = result.e;
        if (str != null) {
            personal = new BeneficiaryCreationType.Business(str);
        } else {
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            personal = new BeneficiaryCreationType.Personal(str2, str3);
        }
        lw0.a aVarC = c(this, new TextLocalisedClause(R$string.cop_confirmation_close_matched_title, null, null, 14), textLocalisedClause);
        List listK = v.k(new CellDetailsDelegate.Model("ID_USER_INPUT", new t0((Clause) new TextLocalisedClause(R$string.cop_confirmation_close_matched_you_entered, null, null, 14), (Image) null, 0, false, 30), new TextClause(g6d.c.c(beneficiaryCreationType), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("ID_CONFIRMATION", new t0((Clause) new TextLocalisedClause(R$string.cop_confirmation_close_matched_did_you_mean_title, null, null, 14), (Image) null, 0, false, 30), g6d.c.a(confirmationOfPayeeScreenContract$InputData.f86044a, beneficiaryCreationType, null), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, a(R$string.beneficiary_creation_cop_action_replace_and_continue, LargeActionButton.ButtonStyle.f58725a, new ConfirmationOfPayeeButtonAction.ReplaceName(personal)), a(R$string.beneficiary_creation_cop_action_keep_input, LargeActionButton.ButtonStyle.f58726b, ConfirmationOfPayeeButtonAction.KeepInfo.f86056a), null, null, null, 121), listK, aVarC);
    }
}
