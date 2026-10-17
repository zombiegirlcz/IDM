package afa;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.impl.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static rp0.y a(String currency, PocketListType pocketListType, Object obj2, String str, String str2, boolean z) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketListType, "pocketListType");
        boolean z3 = pocketListType instanceof PocketListType.Joint;
        PocketListType.RevXFiat revXFiat = PocketListType.RevXFiat.f80782a;
        PocketListType.Main main = PocketListType.Main.f80780a;
        PocketListType.Pro pro = PocketListType.Pro.f80781a;
        if (z3) {
            i = R$string.account_detail_details_list_dialog_add_new_joint_title;
        } else if (Intrinsics.f(pocketListType, pro)) {
            i = R$string.account_detail_details_list_dialog_add_new_pro_title;
        } else {
            if (!Intrinsics.f(pocketListType, main) && !Intrinsics.f(pocketListType, revXFiat)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.account_detail_details_list_dialog_add_new_main_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(currency), null, 12);
        if (z) {
            if (z3) {
                i2 = R$string.account_detail_details_list_dialog_add_new_joint_subtitle_mx;
            } else if (Intrinsics.f(pocketListType, pro)) {
                i2 = R$string.account_detail_details_list_dialog_add_new_pro_subtitle_mx;
            } else {
                if (!Intrinsics.f(pocketListType, main) && !Intrinsics.f(pocketListType, revXFiat)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.account_detail_details_list_dialog_add_new_main_subtitle_mx;
            }
        } else if (z3) {
            i2 = R$string.account_detail_details_list_dialog_add_new_joint_subtitle;
        } else if (Intrinsics.f(pocketListType, pro)) {
            i2 = R$string.account_detail_details_list_dialog_add_new_pro_subtitle;
        } else {
            if (!Intrinsics.f(pocketListType, main) && !Intrinsics.f(pocketListType, revXFiat)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.account_detail_details_list_dialog_add_new_main_subtitle;
        }
        xi0.b.Companion.getClass();
        return new rp0.y(zhm.u.c(new um0("LIST_ID_TWIN_BUTTON", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.account_detail_details_list_dialog_add_new_button_go_back, null, null, 14), false, null, str, 24), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(z ? R$string.account_detail_details_list_dialog_add_new_button_add_account_mx : R$string.account_detail_details_list_dialog_add_new_button_add_account, null, null, 14), false, "ADD_ACCOUNT_BUTTON_TAG", str2, 8), obj2, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new rp0.t(textLocalisedClause, new TextLocalisedClause(i2, zhm.u.c(new CurrencyClause(xi0.a.a(currency), null, null, 6)), null, 12), new rp0.v("CURRENCY_ICON_ID", new CurrencyImage(currency, (ImageTransformations) null, (TextLocalisedClause) null, 14)), 24), null, null, null, null, 1020);
    }
}
