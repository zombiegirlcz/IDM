package zje;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yui.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabCryptoFlowV2 f322794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TabCryptoFlowV2 tabCryptoFlowV2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f322794w = tabCryptoFlowV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f322794w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f322794w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f322794w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f322794w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f(this.f322794w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            default:
                f fVar6 = new f(this.f322794w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((ux0.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabCryptoFlowV2 tabCryptoFlowV2 = this.f322794w;
        switch (i) {
            case 0:
                String pageId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR2 = tabCryptoFlowV2.R2();
                Intrinsics.h(pageId);
                nVarR2.getClass();
                Intrinsics.checkNotNullParameter(pageId, "pageId");
                if (!pageId.equals("ID_NULL_PAGE") && pageId.length() > 0) {
                    ((eke.b) nVarR2.f322807q).a(pageId);
                    nVarR2.H2(nVarR2.u, new v(pageId, 16));
                }
                break;
            case 1:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR22 = tabCryptoFlowV2.R2();
                Intrinsics.h(message);
                nVarR22.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                ((eke.e) nVarR22.v.getValue()).c3(message);
                break;
            case 2:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR23 = tabCryptoFlowV2.R2();
                Intrinsics.h(message2);
                nVarR23.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                ((eke.e) nVarR23.v.getValue()).d3(message2);
                break;
            case 3:
                String menuItemId = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR24 = tabCryptoFlowV2.R2();
                Intrinsics.h(menuItemId);
                nVarR24.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                ((eke.b) nVarR24.f322807q).q0(((TabCryptoFlowV2Contract$FlowState) ((j2) nVarR24.u.f22677a).getValue()).f89811a.f, menuItemId);
                break;
            case 4:
                ux0.s sVar = (ux0.s) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR25 = tabCryptoFlowV2.R2();
                Intrinsics.h(sVar);
                nVarR25.V1(sVar);
                break;
            default:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR26 = tabCryptoFlowV2.R2();
                Intrinsics.h(aVar6);
                nVarR26.L(aVar6);
                break;
        }
        return Unit.f186387a;
    }
}
