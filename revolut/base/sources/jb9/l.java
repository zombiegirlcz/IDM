package jb9;

import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PasscodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(PasscodeScreen passcodeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = passcodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PasscodeScreen passcodeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.onboarding.impl.onboarding.passcode.a aVar2 = (com.revolut.feature.onboarding.impl.onboarding.passcode.a) passcodeScreen.e3();
                aVar2.H2(aVar2.f78464p, new j7b.l(20));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.onboarding.impl.onboarding.passcode.a) passcodeScreen.e3()).C2(b.f172612a);
                break;
        }
        return Unit.f186387a;
    }
}
