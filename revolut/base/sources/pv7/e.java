package pv7;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDetailsLayoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InsuranceDetailsLayoutScreen insuranceDetailsLayoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDetailsLayoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = tVar.f54722b.f51596l;
        sr7.a aVar2 = obj3 instanceof sr7.a ? (sr7.a) obj3 : null;
        if (aVar2 == null) {
            return Unit.f186387a;
        }
        ActionWidgetDelegate.a clickAction = tVar.f54721a;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        nr7.d dVar = (nr7.d) aVar2.f265132a.get(clickAction);
        if (dVar == null) {
            return Unit.f186387a;
        }
        ((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) this.v.d()).J2(dVar, tVar.f54722b.f51590a);
        return Unit.f186387a;
    }
}
