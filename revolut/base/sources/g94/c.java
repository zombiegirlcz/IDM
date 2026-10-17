package g94;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.other_liabilities.DebtV2OtherLiabilitiesController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtV2OtherLiabilitiesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DebtV2OtherLiabilitiesController debtV2OtherLiabilitiesController, Continuation continuation) {
        super(2, continuation);
        this.v = debtV2OtherLiabilitiesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Q.getValue();
        Intrinsics.h(model);
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.e;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.api.models.debts.DebtType");
        hVar.C2(new d((pu3.d) obj3));
        return Unit.f186387a;
    }
}
