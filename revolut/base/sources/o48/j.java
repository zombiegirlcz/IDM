package o48;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        o48.a domainState = (o48.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_joint_cards_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_joint_cards_new_description, null, null, 14);
        boolean z = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6);
        RowDelegate.Model model = null;
        RowDelegate.Model model2 = new RowDelegate.Model("JOINT_CARDS", image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        boolean z3 = false;
        int i = 6;
        RowDelegate.Model model3 = new RowDelegate.Model("JOINT_ACCOUNT_DETAILS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i), new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_account_details_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_account_details_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        boolean z4 = false;
        RowDelegate.Model model4 = new RowDelegate.Model("JOINT_SCHEDULED_PAYMENT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i), new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_scheduled_payments_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_scheduled_payments_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        boolean z6 = false;
        RowDelegate.Model model5 = new RowDelegate.Model("JOINT_TRANSACTION_HISTORY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, i), new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_transaction_history_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_transaction_history_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        boolean z11 = false;
        RowDelegate.Model model6 = new RowDelegate.Model("JOINT_SG_CAP_LIMITS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z11, z11, i), new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_flow_cap_limits_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.joint_offboarding_lose_benefits_sections_flow_cap_limits_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        if (com.bumptech.glide.d.v(domainState.f222166a)) {
            model = model6;
        }
        qv0.i[] elements = {model2, model3, model4, model5, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, R$attr.uikit_dp72, 0, 0, 29);
        return new e(listL);
    }
}
