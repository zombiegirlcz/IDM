package ble;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.invest.api.TabInvestApi$Toggles;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.revolut.feature.tab.invest.impl.ui.home.f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j1 j1Var = new j1(this.v, continuation);
        j1Var.u = obj2;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0Var = com.revolut.feature.tab.invest.impl.ui.home.f.Companion;
        List list = (List) data.getContent();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((WealthAccount) obj3).b5()) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = null;
        }
        com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
        jte.d dVar = (jte.d) fVar.N;
        p pVar = (dVar.c(TabInvestApi$Toggles.InvestPreOnboardedUSPOnly.f89827c) && dVar.c(FeatureWealthApi$Toggles.InvestHomeUSP.f95158c)) ? (arrayList == null || !hx7.l.p(arrayList)) ? (arrayList == null && data.getLoading()) ? null : p.STANDARD : p.USP_AND_DISCLAIMER : p.STANDARD;
        fVar.H2(fVar.f89873e0, new beg.k(data, pVar, 19));
        if (pVar != null) {
            j2 j2Var = fVar.i0;
            j2Var.getClass();
            j2Var.g(null, pVar);
        }
        return Unit.f186387a;
    }
}
