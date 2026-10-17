package u03;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import h93.f0;
import h93.o;
import h93.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e03.c f276047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y43.a f276048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f276049c;
    public final gte.a d;
    public final rul.e e;

    public j(e03.c uiConfigurationProvider, y43.a cardPaymentMethodWidget, g revolutCardCellItemProvider, gte.a featureToggleInteractor, rul.e securityHubFeatureChecker) {
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
        Intrinsics.checkNotNullParameter(revolutCardCellItemProvider, "revolutCardCellItemProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(securityHubFeatureChecker, "securityHubFeatureChecker");
        this.f276047a = uiConfigurationProvider;
        this.f276048b = cardPaymentMethodWidget;
        this.f276049c = revolutCardCellItemProvider;
        this.d = featureToggleInteractor;
        this.e = securityHubFeatureChecker;
    }

    public static aim.e a(e03.b bVar) {
        aim.e eVarB = u.b();
        if (bVar.f121382c) {
            eVarB.add(new RowDelegate.Model("REPLACE_CARD_ID", new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.card_action_replace_title, null, null, 14), new TextLocalisedClause(R$string.card_action_replace_voluntary_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
        }
        if (bVar.d) {
            eVarB.add(new RowDelegate.Model("REPLACE_VIRTUAL_CARD_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.card_action_replace_title, null, null, 14), new TextLocalisedClause(R$string.card_action_replace_virtual_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
        }
        if (bVar.k) {
            eVarB.add(new RowDelegate.Model("REMOVE_CARD_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.card_action_remove_title, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public static RowDelegate.Model b(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String str = card.f150111b;
        return new RowDelegate.Model("LABEL_CARD_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.card_action_name_your_card_title, null, null, 14), (str == null || !(d0.W(str) ^ true)) ? new TextLocalisedClause(R$string.card_action_name_your_card_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_action_your_card_name_subtitle, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676);
    }

    public static List d(e03.b bVar) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        RowDelegate.Model model3;
        f0 f0Var = bVar.f121380a;
        boolean z = f0Var.f150112c;
        RowDelegate.Model model4 = !z && f0Var.k.f150132a.compareTo(h93.g.NONE) > 0 && !bVar.e.q0 && !f0Var.x() ? new RowDelegate.Model("SHOW_PIN_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_key, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R.string.card_action_show_pin, null, null, 14), new TextLocalisedClause(R.string.card_action_show_pin_info_short, null, null, 14), null, null, 0, null, false, false, null, bVar.f121380a.f != r.ORDERED ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, bVar, null, 0, 0, 0, 0, 1056931692) : null;
        RowDelegate.Model modelE = e(f0Var);
        if (f0Var.D) {
            RowDelegate.Model model5 = model4;
            model = new RowDelegate.Model("CHANGE_PIN_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_change_passcode, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.change_pin_settings_cell_title, null, null, 14), new TextLocalisedClause(R$string.change_pin_settings_cell_description, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 1056964460);
            model2 = model5;
            model3 = modelE;
        } else {
            model3 = modelE;
            model2 = model4;
            model = null;
        }
        RowDelegate.Model[] elements = {model2, model3, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            return zhm.f0.f322471a;
        }
        return yp0.b.g(listL, new ListSubheaderDelegate.Model("PIN_SETTINGS_SUB_HEADER_LIST_ID", (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.card_settings_section_cvv, null, null, 14) : new TextLocalisedClause(R$string.card_settings_section_pin, null, null, 14)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public static RowDelegate.Model e(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (card.w()) {
            return new RowDelegate.Model("RESET_PIN_TRIES_ID", new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(card.f150112c ? R$string.card_action_unblock_pin_cvv_virtual_title : R$string.card_action_unblock_pin_cvv_title, null, null, 14), new TextLocalisedClause(R$string.card_action_unblock_pin_cvv_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, card, null, 0, 0, 0, 0, 1056964460);
        }
        return null;
    }

    public static RowDelegate.Model g(a value) {
        int i;
        int i2;
        ResourceImage resourceImage;
        TextLocalisedClause textLocalisedClauseC;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = value.f276040h;
        TextLocalisedClause textLocalisedClause2 = value.f276039g;
        boolean z3 = value.i;
        if (z) {
            i = R$attr.uikit_colorForeground;
            i2 = R$attr.uikit_colorGreyTone50;
            resourceImage = value.f276038c;
        } else {
            i = R$attr.uikit_colorGreyTone20;
            resourceImage = value.d;
            i2 = i;
        }
        i93.e eVar = value.f276036a;
        if (!z3 || z) {
            if (z3 && textLocalisedClause2 != null) {
                textLocalisedClauseC = TextLocalisedClause.c(textLocalisedClause2, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) value.f276037b, eVar.toString(), false), 27);
                textLocalisedClause = textLocalisedClauseC;
            }
            textLocalisedClause = null;
        } else {
            if (textLocalisedClause2 != null) {
                textLocalisedClauseC = TextLocalisedClause.c(textLocalisedClause2, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent_30), false, null, false, null, 254), 27);
                textLocalisedClause = textLocalisedClauseC;
            }
            textLocalisedClause = null;
        }
        return new RowDelegate.Model(eVar.toString(), resourceImage, null, null, TextLocalisedClause.c(value.e, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 27), TextLocalisedClause.c(value.f, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 27), textLocalisedClause, null, 0, new vf(z3, value.f276040h), false, false, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 1056958060);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(e03.b r56) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u03.j.c(e03.b):java.util.List");
    }

    public final ArrayList f(e03.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = ((jla.h) this.e.f257629a).d("security_hub.card_connections", null) == bla.c.ENABLED;
        arrayList.add(new RowDelegate.Model("LINKED_WALLETS_ITEM_ID", new ResourceImage(z ? R$drawable.uikit_icn_24_link : R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(z ? com.revolut.feature.security_hub.api.R$string.security_hub_home_card_connections : R$string.card_action_linked_wallets_title, null, null, 14), new TextLocalisedClause(z ? com.revolut.feature.security_hub.api.R$string.security_hub_card_connections_card_settings_subtitle : R$string.card_action_linked_wallets_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
        int size = arrayList.size();
        Iterator it8 = bVar.f.iterator();
        while (it8.hasNext()) {
            arrayList.add(g((a) it8.next()));
        }
        Iterator it9 = bVar.f.iterator();
        while (true) {
            if (!it9.hasNext()) {
                i = -1;
                break;
            }
            a aVar = (a) it9.next();
            if (aVar.f276036a == i93.e.CONTACTLESS && aVar.i) {
                break;
            }
            i++;
        }
        o oVar = bVar.f121383g;
        dj0.d dVar = oVar != null ? oVar.f150158b.f150156c : null;
        if (oVar != null && dVar != null && i != -1) {
            int i2 = size + i + 1;
            f0 f0Var = bVar.f121380a;
            h93.n nVar = oVar.f150158b;
            dj0.d dVar2 = nVar.f150154a;
            dj0.d dVar3 = nVar.f150156c;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_settings_item_contactless_limit_title, null, null, 14);
            List listK = v.k(dVar2, dVar3);
            ArrayList arrayList2 = new ArrayList(w.t(listK, 10));
            Iterator it10 = listK.iterator();
            while (it10.hasNext()) {
                arrayList2.add(new MoneyClause((dj0.d) it10.next(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
            }
            arrayList.add(i2, new RowDelegate.Model("CARD_SCA_ITEM", new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, textLocalisedClause, yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2), null, null, 0, new pf(new TextLocalisedClause(R$string.card_settings_item_contactless_limit_action_reset, null, null, 14), null, null, false, null, null, 510), false, false, null, null, null, null, null, f0Var, null, 0, 0, 0, 0, 1056962412));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("SECURITY_SETTINGS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.card_settings_section_security, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }
}
