package mk5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CurrencyChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CurrencyChooserScreen currencyChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = currencyChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (aVar2.o.d instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget) {
            aVar2.n2(new z(aVar2, model, null), new whi.b(6));
        } else {
            aVar2.C2(new vj5.e(model.f53228a));
        }
        return Unit.f186387a;
    }
}
