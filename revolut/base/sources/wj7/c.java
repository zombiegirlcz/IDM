package wj7;

import aw0.f4;
import cli.y;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v2e.x;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceExpenseDetailsScreen f297975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297975w = cFACInsuranceExpenseDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f297975w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f297975w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f297975w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((File) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen = this.f297975w;
        switch (i) {
            case 0:
                File file = (File) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = cFACInsuranceExpenseDetailsScreen.e3();
                nj7.a configuration = nj7.a.REMOVE_DOCUMENT;
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                oki.h.v2(bVar.u, new CFACInsuranceExpenseDetailsScreenContract$ModalStep.BottomSheet(configuration, file), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = cFACInsuranceExpenseDetailsScreen.e3();
                String amountString = charSequence.toString();
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar2 = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                y yVar = bVar2.f75086t;
                xi0.b bVar3 = ((i) ((j2) yVar.f22677a).getValue()).f297978a.k.f115083b;
                bVar2.H2(yVar, new vtf.b(2, new dj0.d(bVar2.f75085s.b(amountString, bVar3.f306286a), bVar3)));
                break;
            default:
                f4 f4Var = (f4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = cFACInsuranceExpenseDetailsScreen.e3();
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar4 = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVarE33;
                bVar4.H2(bVar4.f75086t, new x(f4Var.f10304b, 13));
                break;
        }
        return Unit.f186387a;
    }
}
