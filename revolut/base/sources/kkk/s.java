package kkk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f185120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f185121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f185122y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, t tVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f185122y = tVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(0, this.f185122y, continuation);
                sVar.f185120w = flowCollector;
                sVar.f185121x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            default:
                s sVar2 = new s(1, this.f185122y, continuation);
                sVar2.f185120w = flowCollector;
                sVar2.f185121x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f185120w;
                    t tVar = this.f185122y;
                    cha.b bVar = tVar.f185125r;
                    FamilyPlanInvitationScreenContract$InputData familyPlanInvitationScreenContract$InputData = tVar.u;
                    String familyId = familyPlanInvitationScreenContract$InputData.f103398a;
                    String invitationId = familyPlanInvitationScreenContract$InputData.f103399b;
                    ffk.h hVar = (ffk.h) bVar;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(familyId, "familyId");
                    Intrinsics.checkNotNullParameter(invitationId, "invitationId");
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    pfk.s sVar = (pfk.s) hVar.f134833b;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(familyId, "familyId");
                    Intrinsics.checkNotNullParameter(invitationId, "invitationId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    v1 v1VarD = c8g.a.D(rd0.e.n(xam.a.h(new r(0, tVar, null), ((x4l.c) sVar.f235690j.getValue()).b(new pfk.l(familyId, invitationId), loadingStrategy)), h0.f322473a));
                    this.f185120w = null;
                    this.f185121x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1VarD, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f185120w;
                    vkm.d dVarB = rd0.e.b(this.f185122y.o.v(w4l.h.f294642c));
                    this.f185120w = null;
                    this.f185121x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
