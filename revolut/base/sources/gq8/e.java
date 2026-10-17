package gq8;

import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.feature.junior_tasks.api.models.JuniorTaskTaxBreakdownType;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxBreakdown;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f145596a;

    public e(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f145596a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        CellDetailsDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_challenges_taxes_breakdown_header_title, null, null, 14), null, null, null, false, 30);
        JuniorTasksTransferTaxes juniorTasksTransferTaxes = this.f145596a.f145593a;
        ArrayList<JuniorTasksTransferTaxBreakdown> arrayList = juniorTasksTransferTaxes.f77355b;
        ArrayList arrayList2 = new ArrayList();
        for (JuniorTasksTransferTaxBreakdown juniorTasksTransferTaxBreakdown : arrayList) {
            JuniorTaskTaxBreakdownType juniorTaskTaxBreakdownType = juniorTasksTransferTaxBreakdown.f77353b;
            if (juniorTaskTaxBreakdownType instanceof JuniorTaskTaxBreakdownType.Gmf) {
                model = new CellDetailsDelegate.Model("consumption.gmf", new t0((Clause) new TextLocalisedClause(R$string.junior_challenges_taxes_breakdown_gmf_tax_key, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(juniorTasksTransferTaxBreakdown.f77352a, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, juniorTasksTransferTaxBreakdown.f77353b, null, null, 0, null, false, false, null, null, 30648);
            } else {
                if (!(juniorTaskTaxBreakdownType instanceof JuniorTaskTaxBreakdownType.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                model = null;
            }
            if (model != null) {
                arrayList2.add(model);
            }
        }
        ArrayList<JuniorTasksTransferTaxBreakdown> arrayList3 = juniorTasksTransferTaxes.f77355b;
        ArrayList arrayList4 = new ArrayList();
        for (JuniorTasksTransferTaxBreakdown juniorTasksTransferTaxBreakdown2 : arrayList3) {
            dj0.d dVar = juniorTasksTransferTaxBreakdown2.f77353b instanceof JuniorTaskTaxBreakdownType.Unknown ? juniorTasksTransferTaxBreakdown2.f77352a : null;
            if (dVar != null) {
                arrayList4.add(dVar);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList4) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? (dj0.d) obj2 : pyd.c.O(dVarO, (dj0.d) obj2);
            i = i2;
        }
        dj0.d dVar2 = dVarO.f(dj0.d.e) ? dVarO : null;
        if (dVar2 != null) {
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("OTHER_TAXES_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.junior_challenges_taxes_breakdown_other_taxes_key, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30648);
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("TOTAL_TAXES_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.junior_challenges_taxes_breakdown_total_taxes_key, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(juniorTasksTransferTaxes.f77354a, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30648);
            ArrayList arrayListE0 = d0.E0(u.c(model2), arrayList2);
            yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            arrayList2 = d0.F0(model3, arrayListE0);
        } else {
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        }
        return new cii.b(null, arrayList2, aVar);
    }
}
