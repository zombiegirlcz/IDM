package apb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$SalaryStudentHys;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tkb.e;
import xme.d;
import xme.g;
import xob.j;
import xob.k;
import xob.m;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f8138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f8139b;

    public c(e protectionSchemeMapper, dcd.b savingsInterestRateFormatter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(protectionSchemeMapper, "protectionSchemeMapper");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f8138a = savingsInterestRateFormatter;
        this.f8139b = featureToggleInteractor;
    }

    public static RowDelegate.Model c(String str, m mVar, SavingsProductData savingsProductData) {
        TextLocalisedClause textLocalisedClause;
        if ((str != null && str.length() != 0) || Intrinsics.f(mVar, k.f307775a)) {
            return null;
        }
        boolean z = mVar instanceof j;
        int i = b.f8136a[opg.a.g(savingsProductData).ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.savings_details_next_interest, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.savings_details_next_return, null, null, 14);
        }
        return new RowDelegate.Model("NEXT_INTEREST_PAYMENT_LIST_ITEM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_coins, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, z ? new TextLocalisedClause(R$string.savings_details_next_interest_payout_on, u.c(new TimeClause(oc.c.F(((j) mVar).f307774a), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.savings_details_next_interest_pending, null, null, 14), null, null, 0, null, !z, null, false, null, null, z ? null : new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), null, null, null, null, null, 0, 0, 0, 0, 536803288);
    }

    public static RowDelegate.Model d(xme.e eVar) {
        Object next;
        d dVar = eVar instanceof d ? (d) eVar : null;
        if (dVar != null) {
            Iterator it8 = dVar.f307230b.f307235c.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((g) next).f307236a, "residentWithholdingTax")) {
                    break;
                }
            }
            g gVar = (g) next;
            if (gVar != null) {
                String str = gVar.f307238c;
                Clause textLocalisedClause = dVar.e ? new TextLocalisedClause(R$string.savings_information_rwt_exempt, null, null, 14) : new TextClause(gVar.f307237b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (str != null) {
                    textLocalisedClause = new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(R$string.savings_information_rwt_update_subtitle, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), 10)), new DotDividerClause((Integer) null), null, null, 12);
                }
                return new RowDelegate.Model("RWT_LIST_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_briefcase_percent, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.savings_information_rwt_title, null, null, 14), null, 0, textLocalisedClause, null, null, 0, null, str != null, null, false, null, null, null, null, null, null, str != null ? new qkb.a(str) : null, null, 0, 0, 0, 0, 532674520);
            }
        }
        return null;
    }

    public final RowDelegate.Model a(SavingsProductData savingsProductData) {
        TextLocalisedClause textLocalisedClause;
        ncd.d dVarG = opg.a.g(savingsProductData);
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        int i = b.f8136a[dVarG.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.savings_details_rate_interest, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.savings_details_rate_return, null, null, 14);
        }
        Clause clauseB = b(savingsProduct.o, textLocalisedClause);
        dcd.b bVar = this.f8138a;
        Clause clauseN = bVar.n(savingsProductData, null, true);
        if (clauseN == null) {
            clauseN = bVar.g(savingsProductData, false, null, true);
        }
        Clause clause = clauseN;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        mf mfVar = new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
        String str = savingsProduct.f86621h.f;
        return new RowDelegate.Model("VANILLA_INTEREST_RATE_LIST_ITEM", image24, clauseB, null, 0, clause, null, null, 0, null, false, null, false, null, null, mfVar, null, null, null, str != null ? new qkb.a(str) : null, null, 0, 0, 0, 0, 532611032);
    }

    public final Clause b(SavingsProduct.Campaign campaign, TextLocalisedClause textLocalisedClause) {
        String str;
        String str2 = (campaign == null || (str = (String) campaign.d.get("INTEREST TITLE")) == null || d0.W(str)) ? null : str;
        return (!((jte.d) this.f8139b).c(SavingsCoreApi$Toggles$SalaryStudentHys.f83119c) || str2 == null) ? textLocalisedClause : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
