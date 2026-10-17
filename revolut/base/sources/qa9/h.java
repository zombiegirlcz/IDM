package qa9;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.onboarding.impl.onboarding.country.screen.CountryResidenceScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CountryResidenceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CountryResidenceScreen countryResidenceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = countryResidenceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.onboarding.impl.onboarding.country.screen.a aVar2 = (com.revolut.feature.onboarding.impl.onboarding.country.screen.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        w wVar = aVar2.f78430p;
        String listId = model.f52519a;
        boolean z = model.f52521c;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        aVar2.H2(aVar2.u, new q2g.h(Intrinsics.f(listId, "country_explicit_consent_item_id") ? Boolean.valueOf(!z) : null, aVar2, 12));
        return Unit.f186387a;
    }
}
