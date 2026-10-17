package s44;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAddressInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditAddressInputScreen creditAddressInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditAddressInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Intrinsics.h(model);
        p pVar = (p) lVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object[] objArr = 0;
        if (Intrinsics.f(str, "id_current_address")) {
            pVar.n2(new rbh.k(pVar, objArr == true ? 1 : 0, 28), new whi.b(6));
        } else if (a0.H(str, "id_previous_address_", false)) {
            Object obj3 = model.u;
            Address address = obj3 instanceof Address ? (Address) obj3 : null;
            if (address != null) {
                pVar.H2(pVar.f259769t, new s31.a(pVar, address, 5));
            }
        }
        return Unit.f186387a;
    }
}
