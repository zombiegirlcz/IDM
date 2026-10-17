package nnd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.account_picker.AccountPickerController;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(AccountPickerController accountPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.v, continuation, 0);
            default:
                return new u(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountPickerController accountPickerController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i0) accountPickerController.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) accountPickerController.R2();
                a aVar3 = (a) ((c) ((j2) i0Var.f217559x.f22677a).getValue()).f217532a.getContent();
                k kVar = aVar3 != null ? aVar3.f217519b : null;
                j jVar = kVar instanceof j ? (j) kVar : null;
                if (jVar != null) {
                    Set set = jVar.f217562c;
                    AnalyticsAccount analyticsAccount = (AnalyticsAccount) zhm.d0.c0(set);
                    if (analyticsAccount != null) {
                        i0Var.P2(i0.J2(analyticsAccount, set));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
