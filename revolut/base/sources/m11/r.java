package m11;

import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoChallengeProgressViewController f201189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(CryptoChallengeProgressViewController cryptoChallengeProgressViewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f201189w = cryptoChallengeProgressViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f201189w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f201189w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        d dVar = (d) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(dVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.f201189w;
        switch (i) {
            case 0:
                d dVar = (d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3()).I2(dVar);
                break;
            default:
                d dVar2 = (d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3()).I2(dVar2);
                break;
        }
        return Unit.f186387a;
    }
}
