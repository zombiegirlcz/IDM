package s55;

import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.loan.impl.ui.autopay.flow.LoanAutopayFlowContract$State;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import p35.p0;
import p35.u0;
import y45.f;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.autopay.flow.a f259927w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f259927w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f259927w, continuation, 0);
            default:
                return new c(this.f259927w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pfm.a aVarP;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar2 = this.f259927w;
                    u55.b bVar = aVar2.v;
                    String facilityId = aVar2.f70321t.f70313a;
                    AccountDetails.LinkedAccount linkedAccount = ((LoanAutopayFlowContract$State) aVar2.A2().f98429a).f70315a;
                    Object repaymentSource = linkedAccount != null ? new RepaymentSource.ExternalAccount(linkedAccount) : RepaymentSource.RevolutWallet.f68559a;
                    l35.b bVar2 = bVar.f277382a;
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
                    if (repaymentSource instanceof RepaymentSource.RevolutWallet) {
                        aVarP = ((f) bVar2).q(facilityId, u0.WALLET, p0.ACTIVE, null);
                    } else {
                        if (!(repaymentSource instanceof RepaymentSource.ExternalAccount)) {
                            if ((repaymentSource instanceof RepaymentSource.Pocket) || (repaymentSource instanceof RepaymentSource.JointAccount)) {
                                throw new IllegalStateException(j6.a.q("Unsupported repayment source type: ", o0.f186429a.b(repaymentSource.getClass()).m()));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        AccountDetails.LinkedAccount linkedAccount2 = ((RepaymentSource.ExternalAccount) repaymentSource).f68552a;
                        aVarP = ((f) bVar2).p(facilityId, linkedAccount2.f, linkedAccount2.f68543g);
                    }
                    pfm.a aVarE = aVarP.e(((f) bVar2).n(facilityId));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.credit.loan.impl.ui.autopay.flow.a aVar4 = this.f259927w;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar = new c(aVar4, continuation, 0);
                    this.v = 1;
                    if (aVar4.p2(this, cVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.u.getClass();
                l.a1(aVar4, aVar4.X1(wj4.a.b()), null, null, new s1k.b(aVar4, null, 8), 3);
                return Unit.f186387a;
        }
    }
}
