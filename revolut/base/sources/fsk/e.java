package fsk;

import ael.u0;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.models.StockFinancialsStatementItemExpandedState;
import efm.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.j;
import te0.s;
import te0.w;
import uqk.l;
import xrk.k;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f137719b;

    public /* synthetic */ e(g gVar, int i) {
        this.f137718a = i;
        this.f137719b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137718a) {
            case 0:
                esk.a aVar = (esk.a) obj2;
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                uqk.g gVar = aVar.f128993a;
                boolean z = aVar.f128994b;
                g gVar2 = this.f137719b;
                yrk.g gVar3 = gVar2.f137721j;
                l statementType = gVar2.i.f103800b;
                String id10 = gVar.f282213a;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(statementType, "statementType");
                Intrinsics.checkNotNullParameter(id10, "id");
                k kVar = (k) gVar3.f316331a;
                j jVar = kVar.f308372g;
                KProperty[] kPropertyArr = k.i;
                LinkedHashMap linkedHashMapZ = r0.z((Map) jVar.getValue(kVar, kPropertyArr[5]).get());
                linkedHashMapZ.put(new StockFinancialsStatementItemExpandedState(id10, (uqk.e) kVar.x0().get()), Boolean.valueOf(!z));
                return w.z0(kVar.f308372g.getValue(kVar, kPropertyArr[5]), linkedHashMapZ);
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                g gVar4 = this.f137719b;
                yrk.g gVar5 = gVar4.f137721j;
                StockFinancialsStatementContract$Configuration stockFinancialsStatementContract$Configuration = gVar4.i;
                String ref2 = stockFinancialsStatementContract$Configuration.f103799a;
                l statementType2 = stockFinancialsStatementContract$Configuration.f103800b;
                uqk.e selectedPeriod = stockFinancialsStatementContract$Configuration.f103801c;
                Integer num = stockFinancialsStatementContract$Configuration.d;
                Integer num2 = stockFinancialsStatementContract$Configuration.e;
                gVar5.getClass();
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(statementType2, "statementType");
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                k kVar2 = (k) gVar5.f316331a;
                r rVarSwitchMap = kVar2.f308372g.getValue(kVar2, k.i[5]).c(s.f270018a).switchMap(new ypg.l(new u0(gVar5, ref2, statementType2, selectedPeriod, num, num2, 21), 10));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
        }
    }
}
