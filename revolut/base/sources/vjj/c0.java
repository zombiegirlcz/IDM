package vjj;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import dej.t1;
import dfj.q0;
import dfj.r0;
import dfj.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vch.s0;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c f289760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f289760w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(0, this.f289760w, continuation);
                c0Var.v = obj2;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(1, this.f289760w, continuation);
                c0Var2.v = obj2;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(2, this.f289760w, continuation);
                c0Var3.v = obj2;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0(3, this.f289760w, continuation);
                c0Var4.v = obj2;
                return c0Var4;
            case 4:
                c0 c0Var5 = new c0(4, this.f289760w, continuation);
                c0Var5.v = obj2;
                return c0Var5;
            case 5:
                c0 c0Var6 = new c0(5, this.f289760w, continuation);
                c0Var6.v = obj2;
                return c0Var6;
            default:
                c0 c0Var7 = new c0(6, this.f289760w, continuation);
                c0Var7.v = obj2;
                return c0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.c cVar = this.f289760w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data, 13));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data2, 14));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data3, 15));
                break;
            case 3:
                x0 x0Var = (x0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (x0Var instanceof dfj.s0) {
                    t1 t1Var = (t1) ((j) ((j2) cVar.I.f22677a).getValue()).f289765a.getContent();
                    if (t1Var != null) {
                        EsimProfileEntry esimProfileEntry = t1Var.e;
                        if (!Intrinsics.f(esimProfileEntry.f100440a, ((dfj.s0) x0Var).f114099a)) {
                            esimProfileEntry = null;
                        }
                        if (esimProfileEntry != null) {
                            EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = esimProfileEntry.f100443g;
                            if (esimMigrationFromDataPlansOnly != null) {
                                oki.h.v2(cVar.J, new EsimMobilePlanDetailsScreenContract$ModalStep.EsimMigration(esimMigrationFromDataPlansOnly.f100292a, esimProfileEntry), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                cVar.O2(esimProfileEntry);
                            }
                        }
                    }
                } else if (x0Var instanceof r0) {
                    cVar.J2();
                } else if (x0Var instanceof q0) {
                    cVar.I2();
                }
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data4, 16));
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data5, 17));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.I, new s0(data6, 18));
                break;
        }
        return Unit.f186387a;
    }
}
