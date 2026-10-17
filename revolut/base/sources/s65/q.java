package s65;

import aw0.c7;
import cli.y;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a f260148w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f260148w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f260148w, continuation, 0);
            default:
                return new q(this.f260148w, continuation, 1);
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
        switch (this.u) {
            case 0:
                com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar = this.f260148w;
                y yVar = aVar.f70414r;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objA = nim.a.a(((y45.f) aVar.o).h(((f) ((j2) yVar.f22677a).getValue()).f260135a.f70144a.f70108a, ((f) ((j2) yVar.f22677a).getValue()).f260136b, (LoanRepaymentDayChangeTerms) ((od0.i) zi0.c.I(((f) ((j2) yVar.f22677a).getValue()).f260137c)).c()), this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                n65.a aVar2 = aVar.f70412p;
                int i2 = ((f) ((j2) aVar.f70414r.f22677a).getValue()).f260136b;
                aVar2.getClass();
                int i3 = R$string.credit_loan_change_repayment_day_success;
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDate localDateWithDayOfMonth = LocalDate.now().withDayOfMonth(i2);
                Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
                return yji.l.a1(aVar, aVar.X1(new mii.k("change-repayment-day-success", new TextLocalisedClause(i3, u.c(com.revolut.core.ui_kit.models.j.b(jVar, localDateWithDayOfMonth, new LocalDateClause$DateFormat.DayOfMonth(true))), null, 12), null, null, null, 28)), null, null, new p(aVar, null), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a aVar4 = this.f260148w;
                q qVar = new q(aVar4, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "changeRepaymentDay", qVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
