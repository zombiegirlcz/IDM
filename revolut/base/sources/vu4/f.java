package vu4;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f292250a;
        String str = domainState.f292251b;
        if (z) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_header_title, null, null, 14), new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_header_subtitle, u.c(str), null, 12), null, null, false, 28);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_button_title, null, null, 14);
            List listK = v.k(new RowDelegate.Model("id_row_earn_rev_points", new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_bullets_rate_title, null, null, 14), new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_bullets_rate_short_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676), new RowDelegate.Model("id_row_cashback_balance_rev_points", new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_bullets_cashback_title, null, null, 14), new TextLocalisedClause(R$string.credit_credit_card_rev_points_existing_account_bullets_cashback_subtitle, u.c(str), null, 12), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new d(textLocalisedClause, listK, aVar);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_header_subtitle, u.c(str), null, 12);
        int i = R$attr.uikit_colorForeground;
        lw0.a aVar2 = new lw0.a(textLocalisedClause2, textLocalisedClause3, new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, new ImageTransformations(null, null, null, null, null, 53, 53, 31), (Clause) null, 182), null), null, false, 24);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_button_title, null, null, 14);
        List listK2 = v.k(new RowDelegate.Model("id_row_earn_rev_points", new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_bullets_rate_title, null, null, 14), new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_bullets_rate_short_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676), new RowDelegate.Model("id_row_cashback_balance_rev_points", new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_bullets_cashback_title, null, null, 14), new TextLocalisedClause(R$string.credit_credit_card_rev_points_new_account_bullets_cashback_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        return new d(textLocalisedClause4, listK2, aVar2);
    }
}
