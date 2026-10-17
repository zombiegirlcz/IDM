package o07;

import as6.l;
import as6.m;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public final ArrayList a(as6.a groupType, List rules) {
        TextLocalisedClause textLocalisedClause;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(rules, "rules");
        List<l> list = rules;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            String strName = groupType.name();
            if (lVar instanceof as6.e) {
                as6.e eVar = (as6.e) lVar;
                m.b bVar = eVar.f8805c;
                wi0.b bVar2 = eVar.f8804b;
                if (bVar.equals(m.b.c.f8817a)) {
                    wi0.b.Companion.getClass();
                    textLocalisedClause = new TextLocalisedClause(Intrinsics.f(bVar2, wi0.b.p0) ? R$string.freelancer_processing_fees_rule_local_cards_consumer_uk : R$string.freelancer_processing_fees_rule_local_cards_consumer_europe, null, null, 14);
                } else if (bVar.equals(m.b.C0075b.f8816a)) {
                    textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_local_cards_consumer_in_country, u.c(new CountryClause(bVar2, null)), null, 12);
                } else {
                    if (!bVar.equals(m.b.a.f8815a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_local_cards_commercial_in_country, u.c(new CountryClause(bVar2, null)), null, 12);
                }
            } else if (lVar instanceof as6.h) {
                m.c cVar = ((as6.h) lVar).f8809b;
                if (cVar.equals(m.c.b.f8819a)) {
                    i2 = R$string.freelancer_processing_fees_rule_regional_cards_consumer_europe;
                } else {
                    if (!cVar.equals(m.c.a.f8818a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.freelancer_processing_fees_rule_regional_cards_commercial_europe;
                }
                textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
            } else if (lVar instanceof as6.d) {
                m.a aVar = ((as6.d) lVar).f8802b;
                if (aVar.equals(m.a.b.f8814a)) {
                    i = R$string.freelancer_processing_fees_rule_international_cards_consumer;
                } else {
                    if (!aVar.equals(m.a.C0074a.f8813a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.freelancer_processing_fees_rule_international_cards_commercial;
                }
                textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            } else if (lVar instanceof as6.g) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_other_cards, null, null, 14);
            } else if (lVar instanceof as6.j) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_revolut_pay_personal, null, null, 14);
            } else if (lVar instanceof as6.i) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_revolut_pay_commercial, null, null, 14);
            } else if (lVar instanceof as6.k) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_revolut_pay_smile, null, null, 14);
            } else {
                if (!(lVar instanceof as6.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_rule_open_banking, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
            as6.c cVarA = lVar.a();
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.freelancer_processing_fees_fee_percentage_caption, u.c(new PercentageClause(lVar.a().f8799a, (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
            dj0.d dVar = cVarA.f8800b;
            MoneyClause moneyClause = dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
            arrayList.add(new CellDetailsDelegate.Model(strName, textLocalisedClause2, moneyClause != null ? new TextLocalisedClause(R$string.freelancer_processing_fees_fee_percentage_and_absolute_caption, v.k(textLocalisedClause3, moneyClause), null, 12) : textLocalisedClause3, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        return arrayList;
    }
}
