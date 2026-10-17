package dah;

import aii.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.wealth.impl.ui.extensions.disclaimers.modal_disclaimer.WealthDisclaimerBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ WealthDisclaimerBottomSheet u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WealthDisclaimerBottomSheet wealthDisclaimerBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.u = wealthDisclaimerBottomSheet;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.u.T.getValue()).C2(q.f5292a);
        return Unit.f186387a;
    }
}
