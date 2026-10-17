package yp9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zp9.x;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillInputData f315797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f315798b;

    public b(SplitBillInputData inputData, x splitFooterMapper, f splitBillSummaryItemizationButtonsDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(splitFooterMapper, "splitFooterMapper");
        Intrinsics.checkNotNullParameter(splitBillSummaryItemizationButtonsDelegate, "splitBillSummaryItemizationButtonsDelegate");
        this.f315797a = inputData;
        List list = inputData.f79198b;
        dj0.d.Companion.getClass();
        dj0.d dVarA = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarA = i == 0 ? com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a() : pyd.c.O(dVarA, com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj2).a());
            i = i2;
        }
        this.f315798b = dVarA;
    }

    public static IconNavBarMenuItem a() {
        return new IconNavBarMenuItem("INFO_ITEM_MENU_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
