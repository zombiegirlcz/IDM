package o83;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionsListController f222914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SubscriptionsListController subscriptionsListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f222914w = subscriptionsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f222914w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f222914w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SubscriptionsListController subscriptionsListController = this.f222914w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar = (e) subscriptionsListController.R.getValue();
                Intrinsics.h(listId);
                m mVar = (m) eVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ADD_NEW_SUBSCRIPTION_ACTION_LIST_ID")) {
                    mVar.l2(new nt4.f(mVar, null, 13), new yi5.b(26));
                }
                break;
            default:
                t clickData = (t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVar2 = (e) subscriptionsListController.R.getValue();
                Intrinsics.h(clickData);
                m mVar2 = (m) eVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (a0.H(clickData.f54722b.f51590a, "SUGGESTED_SUBSCRIPTION_LIST_WIDGET_ID", false)) {
                    mVar2.f222925q.Z2(clickData);
                }
                break;
        }
        return Unit.f186387a;
    }
}
