package c7e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.impl.R$string;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.d f21928a;

    public b(m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f21928a = cardThumbnailImageProvider;
    }

    public static ShotDialogDisplayer$Configuration a() {
        return ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "DIALOG_ID_SHOT_SUCCESS", new TextLocalisedClause(R$string.card_linked_card_clipboard_banner_title, null, null, 14), null, null, null, 60);
    }

    public static LargeActionButtonDelegate.Model b(String str, int i, LargeActionButton.ButtonStyle buttonStyle, f0 f0Var) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp24;
        int i5 = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model(str, buttonStyle, null, textLocalisedClause, false, str, f0Var, i2, i3, i5, i5, 336);
    }

    public final y c(f0 linkedCard, pcd.b accountType) {
        Intrinsics.checkNotNullParameter(linkedCard, "linkedCard");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new y(v.k(b("LINKED_CARD_INFO_SEE_CARD_ITEM_ID", R$string.card_payment_method_spend_from_link_card_sheet_action_see_card, LargeActionButton.ButtonStyle.f58725a, linkedCard), b("LINKED_CARD_INFO_UNLINK_CARD_ITEM_ID", R$string.card_payment_method_spend_from_link_card_sheet_action_unlink_card, LargeActionButton.ButtonStyle.f58726b, linkedCard)), new t(new TextLocalisedClause(R$string.card_payment_method_spend_from_link_card_sheet_title, null, null, 14), accountType == pcd.b.PERSONAL_JOINT ? new TextLocalisedClause(R$string.card_payment_method_spend_from_link_card_sheet_joint_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_payment_method_spend_from_link_card_sheet_subtitle, null, null, 14), new rp0.v("UNLINK_POCKET+DIALOG_IMAGE", ((ia3.h) this.f21928a).c(linkedCard)), 24), rp0.l.WINDOW, null, null, null, 1016);
    }
}
