package wn7;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.home.InsuranceCarHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ InsuranceCarHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InsuranceCarHomeScreen insuranceCarHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = insuranceCarHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((BigTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.f75524a0.getValue();
        lVar.getClass();
        lVar.v2(new g(null));
        return Unit.f186387a;
    }
}
