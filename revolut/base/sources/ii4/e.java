package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import hs3.s1;
import hs3.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spinner.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SpinnerConfiguration.Popup f161519w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar, SpinnerConfiguration.Popup popup, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f161519w = popup;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f161519w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar = (n) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = nVar instanceof j;
        com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar2 = this.v;
        if (z) {
            it3.d dVar = ((j) nVar).f161531a;
            SpinnerFlowContract$InputData spinnerFlowContract$InputData = aVar2.f68420p;
            a2 a2Var = aVar2.f68424t;
            Continuation continuation = null;
            if (a2Var != null) {
                a2Var.f(null);
            }
            aVar2.s1();
            int i = 26;
            if (!aVar2.L2() && spinnerFlowContract$InputData.f68408b) {
                aVar2.C1(new BridgeDestination(new FinishCommand(200, c84.v.b(dVar, spinnerFlowContract$InputData.f68409c), null, 4)));
            } else {
                aVar2.l2(new i44.a(aVar2, dVar, continuation, i), new yi5.b(26));
            }
        } else if (nVar instanceof m) {
            aVar2.R2(((m) nVar).f161537b, this.f161519w.f66389b.f);
        } else {
            if (!(nVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            u1 u1Var = ((k) nVar).f161532a;
            List list = u1Var.f154955c;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(com.revolut.feature.credit.application.plugins.api.models.config.c.a((s1) it8.next()));
            }
            aVar2.Q2(u1Var.f154954b, arrayList);
        }
        return Unit.f186387a;
    }
}
