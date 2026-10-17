package da8;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreen;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAccountDetailsConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorAccountDetailsConfirmationScreen juniorAccountDetailsConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAccountDetailsConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a aVar2 = (com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.a) iVarE3;
        y yVar = aVar2.v;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z = !(model.f53306c == qd0.SELECTED);
        TextDelegate.Model model2 = (TextDelegate.Model) model.f53305b;
        Object obj3 = model2.f53534g;
        if (obj3 instanceof ConsentMechanics.OptOut) {
            aVar2.H2(yVar, new a6j.a((ConsentMechanics.OptOut) obj3, z, 15));
        } else if (Intrinsics.f(model2.f53531a, "ID_CHECKBOX_PERSONAL_DATA_ACCURATE")) {
            aVar2.H2(yVar, new cmc.a(z, 6));
        }
        return Unit.f186387a;
    }
}
