package yb4;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinancialSituationChangesScreenContract$InputData f312190a;

    public k(FinancialSituationChangesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f312190a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        boolean z3;
        boolean z4;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = this.f312190a.f67762a.f266608c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            z = false;
            if (!it8.hasNext()) {
                break;
            }
            sy3.a aVar = (sy3.a) it8.next();
            boolean zF = Intrinsics.f(domainState.f312184a.get(aVar.f266603a), Boolean.TRUE);
            String str = aVar.f266603a;
            int i = R$string.financial_situation_confirmation_changes_item_title;
            String str2 = zF ? (String) domainState.f312185b.get(str) : null;
            if (str2 == null) {
                str2 = aVar.f266604b;
            }
            arrayList2.add(new InputChecklistDelegate.Model(str, new TextLocalisedClause(i, u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), zF, true, (aVar.f266605c == sy3.b.CUSTOM && zF) ? new InputChecklistDelegate.a.C0408a(4, 0, new TextLocalisedClause(R$string.financial_situation_confirmation_changes_item_title, u.c(new TextClause(aVar.f266604b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), true) : new InputChecklistDelegate.a.b(null), iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524224));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        Map map = domainState.f312185b;
        Map map2 = domainState.f312184a;
        if (map2.isEmpty()) {
            z3 = false;
        } else {
            Iterator it9 = map2.entrySet().iterator();
            while (it9.hasNext()) {
                if (((Boolean) ((Map.Entry) it9.next()).getValue()).booleanValue()) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            String str3 = (String) entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue() && map.containsKey(str3)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            z4 = true;
        } else {
            Iterator it10 = linkedHashMap.entrySet().iterator();
            while (it10.hasNext()) {
                CharSequence charSequence = (CharSequence) map.get((String) ((Map.Entry) it10.next()).getKey());
                if (charSequence == null || d0.W(charSequence)) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
        }
        if (z3 && z4) {
            z = true;
        }
        return new i(arrayList2, z);
    }
}
