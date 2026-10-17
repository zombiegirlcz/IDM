package qa5;

import aim.e;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sa5.c;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f243961a;

    public b(c uiMapper) {
        Intrinsics.checkNotNullParameter(uiMapper, "uiMapper");
        this.f243961a = uiMapper;
    }

    public final ActionsBottomSheetController a(CreditPostTerminationPlanDetails planDetails) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.post_termination_plan_bottom_sheet_title, null, null, 14);
        int i = a.f243960a[planDetails.f70653b.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.post_termination_plan_bottom_sheet_description, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.post_termination_plan_bottom_sheet_description_without_discount, null, null, 14);
        }
        e eVarA = this.f243961a.a(planDetails);
        ArrayList arrayList = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(R$string.post_termination_plan_bottom_sheet_action, null, null, 14), null);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return BottomSheet.b(textLocalisedClause2, textLocalisedClause, null, arrayList, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), Constants.TAG_GPI_VERSION);
            }
            CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) bVar.next();
            arrayList.add(new BottomSheet.Item.CellItem(model.f51832a, model.f51833b.f10536a, model.f51834c, null, false, null, 0, 104));
        }
    }
}
