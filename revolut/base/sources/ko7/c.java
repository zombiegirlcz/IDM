package ko7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.address.AddressPickerScreen;
import k7c.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ AddressPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddressPickerScreen addressPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = addressPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.T2();
        if (((d) lVar.t2()).f186252a.getError() != null) {
            lVar.A2(true);
        } else if (((d) lVar.t2()).f186253b.getError() != null) {
            lVar.l2(new l0(lVar, null, 22), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
