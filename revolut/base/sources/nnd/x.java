package nnd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.AccountPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(AccountPickerController accountPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = accountPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        x xVar = new x(this.v, continuation);
        xVar.u = obj2;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        boolean z = obj3 instanceof c1;
        AccountPickerController accountPickerController = this.v;
        if (z) {
            ((i0) accountPickerController.R2()).O2(new d(((c1) obj3).a()));
        } else if (obj3 instanceof g) {
            ((i0) accountPickerController.R2()).O2(e.f217542a);
        }
        return Unit.f186387a;
    }
}
