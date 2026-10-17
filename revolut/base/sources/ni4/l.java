package ni4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import rp0.p;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f215646w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f215646w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f215646w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f215646w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SpousalConsentInitiatorPopupScreenConfig.Action action;
        int i = this.u;
        n nVar = this.f215646w;
        switch (i) {
            case 0:
                p pVar = (p) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = pVar == null ? -1 : k.f215645a[pVar.ordinal()];
                if (i2 == 1) {
                    nVar.f215652w.invoke();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.y2(nVar.v.e);
                }
                return Unit.f186387a;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    nVar.y2(nVar.v.f66404c.f66411b);
                } else if (n1Var instanceof m1) {
                    SpousalConsentInitiatorPopupScreenConfig.Button button = nVar.v.d;
                    if (button == null || (action = button.f66411b) == null) {
                        action = SpousalConsentInitiatorPopupScreenConfig.Action.CloseScreen.f66406a;
                    }
                    nVar.y2(action);
                } else {
                    nVar.y2(nVar.v.e);
                }
                return Unit.f186387a;
        }
    }
}
