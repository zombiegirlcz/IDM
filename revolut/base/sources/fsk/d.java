package fsk;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.g2;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.models.StockFinancialsStatementItemExpandedState;
import com.revolut.retail.wealth.resources.R$string;
import ip0.gu;
import ip0.s7;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import uqk.i;
import uqk.j;
import uqk.k;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static Clause d(k kVar, Custom custom) {
        if (kVar instanceof i) {
            return new MoneyClause(((i) kVar).f282216a, new MoneyClause.Format.Shorts(false, 63), custom, o9.NON_SENSITIVE);
        }
        if (kVar instanceof j) {
            return new NumberClause(((j) kVar).f282217a, new NumberClause.Format.Compact(true), custom);
        }
        if (kVar == null) {
            return new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List e(int i, int i2) {
        gu guVar = new gu(j6.a.l(i, "LOADING_ITEM_ID_", "_$0"), 0, 0, 30);
        IntRange intRangeO = kotlin.ranges.f.o(1, i2);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.g(i, it8.nextInt(), "LOADING_ITEM_ID_", "_"), 0, 0, 0, 0, false, null, 126));
        }
        List listQ = i2b.a.q(guVar, arrayList);
        yp0.b.k(listQ, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return listQ;
    }

    public static ArrayList f(int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            uqk.g gVar = (uqk.g) it8.next();
            ArrayList arrayList3 = gVar.e;
            k kVar = gVar.d;
            String str = gVar.f282213a;
            a0.x(i2b.a.q(!arrayList3.isEmpty() ? new ListSubheaderDelegate.Model(j6.a.q("STATEMENT_ITEM_CELL_ID_", str), (Image) null, (Clause) new TextClause(gVar.f282214b, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), (Image) null, d(kVar, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254)), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514) : new CellDetailsDelegate.Model(j6.a.q("STATEMENT_ITEM_CELL_ID_", str), new TextClause(gVar.f282214b, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), d(kVar, new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254)), null, null, false, 0, g2.BOTTOM, null, null, null, 0, null, false, null, 0, 0, i, 0, 786280), f(R$attr.uikit_dp24, gVar.e)), arrayList2);
        }
        return arrayList2;
    }

    public final List a() {
        List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATEMENTS_ID", new TextLocalisedClause(R$string.wealth_stock_details_statements_empty, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D179", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, R$attr.uikit_dp24, 28644));
        yp0.b.k(listC, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 28);
        return listC;
    }

    public final List b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_details_statements_error_title, null, null, 14);
        int i = R$drawable.uikit_icn_24_retry;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
        Float fValueOf = Float.valueOf(16.0f);
        List listC = u.c(new FullScreenStateDelegate.Model("ERROR_STATEMENTS_ID", textLocalisedClause, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.wealth_stock_details_statements_error_action, null, null, 14))), false, null, null, false, 0, R$attr.uikit_dp24, 28612));
        yp0.b.k(listC, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 28);
        return listC;
    }

    public final ArrayList c(uqk.f statement, uqk.e selectedPeriod, Map expandedItems) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        ArrayList<uqk.g> arrayList = statement.e;
        ArrayList arrayList2 = new ArrayList();
        for (uqk.g gVar : arrayList) {
            String str = gVar.f282213a;
            ArrayList arrayList3 = gVar.e;
            Object obj2 = expandedItems.get(new StockFinancialsStatementItemExpandedState(str, selectedPeriod));
            if (obj2 == null) {
                obj2 = Boolean.TRUE;
            }
            Boolean bool = (Boolean) obj2;
            boolean zBooleanValue = bool.booleanValue();
            ArrayList arrayList4 = null;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("STATEMENT_ITEM_CELL_ID_", gVar.f282213a), (Image) null, (Clause) new TextClause(gVar.f282214b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), (Image) (!arrayList3.isEmpty() ? new ResourceImage(zBooleanValue ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), d(gVar.d, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)), (String) null, (ListSubheaderDelegate.Model.a) (!arrayList3.isEmpty() ? ListSubheaderDelegate.Model.a.C0411a.f52724a : null), false, false, (Object) (!arrayList3.isEmpty() ? new esk.a(gVar, zBooleanValue) : null), (Parcelable) null, 0, 0, 0, 0, 64418);
            ArrayList arrayListF = f(R$attr.uikit_dp16, arrayList3);
            if (bool.booleanValue()) {
                arrayList4 = arrayListF;
            }
            List listQ = i2b.a.q(model, arrayList4);
            yp0.b.k(listQ, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            a0.x(listQ, arrayList2);
        }
        return arrayList2;
    }
}
