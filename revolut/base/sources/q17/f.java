package q17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jr6.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f241397a;

    public f(u saleStateMapper) {
        Intrinsics.checkNotNullParameter(saleStateMapper, "saleStateMapper");
        this.f241397a = saleStateMapper;
    }

    public static ActionsView.Item a(boolean z, FreelancerOrder freelancerOrder) {
        if (z) {
            return new ActionsView.Item("LIST_ID_ACTION_CANCEL", null, false, null, null, new TextLocalisedClause(R$string.freelancer_common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new b(freelancerOrder), null, 24478);
        }
        return null;
    }

    public static ActionsView.Item b(boolean z, FreelancerOrder freelancerOrder) {
        if (z) {
            return new ActionsView.Item("LIST_ID_ACTION_DUPLICATE", null, false, null, null, new TextLocalisedClause(R$string.freelancer_common_action_duplicate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new b(freelancerOrder), null, 24478);
        }
        return null;
    }

    public static ActionsView.Item c(String str) {
        if (str != null) {
            return new ActionsView.Item("LIST_ID_ACTION_RECEIPT_SHARE", null, false, null, null, new TextLocalisedClause(R$string.freelancer_sale_details_action_receipt, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_receipt, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new c(str), null, 24478);
        }
        return null;
    }

    public static ActionsView.Item d(wr6.a aVar, FreelancerOrder freelancerOrder) {
        if (aVar != wr6.a.NONE) {
            return new ActionsView.Item("LIST_ID_ACTION_REFUND", null, false, null, null, aVar == wr6.a.PARTIAL ? new TextLocalisedClause(R$string.freelancer_sale_details_action_refund_more, null, null, 14) : new TextLocalisedClause(R$string.freelancer_common_action_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_status_refund, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new b(freelancerOrder), null, 24478);
        }
        return null;
    }
}
