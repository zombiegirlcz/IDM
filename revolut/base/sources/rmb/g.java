package rmb;

import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_term_selection.SavingsTermSelectionScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SavingsTermSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(SavingsTermSelectionScreen savingsTermSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = savingsTermSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SavingsTermSelectionScreen savingsTermSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                savingsTermSelectionScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) savingsTermSelectionScreen.d();
                SavingsProductData savingsProductData = ((a) ((j2) qVar.f255237x.f22677a).getValue()).f255216b;
                if (savingsProductData != null) {
                    qVar.C2(new b(savingsProductData));
                }
                break;
        }
        return Unit.f186387a;
    }
}
