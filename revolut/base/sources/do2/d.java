package do2;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((q) this.v.R2()).K2(textData.f52597a, textData.f52598b.toString(), null);
        return Unit.f186387a;
    }
}
