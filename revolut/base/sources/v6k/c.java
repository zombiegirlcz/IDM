package v6k;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.payments.money_request.core.R$string;
import com.revolut.retail.feature.payments.money_request.core.actions.money_requests_actions.MoneyRequestsActionsContract$StatusAction;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import rp0.d0;
import rp0.d2;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements wv9.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f286412a;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f286412a = uiKitResources;
    }

    public static Clause k(Clause clause, MoneyRequestState moneyRequestState, Custom custom) {
        int i = moneyRequestState == null ? -1 : b.f286410b[moneyRequestState.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.money_request_core_details_payer_state_rejected, u.c(clause), custom, 8) : new TextLocalisedClause(R$string.money_request_core_details_payer_state_accepted_to_someone_short, null, custom, 10) : new TextLocalisedClause(R$string.money_request_core_details_payer_state_active, null, custom, 10);
    }

    public static Clause l(Clause clause, MoneyRequestState moneyRequestState, Custom custom) {
        int i = moneyRequestState == null ? -1 : b.f286410b[moneyRequestState.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.money_request_core_details_requester_state_cancelled_short, null, custom, 10) : new TextLocalisedClause(R$string.money_request_core_details_state_expired, u.c(clause), custom, 8) : new TextLocalisedClause(R$string.money_request_core_details_requester_state_rejected_short, u.c(clause), custom, 8) : new TextLocalisedClause(R$string.money_request_core_details_requester_state_accepted_short, u.c(clause), custom, 8) : new TextLocalisedClause(R$string.money_request_core_details_requester_state_active_short, u.c(clause), custom, 8);
    }

    public final MoneyClause a(MoneyRequest moneyRequest, Custom custom) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
        dj0.d dVarI0 = moneyRequest.d;
        int i = b.f286411c[moneyRequestDirection.ordinal()];
        if (i == 1) {
            dVarI0 = pyd.c.i0(dVarI0);
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new MoneyClause(dVarI0, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), custom, null, 8);
    }

    public final LayeredImage b(MoneyRequestState moneyRequestState) {
        Float fValueOf = Float.valueOf(16.0f);
        int i = moneyRequestState == null ? -1 : b.f286410b[moneyRequestState.ordinal()];
        if (i == 1) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i2 = R$drawable.uikit_icn_16_status_clock_arrows;
            int i3 = R$attr.uikit_colorGroupedBackground;
            return companion.d(i2, R$attr.uikit_colorOrange, i3, Integer.valueOf(i3), 2.0f, 2.0f, fValueOf);
        }
        if (i == 2) {
            LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
            int i5 = R$drawable.uikit_icn_16_check;
            int i6 = R$attr.uikit_colorGroupedBackground;
            return companion2.d(i5, R$attr.uikit_colorGreen, i6, Integer.valueOf(i6), 2.0f, 2.0f, fValueOf);
        }
        if (i == 3) {
            LayeredImage.Companion companion3 = LayeredImage.INSTANCE;
            int i21 = R$drawable.uikit_icn_16_cross;
            int i22 = R$attr.uikit_colorGroupedBackground;
            return companion3.d(i21, R$attr.uikit_colorRed, i22, Integer.valueOf(i22), 2.0f, 2.0f, fValueOf);
        }
        if (i != 4 && i != 5) {
            return null;
        }
        LayeredImage.Companion companion4 = LayeredImage.INSTANCE;
        int i32 = R$drawable.uikit_icn_16_canceled;
        int i33 = R$attr.uikit_colorGroupedBackground;
        return companion4.d(i32, R$attr.uikit_colorGreyTone50, i33, Integer.valueOf(i33), 2.0f, 2.0f, fValueOf);
    }

    public final y c(MoneyRequest moneyRequest) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        MoneyClause moneyClause = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        String strG = g(moneyRequest);
        if (strG == null) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.money_request_core_notification_friend, null, null, 14);
            textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_details_alert_cancel_request_title, v.k(moneyClause, textLocalisedClause3), null, 12);
            textLocalisedClause2 = new TextLocalisedClause(R$string.money_request_core_link_cancel_alert_request_message, v.k(textLocalisedClause3, moneyClause), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_details_cancel_request_title, v.k(moneyClause, strG), null, 12);
            textLocalisedClause2 = null;
        }
        return d0.d(textLocalisedClause, textLocalisedClause2, new d2("MR_BOTTOM_DIALOG_BUTTON_CANCEL_ID", new TextLocalisedClause(R$string.money_request_core_details_cancel_request_cancel, null, null, 14), new i6k.c(moneyRequest), 56), new d2("MR_BOTTOM_DIALOG_BUTTON_DISMISS_ID", new TextLocalisedClause(R$string.money_request_core_details_cancel_request_no, null, null, 14), null, 56), null, 112);
    }

    public final int d(MoneyRequestState moneyRequestState) {
        int i = moneyRequestState == null ? -1 : b.f286410b[moneyRequestState.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorOrange;
        }
        if (i == 2) {
            return R$attr.uikit_colorGreen;
        }
        if (i != 3 && i != 4) {
            return R$attr.uikit_colorGreyTone50;
        }
        return R$attr.uikit_colorRed;
    }

    public final Image e(MoneyRequest moneyRequest, wv9.b iconType) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        MoneyRequestCounterParty moneyRequestCounterParty2 = moneyRequest.f60320l;
        MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
        if (moneyRequestDirection == MoneyRequestDirection.INCOMING && moneyRequestCounterParty2.getF60343a() != null) {
            return new ContactImage(moneyRequestCounterParty2.getF60343a(), (String) null, moneyRequestCounterParty2.getE(), (String) null, (String) null, com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty2), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058);
        }
        if (moneyRequestDirection == MoneyRequestDirection.OUTGOING && moneyRequestCounterParty != null) {
            return new ContactImage(moneyRequestCounterParty.getF60343a(), (String) null, moneyRequestCounterParty.getE(), (String) null, (String) null, com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4058);
        }
        if (moneyRequest.f60318h != null) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_link, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorBlue, 14.0f, Float.valueOf(28.0f), null, 32);
        }
        int i = b.f286409a[iconType.ordinal()];
        if (i == 1) {
            return new ResourceImage(R$drawable.uikit_icn_24_user, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepGrey), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (i == 2) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_user, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorGreyTone10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final y0 f(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        return new y0("STATUS_DIALOG_FUNDS_ID", new z(new TextLocalisedClause(R$string.payments_money_request_insufficient_balance_title, null, null, 14), new TextLocalisedClause(R$string.payments_money_request_insufficient_balance_subtitle, null, null, 14), new TextLocalisedClause(R$string.payments_money_request_insufficient_balance_action_add_money, null, null, 14), null, null, new MoneyRequestsActionsContract$StatusAction.InsufficientFunds(moneyRequest), false, null, null, null, null, null, null, 32628), false, 4);
    }

    public final String g(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.k;
        MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
        if (moneyRequestDirection != MoneyRequestDirection.OUTGOING || moneyRequestCounterParty == null) {
            if (moneyRequestDirection == MoneyRequestDirection.INCOMING) {
                return com.revolut.domain.models.moneyrequest.b.d(moneyRequest);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "moneyRequestCounterParty");
        Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "<this>");
        String strC = com.revolut.domain.models.moneyrequest.a.c(moneyRequestCounterParty);
        return strC.length() == 0 ? m70.a.l(com.revolut.domain.models.moneyrequest.a.d(moneyRequestCounterParty)) : strC;
    }

    public final TextLocalisedClause h(MoneyRequest moneyRequest) {
        int i = R$string.request_details_alert_decline_request_title;
        MoneyClause moneyClause = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        String strG = g(moneyRequest);
        if (strG == null) {
            strG = "";
        }
        return new TextLocalisedClause(i, v.k(moneyClause, new TextClause(strG, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public final Clause i(MoneyRequest moneyRequest) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        String strG = g(moneyRequest);
        if (strG != null) {
            String str = strG.length() > 0 ? strG : null;
            if (str != null) {
                return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        return new TextLocalisedClause(R$string.money_request_core_transaction_description_request, null, null, 14);
    }

    public final String j(String name, MoneyRequestState moneyRequestState, MoneyRequestDirection direction) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return this.f286412a.b(direction == MoneyRequestDirection.OUTGOING ? l(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyRequestState, null) : k(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyRequestState, null)).toString();
    }

    public final y0 m(MoneyRequest moneyRequest) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        String strC = com.revolut.domain.models.moneyrequest.a.c(moneyRequest.f60320l);
        MoneyClause moneyClause = new MoneyClause(moneyRequest.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (kotlin.text.d0.W(strC)) {
            textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_send_status_success_title_without_name, u.c(moneyClause), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.money_request_core_send_status_success_title, v.k(moneyClause, new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        return new y0("STATUS_DIALOG_SUCCESS_ID", new j0((Clause) textLocalisedClause, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) new MoneyRequestsActionsContract$StatusAction.Success(moneyRequest), (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4086), false, 4);
    }
}
