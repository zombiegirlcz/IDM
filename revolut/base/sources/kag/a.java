package kag;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import i9g.n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z80.b;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f182491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f182492b;

    public a(b phoneToolsProvider, n0 travellerInfoProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(travellerInfoProvider, "travellerInfoProvider");
        this.f182491a = phoneToolsProvider;
        this.f182492b = travellerInfoProvider;
    }

    public static List a(String specialRequest) {
        Intrinsics.checkNotNullParameter(specialRequest, "specialRequest");
        InputTextDelegate.Model model = new InputTextDelegate.Model("SPECIAL_REQUEST_ITEM_ID", new TextClause(specialRequest, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_request_title, null, null, 14), null, null, null, null, false, null, false, true, 0, false, 0, true, false, true, f0.f322471a, false, false, 0, false, false, null, 989413232, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final List b(String email, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        TextClause textClause = new TextClause(email, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_email_title, null, null, 14);
        n0 n0Var = this.f182492b;
        n0Var.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("EMAIL_ITEM_ID", textClause, textLocalisedClause, null, !n0Var.c(email) ? new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_email_error_message, null, null, 14) : null, null, null, z, 50, !n0Var.c(email), true, 208, false, 0, true, false, true, f0.f322471a, false, false, 0, false, false, null, 987316080, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final List c(String firstName, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        TextClause textClause = new TextClause(firstName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_name_first_name_title, null, null, 14);
        n0 n0Var = this.f182492b;
        n0Var.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("FIRST_NAME_ITEM_ID", textClause, textLocalisedClause, null, !n0Var.d(firstName) ? new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_name_first_name_error_message, null, null, 14) : null, null, null, z, 40, !n0Var.d(firstName), true, 96, true, 0, true, false, true, f0.f322471a, false, false, 0, false, false, null, 987316080, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final List d(String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        TextClause textClause = new TextClause(lastName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_name_last_name_title, null, null, 14);
        n0 n0Var = this.f182492b;
        n0Var.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("LAST_NAME_ITEM_ID", textClause, textLocalisedClause, null, !n0Var.e(lastName) ? new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_name_last_name_error_message, null, null, 14) : null, null, null, z, 40, !n0Var.e(lastName), true, 96, true, 0, true, false, true, f0.f322471a, false, false, 0, false, false, null, 987316080, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final List e(String phone, boolean z) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        TextClause textClause = new TextClause(b.b(this.f182491a, phone, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_phone_phone_title, null, null, 14);
        n0 n0Var = this.f182492b;
        n0Var.getClass();
        InputTextDelegate.Model model = new InputTextDelegate.Model("PHONE_ITEM_ID", textClause, textLocalisedClause, null, !n0Var.f(phone) ? new TextLocalisedClause(R$string.hotels_checkout_edit_travel_info_section_traveller_phone_phone_error_message, null, null, 14) : null, null, null, z, 20, !n0Var.f(phone), true, 3, true, 0, true, false, true, f0.f322471a, false, false, 0, false, false, null, 987316080, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
