package gc1;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CardReaderSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardReaderSettingsScreen cardReaderSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cardReaderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.u.T2();
        qVar.getClass();
        qVar.l2(new p(qVar, null, 2), new yi5.b(26));
        return Unit.f186387a;
    }
}
