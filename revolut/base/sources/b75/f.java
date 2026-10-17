package b75;

import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanInterestRateBreakdownController f12914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(LoanInterestRateBreakdownController loanInterestRateBreakdownController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12914w = loanInterestRateBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f12914w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f12914w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        yx4.b bVar = (yx4.b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(bVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanInterestRateBreakdownController loanInterestRateBreakdownController = this.f12914w;
        switch (i) {
            case 0:
                yx4.b bVar = (yx4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.a) ((h) loanInterestRateBreakdownController.R.getValue())).I2(bVar);
                break;
            default:
                yx4.b bVar2 = (yx4.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.a) ((h) loanInterestRateBreakdownController.R.getValue())).I2(bVar2);
                break;
        }
        return Unit.f186387a;
    }
}
