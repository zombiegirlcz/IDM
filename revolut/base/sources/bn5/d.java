package bn5;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreen;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PlaceOfBirthScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlaceOfBirthScreen placeOfBirthScreen, Continuation continuation) {
        super(2, continuation);
        this.u = placeOfBirthScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.feature.crypto.tfr.validation.impl.pob.a) ((h) this.u.P.getValue())).f71049s, PlaceOfBirthScreenContract$ModalStep.CountryPicker.f71045a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
