package id4;

import a0.d;
import android.os.Parcelable;
import av3.c;
import av3.g;
import av3.h;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import dx4.c1;
import grl.k9;
import ip0.ak0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import yp0.b;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C0917a Companion = new C0917a();

    /* JADX INFO: renamed from: id4.a$a, reason: collision with other inner class name */
    public static final class C0917a {
        private C0917a() {
        }
    }

    public static CreditBottomSheetListItemsController a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CANT_FIND_BANK_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_action, null, null, 14), false, null, null, null, null, 1000);
        b.r(model, 0, 0, 0, 0, 15);
        List listC = u.c(model);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController b() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_mandatory_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_mandatory_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CANT_FIND_BANK_MANDATORY_CANCEL_APPLICATION", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_mandatory_action_cancel_application, null, null, 14), false, null, null, null, null, 1000);
        b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CANT_FIND_BANK_MANDATORY_CLOSE", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_mandatory_action_close, null, null, 14), false, null, null, null, null, 1000);
        b.r(model2, 0, 0, 0, 0, 15);
        List listK = v.k(model, model2);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController c() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_optional_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_optional_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_CANT_FIND_BANK_OPTIONAL_SKIP", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_optional_action_skip, null, null, 14), false, null, null, null, null, 1000);
        b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CANT_FIND_BANK_OPTIONAL_CLOSE", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_cant_link_popup_optional_action_close, null, null, 14), false, null, null, null, null, 1000);
        b.r(model2, 0, 0, 0, 0, 15);
        List listK = v.k(model, model2);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController d() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_first_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_first_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_RECEIVE_INCOME_TO_REVOLUT_CONTINUE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_first_action_continue, null, null, 14), false, null, null, null, null, 1000);
        b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_RECEIVE_INCOME_TO_REVOLUT_CANCEL", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_first_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        b.r(model2, 0, 0, 0, 0, 15);
        List listK = v.k(model, model2);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController e(c popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        int i = R$string.linked_accounts_v2_intro_info_popup_title;
        String str = popup.f9888b;
        if (str == null) {
            str = "";
        }
        LargeActionButtonDelegate.Model model = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str2 = popup.f9889c;
        lw0.a aVar = new lw0.a(textLocalisedClause, str2 != null ? new TextLocalisedClause(R$string.linked_accounts_v2_intro_info_popup_description, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, false, 28);
        String str3 = popup.d;
        if (str3 != null) {
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_DIALOG_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_intro_info_popup_button, u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, null, null, null, null, 1000);
            b.r(model2, 0, 0, 0, 0, 15);
            model = model2;
        }
        List listL = v.l(model);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listL, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController f() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v3_bank_selection_revolut_popup_pay_later_first_title, null, null, 14), null, null, null, false, 30);
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_RECEIVE_INCOME_TO_REVOLUT_DESCRIPTION", (Clause) null, (Clause) new TextLocalisedClause(R$string.linked_accounts_v3_bank_selection_revolut_popup_pay_later_first_description, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_RECEIVE_INCOME_TO_REVOLUT_CONTINUE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v3_bank_selection_revolut_popup_pay_later_first_action_continue, null, null, 14), false, null, null, null, null, 1000);
        b.r(model2, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_RECEIVE_INCOME_TO_REVOLUT_CANCEL", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.linked_accounts_v3_bank_selection_revolut_popup_pay_later_first_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        b.r(model3, 0, 0, 0, 0, 15);
        List listK = v.k(model, model2, model3);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public static CreditBottomSheetListItemsController g(h permissions) {
        ?? arrayList;
        TextDelegate.Model model;
        Image imageT1;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        List list = permissions.e;
        LargeActionButtonDelegate.Model model2 = null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                g gVar = (g) obj2;
                String strN = d.n("consent_", i);
                int i3 = R$string.linked_accounts_v2_consent_item_title;
                String str = gVar.f9901b;
                if (str == null) {
                    str = "";
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                String str2 = gVar.f9902c;
                TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.linked_accounts_v2_consent_item_description, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
                c1 c1Var = gVar.f9900a;
                arrayList.add(new RowDelegate.Model(strN, (c1Var == null || (imageT1 = c1Var.T1()) == null) ? null : new RowDelegate.Model.MainImage.Image24(imageT1, false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                i = i2;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r56 = arrayList;
        b.k(r56, 0, 0, 0, 0, 31);
        String str3 = permissions.d;
        if (str3 != null) {
            TextDelegate.Model model3 = new TextDelegate.Model("ID_PERMISSIONS_DISCLAIMER", new TextLocalisedClause(R$string.linked_accounts_v2_consent_disclaimer, u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
            int i5 = R$attr.uikit_dp4;
            b.p(model3, i5, i5, i5, i5);
            model = model3;
        } else {
            model = null;
        }
        List listL = v.l(model);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.linked_accounts_v2_consent_title, u.c(new TextClause(permissions.f9903a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str4 = permissions.f9904b;
        lw0.a aVar = new lw0.a(textLocalisedClause3, str4 != null ? new TextLocalisedClause(R$string.linked_accounts_v2_consent_description, u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, false, 28);
        ArrayList arrayListE0 = d0.E0(listL, (Collection) r56);
        String str5 = permissions.f9905c;
        if (str5 != null) {
            LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("ID_PERMISSIONS_CONTINUE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_consent_action, u.c(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), false, null, null, null, null, 1000);
            b.r(model4, 0, 0, 0, 0, 15);
            model2 = model4;
        }
        ArrayList arrayListE02 = d0.E0(v.l(model2), arrayListE0);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, arrayListE02, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController h() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_second_title, null, null, 14), new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_second_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_REVOLUT_CANT_BE_SELECTED_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_bank_selection_revolut_popup_second_action, null, null, 14), false, null, null, null, null, 1000);
        b.r(model, 0, 0, 0, 0, 15);
        List listC = u.c(model);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listC, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }

    public static CreditBottomSheetListItemsController i(av3.b popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.linked_accounts_v2_intro_action_popup_title, u.c(popup.f9884a), null, 12), new TextLocalisedClause(R$string.linked_accounts_v2_intro_action_popup_description, u.c(popup.f9885b), null, 12), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_SKIP_LINKING_PROCESS_CONFIRM", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.linked_accounts_v2_intro_action_popup_primary_button, u.c(popup.f9886c), null, 12), false, null, null, null, null, 1000);
        b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_SKIP_LINKING_PROCESS_CLOSE", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.linked_accounts_v2_intro_action_popup_secondary_button, u.c(popup.d), null, 12), false, null, null, null, null, 1000);
        b.r(model2, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new CreditBottomSheetListItemsController(new cy4.a(aVar, listL, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
    }
}
