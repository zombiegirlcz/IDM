package hp2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ BankAccountSwitchingStartDateSelectionScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bankAccountSwitchingStartDateSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.u.R.getValue();
        jVar.getClass();
        jVar.l2(new gvc.m(jVar, null, 23), new yi5.b(26));
        return Unit.f186387a;
    }
}
