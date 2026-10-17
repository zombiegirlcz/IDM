package rj7;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.R$string;
import ip0.jl0;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lk7.r;
import rd3.x;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f254630a;

    public n(r limitSectionItemsProvider) {
        Intrinsics.checkNotNullParameter(limitSectionItemsProvider, "limitSectionItemsProvider");
        this.f254630a = limitSectionItemsProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f;
        CFACReimbursementType cFACReimbursementType = domainState.f254624b;
        CFACProductDetails cFACProductDetails = domainState.d;
        List list2 = (List) iii.c.f(data, new b(3), new rhj.m(7), new x(this, 3));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cfac_claim_your_coverage_cancellation_reason_title, null, null, 14);
        String str = domainState.f254623a;
        List listC = u.c(new RowDelegate.Model("ID_COVERAGE_REASON_ITEM", null, textLocalisedClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(domainState.e.f74969c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List listO = i2b.a.o(i2b.a.o(list2, listC), this.f254630a.b(cFACProductDetails, cFACReimbursementType, false, null));
        int i = i.f254622a[cFACReimbursementType.ordinal()];
        if (i == 1) {
            list = cFACProductDetails.e.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = cFACProductDetails.f.f;
        }
        List<String> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (String str2 : list3) {
            arrayList.add(new jl0(str2, new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)));
        }
        ToDoItemDelegate.INSTANCE.getClass();
        ToDoItemDelegate.Companion.a(arrayList);
        return new l(i2b.a.o(listO, yp0.b.g(arrayList, new ListSubheaderDelegate.Model("ID_IMPORTANT_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(R$string.cfac_claim_your_coverage_important_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126)));
    }
}
