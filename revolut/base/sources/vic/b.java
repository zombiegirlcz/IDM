package vic;

import bgc.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationStatusDialogFactory$ErrorDialogPayload$RewardActivation;
import dx6.m;
import efm.d0;
import ehc.w;
import gim.i;
import iuf.y;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import nii.c0;
import nii.f;
import nii.h;
import nii.l1;
import nii.n1;
import phc.j;
import ufm.n;
import ugc.g;
import uxe.l;
import vb2.r;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f289563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f289563w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f289563w, continuation, 0);
            default:
                return new b(this.f289563w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objS;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                c cVar = this.f289563w;
                if (i == 0) {
                    o.b(obj2);
                    e eVar = cVar.f289565q;
                    RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = cVar.o;
                    String merchantRef = rewardRegistrationFlowContract$InputData.f84950a;
                    HashMap parameters = rewardRegistrationFlowContract$InputData.f84951b;
                    g gVar = (g) eVar;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(merchantRef, "merchantRef");
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    j jVar = (j) gVar.f280008b;
                    Intrinsics.checkNotNullParameter(merchantRef, "merchantRef");
                    Intrinsics.checkNotNullParameter(parameters, "parameters");
                    d0<w> d0VarCompleteExternalRewardRegistration = jVar.f236272a.completeExternalRewardRegistration(merchantRef, parameters);
                    phc.b bVar = new phc.b(2, new phc.e(0));
                    d0VarCompleteExternalRewardRegistration.getClass();
                    ufm.i iVar = new ufm.i(d0VarCompleteExternalRewardRegistration, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    n nVarI0 = te0.w.i0(iVar);
                    this.v = 1;
                    objB = nim.a.b(nVarI0, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                cVar.H2(cVar.f289567s, new r((String) objB, 10));
                return objB;
            default:
                c cVar2 = this.f289563w;
                yki.i iVar2 = cVar2.f289568t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                if (i2 == 0) {
                    o.b(obj2);
                    cVar2.f289564p.getClass();
                    c0 c0Var = new c0(new TextLocalisedClause(R$string.perks_complete_external_registration_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
                    m mVar = new m(cVar2, 6);
                    y yVar = new y(cVar2, 29);
                    b bVar2 = new b(cVar2, continuation, 0);
                    this.v = 1;
                    objS = k.S(cVar2.X(), c0Var, mVar, yVar, bVar2, this);
                    if (objS == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objS = obj2;
                }
                h hVar = (h) objS;
                if (hVar instanceof nii.g) {
                    oki.h.D2(iVar2);
                } else {
                    if (!(hVar instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n1 n1Var = ((f) hVar).f216147b;
                    if (n1Var instanceof l1) {
                        if (Intrinsics.f(((l1) n1Var).f216190a.a(), RewardRegistrationStatusDialogFactory$ErrorDialogPayload$RewardActivation.f84953a)) {
                            cVar2.l2(new l(cVar2, continuation, 23), new yi5.b(26));
                        } else {
                            oki.h.D2(iVar2);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
