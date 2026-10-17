package yyi;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SchemeLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SchemeLoungesHomeScreen schemeLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = schemeLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t tVar = (t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        ActionWidgetDelegate.Model model = tVar.f54722b;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) hVarE3;
        aVar2.I2(model.f51596l, model.f51590a);
        return Unit.f186387a;
    }
}
