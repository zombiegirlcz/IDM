package gk7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import fnk.o;
import hha.s;
import ip0.gu;
import ip0.pb0;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements p {
    public static aim.e b() {
        aim.e eVarB = u.b();
        eVarB.add(new gu("LOADING_ITEM_0", 0, 0, 30));
        List listK = v.k(new pb0("LOADING_ITEM_1"), new pb0("LOADING_ITEM_2"), new pb0("LOADING_ITEM_3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f144330a;
        List list = (List) iii.c.f(data, new a(this, 1), new gcc.c(this, 18), new o(this, domainState, 29));
        List list2 = domainState.f144331b;
        boolean z = true;
        boolean z3 = !list2.isEmpty();
        TextLocalisedClause textLocalisedClause = list2.isEmpty() ? new TextLocalisedClause(R.string.common_action_add, null, null, 14) : new TextLocalisedClause(R$string.cfac_claim_select_expenses_action_continue, v1.c.v(list2), null, 12);
        boolean z4 = ((List) data.getContent()) != null ? !r2.isEmpty() : true;
        if (domainState.f144332c.length() <= 0) {
            if (!(((List) data.getContent()) != null ? !r0.isEmpty() : false)) {
                z = false;
            }
        }
        hha.d dVar = (hha.d) domainState.d.getContent();
        TextLocalisedClause textLocalisedClause2 = (dVar == null || !s.o(dVar)) ? new TextLocalisedClause(R$string.cfac_claim_select_expenses_subtitle, null, null, 14) : new TextLocalisedClause(R$string.cfac_claim_select_expenses_private_subtitle, null, null, 14);
        return new j(list, textLocalisedClause, z3, z4, z, textLocalisedClause2);
    }
}
