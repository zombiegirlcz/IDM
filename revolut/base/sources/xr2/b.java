package xr2;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$string;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nr2.d;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {
    public final sa a(String merchantBlockageId, String str, String str2) {
        Intrinsics.checkNotNullParameter(merchantBlockageId, "merchantBlockageId");
        return new sa("LIST_ID_UNBLOCK_WIDGET", (Clause) (str2 != null ? new TextLocalisedClause(R$string.merchants_block_details_someones_blocked_no_name, u.c(str2), null, 12) : str != null ? new TextLocalisedClause(R$string.merchants_block_details_name_blocked, u.c(str), null, 12) : new TextLocalisedClause(R$string.merchants_block_details_blocked_no_name, null, null, 14)), (Clause) (str2 != null ? new TextLocalisedClause(R$string.merchants_block_details_someones_warning_message, u.c(str2), null, 12) : new TextLocalisedClause(R$string.merchants_block_details_warning_message, null, null, 14)), u.c(new ActionsView.Item("LIST_ID_UNBLOCK_WIDGET", null, false, null, null, new TextLocalisedClause(R$string.merchants_block_details_unblock_merchant, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, new nr2.b(merchantBlockageId, str, str2), null, 24478)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
    }
}
