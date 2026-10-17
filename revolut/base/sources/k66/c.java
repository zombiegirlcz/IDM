package k66;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.l3;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreen;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiRecoveryPhraseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DeFiRecoveryPhraseScreen deFiRecoveryPhraseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiRecoveryPhraseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.L.getValue();
        Intrinsics.h(event);
        com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a aVar2 = (com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof l3) && (((e) ((j2) aVar2.f71877r.f22677a).getValue()).f181648a instanceof g)) {
            oki.h.v2(aVar2.f71876q, DeFiRecoveryPhraseScreenContract$ModalStep.Consent.f71874a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
