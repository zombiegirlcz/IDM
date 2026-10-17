package de9;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.passcode.PasscodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PasscodeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PasscodeScreen passcodeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = passcodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((PinCodeView.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.T2();
        fe9.h hVar = xVar.f113342r;
        boolean f78629a = xVar.f113340p.f78626l.getF78629a();
        hVar.getClass();
        hVar.e3(f78629a, true);
        return Unit.f186387a;
    }
}
