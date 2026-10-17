package nya;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d f220732w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220732w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(this.f220732w, continuation, 0);
                g0Var.v = obj2;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.f220732w, continuation, 1);
                g0Var2.v = obj2;
                return g0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = this.f220732w;
        switch (i) {
            case 0:
                i iVar = (i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.E, new b0(iVar, 1));
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
                    dVar.s1();
                    dVar.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
