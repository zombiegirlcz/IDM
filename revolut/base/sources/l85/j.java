package l85;

import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment_v2.ReviewPaymentV2ControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o55.w;
import q35.g0;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanRepaymentAccountModelExtension.RepaymentAccountState f192794w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, LoanRepaymentAccountModelExtension.RepaymentAccountState repaymentAccountState, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f192794w = repaymentAccountState;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f192794w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        n nVar = this.v;
        ReviewPaymentV2ControllerContract$InputData reviewPaymentV2ControllerContract$InputData = nVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        y45.j jVar = nVar.f192800q;
        String str = reviewPaymentV2ControllerContract$InputData.f70573a;
        Long l2 = new Long(reviewPaymentV2ControllerContract$InputData.f70574b.f115082a);
        String strA = this.f192794w.a();
        g0 g0Var = reviewPaymentV2ControllerContract$InputData.f70575c;
        this.u = 1;
        w wVar = jVar.f310804a;
        wVar.getClass();
        ac8.h hVar = new ac8.h(22, str, wVar, l2, strA, g0Var, null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, hVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
