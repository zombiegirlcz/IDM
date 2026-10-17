package rp4;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmationItem;
import dx4.a1;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        RowDelegate.Model.MainImage.Image24 image24;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CreditCardAutopayConfirmation creditCardAutopayConfirmation = domainState.f256255a;
        int i = R$string.credit_card_autopay_amount_confirmation_title;
        String str = creditCardAutopayConfirmation.f70697b;
        String str2 = creditCardAutopayConfirmation.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str3 = creditCardAutopayConfirmation.f70698c;
        int i2 = 6;
        lw0.a aVar = new lw0.a(textLocalisedClause, str3 != null ? new TextLocalisedClause(R$string.credit_card_autopay_amount_confirmation_description, u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24);
        m6 m6Var = n6.Companion;
        aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.credit_common_not_now, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, c.f256258a, 508), m6.c(m6Var, new TextLocalisedClause(R$string.credit_common_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, str2 == null || str2.length() == 0 || (str2.length() != 0 && domainState.f256256b), null, null, b.f256257a, 476), (Clause) null, (aw0.f) null, 25);
        aim.e eVarB = u.b();
        ArrayList arrayList = creditCardAutopayConfirmation.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i3 = 0;
        for (Object obj2 : arrayList) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            CreditCardAutopayConfirmationItem creditCardAutopayConfirmationItem = (CreditCardAutopayConfirmationItem) obj2;
            String strN = a0.d.n("amount_confirmation_item_", i3);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_autopay_amount_confirmation_info_item_title, u.c(new TextClause(creditCardAutopayConfirmationItem.f70700b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            String str4 = creditCardAutopayConfirmationItem.f70701c;
            TextLocalisedClause textLocalisedClause3 = str4 != null ? new TextLocalisedClause(R$string.credit_card_autopay_amount_confirmation_info_item_description, u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
            a1 a1Var = creditCardAutopayConfirmationItem.f70699a;
            if (a1Var != null) {
                GlyphImage glyphImage = new GlyphImage(a1Var.c(), null, null, 6);
                boolean z = false;
                image24 = new RowDelegate.Model.MainImage.Image24(glyphImage, z, z, i2);
            } else {
                image24 = null;
            }
            arrayList2.add(new RowDelegate.Model(strN, image24, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i3 = i5;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("amount_confirmation_checkbox", new TextLocalisedClause(R$string.credit_card_autopay_amount_confirmation_info_item_checkbox, prk.o.v(0, 30, null, null, str2), null, 12), domainState.f256256b, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            }
        }
        return new cii.b(gVar, u.a(eVarB), aVar);
    }
}
