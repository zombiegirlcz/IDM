package q65;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f242499w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242499w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f242499w, continuation, 0);
            default:
                return new j(this.f242499w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    m mVar = this.f242499w;
                    l35.b bVar = mVar.f242504q;
                    LoanConfirmNewRepaymentDayScreenContract$InputData loanConfirmNewRepaymentDayScreenContract$InputData = mVar.f242503p;
                    pfm.a aVarH = ((y45.f) bVar).h(loanConfirmNewRepaymentDayScreenContract$InputData.f70401a, loanConfirmNewRepaymentDayScreenContract$InputData.f70402b, (LoanRepaymentDayChangeTerms) zi0.c.I(((g) mVar.t2()).f242494b));
                    this.v = 1;
                    if (nim.a.a(aVarH, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                m mVar2 = this.f242499w;
                j jVar = new j(mVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(mVar2.k, "changeRepaymentDay", jVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
