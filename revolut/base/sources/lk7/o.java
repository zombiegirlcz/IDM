package lk7;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import ip0.c2;
import ip0.d2;
import ip0.p10;
import ip0.pb0;
import ip0.qi;
import ip0.t10;
import ip0.xk;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jmrtd.lds.LDSFile;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListSubheaderDelegate.Model f196291b;

    public /* synthetic */ o(ListSubheaderDelegate.Model model, int i) {
        this.f196290a = i;
        this.f196291b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f196290a;
        p10 p10Var = p10.f165755a;
        Function0 it8 = (Function0) obj2;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                return r.c(CFACReimbursementType.DOC_PROOF_REIMBURSEMENT, this.f196291b);
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB = zhm.u.b();
                for (int i2 = 0; i2 < 3; i2++) {
                    eVarB.add(new pb0(a0.d.n("loading_coverage_cell_", i2)));
                }
                return yp0.b.g(zhm.u.a(eVarB), this.f196291b, null, 0, 0, 126);
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                qi qiVar = new qi("TABS_LOADING_LIST_ID", 2);
                IntRange intRangeO = kotlin.ranges.f.o(0, 8);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it9 = intRangeO.iterator();
                while (it9.f289625c) {
                    arrayList.add(new d2(a0.d.n("TOP_MOVERS_GRID_LOADING_", it9.nextInt()), c2.CIRCLE));
                }
                Float fValueOf = Float.valueOf(16.0f);
                int i3 = R$attr.uikit_dp16;
                return yp0.b.g(zhm.v.k(qiVar, new xk("TOP_MOVERS_GRID_LOADING_LIST_ID", arrayList, 4, null, fValueOf, 0, 0, i3, i3, 63976)), this.f196291b, null, R$attr.uikit_dp12, R$attr.uikit_dp24, 114);
            case 3:
                Intrinsics.checkNotNullParameter(it8, "getDefaultLoadingItems");
                return yp0.b.i(new t10("ManagedPortfolioDetailsAboutInfoExtensionMapper_about_text_loading", p10Var), this.f196291b, null, 0, 0, 126);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                return yp0.b.i(new t10("index-overview-about", p10Var), this.f196291b, null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
        }
    }

    public /* synthetic */ o(q qVar, ListSubheaderDelegate.Model model) {
        this.f196290a = 0;
        this.f196291b = model;
    }
}
