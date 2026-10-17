package nsc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedEntitiesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrustedEntitiesScreen trustedEntitiesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = trustedEntitiesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.sca_prompt.impl.trusted_entities.a aVar2 = (com.revolut.feature.sca_prompt.impl.trusted_entities.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            aVar2.I2();
        }
        return Unit.f186387a;
    }
}
