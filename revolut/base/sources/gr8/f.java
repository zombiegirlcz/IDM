package gr8;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Mode;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Sender;
import com.revolut.feature.junior_transfer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f145948a;

    public f(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f145948a = inputData;
    }

    public static h a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new h(false, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, "JUNIOR_BLOCK_INBOUND_TRANSFER_PRIMARY_BUTTON", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        h hVarA;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = this.f145948a;
        JuniorBlockInboundTransferNavigation$Junior juniorBlockInboundTransferNavigation$Junior = bVar.f145944a;
        JuniorBlockInboundTransferNavigation$Mode juniorBlockInboundTransferNavigation$Mode = bVar.f145945b;
        if (juniorBlockInboundTransferNavigation$Mode instanceof JuniorBlockInboundTransferNavigation$Mode.Block) {
            List list = ((JuniorBlockInboundTransferNavigation$Mode.Block) juniorBlockInboundTransferNavigation$Mode).f77410a;
            if (list.size() == 1) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.junior_payments_block_sender_header_title, u.c(((JuniorBlockInboundTransferNavigation$Sender) d0.b0(list)).f77414b), null, 12);
            } else {
                textLocalisedClause3 = new TextLocalisedClause(R$string.junior_payments_block_multiple_senders_header_title, u.c(String.valueOf(list.size())), null, 12);
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.junior_payments_block_sender_header_description, null, null, 14);
            hVarA = a(new TextLocalisedClause(R$string.junior_payments_block_sender_action_block, null, null, 14), new TextLocalisedClause(R$string.junior_payments_block_sender_action_cancel, null, null, 14));
        } else {
            if (!(juniorBlockInboundTransferNavigation$Mode instanceof JuniorBlockInboundTransferNavigation$Mode.Unblock)) {
                if (!(juniorBlockInboundTransferNavigation$Mode instanceof JuniorBlockInboundTransferNavigation$Mode.Informational)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.junior_payments_blocked_users_header_title, null, null, 14);
                textLocalisedClause = new TextLocalisedClause(R$string.junior_payments_block_sender_header_description, null, null, 14);
                textLocalisedClause2 = textLocalisedClause5;
                hVarA = null;
                lw0.a aVar = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 24);
                boolean z = false;
                RowDelegate.Model model = new RowDelegate.Model("SEND_MONEY_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.junior_payments_block_unblock_sender_send_money, u.c(juniorBlockInboundTransferNavigation$Junior.f77409b), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.junior_payments_block_unblock_sender_receive_money, u.c(juniorBlockInboundTransferNavigation$Junior.f77409b), null, 12);
                boolean z3 = false;
                List listK = v.k(model, new RowDelegate.Model("RECEIVE_MONEY_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), textLocalisedClause6, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new cii.b(hVarA, listK, aVar);
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.junior_payments_unblock_sender_header_title, u.c(((JuniorBlockInboundTransferNavigation$Mode.Unblock) juniorBlockInboundTransferNavigation$Mode).f77412a.f77414b), null, 12);
            textLocalisedClause4 = new TextLocalisedClause(R$string.junior_payments_unblock_sender_header_description, null, null, 14);
            hVarA = a(new TextLocalisedClause(R$string.junior_payments_unblock_sender_action_unblock, null, null, 14), new TextLocalisedClause(R$string.junior_payments_unblock_sender_action_cancel, null, null, 14));
        }
        textLocalisedClause = textLocalisedClause4;
        textLocalisedClause2 = textLocalisedClause3;
        lw0.a aVar2 = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 24);
        boolean z4 = false;
        RowDelegate.Model model2 = new RowDelegate.Model("SEND_MONEY_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.junior_payments_block_unblock_sender_send_money, u.c(juniorBlockInboundTransferNavigation$Junior.f77409b), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        TextLocalisedClause textLocalisedClause62 = new TextLocalisedClause(R$string.junior_payments_block_unblock_sender_receive_money, u.c(juniorBlockInboundTransferNavigation$Junior.f77409b), null, 12);
        boolean z310 = false;
        List listK2 = v.k(model2, new RowDelegate.Model("RECEIVE_MONEY_ITEM_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z310, z310, 6), textLocalisedClause62, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new cii.b(hVarA, listK2, aVar2);
    }
}
