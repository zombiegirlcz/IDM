package uo7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CarSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarSearchScreen carSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = carSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.Z.getValue();
        String value = textData.f52598b.toString();
        m mVar = (m) iVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        mVar.x2(new k(value, 0));
        return Unit.f186387a;
    }
}
