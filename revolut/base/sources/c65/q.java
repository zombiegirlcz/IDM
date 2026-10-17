package c65;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f21671w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f21671w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f21671w, continuation, 0);
            case 1:
                return new q(this.f21671w, continuation, 1);
            case 2:
                return new q(this.f21671w, continuation, 2);
            case 3:
                return new q(this.f21671w, continuation, 3);
            default:
                return new q(this.f21671w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        rp0.y yVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                t tVar = this.f21671w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    l35.b bVar = tVar.f21675r;
                    String loanId = tVar.o.f70360a.f70144a.f70108a;
                    y45.f fVar = (y45.f) bVar;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "id");
                    o55.z zVar = fVar.f310794a;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    pfm.a aVarE = te0.w.g0(zVar.f222381a.cancelLoan(loanId)).e(fVar.r(loanId));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                t.I2(tVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    t tVar2 = this.f21671w;
                    q qVar = new q(tVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(tVar2.X(), "LOAN_CANCELLATION_CONFIRMATION_LOADING_TAG", qVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                t tVar3 = this.f21671w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = tVar3.u.f(false);
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                do3.n nVar = (do3.n) objB;
                j60.a aVar4 = tVar3.f21673p;
                v vVar = tVar3.f21674q;
                LoanDetails loanDetails = tVar3.o.f70360a;
                Intrinsics.h(nVar);
                String strI = te0.w.I(nVar);
                String str = nVar.f116411g;
                ((x) vVar).getClass();
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                Loan loan = loanDetails.f70144a;
                b95.a aVar5 = loan.o;
                LoanState loanState = loan.i;
                int i5 = w.f21679a[aVar5.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    yVar = new rp0.y(x.b(loanDetails, strI, str, loanState instanceof LoanState.Planned ? new TextLocalisedClause(R$string.loan_management_renouncement_confirmation_action_confirm, null, null, 14) : new TextLocalisedClause(R$string.loan_management_cancellation_info_dialog_confirm, null, null, 14), new TextLocalisedClause(R$string.loan_management_cancellation_loan_confirmation_action_decline, null, null, 14)), new rp0.t(loanState instanceof LoanState.Planned ? new TextLocalisedClause(R$string.loan_management_renouncement_confirmation_title, null, null, 14) : new TextLocalisedClause(R$string.loan_management_cancellation_info_dialog_title, null, null, 14), null, null, 28), rp0.l.WINDOW, null, null, null, 1016);
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yVar = new rp0.y(x.b(loanDetails, strI, str, new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmation_action_accept, null, null, 14), new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmation_action_decline, null, null, 14)), new rp0.t(new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmation_disbursed_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmation_disbursed_description_format, zhm.u.c(new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmation_disbursed_description_link, null, new Click(30, (Integer) null, (Object) null, "CONTACT_US_LINK_ID", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, 1016);
                }
                aVar4.x(yVar);
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                t tVar4 = this.f21671w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    l35.b bVar2 = tVar4.f21675r;
                    String loanId2 = tVar4.o.f70360a.f70144a.f70108a;
                    y45.f fVar2 = (y45.f) bVar2;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(loanId2, "id");
                    o55.z zVar2 = fVar2.f310794a;
                    zVar2.getClass();
                    Intrinsics.checkNotNullParameter(loanId2, "loanId");
                    pfm.a aVarE2 = te0.w.g0(zVar2.f222381a.renounceLoan(loanId2)).e(fVar2.r(loanId2));
                    Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                t.I2(tVar4);
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    t tVar5 = this.f21671w;
                    q qVar2 = new q(tVar5, null, 3);
                    this.v = 1;
                    if (u0.b0(tVar5.X(), "LOAN_CANCELLATION_CONFIRMATION_LOADING_TAG", qVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
