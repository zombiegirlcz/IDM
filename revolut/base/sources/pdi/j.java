package pdi;

import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ContractStatementData;
import hs3.i1;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pe0.q;
import pfk.g0;
import pfk.q0;
import pfk.t0;
import pgi.s;
import pjl.z0;
import pkf.d0;
import pkf.e1;
import pn6.l;
import qua.p;
import tgb.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f235255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f235256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235255w = obj2;
        this.f235256x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f235255w, (wj0.b) this.f235256x, continuation, 0);
            case 1:
                return new j((q) this.f235255w, (pe0.e) this.f235256x, continuation, 1);
            case 2:
                return new j((pe0.f) this.f235255w, (q) this.f235256x, continuation, 2);
            case 3:
                return new j((List) this.f235255w, (k7i.i) this.f235256x, continuation, 3);
            case 4:
                return new j((pf9.e) this.f235255w, (p) this.f235256x, continuation, 4);
            case 5:
                return new j((pf9.e) this.f235255w, (ap1.d) this.f235256x, continuation, 5);
            case 6:
                return new j((g0) this.f235255w, (hha.d) this.f235256x, continuation, 6);
            case 7:
                return new j((t0) this.f235255w, (q0) this.f235256x, continuation, 7);
            case 8:
                return new j((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f235255w, (String) this.f235256x, continuation, 8);
            case 9:
                return new j((com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f235255w, (o) this.f235256x, continuation, 9);
            case 10:
                return new j((s) this.f235255w, (String) this.f235256x, continuation, 10);
            case 11:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) this.f235255w, (i1) this.f235256x, continuation, 11);
            case 12:
                return new j((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) this.f235255w, (String) this.f235256x, continuation, 12);
            case 13:
                return new j((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f235255w, (xi0.b) this.f235256x, continuation, 13);
            case 14:
                return new j((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f235255w, (TravelMilesRate) this.f235256x, continuation, 14);
            case 15:
                return new j((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.f235255w, (hha.d) this.f235256x, continuation, 15);
            case 16:
                return new j((pj4.k) this.f235255w, (String) this.f235256x, continuation, 16);
            case 17:
                return new j((pjc.j) this.f235255w, (Set) this.f235256x, continuation, 17);
            case 18:
                j jVar = new j((pjl.g) this.f235256x, continuation, 18);
                jVar.f235255w = obj2;
                return jVar;
            case 19:
                j jVar2 = new j((z0) this.f235256x, continuation, 19);
                jVar2.f235255w = obj2;
                return jVar2;
            case 20:
                j jVar3 = new j((d0) this.f235256x, continuation, 20);
                jVar3.f235255w = obj2;
                return jVar3;
            case 21:
                j jVar4 = new j((e1) this.f235256x, continuation, 21);
                jVar4.f235255w = obj2;
                return jVar4;
            case 22:
                return new j((pkh.k) this.f235255w, (ty0.a) this.f235256x, continuation, 22);
            case 23:
                return new j((com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a) this.f235255w, (String) this.f235256x, continuation, 23);
            case 24:
                return new j((pm9.f) this.f235255w, (km9.f) this.f235256x, continuation, 24);
            case 25:
                return new j((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a) this.f235255w, (EsimMobilePlanSummaryScreenContract$ContractStatementData) this.f235256x, continuation, 25);
            case 26:
                return new j((pn2.d) this.f235256x, continuation, 26);
            case 27:
                return new j((l) this.f235255w, (String) this.f235256x, continuation, 27);
            case 28:
                return new j((pn8.a) this.f235255w, (String) this.f235256x, continuation, 28);
            default:
                return new j((pnb.h) this.f235255w, (TaxForm) this.f235256x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pdi.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235256x = obj2;
    }
}
