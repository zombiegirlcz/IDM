package s44;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.input.CreditAddressInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAddressInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CreditAddressInputScreen creditAddressInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditAddressInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "id_add_new_address")) {
            p pVar = (p) this.v.d();
            pVar.C2(new j(((g) ((j2) pVar.f259769t.f22677a).getValue()).e));
        }
        return Unit.f186387a;
    }
}
