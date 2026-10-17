package yb4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.changes.FinancialSituationChangesScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final FinancialSituationChangesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f312189p;

    public j(n stateMapper, FinancialSituationChangesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        ArrayList arrayList = inputData.f67762a.f266608c;
        int iB = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashMap.put(((sy3.a) it8.next()).f266603a, Boolean.FALSE);
        }
        ArrayList arrayList2 = this.o.f67762a.f266608c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((sy3.a) obj2).f266605c == sy3.b.CUSTOM) {
                arrayList3.add(obj2);
            }
        }
        int iB2 = q0.b(w.t(arrayList3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            String str = ((sy3.a) it9.next()).f266603a;
            m70.a.c(t0.f186434a);
            linkedHashMap2.put(str, "");
        }
        this.f312189p = mra.d.b(this, new f(linkedHashMap, linkedHashMap2), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312189p;
    }
}
