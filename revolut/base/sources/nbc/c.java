package nbc;

import aim.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lbc.k;
import lbc.r;
import org.jetbrains.annotations.NotNull;
import wbc.m;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static e a(m orderDetails, boolean z) {
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        e eVarB = u.b();
        String str = orderDetails.f296118g.d;
        if (str != null) {
            eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("VISIT_STORE_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_actions_visit_store, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_language, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new r(str), null, null, Constants.TAG_EMV_L2_CHECKSUM));
        }
        String str2 = orderDetails.f296118g.f296110c;
        if (str2 != null) {
            eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("RETURN_POLICY_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_actions_return_policy, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new r(str2), null, null, Constants.TAG_EMV_L2_CHECKSUM));
        }
        String str3 = orderDetails.f;
        if (str3 != null) {
            eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("VIEW_RECEIPT_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_actions_view_receipt, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_receipt, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new r(str3), null, null, Constants.TAG_EMV_L2_CHECKSUM));
        }
        if (z && orderDetails.e) {
            eVarB.add(com.revolut.core.ui_kit.models.popup.a.a("ADD_DELIVERY_POP_UP_ACTION_ID", new TextLocalisedClause(R$string.revolut_pay_order_details_actions_add_delivery_tracking, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delivery_car, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, k.f193635a, null, null, Constants.TAG_EMV_L2_CHECKSUM));
        }
        return u.a(eVarB);
    }
}
