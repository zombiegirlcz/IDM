package nnd;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.AccountPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AccountPickerController accountPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = accountPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z zVar = new z(this.v, continuation);
        zVar.u = obj2;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((i0) this.v.R2()).N2(model.k);
        return Unit.f186387a;
    }
}
