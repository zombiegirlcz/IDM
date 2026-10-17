package n0c;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.donations.api.navigation.DonatedAmountInfoScreenDescriptor$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeDetails;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeRate;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsTransactionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar;
        RevPointsTransaction revPointsTransaction;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails;
        RevPointsTransactionExchangeRate revPointsTransactionExchangeRate;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) jVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "SECTION_EXCHANGE_DETAILS_RECEIVED_AMOUNT") && (iVar = (i) ((h) ((j2) bVar.f83860x.f22677a).getValue()).f210981a.getContent()) != null && (revPointsTransaction = iVar.f210983a) != null && (revPointsTransactionExchangeDetails = revPointsTransaction.o) != null && (revPointsTransactionExchangeRate = revPointsTransactionExchangeDetails.f84067a) != null) {
            Intrinsics.checkNotNullParameter(revPointsTransactionExchangeRate, "<this>");
            yji.l.j2(bVar, bVar.e1(new ca6.a(new DonatedAmountInfoScreenDescriptor$InputData(Intrinsics.f(revPointsTransactionExchangeRate.f84070a, revPointsTransactionExchangeRate.f84071b)))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        return Unit.f186387a;
    }
}
