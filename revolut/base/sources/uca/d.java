package uca;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.model.PixQrCodeAmount;
import com.revolut.feature.pix.api.model.PixQrCodeChange;
import com.revolut.feature.pix.api.model.PixQrCodeMoneyBreakdown;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements i8a.c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final aim.e a(PixQrCodeMoneyBreakdown breakdown, PixQrCodeChange change) {
        ?? r132;
        ?? r2;
        int i;
        dj0.d dVar;
        ?? model;
        dj0.d dVar2;
        dj0.d discount;
        aim.e eVar;
        CellDetailsActionDelegate.Model model2;
        dj0.d original;
        aim.e eVarB = u.b();
        if (breakdown != null && (original = breakdown.f80465b) != null) {
            Intrinsics.checkNotNullParameter(original, "original");
            eVarB.add(new CellDetailsDelegate.Model("ID_ORIGINAL_AMOUNT", new TextLocalisedClause(R$string.pix_transaction_review_item_title_original_amount, null, null, 14), new MoneyClause(original, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        if (breakdown != null) {
            dj0.d dVar3 = breakdown.f;
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            dj0.d dVar4 = breakdown.e;
            dj0.d dVarO = (dVar3 == null || dVar4 == null) ? null : pyd.c.O(dVar3, dVar4);
            dj0.d dVar5 = dVarO == null ? dVar3 == null ? dVar4 : dVar3 : dVarO;
            if (dVar5 != null) {
                eVar = eVarB;
                model2 = new CellDetailsActionDelegate.Model("ID_INTEREST_AND_FEE", new TextLocalisedClause(R$string.pix_transaction_review_item_title_interest_and_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, breakdown, 0, 0, 0, 0, 4192228);
            } else {
                eVar = eVarB;
                model2 = null;
            }
            aim.e eVar2 = eVar;
            r132 = eVar2;
            if (model2 != null) {
                eVar2.add(model2);
                r132 = eVar2;
            }
        } else {
            r132 = eVarB;
        }
        if (breakdown == null || (discount = breakdown.d) == null) {
            r2 = 0;
            i = 14;
        } else {
            Intrinsics.checkNotNullParameter(discount, "discount");
            r2 = 0;
            i = 14;
            r132.add(new CellDetailsDelegate.Model("ID_DISCOUNT", new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_item_discount, null, null, 14), new MoneyClause(discount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, true, 0, 0, 31736));
        }
        if (change != null) {
            PixQrCodeAmount pixQrCodeAmount = change.f80431a;
            Intrinsics.checkNotNullParameter(change, "change");
            if (pixQrCodeAmount == null || (dVar2 = pixQrCodeAmount.f80424a) == null || dVar2.k()) {
                model = r2;
            } else {
                model = new CellDetailsDelegate.Model("ID_PIX_CHANGE_AMOUNT", new TextLocalisedClause(R$string.pix_transaction_review_item_title_pix_change_amount, r2, r2, i), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, Intrinsics.f(pixQrCodeAmount.f80425b, Boolean.TRUE) ? new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : r2, true, 0, 0, 31224);
            }
            if (model != 0) {
                r132.add(model);
            }
        }
        if (breakdown != null && (dVar = breakdown.f80467g) != null) {
            Intrinsics.checkNotNullParameter(dVar, "final");
            r132.add(new CellDetailsDelegate.Model("ID_TOTAL_AMOUNT", new TextLocalisedClause(R$string.pix_transaction_review_item_title_total_amount, r2, r2, i), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        }
        aim.e eVarA = u.a(r132);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
