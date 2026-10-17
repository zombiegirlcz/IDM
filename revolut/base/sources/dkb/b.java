package dkb;

import cli.y;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.vj0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SavingsChallengeSetUpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(SavingsChallengeSetUpScreen savingsChallengeSetUpScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = savingsChallengeSetUpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((vj0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SavingsChallengeSetUpScreen savingsChallengeSetUpScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a) savingsChallengeSetUpScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a aVar3 = (com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a) savingsChallengeSetUpScreen.d();
                y yVar = aVar3.f83199r;
                aVar3.C2(new e((dj0.d) ((d) ((j2) yVar.f22677a).getValue()).f115496c.get(((d) ((j2) yVar.f22677a).getValue()).f115495b)));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.a) savingsChallengeSetUpScreen.d()).f83200s, SavingsChallengeSetUpScreenContract$ModalStep.PrizeDrawEntries.f83196a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
