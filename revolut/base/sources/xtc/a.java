package xtc;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f308804a;

    public a(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f308804a = dateProvider;
    }

    public static List a(String str, SecurityDelayInfo securityDelayInfo) {
        List listC = u.c(new sa("SECURITY_DELAY_BANNER_ITEM_LIST_ID", (Clause) new TextLocalisedClause(R$string.security_delay_banner_complete_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.security_delay_banner_complete_subtitle, null, null, 14), v.k(new ActionsView.Item("SECURITY_DELAY_BANNER_VERIFY_BUTTON_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.security_delay_banner_complete_action, null, null, 14), null, null, null, null, false, null, null, new SecurityDelayBannerActionData(securityDelayInfo.getF85417a(), str), null, 24476), new ActionsView.Item("SECURITY_DELAY_BANNER_CANCEL_BUTTON_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.security_delay_banner_cancel, null, null, 14), null, null, null, null, false, null, null, new SecurityDelayBannerActionData(securityDelayInfo.getF85417a(), str), null, 24476)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
