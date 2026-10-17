package wff;

import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wff.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TroubleshooterDetailScreen f297088w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TroubleshooterDetailScreen troubleshooterDetailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297088w = troubleshooterDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f297088w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f297088w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f297088w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d(this.f297088w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            default:
                d dVar5 = new d(this.f297088w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TroubleshooterDetailScreen troubleshooterDetailScreen = this.f297088w;
        switch (i) {
            case 0:
                String url2 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) troubleshooterDetailScreen.i3();
                xVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                xVar.z2(url2);
                break;
            case 1:
                y clickData = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI3 = troubleshooterDetailScreen.i3();
                Intrinsics.h(clickData);
                x xVar2 = (x) oVarI3;
                xVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                xVar2.f297107q.v1(clickData);
                break;
            case 2:
                String actionId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI32 = troubleshooterDetailScreen.i3();
                Intrinsics.h(actionId);
                x xVar3 = (x) oVarI32;
                xVar3.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                if (Intrinsics.f(actionId, "DONE_ACTION_ID")) {
                    xVar3.v2(n.a.f297095a);
                }
                break;
            case 3:
                Object obj3 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI33 = troubleshooterDetailScreen.i3();
                x xVar4 = (x) oVarI33;
                xVar4.y2(((qv0.p) obj3).getF55176j(), ((koi.j) obj3).getF55172b());
                break;
            default:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarI34 = troubleshooterDetailScreen.i3();
                x xVar5 = (x) oVarI34;
                xVar5.y2(aVar5.d, aVar5.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
