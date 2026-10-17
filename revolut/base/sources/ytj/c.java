package ytj;

import aw0.n6;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChallengeDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ChallengeDetailsController challengeDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = challengeDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d0j.i iVar;
        int i = this.u;
        ChallengeDetailsController challengeDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) challengeDetailsController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar3 = (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) challengeDetailsController.d();
                d0j.k kVar = (d0j.k) ((j) ((j2) aVar3.v.f22677a).getValue()).f316817a.getContent();
                if (kVar != null && (iVar = kVar.f110416l) != null) {
                    String str = iVar.f110407b;
                    Continuation continuation = null;
                    if (kVar.e == d0j.n.NOT_STARTED) {
                        aVar3.l2(new y65.l(aVar3, kVar.f110411b, kVar.f110410a, continuation, 14), new yi5.b(26));
                    } else if (str != null) {
                        aVar3.l2(new yg6.v(aVar3, str, continuation, 24), new yi5.b(26));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
