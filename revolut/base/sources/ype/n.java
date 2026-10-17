package ype;

import android.text.InputFilter;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.models.Checkmark;
import com.revolut.feature.tax_residency.impl.v2.models.WhereToFindTinHint;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$InputData;
import ip0.lr;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TinInputScreenContract$InputData f315859a;

    public n(TinInputScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f315859a = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause textLocalisedClause;
        int i;
        int i2;
        Clause textLocalisedClause2;
        aw0.i eVar;
        int i3;
        int i5;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f315850c;
        Boolean bool = domainState.e;
        boolean z3 = domainState.d;
        boolean z4 = (z && !z3) || Intrinsics.f(bool, Boolean.FALSE);
        TextClause textClause = new TextClause(domainState.f315849b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TinInputScreenContract$InputData tinInputScreenContract$InputData = this.f315859a;
        String str = tinInputScreenContract$InputData.f90309c;
        k kVar = tinInputScreenContract$InputData.i;
        List list = tinInputScreenContract$InputData.f90311h;
        InputTextDelegate.Model model = new InputTextDelegate.Model("tin_input_field", textClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(tinInputScreenContract$InputData.f.f90182a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, null, false, z4 ? new TextLocalisedClause(R$string.tax_residency_enter_value_error, u.c(new TextClause(tinInputScreenContract$InputData.f90309c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, null, null, null, false, null, null, z4, false, false, false, new lr(524433), 0, null, null, false, true, null, null, true, u.c(new InputFilter.AllCaps()), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1679949984, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i6 = 0;
        for (Object obj2 : list2) {
            int i21 = i6 + 1;
            if (i6 < 0) {
                v.s();
                throw null;
            }
            Checkmark checkmark = (Checkmark) obj2;
            String strN = a0.d.n("tin_input_checkmark_", i6);
            TextClause textClause2 = new TextClause(checkmark.f90153b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            int i22 = m.f315858c[checkmark.f90152a.ordinal()];
            if (i22 == 1) {
                i5 = R$drawable.uikit_icn_24_check;
            } else if (i22 == 2) {
                i5 = R$drawable.uikit_icn_24_dot;
            } else {
                if (i22 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = R$drawable.uikit_icn_24_cross;
            }
            arrayList.add(new CellDetailsStandaloneNoteDelegate.Model(strN, null, textClause2, null, new ResourceImage(i5, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false, null, i6 == 0 ? R$attr.uikit_dp12 : R$attr.uikit_dp4, i6 == v.j(list) ? R$attr.uikit_dp12 : R$attr.uikit_dp4, 1642));
            i6 = i21;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(arrayList, u.c(model));
        int[] iArr = m.f315856a;
        int i32 = iArr[kVar.ordinal()];
        if (i32 == 1) {
            i = 12;
            textLocalisedClause = new TextLocalisedClause(R$string.tin_flow_missing_tin_title, u.c(new TextClause(tinInputScreenContract$InputData.f90308b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextClause(tinInputScreenContract$InputData.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            i = 12;
        }
        int i33 = iArr[kVar.ordinal()];
        if (i33 == 1) {
            i2 = 1;
            textLocalisedClause2 = new TextLocalisedClause(R$string.tin_flow_missing_tin_description, v.k(new TextClause(tinInputScreenContract$InputData.f90309c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryClause(tinInputScreenContract$InputData.f90307a, null)), null, i);
        } else {
            if (i33 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new HtmlClause(1, 28, (Integer) null, (Object) null, tinInputScreenContract$InputData.e);
            i2 = 1;
        }
        WhereToFindTinHint whereToFindTinHint = tinInputScreenContract$InputData.k;
        if (whereToFindTinHint != null) {
            TextClause textClause3 = new TextClause(whereToFindTinHint.f90191c, (Style) new Click(30, (Integer) null, (Object) null, "tin_input_learn_more_click", false), (Integer) null, false, (o9) null, (List) null, 124);
            Clause[] clauseArr = new Clause[2];
            clauseArr[0] = textLocalisedClause2;
            clauseArr[i2] = textClause3;
            textLocalisedClause2 = yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(clauseArr));
        }
        Clause clause = textLocalisedClause2;
        m6 m6Var = n6.Companion;
        n6 n6VarC = m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "tin_input_continue_loading", (domainState.f315850c && z3 && Intrinsics.f(bool, Boolean.TRUE)) ? i2 : 0, null, null, null, 972);
        i iVar = tinInputScreenContract$InputData.f90312j;
        if (iVar != null) {
            int i43 = m.f315857b[iVar.ordinal()];
            if (i43 == i2) {
                i3 = R$string.tax_residency_list_remove_tax_residence;
            } else if (i43 == 2) {
                i3 = com.revolut.retail.common.ui.R$string.common_action_not_now;
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$string.tin_flow_cant_provide;
            }
            eVar = new aw0.h(false, n6VarC, m6.c(m6Var, new TextLocalisedClause(i3, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, "tin_input_secondary_button", false, null, null, iVar, 492), null, null, null, 121);
        } else {
            eVar = new aw0.e(false, null, null, n6VarC, null, null, 55);
        }
        return new j(arrayListE0, textLocalisedClause, clause, eVar);
    }
}
