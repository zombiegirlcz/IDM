package v25;

import c55.j0;
import com.revolut.feature.credit.core.ui.bottom_sheet.list.CreditBottomSheetListItemsController;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.kompot.common.ModalDestination;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m35.p;
import uyh.s;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f285648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f285648w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f285648w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f285648w;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVarG = m70.a.g(oVar.f285665n.a(str, w4l.h.f294642c), null, new s(26), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Loan loan = (Loan) obj2;
        p pVar = oVar.f285669s;
        Intrinsics.h(loan);
        m35.o oVarB = ((j0) pVar).b(loan, true);
        boolean z = oVarB instanceof m35.n;
        int i2 = 2;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            yji.n.P2(oVar, oVar.o2(((m35.n) oVarB).f202290a), bottom_dialog, null, 2);
        } else if (oVarB instanceof m35.m) {
            CreditBottomSheetListItemsController creditBottomSheetListItemsController = ((m35.m) oVarB).f202289a;
            a block = new a(oVar, str, i2);
            Intrinsics.checkNotNullParameter(block, "block");
            creditBottomSheetListItemsController.H = block;
            yji.n.P2(oVar, creditBottomSheetListItemsController, bottom_dialog, null, 2);
        } else {
            if (oVarB != null) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
