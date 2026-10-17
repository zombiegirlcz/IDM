package ahf;

import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ScheduledPaymentsScreen f5081w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ScheduledPaymentsScreen scheduledPaymentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5081w = scheduledPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f5081w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f5081w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f5081w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ScheduledPaymentsScreen scheduledPaymentsScreen = this.f5081w;
        switch (i) {
            case 0:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = scheduledPaymentsScreen.e3();
                Intrinsics.h(clickData);
                z zVar = (z) mVarE3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (kotlin.text.a0.H(clickData.f54722b.f51590a, "SUGGESTED_SUBSCRIPTION_LIST_WIDGET_ID", false)) {
                    zVar.I.Z2(clickData);
                }
                break;
            case 1:
                String itemAction = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = scheduledPaymentsScreen.e3();
                Intrinsics.h(itemAction);
                z zVar2 = (z) mVarE32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(itemAction, "itemAction");
                if (itemAction.equals("ACTION_ADD_NEW_ID")) {
                    zVar2.n2(new r(zVar2, null, 1), new whi.b(6));
                }
                break;
            default:
                String searchQuery = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = scheduledPaymentsScreen.e3();
                Intrinsics.h(searchQuery);
                z zVar3 = (z) mVarE33;
                zVar3.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                zVar3.M.d(searchQuery);
                break;
        }
        return Unit.f186387a;
    }
}
