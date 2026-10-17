package ixe;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.revolut.feature_fourthline_impl.R;
import e93.j0;
import ip0.y7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    public static qv0.i a(String str, TextLocalisedClause textLocalisedClause, MoneyClause moneyClause, boolean z) {
        if (!z) {
            return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), moneyClause, null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        int i = R$attr.uikit_dp8;
        return new y7(str, moneyClause, textLocalisedClause, null, 0, null, i, i, 1656);
    }

    public static qv0.i b(j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        return a("REV_POINTS_DISCOUNT_AMOUNT_LIST_ID", new TextLocalisedClause(R$string.checkout_footer_points_discount, null, null, 14), sx4.f.b(3, null, null, j0Var.f123877b.l()), false);
    }

    public static CellDetailsDelegate.Model c(dj0.d dVar) {
        if (dVar.k()) {
            return null;
        }
        return new CellDetailsDelegate.Model("TOP_UP_METHOD_FEE_ID", new TextLocalisedClause(R$string.topup_checkout_detail_card_surcharge, null, null, 14), sx4.f.b(3, null, null, dVar), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520);
    }

    public static qv0.i e(jxe.l lVar, boolean z) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.checkout_footer_total_amount_v2, null, null, 14);
        cxe.d dVarB = lVar.b();
        return a("TOTAL_CHECKOUT_PAYMENT_AMOUNT_LIST_ID", textLocalisedClause, sx4.f.b(3, null, null, pyd.c.O(dVarB.f109938a, pyd.c.M(dVarB.f109939b))), z);
    }

    public static List f(jxe.l lVar, boolean z, j0 j0Var) {
        cxe.d dVarC;
        dj0.d dVar = lVar.b().f109939b;
        if (dVar == null || dVar.k()) {
            dVar = null;
        }
        if (dVar == null) {
            if (!(lVar instanceof jxe.j) && (dVarC = lVar.c()) != null) {
                iVarA = a("LEFT_TO_PAY_LIST_ID", new TextLocalisedClause(R$string.topup_checkout_detail_left_to_pay, null, null, 14), sx4.f.b(3, null, null, dVarC.f109938a), z);
            }
            qv0.i[] elements = {e(lVar, z && iVarA == null), b(j0Var), iVarA};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        qv0.i iVarE = e(lVar, false);
        qv0.i iVarB = b(j0Var);
        dj0.d dVar2 = lVar.b().f109939b;
        CellDetailsDelegate.Model model = dVar2 == null ? null : new CellDetailsDelegate.Model("CREDIT_POCKET_PAYMENT_AMOUNT_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.topup_checkout_total_section_pay_with_credit, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), sx4.f.b(3, null, null, dVar2), null, null, null, null, 0, null, false, false, null, null, 32760);
        dj0.d dVar3 = lVar.b().f109938a;
        dj0.d.Companion.getClass();
        qv0.i[] elements2 = {iVarE, iVarB, model, dVar3.f(dj0.d.e) ? a("PAY_NOW_PAYMENT_AMOUNT_LIST_ID", new TextLocalisedClause(R$string.topup_checkout_total_section_pay_now, null, null, 14), sx4.f.b(3, null, null, dVar3), z) : null};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.d.L(elements2);
    }

    public final RowDelegate.Model d(jxe.m mVar) {
        DangerCircleBadge dangerCircleBadge;
        DangerCircleBadge dangerCircleBadge2;
        SelectedMethod selectedMethod = mVar.f179188a;
        if (selectedMethod == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        Clause f90904b = selectedMethod.getF90904b();
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        boolean z = selectedMethod instanceof SelectedMethod.StoredMethod;
        Clause f90905c = (!z || ((SelectedMethod.StoredMethod) selectedMethod).getE()) ? selectedMethod.getF90905c() : new TextLocalisedClause(R$string.topup_external_institutions_status_unavailable, null, null, 14);
        Image d = selectedMethod.getD();
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        SelectedMethod.StoredMethod storedMethod = z ? (SelectedMethod.StoredMethod) selectedMethod : null;
        if (storedMethod != null) {
            Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
            if (storedMethod.getE()) {
                if ((storedMethod instanceof SelectedMethod.StoredMethod.Card) && ((SelectedMethod.StoredMethod.Card) storedMethod).f90906g) {
                    dangerCircleBadge2 = new DangerCircleBadge(dw0.a.Suspicious);
                }
                dangerCircleBadge = null;
            } else {
                dangerCircleBadge2 = new DangerCircleBadge(dw0.a.Suspicious);
            }
            dangerCircleBadge = dangerCircleBadge2;
        } else {
            dangerCircleBadge = null;
        }
        return new RowDelegate.Model("SELECTED_METHOD_LIST_ID", new RowDelegate.Model.MainImage.Image40(d, dangerCircleBadge, null, false, null, false, 60), f90904b, null, 2, f90905c, null, null, 0, new pf(new TextLocalisedClause(R.string.topup_dd_input_change_button, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, selectedMethod, null, 0, 0, 0, 0, 532675528);
    }
}
