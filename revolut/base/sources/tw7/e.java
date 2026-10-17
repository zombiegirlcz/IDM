package tw7;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InsuranceHomeScreen insuranceHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t tVar = (t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = tVar.f54722b.f51596l;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_common.ui.common.mapper.ActionWidgetParcel");
        ActionWidgetDelegate.a clickAction = tVar.f54721a;
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        nr7.d dVar = (nr7.d) ((sr7.a) obj3).f265132a.get(clickAction);
        ((com.revolut.feature.insurance_home.impl.ui.screen.home.a) this.v.R2()).J2(dVar, tVar.f54722b.f51590a);
        return Unit.f186387a;
    }
}
