package gv4;

import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        ?? r122;
        TextLocalisedClause textLocalisedClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wi0.b countryCode = domainState.f147051b;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause2 = Intrinsics.f(countryCode, wi0.b.l2) ? new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_header_title_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_header_title, null, null, 14);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause textLocalisedClause3 = Intrinsics.f(countryCode, wi0.b.p0) ? new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_header_subtitle_gb, null, null, 14) : new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_header_subtitle, null, null, 14);
        List list = domainState.f147050a;
        aim.e eVarB = u.b();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            CreditCardInAppStatement$AccruedInterest creditCardInAppStatement$AccruedInterest = (CreditCardInAppStatement$AccruedInterest) next;
            arrayList.add(new CellDetailsDelegate.Model(a0.d.n("id_credit_card_accrued_interest_item_", i2), new t0((Clause) new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_info_title, u.c(new TextClause(creditCardInAppStatement$AccruedInterest.f68867a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, false, 28), new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_info_value, u.c(sx4.f.b(3, null, null, creditCardInAppStatement$AccruedInterest.f68869c)), null, 12), null, creditCardInAppStatement$AccruedInterest, null, null, 0, null, false, true, null, null, 28600));
            it8 = it8;
            i2 = i3;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.p0;
        if (Intrinsics.f(countryCode, bVar)) {
            i = 14;
            r122 = 0;
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_title_gb, null, null, 14);
        } else {
            i = 14;
            r122 = 0;
            r122 = 0;
            textLocalisedClause = Intrinsics.f(countryCode, wi0.b.l2) ? new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_title_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        TextLocalisedClause textLocalisedClause5 = Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_subtitle_gb, r122, r122, i) : Intrinsics.f(countryCode, wi0.b.l2) ? new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_subtitle_nz, r122, r122, i) : new TextLocalisedClause(R$string.credit_card_statement_accrued_interests_section_highlight_subtitle, r122, r122, i);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i5 = R$drawable.uikit_icn_24_lightbulb;
        int i6 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model model = new RowDelegate.Model("id_credit_card_accrued_interest_tip", new RowDelegate.Model.MainImage.Image40(y.h(new Color.Solid(i6), 0.1f, companion, i5, new Color.Solid(i6)), null, null, false, null, false, 60), textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new i(u.a(eVarB), textLocalisedClause2, textLocalisedClause3);
    }
}
