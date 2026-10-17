package u23;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nj1.j;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import yp0.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1530a Companion = new C1530a();

    /* JADX INFO: renamed from: u23.a$a, reason: collision with other inner class name */
    public static final class C1530a {
        private C1530a() {
        }
    }

    public static y a(j warning) {
        int i;
        Intrinsics.checkNotNullParameter(warning, "warning");
        j.f fVar = j.f.f216346a;
        boolean zF = Intrinsics.f(warning, fVar);
        j.d dVar = j.d.f216344a;
        j.b bVar = j.b.f216342a;
        if (zF) {
            i = R$string.card_delivery_warning_no_house_number_title;
        } else if (Intrinsics.f(warning, j.c.f216343a)) {
            i = R$string.card_delivery_warning_no_number_line1_line2;
        } else if (Intrinsics.f(warning, j.a.f216341a)) {
            i = R$string.card_delivery_warning_no_number_line1;
        } else if (Intrinsics.f(warning, j.e.f216345a)) {
            i = R$string.card_delivery_warning_no_number_line2_title;
        } else if (Intrinsics.f(warning, dVar)) {
            i = R$string.card_delivery_warning_no_number_line2_title_germany;
        } else {
            if (!Intrinsics.f(warning, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.card_delivery_warning_no_number_line1_line2_title_germany;
        }
        t tVar = new t(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(Intrinsics.f(warning, fVar) ? R$string.card_delivery_warning_no_house_number_subtitle : R$string.card_delivery_warning_no_number_line2_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause((Intrinsics.f(warning, dVar) || Intrinsics.f(warning, bVar)) ? R$string.card_delivery_warning_no_house_number_button_add_address_info : R$string.card_delivery_warning_no_house_number_button_add_house_number, null, null, 14);
        int i2 = R$attr.uikit_dp24;
        int i3 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("NO_HOUSE_NUMBER_BUTTON_ADD_MISSING_INFO_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i3, i3, i3, 496);
        LargeActionButton.ButtonStyle buttonStyle = Intrinsics.f(warning, fVar) ? LargeActionButton.ButtonStyle.o : LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause((Intrinsics.f(warning, dVar) || Intrinsics.f(warning, bVar)) ? R$string.card_delivery_warning_no_house_number_button_no_address_info : R$string.card_delivery_warning_no_house_number_button_no_number, null, null, 14);
        int i5 = R$attr.uikit_dp8;
        int i6 = R$attr.uikit_dp24;
        int i21 = R$attr.uikit_dp16;
        return new y(v.k(model, new LargeActionButtonDelegate.Model("NO_HOUSE_NUMBER_BUTTON_APPROVED_ID", buttonStyle, null, textLocalisedClause2, false, null, null, i5, i6, i21, i21, 496)), tVar, null, null, null, null, 1020);
    }

    public static y b(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        t tVar = new t(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_unverified_address_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_unverified_address_description, null, null, 14), null, 28);
        RowDelegate.Model model = new RowDelegate.Model("POOR_ADDRESS_LIST_ID", null, new TextClause(o51.a.b(address, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_unverified_address_edit_button, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("EDIT_POOR_ADDRESS_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i2, i2, i2, 496);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_unverified_address_continue_button, null, null, 14);
        int i3 = R$attr.uikit_dp8;
        int i5 = R$attr.uikit_dp24;
        int i6 = R$attr.uikit_dp16;
        return new y(v.k(model, model2, new LargeActionButtonDelegate.Model("CONFIRM_POOR_ADDRESS_BUTTON_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i3, i5, i6, i6, 496)), tVar, null, null, null, null, 1020);
    }

    public static y c(Address address, Address suggestedAddress, Address selectedAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(suggestedAddress, "suggestedAddress");
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        t tVar = new t(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_verify_address_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_verify_address_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28);
        l lVar = l.WINDOW;
        e eVarB = u.b();
        vd0 vd0Var = vd0.RADIO;
        List listK = v.k(new SelectableDelegate.Model("ORIGINAL_ADDRESS_LIST_ID", new RowDelegate.Model("ORIGINAL_ADDRESS_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_verify_address_original_cell, null, null, 14), null, 0, m33.a.c(address), null, null, 0, null, false, null, false, null, null, null, null, null, null, address, null, 0, 0, 0, 0, 532676570), address.equals(selectedAddress) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744), new SelectableDelegate.Model("SUGGESTED_ADDRESS_LIST_ID", new RowDelegate.Model("SUGGESTED_ADDRESS_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_verify_address_suggested_cell, null, null, 14), null, 0, m33.a.c(suggestedAddress), null, null, 0, null, false, null, false, null, null, null, null, null, null, suggestedAddress, null, 0, 0, 0, 0, 532676570), suggestedAddress.equals(selectedAddress) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, false, 32744));
        b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.cards_delivery_verify_address_confirm, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model("CONFIRM_ADDRESS_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i2, i2, 496));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, 1016);
    }
}
