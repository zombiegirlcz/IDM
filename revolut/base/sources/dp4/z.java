package dp4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardFutureInstalmentQuotes;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import com.revolut.feature.credit.card.impl.network.CreditCardService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yn4.t;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f116720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f116721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f116722y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116720w = c0Var;
        this.f116721x = str;
        this.f116722y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f116720w, this.f116721x, this.f116722y, continuation, 0);
            case 1:
                return new z(this.f116720w, this.f116721x, this.f116722y, continuation, 1);
            default:
                return new z(this.f116720w, this.f116721x, this.f116722y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService = this.f116720w.f116604a;
                    this.v = 1;
                    if (creditCardService.cancelInstalment(this.f116721x, this.f116722y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService2 = this.f116720w.f116604a;
                    this.v = 1;
                    obj2 = creditCardService2.futureInstalmentsQuote(this.f116721x, this.f116722y, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yn4.y yVar = (yn4.y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<this>");
                List<yn4.x> repaidInstalments = yVar.getRepaidInstalments();
                ArrayList arrayList = new ArrayList(zhm.w.t(repaidInstalments, 10));
                for (yn4.x xVar : repaidInstalments) {
                    int newTerm = xVar.getNewTerm();
                    int repaidTerm = xVar.getRepaidTerm();
                    dj0.d dVarO = mo3.a.o(xVar.getNewPlanAmount());
                    dj0.d dVarO2 = mo3.a.o(xVar.getRepaymentAmount());
                    jo3.a savedInterest = xVar.getSavedInterest();
                    arrayList.add(new CreditCardFutureInstalmentQuote(newTerm, repaidTerm, dVarO, dVarO2, savedInterest != null ? mo3.a.o(savedInterest) : null, mo3.a.o(xVar.getRegularAmount()), mo3.a.o(xVar.getLastAmount()), xVar.getLastMaturingDate(), zn4.c.b(xVar.getLastAmountBreakdown())));
                }
                return new CreditCardFutureInstalmentQuotes(zhm.d0.P0(arrayList, new zn4.a()), yVar.getNextMaturingDate(), yVar.getPreviousLastMaturingDate());
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    CreditCardService creditCardService3 = this.f116720w.f116604a;
                    this.v = 1;
                    obj2 = creditCardService3.getChangeTermQuote(this.f116721x, this.f116722y, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yn4.t tVar = (yn4.t) obj2;
                Intrinsics.checkNotNullParameter(tVar, "<this>");
                t.a current = tVar.getCurrent();
                CreditCardInstalmentChangeTermQuote.CurrentInstalment currentInstalment = new CreditCardInstalmentChangeTermQuote.CurrentInstalment(mo3.a.o(current.getDueAmount()), current.getDueDate(), mo3.a.o(current.getEstimatedInterest()), mo3.a.o(current.getTotalToRepay()), current.getReferenceRateValue());
                List<t.b> updatedInstalments = tVar.getUpdatedInstalments();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(updatedInstalments, 10));
                for (t.b bVar : updatedInstalments) {
                    int newTerm2 = bVar.getNewTerm();
                    dj0.d dVarO3 = mo3.a.o(bVar.getTotalToRepay());
                    dj0.d dVarO4 = mo3.a.o(bVar.getMonthlyPrincipal());
                    dj0.d dVarO5 = mo3.a.o(bVar.getEstimatedInterest());
                    dj0.d dVarO6 = mo3.a.o(bVar.getNextDueAmount());
                    jo3.a dailyInterest = bVar.getDailyInterest();
                    arrayList2.add(new CreditCardInstalmentChangeTermQuote.UpdatedInstalment(newTerm2, dVarO3, dVarO4, dVarO5, dVarO6, dailyInterest != null ? mo3.a.o(dailyInterest) : null));
                }
                return new CreditCardInstalmentChangeTermQuote(currentInstalment, arrayList2);
        }
    }
}
