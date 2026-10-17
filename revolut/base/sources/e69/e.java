package e69;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ MasavPayToMerchantConfirmationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = masavPayToMerchantConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((u) this.u.d()).J2(l.f122947a);
        return Unit.f186387a;
    }
}
