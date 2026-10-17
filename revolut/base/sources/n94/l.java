package n94;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import my3.p;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        my3.f fVar = domainState.f213565a;
        int i = R$string.credit_application_outstanding_debts_v3_debts_hub_title;
        String str = fVar.f210312a;
        my3.d dVar = fVar.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(str), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_subtitle, u.c(fVar.f210313b), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_confirm_button, u.c(fVar.f210314c), null, 12);
        List<my3.e> list = fVar.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list.iterator();
            loop1: while (it8.hasNext()) {
                p pVar = ((my3.e) it8.next()).f210311g;
                if (pVar != null) {
                    ArrayList<my3.o> arrayList = pVar.f;
                    if (!arrayList.isEmpty()) {
                        for (my3.o oVar : arrayList) {
                            if (oVar.f0() && oVar.k0() && oVar.getValue() == null) {
                                z = false;
                                break loop1;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            z = true;
        }
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_add_debt_item_title, u.c(dVar.f210306b), null, 12);
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_add_debt_item_subtitle, u.c(dVar.f210307c), null, 12);
        a1 a1Var = dVar.f210305a;
        RowDelegate.Model model = new RowDelegate.Model("ADD_NEW_DEBT_ITEM_LIST_ID", a1Var != null ? new RowDelegate.Model.MainImage.Image40(a1Var.d(), null, null, false, null, false, 60) : null, textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (my3.e eVar : list) {
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_debt_item_title, u.c(eVar.f210309b), null, 12);
            String str2 = eVar.f210310c;
            TextLocalisedClause textLocalisedClause7 = str2 != null ? new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_debt_item_subtitle, u.c(str2), null, 12) : null;
            a1 a1Var2 = eVar.d;
            RowDelegate.Model.MainImage.Image40 image40 = a1Var2 != null ? new RowDelegate.Model.MainImage.Image40(a1Var2.d(), null, null, false, null, false, 60) : null;
            TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_debt_item_value_primary, u.c(eVar.e), null, 12);
            String str3 = eVar.f;
            arrayList2.add(new RowDelegate.Model("debt_item_list_id", image40, textLocalisedClause6, null, 0, textLocalisedClause7, null, null, 0, new RowDelegate.Model.c.b(textLocalisedClause8, str3 != null ? new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debts_hub_debt_item_value_secondary, u.c(str3), null, 12) : null, null, false, 124), eVar.f210311g != null, null, false, null, null, null, null, null, null, eVar, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        Unit unit = Unit.f186387a;
        return new j(u.a(eVarB), textLocalisedClause, textLocalisedClause2, textLocalisedClause3, z);
    }
}
