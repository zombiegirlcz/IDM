package yxc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import ip0.b50;
import ip0.c50;
import ip0.d50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.j50;
import ip0.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements z9l.i {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.j f317654a;

    public r(z9l.j dateMapper, l iconUiMapper) {
        Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
        Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
        this.f317654a = dateMapper;
    }

    public static boolean b(Step step) {
        return (step.f64198h != fr2.a.BUTTON || step.f64197g == null || step.f == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProgressStepVerticalV2Delegate.Model c(SectionContent.ProgressionSteps progressionSteps, Step step, int i, boolean z, boolean z3, String str, boolean z4, Integer num, Integer num2) {
        String str2;
        TextClause textClause;
        Integer num3;
        String str3;
        ArrayList arrayList;
        TextClause textClause2;
        i50 g50Var;
        i50 f50Var;
        String strR;
        String str4 = step.f64194a;
        String str5 = step.f64197g;
        TextClause textClause3 = new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause clauseA = ((s) this.f317654a).a(progressionSteps, step);
        ArrayList arrayList2 = progressionSteps.f64180c;
        int i2 = progressionSteps.d;
        TextClause textClause4 = (z3 || (str2 = step.f64195b) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (str5 == null || step.f == null || b(step)) {
            textClause = textClause3;
            num3 = null;
            str3 = str5;
            arrayList = arrayList2;
            textClause2 = null;
        } else {
            str3 = str5;
            textClause = textClause3;
            num3 = null;
            arrayList = arrayList2;
            textClause2 = new TextClause(str3, (Style) new Click(28, (Integer) null, (Object) step.f, str5, false), (Integer) null, false, (o9) null, (List) null, 124);
        }
        m70.a.c(t0.f186434a);
        Clause textClause5 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause[] elements = {clauseA, textClause4, textClause2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            listL = zhm.u.c(textClause5);
        }
        List list = listL;
        if (list.size() > 1) {
            textClause5 = new DotDividerClause(num3);
        }
        CompositeClause compositeClauseM = yoj.b.m(textClause5, list);
        boolean z6 = i2 == v.j(arrayList);
        boolean z11 = i == i2;
        b50 b50Var = c50.Companion;
        int size = arrayList.size();
        b50Var.getClass();
        c50 c50VarA = b50.a(i, size);
        if (b(step)) {
            g50Var = new d50((z || str3 == null) ? num3 : new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, c50VarA, 6);
        } else {
            if (i < i2) {
                f50Var = new h50(z6 ? j50.INACTIVE : j50.NORMAL, c50VarA);
            } else if (z11) {
                f50Var = new f50(z6 ? j50.INACTIVE : j50.NORMAL, c50VarA, z);
            } else {
                g50Var = new g50(c50VarA);
            }
            g50Var = f50Var;
        }
        if (z4 && (z3 || i == i2)) {
            strR = a0.d.r(str, "ID_PROGRESS_STEP_");
        } else {
            strR = str + "ID_PROGRESS_STEP_" + i + step.f64194a;
        }
        return new ProgressStepVerticalV2Delegate.Model(strR, textClause, compositeClauseM, g50Var, false, (z && b(step) && str3 != null) ? new z40(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : num3, (num == null || i != 0) ? R$attr.uikit_dp4 : num.intValue(), (num2 == null || i != arrayList.size() - 1) ? R$attr.uikit_dp12 : num2.intValue(), 0, step.f, z3, z3 && z4, 5712);
    }

    public final List d(SectionContent.ProgressionSteps progressionSection, boolean z) {
        Intrinsics.checkNotNullParameter(progressionSection, "progressionSection");
        return d0.E0(z9l.i.a(this, progressionSection, z, null, null, null, false, 60), zhm.u.c(new CellDetailsDelegate.Model(j6.a.q("ID_TICKETOR_PROGRESSION_PROGRESS_TITLE_", progressionSection.f64178a), new TextClause(progressionSection.f64178a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, null, null, false, 0, 0, 31736)));
    }
}
