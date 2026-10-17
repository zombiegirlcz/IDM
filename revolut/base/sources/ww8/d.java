package ww8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreen;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ AddressConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AddressConfirmationScreen addressConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = addressConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.feature.kyc.impl.screens.addressconfirmation.a) ((i) this.u.O.getValue())).f77855t, AddressConfirmationScreenContract$ModalStep.ProfileAddress.f77850a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
