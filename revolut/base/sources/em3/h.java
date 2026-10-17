package em3;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts.api.navigation.BlockUserBottomSheetInputData;
import com.revolut.feature.contacts.impl.R$string;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zm3.l;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockUserBottomSheetInputData f127601a;

    public h(BlockUserBottomSheetInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f127601a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List list;
        List list2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BlockUserBottomSheetInputData blockUserBottomSheetInputData = this.f127601a;
        zm3.a aVar = blockUserBottomSheetInputData.f65980a;
        boolean z = false;
        boolean z3 = (aVar instanceof l) && q.K((l) aVar);
        int i = g.f127600a[blockUserBottomSheetInputData.f65981b.ordinal()];
        int i2 = 6;
        if (i == 1) {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_title, u.c(new TextClause(q.H(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(z3 ? R$string.payments_block_user_bottom_sheet_subtitle_business : R$string.payments_block_user_bottom_sheet_subtitle, null, null, 14), new lw0.b(n14.e.l(aVar, null, 3), null), null, false, 24);
            if (z3) {
                list = f0.f322471a;
            } else {
                List listK = v.k(new RowDelegate.Model("LIST_ID_SEND_MESSAGES_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_option_send_message, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("LIST_ID_TRANSFER_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_option_request_send_money, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("LIST_ID_ADD_TO_GROUPS_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_option_add_to_groups, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                list = listK;
            }
            m6 m6Var = n6.Companion;
            return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_action_block, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "BLOCK_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), list, aVar2);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.payments_unblock_user_bottom_sheet_title, u.c(new TextClause(q.H(aVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(z3 ? R$string.payments_unblock_user_bottom_sheet_subtitle_business : R$string.payments_unblock_user_bottom_sheet_description, null, null, 14), new lw0.b(n14.e.l(aVar, null, 3), null), null, false, 24);
        if (z3) {
            list2 = f0.f322471a;
        } else {
            List listK2 = v.k(new RowDelegate.Model("LIST_ID_SEND_MESSAGES_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_option_send_message, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("LIST_ID_TRANSFER_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_right_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i2), new TextLocalisedClause(R$string.payments_block_user_bottom_sheet_option_request_send_money, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            yp0.b.k(listK2, 0, 0, 0, 0, 31);
            list2 = listK2;
        }
        m6 m6Var2 = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(R$string.payments_unblock_user_bottom_sheet_unblock, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "UNBLOCK_BUTTON_LOADING_TAG", false, null, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), m6.c(m6Var2, new TextLocalisedClause(R$string.payments_unblock_user_bottom_sheet_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), list2, aVar3);
    }
}
