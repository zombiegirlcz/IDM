package i47;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.TaxHubTransactionExportFilterScreen;
import ds6.c0;
import ds6.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import tof.i3;
import vkm.j2;
import zhm.a0;
import zhm.a1;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxHubTransactionExportFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxHubTransactionExportFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubTransactionExportFilterScreen taxHubTransactionExportFilterScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) taxHubTransactionExportFilterScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a aVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a) taxHubTransactionExportFilterScreen.R2();
                y yVar = aVar3.f74381r;
                d0 d0Var = (d0) zi0.c.I(((h) ((j2) yVar.f22677a).getValue()).f158287a);
                j2 j2Var = (j2) yVar.f22677a;
                Set setK = a1.k(((h) j2Var.getValue()).d, ((h) j2Var.getValue()).f158288b);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = setK.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        Set setK2 = a1.k(((h) j2Var.getValue()).e, ((h) j2Var.getValue()).f158289c);
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator it9 = setK2.iterator();
                        while (it9.hasNext()) {
                            c0 c0Var = (c0) d0Var.f117233b.get((xi0.b) it9.next());
                            List list = c0Var != null ? c0Var.f117231b : null;
                            if (list == null) {
                                list = f0.f322471a;
                            }
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            Iterator it10 = list.iterator();
                            while (it10.hasNext()) {
                                linkedHashSet3.add(((a3) it10.next()).f272581b);
                            }
                            a0.x(linkedHashSet3, linkedHashSet2);
                        }
                        aVar3.C2(new i(((h) j2Var.getValue()).f158288b, ((h) j2Var.getValue()).f158289c, a1.l(linkedHashSet, linkedHashSet2), d0Var.f117234c, d0Var.d, d0Var.e));
                    } else {
                        ds6.a0 a0Var = (ds6.a0) d0Var.f117232a.get((i3) it8.next());
                        List list2 = a0Var != null ? a0Var.f117227a : null;
                        if (list2 == null) {
                            list2 = f0.f322471a;
                        }
                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                        Iterator it11 = list2.iterator();
                        while (it11.hasNext()) {
                            linkedHashSet4.add(((a3) it11.next()).f272581b);
                        }
                        a0.x(linkedHashSet4, linkedHashSet);
                    }
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
