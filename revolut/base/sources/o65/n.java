package o65;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f222515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f222516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dj0.d f222517y;
    public final /* synthetic */ LoanDetails z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, String str, dj0.d dVar, LoanDetails loanDetails, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f222515w = oVar;
        this.f222516x = str;
        this.f222517y = dVar;
        this.z = loanDetails;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f222515w, this.f222516x, this.f222517y, this.z, continuation, 0);
            default:
                return new n(this.f222515w, this.f222516x, this.f222517y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                o oVar = this.f222515w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (o.b3(oVar, this.f222516x, this.f222517y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return obj2;
                    }
                    yhm.o.b(obj2);
                }
                oVar.f222520n.getClass();
                y0 y0Var = new y0("change-repayment-day-outstanding-balance-repaid", new j0((Clause) new TextLocalisedClause(R$string.credit_loan_change_repayment_day_outstanding_settled, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.credit_loan_change_repayment_day_action_change_repayment_day, null, null, 14), new TextLocalisedClause(R$string.credit_loan_change_repayment_day_action_back_to_loan, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078), false, 4);
                m mVar = new m(this.z, null, 0);
                this.v = 2;
                Object objE3 = o.e3(oVar, y0Var, mVar, this, 2);
                return objE3 == aVar ? aVar : objE3;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar2 = this.f222515w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (o.b3(oVar2, this.f222516x, this.f222517y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return obj2;
                    }
                    yhm.o.b(obj2);
                }
                oVar2.f222520n.getClass();
                y0 y0Var2 = new y0("change-repayment-day-overdue-balance-repaid", new j0((Clause) new TextLocalisedClause(R$string.credit_loan_change_repayment_day_overdue_settled, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, new TextLocalisedClause(R$string.credit_loan_change_repayment_day_action_change_repayment_day, null, null, 14), new TextLocalisedClause(R$string.credit_loan_change_repayment_day_action_back_to_loan, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078), false, 4);
                m mVar2 = new m(this.z, null, 1);
                this.v = 2;
                Object objE32 = o.e3(oVar2, y0Var2, mVar2, this, 2);
                return objE32 == aVar2 ? aVar2 : objE32;
        }
    }
}
