package ka2;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ReferralContactDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.payid.impl.screen.area.c) this.v.d()).I2(new n(model.f53167l));
        return Unit.f186387a;
    }
}
