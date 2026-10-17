package zje;

import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TabCryptoFlowV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TabCryptoFlowV2 tabCryptoFlowV2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tabCryptoFlowV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            case 3:
                return new e(this.v, continuation, 3);
            case 4:
                return new e(this.v, continuation, 4);
            default:
                return new e(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabCryptoFlowV2 tabCryptoFlowV2 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tabCryptoFlowV2.e3().c1();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = tabCryptoFlowV2.e3();
                cli.h hVar = nVarE3.u;
                nVarE3.C2(new j(((TabCryptoFlowV2Contract$FlowState) ((j2) hVar.f22677a).getValue()).f89812b, ((TabCryptoFlowV2Contract$FlowState) ((j2) hVar.f22677a).getValue()).f89811a.f));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tabCryptoFlowV2.e3().j();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = tabCryptoFlowV2.e3();
                ((eke.b) nVarE32.f322807q).m1(((TabCryptoFlowV2Contract$FlowState) ((j2) nVarE32.u.f22677a).getValue()).f89811a.f);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((eke.e) tabCryptoFlowV2.e3().v.getValue()).Z2();
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tabCryptoFlowV2.e3().W1();
                break;
        }
        return Unit.f186387a;
    }
}
