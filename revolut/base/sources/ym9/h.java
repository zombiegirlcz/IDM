package ym9;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {
    public static RowDelegate.Model a(int i, int i2, String str) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60);
        int i3 = R$attr.uikit_dp8;
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i3, i3, 0, 0, 486539256);
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = g.f314889a[domainState.f314885a.ordinal()];
        if (i == 1) {
            List listK = v.k(a(R$string.security_hub_payees_section_header_blocked_info_list_send_messages, R$drawable.uikit_icn_24_chat, "BLOCKED_SECTION_MESSAGES_LIST_ID"), a(R$string.security_hub_payees_section_header_blocked_info_list_request_or_send_money, R$drawable.uikit_icn_24_arrow_right_left, "BLOCKED_SECTION_MONEY_LIST_ID"), a(R$string.security_hub_payees_section_header_blocked_info_list_add_to_groups, R$drawable.uikit_icn_24_people, "BLOCKED_SECTION_GROUPS_LIST_ID"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new e(new TextLocalisedClause(R$string.security_hub_payees_section_header_blocked_info_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_payees_section_header_blocked_info_subtitle, null, null, 14), listK);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List listK2 = v.k(a(R$string.security_hub_payees_section_header_requires_authentication_info_list_verification, R$drawable.uikit_icn_24_face_id, "REQUIRE_AUTHENTICATION_SECTION_BIOMETRICS_LIST_ID"), a(R$string.security_hub_payees_section_header_requires_authentication_info_list_no_action_required, R$drawable.uikit_icn_24_map_marker_hide, "REQUIRE_AUTHENTICATION_SECTION_ACTION_LIST_ID"));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new e(new TextLocalisedClause(R$string.security_hub_payees_section_header_requires_authentication_info_title, null, null, 14), new TextLocalisedClause(R$string.security_hub_payees_section_header_requires_authentication_info_subtitle, null, null, 14), listK2);
    }
}
