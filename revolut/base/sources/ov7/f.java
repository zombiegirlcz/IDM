package ov7;

import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.CoverageDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CoverageDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoverageDetailsScreen coverageDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = coverageDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b bVar = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) this.u.R2();
        bVar.H2(bVar.f76110r, new ou6.o(10));
        return Unit.f186387a;
    }
}
