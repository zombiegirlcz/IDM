package xab;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoginFragment v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(LoginFragment loginFragment, Continuation continuation) {
        super(2, continuation);
        this.v = loginFragment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h0 h0Var = new h0(this.v, continuation);
        h0Var.u = obj2;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((PinCodeView.Header) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PinCodeView.Header header = (PinCodeView.Header) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        PinCodeView pinCodeView = this.v.m0;
        if (pinCodeView != null) {
            pinCodeView.setHeader(header);
            return Unit.f186387a;
        }
        Intrinsics.r("pinCodeView");
        throw null;
    }
}
