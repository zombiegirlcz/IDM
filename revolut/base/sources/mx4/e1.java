package mx4;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.a5;
import dx4.b5;
import dx4.z4;
import ip0.b50;
import ip0.c50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.j50;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e1 {
    public static ArrayList a(b5 item) {
        i50 h50Var;
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = item.f120560a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            a5 a5Var = (a5) obj2;
            b50 b50Var = c50.Companion;
            int size = item.f120560a.size();
            b50Var.getClass();
            c50 c50VarA = b50.a(i, size);
            Clause htmlLocalisedClause = new HtmlLocalisedClause(R$string.credit_application_constructor_stepper_vertical_title, zhm.u.c(a5Var.f120547a), (Integer) null, (Object) null, 28);
            boolean z = a5Var.d instanceof dx4.h;
            String str = a5Var.f120547a;
            if (z) {
                int i3 = R$drawable.uikit_icn_16_info_outline;
                ImageClauseTint.Color color = new ImageClauseTint.Color(R$attr.uikit_colorGreyTone50);
                Float fValueOf = Float.valueOf(12.0f);
                htmlLocalisedClause = new CompositeClause(zhm.v.k(htmlLocalisedClause, new ImageClause(i3, color, fValueOf, fValueOf, 16)), sx4.g.e(3), null, null, 12);
            }
            HtmlLocalisedClause htmlLocalisedClause2 = new HtmlLocalisedClause(R$string.credit_application_constructor_stepper_vertical_description, zhm.u.c(a5Var.f120548b), (Integer) null, (Object) null, 28);
            z4 z4Var = a5Var.f120549c;
            if (z4Var instanceof z4.a) {
                h50Var = new f50(j50.NORMAL, c50VarA, false);
            } else if (z4Var instanceof z4.b) {
                h50Var = new g50(c50VarA);
            } else {
                if (!(z4Var instanceof z4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                h50Var = new h50(j50.NORMAL, c50VarA);
            }
            i50 i50Var = h50Var;
            dx4.l lVar = a5Var.d;
            arrayList2.add(new ProgressStepVerticalV2Delegate.Model(str, htmlLocalisedClause, htmlLocalisedClause2, i50Var, lVar != null, null, 0, 0, 0, lVar, false, false, 30688));
            i = i2;
        }
        return arrayList2;
    }
}
