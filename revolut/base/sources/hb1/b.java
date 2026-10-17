package hb1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker.AccountPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AccountPickerScreen accountPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        AccountPickerScreen accountPickerScreen = this.v;
        f fVar = (f) accountPickerScreen.S2().f112643g.get();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod.Wallet");
        PaymentMethod.Wallet wallet = (PaymentMethod.Wallet) obj3;
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        hVar.v2(new d(wallet));
        ((m) accountPickerScreen.S2().f112642c.get()).b(false);
        return Unit.f186387a;
    }
}
