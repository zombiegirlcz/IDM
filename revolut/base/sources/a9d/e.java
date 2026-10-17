package a9d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.selection.CardsTroubleshooterSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardsTroubleshooterSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CardsTroubleshooterSelectionScreen cardsTroubleshooterSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardsTroubleshooterSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarT2 = this.v.T2();
        u uVar = (u) nVarT2;
        uVar.y2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
