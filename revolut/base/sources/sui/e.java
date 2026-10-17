package sui;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftTerminalSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AsftTerminalSelectionScreen asftTerminalSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftTerminalSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftTerminalSelectionScreen asftTerminalSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) asftTerminalSelectionScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) asftTerminalSelectionScreen.e3()).v, AsftTerminalSelectionScreenContract$ModalStep.RevPointsInfo.f98873a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
