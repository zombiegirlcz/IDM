package tb6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharityDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CharityDetailsScreen charityDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charityDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar = (com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c) rVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "ITEM_ID_MORE_CHARITIES_SUBHEADER")) {
            cVar.C2(a.b.f72068a);
        } else if (Intrinsics.f(str, "TRANSACTIONS_SUBHEADER_ID")) {
            cli.y yVar = cVar.J;
            if (cVar.f72070q.f()) {
                cVar.C2(new q(new CharityTransactionsParams(((ba6.l) zi0.c.I(((m) ((j2) yVar.f22677a).getValue()).f269480a)).f13938a, 13)));
            } else {
                ba6.l lVar = (ba6.l) ((m) ((j2) yVar.f22677a).getValue()).f269480a.getContent();
                if (lVar != null) {
                    cVar.C1(new BridgeDestination(cVar.f72075x.b(zhm.u.c(lVar))));
                }
            }
        }
        return Unit.f186387a;
    }
}
