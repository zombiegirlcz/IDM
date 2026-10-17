package dnk;

import aw0.e0;
import aw0.g0;
import aw0.i0;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.bf;
import com.revolut.core.ui_kit.delegates.df;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.youTransactor.uCube.rpc.Constants;
import ggk.b1;
import ggk.f1;
import ggk.z0;
import ip0.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f116363b;

    public k(l iconMapper, i highlightedBenefitsLimitCalculator) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(highlightedBenefitsLimitCalculator, "highlightedBenefitsLimitCalculator");
        this.f116362a = iconMapper;
        this.f116363b = highlightedBenefitsLimitCalculator;
    }

    public static y1 b(f1 f1Var, e0 e0Var, int i, int i2) {
        List list = f1Var.f143717c;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        List listV0 = d0.V0(list, 8);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(n.a((String) it8.next()));
        }
        Integer num = f1Var.d;
        int iIntValue = num != null ? num.intValue() - d0.V0(f1Var.f143717c, 7).size() : r5.size() - 7;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (iIntValue <= 0) {
            numValueOf = null;
        }
        y1 y1Var = new y1(new i0(arrayList, e0Var, numValueOf != null ? new g0(numValueOf.intValue()) : null, 8));
        y1Var.i = i;
        y1Var.f167234g = i2;
        return y1Var;
    }

    public final aim.e a(b1 highlightedBenefits, Integer num) {
        Integer numValueOf;
        List listV0;
        Intrinsics.checkNotNullParameter(highlightedBenefits, "highlightedBenefits");
        if (num != null) {
            int iIntValue = num.intValue();
            if (highlightedBenefits.f143705c != null) {
                iIntValue--;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        List list = highlightedBenefits.f143704b;
        if (numValueOf != null && (listV0 = d0.V0(list, numValueOf.intValue())) != null) {
            list = listV0;
        }
        ArrayList arrayListE = e(list);
        f1 f1Var = highlightedBenefits.f143705c;
        RowDelegate.Model modelD = f1Var != null ? d(f1Var, arrayListE.size()) : null;
        aim.e eVarB = u.b();
        eVarB.addAll(arrayListE);
        if (modelD != null) {
            eVarB.add(modelD);
        }
        return u.a(eVarB);
    }

    public final LabelButtonDelegate.Model c(PlansDashboardLayout$Button plansDashboardLayout$Button, String str) {
        String strConcat = str.concat("_button");
        TextClause textClause = new TextClause(plansDashboardLayout$Button.f102734c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        String str2 = plansDashboardLayout$Button.d;
        return new LabelButtonDelegate.Model(strConcat, textClause, null, str2 != null ? ResourceImage.a(this.f116362a.c(str2), 0, Integer.valueOf(R$attr.uikit_colorForeground), new ImageTransformations(null, null, null, null, null, 16, 16, 31), 183) : null, plansDashboardLayout$Button.f102733b, 0, 0, 0, 2020);
    }

    public final RowDelegate.Model d(f1 f1Var, int i) {
        df dfVar;
        String strN = a0.d.n("highlighted_benefit_", i);
        TextClause textClause = new TextClause(f1Var.f143715a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(this.f116362a.c(f1Var.f143716b), false, false, 6);
        List list = f1Var.f143717c;
        List list2 = !list.isEmpty() ? list : null;
        if (list2 == null) {
            dfVar = null;
        } else {
            List listV0 = d0.V0(list2, 7);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList.add(n.a((String) it8.next()));
            }
            Integer num = f1Var.d;
            int iIntValue = num != null ? num.intValue() - d0.V0(list, 7).size() : list.size() - 7;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue <= 0) {
                numValueOf = null;
            }
            dfVar = new df(arrayList, numValueOf, 4);
        }
        return new RowDelegate.Model(strN, image24, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, dfVar != null ? new bf(dfVar) : null, null, null, null, null, 0, 0, 0, 0, 536344568);
    }

    public final ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            z0 z0Var = (z0) obj2;
            String strN = a0.d.n("highlighted_benefit_", i);
            TextClause textClause = new TextClause(z0Var.f143807a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = z0Var.f143809c;
            arrayList.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image24(this.f116362a.c(z0Var.f143808b), false, false, 6), textClause, null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
        return arrayList;
    }

    public final CellDetailsStandaloneNoteDelegate.Model f(String str, String str2, String str3) {
        return new CellDetailsStandaloneNoteDelegate.Model(str, null, new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, ResourceImage.a(this.f116362a.c(str3), 0, Integer.valueOf(R$attr.uikit_colorForeground), null, Constants.TAG_BLE_FIRMWARE_VERSION), false, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 1642);
    }
}
