package mx4;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dx4.i5;
import ip0.xk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i1 {
    public static List a(i5 item) {
        Clause clauseW;
        Clause clauseW2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120637a.f120658a;
        dx4.l1 l1Var = item.f120638b;
        dx4.q qVar = l1Var.d;
        String strR = a0.d.r(str, l1Var.f120658a);
        int i = R$attr.uikit_dp0;
        dx4.l1 l1Var2 = item.f120637a;
        String str2 = l1Var2.f120658a;
        int i2 = R$string.credit_application_constructor_twin_tile_left_title;
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dx4.q qVar2 = l1Var2.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, zhm.u.c(yoj.b.w(textClause, qVar2 != null ? c8g.c.F(qVar2) : null)), null, 12);
        boolean z = qVar2 != null;
        int i3 = R$string.credit_application_constructor_twin_tile_left_value;
        TextClause textClause2 = new TextClause(l1Var2.f120659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = l1Var2.f120660c;
        if (str3 != null) {
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            clauseW = yoj.b.w(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str3, (Style) new Custom(null, false, db.BODY2, false, null, Constants.TAG_FB_CHARGING_STATUS), (Integer) null, false, (o9) null, (List) null, 124));
        } else {
            clauseW = null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i3, zhm.u.c(yoj.b.w(textClause2, clauseW)), null, 12);
        s4 s4Var = s4.FIXED_SMALL;
        t4 t4Var = new t4(textLocalisedClause2, s4Var);
        dx4.l lVar = l1Var2.e;
        int i5 = R$attr.uikit_dp8;
        int i6 = R$attr.uikit_dp0;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model(str2, textLocalisedClause, t4Var, null, z, lVar, null, i5, i5, i6, i6, 72);
        String str4 = l1Var.f120658a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_constructor_twin_tile_right_title, zhm.u.c(yoj.b.w(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), qVar != null ? c8g.c.F(qVar) : null)), null, 12);
        boolean z3 = qVar != null;
        int i21 = R$string.credit_application_constructor_twin_tile_right_value;
        TextClause textClause3 = new TextClause(l1Var.f120659b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str5 = l1Var.f120660c;
        if (str5 != null) {
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            clauseW2 = yoj.b.w(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str5, (Style) new Custom(null, false, db.BODY2, false, null, Constants.TAG_FB_CHARGING_STATUS), (Integer) null, false, (o9) null, (List) null, 124));
        } else {
            clauseW2 = null;
        }
        t4 t4Var2 = new t4(new TextLocalisedClause(i21, zhm.u.c(yoj.b.w(textClause3, clauseW2)), null, 12), s4Var);
        dx4.l lVar2 = l1Var.e;
        int i22 = R$attr.uikit_dp0;
        int i32 = R$attr.uikit_dp8;
        List listK = zhm.v.k(model, new CounterTextDelegate.Model(str4, textLocalisedClause3, t4Var2, null, z3, lVar2, null, i32, i32, i22, i22, 72));
        yp0.b.q(listK, 0, 0, 0, 0, 15);
        xk xkVar = new xk(strR, listK, null, null, null, i, i, i, i, 63612);
        yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(xkVar);
    }
}
