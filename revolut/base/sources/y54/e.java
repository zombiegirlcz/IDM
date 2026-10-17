package y54;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ BirthCityScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BirthCityScreen birthCityScreen, Continuation continuation) {
        super(2, continuation);
        this.u = birthCityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.T2();
        wi0.b bVar = ((f) lVar.t2()).f310982a;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.f297760n0)) {
            lVar.v2(new i(((f) lVar.t2()).f310983b.b()));
        } else {
            lVar.x2(new y4b.b(15));
        }
        return Unit.f186387a;
    }
}
