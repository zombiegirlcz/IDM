package p5k;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.models.quotes.CreditCardInterestPromotion;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.List;
import k5k.a0;
import k5k.g0;
import k5k.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsActionDelegate.Model a(Clause clause, g0 g0Var) {
        return new CellDetailsActionDelegate.Model("SECTION_CREDIT_CARD_ESTIMATED_INTEREST", new TextLocalisedClause(R$string.review_transfer_form_estimated_interest, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clause, false, true, null, g0Var, 0, 0, 32160);
    }

    public final CellDetailsActionDelegate.Model b(s interest, Object obj2) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        if (interest.f233181a.f(dj0.d.e)) {
            return new CellDetailsActionDelegate.Model("SECTION_INTEREST_APPLIES_ITEM_ID", new TextLocalisedClause(R$string.payments_core_fees_breakdown_section_interest_applies_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.payments_core_fees_breakdown_section_interest_applies_value, zhm.u.c(new MoneyClause(interest.f233181a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), false, false, null, obj2, 0, 0, 32224);
        }
        return null;
    }

    public final CellDetailsActionDelegate.Model c(u uVar) {
        if (uVar == null) {
            return null;
        }
        if (uVar instanceof s) {
            s sVar = (s) uVar;
            return b(sVar, new a0(sVar.f233181a, sVar.f233182b, sVar.f233183c, sVar.d));
        }
        if (uVar instanceof r) {
            r rVar = (r) uVar;
            return a(new MoneyClause(rVar.f233179a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new k5k.v(rVar.f233180b, rVar.f233179a));
        }
        if (uVar instanceof q) {
            q qVar = (q) uVar;
            return a(new TextLocalisedClause(R$string.payments_core_fees_breakdown_section_interest_applies_value, zhm.u.c(new MoneyClause(qVar.f233177a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), new k5k.u(qVar.f233177a, qVar.f233178b));
        }
        if (!(uVar instanceof t)) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_fees_breakdown_section_interest_free_title, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i = R$string.payments_core_fees_breakdown_section_interest_free_value;
        t tVar = (t) uVar;
        CreditCardInterestPromotion creditCardInterestPromotion = tVar.d;
        return new CellDetailsActionDelegate.Model("SECTION_INTEREST_FREE_ITEM_ID", textLocalisedClause, 0, resourceImage, new TextLocalisedClause(i, zhm.u.c(new TimeClause(creditCardInterestPromotion.f92274a, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12), false, false, null, new z(tVar.f233184a, tVar.f233185b, tVar.f233186c, creditCardInterestPromotion), 0, 0, 32224);
    }
}
