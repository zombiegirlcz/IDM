package wl8;

import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorContactPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JuniorContactPickerScreen juniorContactPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorContactPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorContactPickerScreen juniorContactPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) juniorContactPickerScreen.e3()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar3 = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) juniorContactPickerScreen.e3();
                zm3.f fVar = ((g) ((j2) aVar3.f77220r.f22677a).getValue()).d;
                if (fVar == null) {
                    throw new IllegalArgumentException("Selected contact mustn't be null");
                }
                oki.h.v2(aVar3.u, new JuniorContactPickerScreenContract$ModalStep.PersonalDataConsentConfirmation(fVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
        }
    }
}
