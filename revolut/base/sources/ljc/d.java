package ljc;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsSelectPaymentScreen f195621w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f195621w = rentAndBillsSelectPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f195621w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f195621w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen = this.f195621w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = rentAndBillsSelectPaymentScreen.e3();
                Intrinsics.h(query);
                r rVar = (r) kVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                rVar.H2(rVar.v, new l3d.a(query, 17));
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = rentAndBillsSelectPaymentScreen.e3();
                Intrinsics.h(listId);
                r rVar2 = (r) kVarE32;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "CREATE_RECURRING_PAYMENT_MENU_ITEM_ID")) {
                    rVar2.C2(h.f195625a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
