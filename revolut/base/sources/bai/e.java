package bai;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AcceptBankTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AcceptBankTermsScreen acceptBankTermsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = acceptBankTermsScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature_retail_user_declarations.bank_terms.a aVar2 = (com.revolut.feature_retail_user_declarations.bank_terms.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (!(obj3 instanceof Terms)) {
            throw new IllegalStateException("Invalid parcel type");
        }
        aVar2.C1(new BridgeDestination(((rre.d) aVar2.f97489q).b((Terms) obj3)));
        return Unit.f186387a;
    }
}
