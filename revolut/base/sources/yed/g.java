package yed;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedCreateAlertRevampedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedCreateAlertRevampedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarT2 = this.v.T2();
        CharSequence note = textData.f52598b;
        com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) qVarT2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        bVar.x2(new a2f.k(18, note));
        bVar.E2();
        return Unit.f186387a;
    }
}
