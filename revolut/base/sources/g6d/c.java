package g6d;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.BeneficiaryCreationType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static Clause a(ConfirmationResult result, BeneficiaryCreationType beneType, Integer num) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(beneType, "beneType");
        String strC = c(beneType);
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        List listN0 = d0.n0(strC, new String[]{" "}, 0, 6);
        String strB = b(result);
        if (strB == null) {
            strB = "";
        }
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        List listN02 = d0.n0(strB, new String[]{" "}, 0, 6);
        CompositeClause compositeClause = num != null ? new CompositeClause(v.k(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d(num.intValue())), null, null, null, 14) : null;
        e eVarB = u.b();
        int size = listN02.size();
        for (int i = 0; i < size; i++) {
            String str = (String) zhm.d0.e0(i, listN0);
            if (str == null) {
                str = "";
            }
            String str2 = (String) listN02.get(i);
            if (i > 0) {
                m70.a.t(t0.f186434a);
                eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            eVarB.add(new TextClause(str2, (Style) null, Integer.valueOf(!Intrinsics.f(str2, str) ? R$attr.uikit_colorStatusWarning : R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122));
        }
        if (!eVarB.isEmpty() && compositeClause != null) {
            eVarB.add(compositeClause);
        }
        e eVarA = u.a(eVarB);
        if (!eVarA.isEmpty()) {
            return new CompositeClause(eVarA, null, null, null, 14);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static String b(ConfirmationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String str = result.f;
        String str2 = result.d;
        String str3 = result.e;
        if (str != null && !d0.W(str)) {
            return str;
        }
        if (str2 == null || d0.W(str2) || str3 == null || d0.W(str3)) {
            return null;
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str2, " ", str3);
    }

    public static String c(BeneficiaryCreationType beneType) {
        Intrinsics.checkNotNullParameter(beneType, "beneType");
        if (beneType instanceof BeneficiaryCreationType.Personal) {
            BeneficiaryCreationType.Personal personal = (BeneficiaryCreationType.Personal) beneType;
            return com.google.android.gms.internal.mlkit_vision_face.a.o(personal.f86042a, " ", personal.f86043b);
        }
        if (beneType instanceof BeneficiaryCreationType.Business) {
            return ((BeneficiaryCreationType.Business) beneType).f86041a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause d(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10);
    }
}
