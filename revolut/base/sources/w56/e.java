package w56;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiSendReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeFiSendReviewScreen deFiSendReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiSendReviewScreen;
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
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        if (Intrinsics.f(model.f53228a, "DeFiSendReviewScreen_Wallet") && (obj3 instanceof CryptoAddress)) {
            p pVarE3 = this.v.R2();
            CryptoAddress wallet = (CryptoAddress) obj3;
            pVarE3.getClass();
            Intrinsics.checkNotNullParameter(wallet, "wallet");
            pVarE3.C2(new i(wallet.f71059a));
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
