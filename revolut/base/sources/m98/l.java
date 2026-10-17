package m98;

import com.revolut.feature.card_order_new.api.junior.CardDesignNotFoundException;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.a2;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f203650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f203651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f203652y;
    public final /* synthetic */ b93.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, boolean z, String str, b93.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f203650w = pVar;
        this.f203651x = z;
        this.f203652y = str;
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f203651x, this.f203650w, this.f203652y, this.z, continuation);
            default:
                return new l(this.f203650w, this.f203651x, this.f203652y, this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws CardDesignNotFoundException {
        NaviCommand naviCommand;
        switch (this.u) {
            case 0:
                p pVar = this.f203650w;
                CardRequestReviewScreenContract$InputData cardRequestReviewScreenContract$InputData = pVar.f203657p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    boolean z = this.f203651x;
                    b93.b bVar = this.z;
                    String str = this.f203652y;
                    if (z) {
                        a2 a2Var = pVar.v;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        l98.f fVar = pVar.u;
                        String str2 = cardRequestReviewScreenContract$InputData.f76730a;
                        NaviCommand naviCommand2 = cardRequestReviewScreenContract$InputData.d;
                        String str3 = pVar.f203663x;
                        this.v = 1;
                        obj2 = fVar.b(str2, str, str3, bVar, naviCommand2, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        naviCommand = (NaviCommand) obj2;
                    } else {
                        l98.f fVar2 = pVar.u;
                        Object content = ((f) pVar.t2()).f203640c.getContent();
                        if (content == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        jc8.b bVar2 = ((jc8.a) content).d;
                        String str4 = bVar2 != null ? bVar2.f172751a : null;
                        String str5 = cardRequestReviewScreenContract$InputData.f76730a;
                        NaviCommand naviCommand3 = cardRequestReviewScreenContract$InputData.d;
                        this.v = 2;
                        obj2 = fVar2.a(str, str4, str5, bVar, naviCommand3, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        naviCommand = (NaviCommand) obj2;
                    }
                } else if (i == 1) {
                    yhm.o.b(obj2);
                    naviCommand = (NaviCommand) obj2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    naviCommand = (NaviCommand) obj2;
                }
                return pVar.C1(new BridgeDestination(naviCommand));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b93.b bVar3 = this.z;
                boolean z3 = this.f203651x;
                p pVar2 = this.f203650w;
                l lVar = new l(z3, pVar2, this.f203652y, bVar3, (Continuation) null);
                this.v = 1;
                Object objB = pu7.a.B(pVar2.k, "TASK_ID_HANDLE_CARD_REQUEST_APPROVAL", lVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z, p pVar, String str, b93.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f203651x = z;
        this.f203650w = pVar;
        this.f203652y = str;
        this.z = bVar;
    }
}
