package vgf;

import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TabTransferShotDialogAction;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289102w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f289102w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(0, this.f289102w, continuation);
            case 1:
                return new i0(1, this.f289102w, continuation);
            case 2:
                return new i0(2, this.f289102w, continuation);
            case 3:
                return new i0(3, this.f289102w, continuation);
            case 4:
                return new i0(4, this.f289102w, continuation);
            default:
                return new i0(5, this.f289102w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar = this.f289102w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    kgf.e eVar = aVar.u;
                    eVar.getClass();
                    ufm.b bVarO0 = te0.w.o0(kotlin.coroutines.g.f186406a, new kgf.d(eVar, null, 0));
                    this.v = 1;
                    obj2 = nim.a.b(bVarO0, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Boolean bool = (Boolean) obj2;
                if (bool == null) {
                    return null;
                }
                aVar.H2(aVar.J, new v2e.x(bool.booleanValue(), 7));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                uk9.h hVar = new uk9.h(aVar, continuation, 13);
                this.v = 1;
                Object objB = pu7.a.B(aVar.k, "LoadUpdates", hVar, this);
                return objB == aVar3 ? aVar3 : objB;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Flow flowF = aVar.J.F();
                    tk9.i iVar = new tk9.i(i2, 16, continuation);
                    this.v = 1;
                    if (vkm.q.y(flowF, iVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (!((qgf.h) ((j2) ((com.revolut.feature.transaction_list.impl.ui.list.flow.a) aVar.v).u.f22677a).getValue()).f245801c) {
                    aVar.f91937s.b(TransactionsPerformanceTracker$Scenario.LIST_UI);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    aVar.H2(aVar.J, new vga.g(24));
                    kgf.e eVar2 = aVar.u;
                    eVar2.getClass();
                    pfm.h hVarN = pd.b.n(kotlin.coroutines.g.f186406a, new kgf.d(eVar2, null, 1));
                    this.v = 1;
                    if (nim.a.a(hVarN, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                b3a.a aVar6 = aVar.f91941y.f289089b;
                return aVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, new TransferDestination.ChatTransfer(false, (TabTransferShotDialogAction.Success) null, 5), null, 4)))));
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    aVar.H2(aVar.J, new vga.g(25));
                    kgf.e eVar3 = aVar.u;
                    eVar3.getClass();
                    pfm.h hVarN2 = pd.b.n(kotlin.coroutines.g.f186406a, new kgf.d(eVar3, null, 1));
                    this.v = 1;
                    if (nim.a.a(hVarN2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                TransactionsScreenContract$InputData transactionsScreenContract$InputData = aVar.B;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarB = rd0.e.b(((mjf.b0) aVar.f91936r).m(transactionsScreenContract$InputData.e));
                    this.v = 1;
                    obj2 = vkm.q.z(dVarB, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Boolean bool2 = (Boolean) obj2;
                if (bool2 != null ? bool2.booleanValue() : false) {
                    pfm.r rVarA = aVar.f91938t.a(transactionsScreenContract$InputData.e);
                    this.v = 2;
                    if (nim.a.a(rVarA, this) == aVar8) {
                        return aVar8;
                    }
                }
                return Unit.f186387a;
        }
    }
}
