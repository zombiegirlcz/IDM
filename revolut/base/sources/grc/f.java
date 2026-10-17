package grc;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ AccountDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AccountDetailsController accountDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = accountDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarR2 = this.u.R2();
        kVarR2.getClass();
        kVarR2.n2(new h(kVarR2, null, 2), new whi.b(6));
        return Unit.f186387a;
    }
}
