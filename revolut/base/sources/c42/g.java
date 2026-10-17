package c42;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmRecipientListScreen f20985w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(ApmRecipientListScreen apmRecipientListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20985w = apmRecipientListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f20985w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f20985w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f20985w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f20985w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ApmRecipientListScreen apmRecipientListScreen = this.f20985w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE3 = apmRecipientListScreen.d();
                Intrinsics.h(query);
                l lVar = (l) dVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVar.H2(lVar.f20992t, new bd2.b(query, 27));
                return Unit.f186387a;
            case 1:
                String item = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE32 = apmRecipientListScreen.d();
                Intrinsics.h(item);
                l lVar2 = (l) dVarE32;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                lVar2.f20988p.d(item);
                return Unit.f186387a;
            case 2:
                String actionId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE33 = apmRecipientListScreen.d();
                Intrinsics.h(actionId);
                l lVar3 = (l) dVarE33;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                lVar3.f20988p.W0(actionId);
                return Unit.f186387a;
            default:
                t clickData = (t) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVarE34 = apmRecipientListScreen.d();
                Intrinsics.h(clickData);
                l lVar4 = (l) dVarE34;
                lVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f54722b.f51590a, "ID_PERMISSIONS_WIDGET")) {
                    ActionWidgetDelegate.a aVar5 = clickData.f54721a;
                    if ((aVar5 instanceof ActionWidgetDelegate.a.c) || (aVar5 instanceof ActionWidgetDelegate.a.d)) {
                        ((pn3.b) lVar4.f20989q).c(lVar4, new bzg.t(lVar4, 24));
                    } else if (aVar5 instanceof ActionWidgetDelegate.a.C0395a) {
                        lVar4.l2(new bv4.h(lVar4, null, 7), new yi5.b(26));
                    } else if (!(aVar5 instanceof com.revolut.core.ui_kit.delegates.h) && !(aVar5 instanceof ActionWidgetDelegate.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
        }
    }
}
