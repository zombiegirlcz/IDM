package q65;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoanConfirmNewRepaymentDayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen, Continuation continuation) {
        super(2, continuation);
        this.v = loanConfirmNewRepaymentDayScreen;
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

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.X.getValue();
        Intrinsics.h(model);
        m mVar = (m) hVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "NEW_REPAYMENT_AMOUNT_ID")) {
            rp0.m mVar2 = mVar.f242506s;
            t tVar = new t(new TextLocalisedClause(R$string.loan_management_change_payday_summary_next_repayment_info_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_change_payday_summary_next_repayment_info_subtitle, null, null, 14), null, 28);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("got_it_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000);
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp24;
            int i3 = R$attr.uikit_dp16;
            yp0.b.p(model2, i, i2, i3, i3);
            mVar2.k(new y(u.c(model2), tVar, null, null, null, null, 1020));
        }
        return Unit.f186387a;
    }
}
