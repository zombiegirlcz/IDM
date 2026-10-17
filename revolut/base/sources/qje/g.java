package qje;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabCryptoFlow f246838w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TabCryptoFlow tabCryptoFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f246838w = tabCryptoFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f246838w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f246838w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f246838w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f246838w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            default:
                g gVar5 = new g(this.f246838w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ux0.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabCryptoFlow tabCryptoFlow = this.f246838w;
        switch (i) {
            case 0:
                ux0.s state = (ux0.s) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = tabCryptoFlow.e3();
                Intrinsics.h(state);
                u uVar = (u) lVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                uVar.I2().V1(state);
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = tabCryptoFlow.e3();
                Intrinsics.h(clickData);
                u uVar2 = (u) lVarE32;
                uVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                uVar2.I2().L(clickData);
                break;
            case 2:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE33 = tabCryptoFlow.e3();
                Intrinsics.h(message);
                u uVar3 = (u) lVarE33;
                uVar3.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                uVar3.J2().c3(message);
                break;
            case 3:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE34 = tabCryptoFlow.e3();
                Intrinsics.h(message2);
                u uVar4 = (u) lVarE34;
                uVar4.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                uVar4.J2().d3(message2);
                break;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE35 = tabCryptoFlow.e3();
                Intrinsics.h(menuItemId);
                u uVar5 = (u) lVarE35;
                uVar5.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                uVar5.I2().d3(menuItemId);
                break;
        }
        return Unit.f186387a;
    }
}
