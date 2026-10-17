package ek7;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import eh3.s;
import ip0.s7;
import ip0.y10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik7.j f126977a;

    public q(ik7.j expenseItemMapper, CFACInsuranceAddExpensesItemMapper addExpensesItemMapper) {
        Intrinsics.checkNotNullParameter(expenseItemMapper, "expenseItemMapper");
        Intrinsics.checkNotNullParameter(addExpensesItemMapper, "addExpensesItemMapper");
        this.f126977a = expenseItemMapper;
    }

    public static List b(i iVar) {
        s7[] elements = {new s7("ID_CLAIMED_AMOUNT_ITEM", 0, 0, 0, 0, false, null, 126), new s7("ID_COVERAGE_ITEM", 0, 0, 0, 0, false, null, 126), iVar.f126964g.f74986a != null ? new s7("ID_EXCESS_PAYABLE_ITEM", 0, 0, 0, 0, false, null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ActionsView.Item item;
        ArrayList arrayListE0;
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.i;
        List list = domainState.f126962b;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_INPUT_CLAIM_NAME_ITEM", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.cfac_claim_review_claim_details_name, null, null, 14), false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -12, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListE02 = d0.E0((List) iii.c.f(domainState.f126965h, new ei8.d(this, domainState, 9), new s(this, domainState, 10), new ec8.q(this, domainState, 5)), u.c(model));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cfac_claim_review_claim_details_cancellation_reason_title, null, null, 14);
        String str2 = domainState.d;
        List list2 = domainState.f126963c;
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = domainState.f;
        if (z) {
            item = new ActionsView.Item("ID_SUPPORTING_DOCUMENTS_ACTION", null, false, null, null, list2.isEmpty() ? new TextLocalisedClause(R$string.cfac_claim_review_claim_details_cancellation_reason_action_add_supporting_documents, null, null, 14) : new TextLocalisedClause(R$string.cfac_claim_review_claim_details_cancellation_reason_action_supporting_documents, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
        } else {
            item = null;
        }
        sa saVar = new sa("ID_SUPPORTING_DOCUMENTS_ITEM", (Clause) textLocalisedClause, (Clause) textClause, v.l(item), false, (Image) ((list2.isEmpty() && z) ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), (y10) null, (Object) null, 4032);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListE03 = d0.E0(u.c(saVar), arrayListE02);
        Object[] elements = {new TextLocalisedClause(R$string.cfac_claim_review_claim_details_claimed_expenses_title, null, null, 14), !list.isEmpty() ? new TextClause(a0.d.n(" · ", list.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_CLAIMED_EXPENSES_ITEM", (Image) null, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (ResourceImage) null, false, false, (Clause) (list.size() > 3 ? new TextLocalisedClause(R$string.cfac_claim_review_claim_details_claimed_expenses_action_see_all, null, null, 14) : null), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
        if (list.isEmpty()) {
            arrayListE0 = yp0.b.g(CFACInsuranceAddExpensesItemMapper.a(), model2, null, 0, 0, 126);
        } else {
            ArrayList arrayListG = yp0.b.g(CFACInsuranceAddExpensesItemMapper.a(), model2, null, 0, 0, 126);
            ArrayList arrayListA = this.f126977a.a(d0.V0(list, 3), true);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            arrayListE0 = d0.E0(arrayListA, arrayListG);
        }
        return new m(d0.E0(arrayListE0, arrayListE03), !list.isEmpty());
    }
}
