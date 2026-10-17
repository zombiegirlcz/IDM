package nml;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CountrySelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CountrySelectionScreen countrySelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = countrySelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.sso.impl.ui.country_selection.b) this.u.d()).f106508s, CountrySelectionScreenContract$ModalStep.CountryPicker.f106501a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
