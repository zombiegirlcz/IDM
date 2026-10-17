package vo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSecurityAndPrivacyController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JuniorSecurityAndPrivacyController juniorSecurityAndPrivacyController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSecurityAndPrivacyController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) kVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ID_LOST_OR_STOLEN_DEVICE")) {
            bVar.n2(new com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.a(bVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
