package o44;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditAddressSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditAddressSearchScreen creditAddressSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = creditAddressSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListCellDelegate.Model model = (ListCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVarH3 = this.v.T2();
        Object obj3 = model.f52696g;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.api.models.plugins.address.Address");
        gv3.b address = (gv3.b) obj3;
        mVarH3.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        mVarH3.v2(new g(address));
        return Unit.f186387a;
    }
}
