package vo8;

import com.revolut.feature.junior_referrals.api.JuniorReferralsApi$Toggles$JuniorReferralsRevamp;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import kl.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f290882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f290883x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290884y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f290884y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(0, this.f290884y, continuation);
                g0Var.f290882w = flowCollector;
                g0Var.f290883x = obj3;
                return g0Var.invokeSuspend(Unit.f186387a);
            case 1:
                g0 g0Var2 = new g0(1, this.f290884y, continuation);
                g0Var2.f290882w = flowCollector;
                g0Var2.f290883x = obj3;
                return g0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                g0 g0Var3 = new g0(2, this.f290884y, continuation);
                g0Var3.f290882w = flowCollector;
                g0Var3.f290883x = obj3;
                return g0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                g0 g0Var4 = new g0(3, this.f290884y, continuation);
                g0Var4.f290882w = flowCollector;
                g0Var4.f290883x = obj3;
                return g0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                g0 g0Var5 = new g0(4, this.f290884y, continuation);
                g0Var5.f290882w = flowCollector;
                g0Var5.f290883x = obj3;
                return g0Var5.invokeSuspend(Unit.f186387a);
            default:
                g0 g0Var6 = new g0(5, this.f290884y, continuation);
                g0Var6.f290882w = flowCollector;
                g0Var6.f290883x = obj3;
                return g0Var6.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f290882w;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.f290884y;
                    akg.n nVarD = bVar.f77338x.d(bVar.o.f77325a, w4l.i.f294643c);
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarD, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f290882w;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar2 = this.f290884y;
                    jhi.k kVarU = nim.a.u(new sxe.g(bVar2, (Continuation) null, 25), bVar2.f77335s.e(bVar2.o.f77325a, w4l.i.f294643c));
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, kVarU, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f290882w;
                    w4l.k kVar = (w4l.k) this.f290883x;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar3 = this.f290884y;
                    akg.n nVarA = hj8.a.a(bVar3.f77332p, bVar3.o.f77325a, kVar);
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarA, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f290882w;
                    w4l.k loadingStrategy = (w4l.k) this.f290883x;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar4 = this.f290884y;
                    t1 t1Var = bVar4.f77333q;
                    String juniorId = bVar4.o.f77325a;
                    t1Var.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    un8.h hVar = (un8.h) ((un8.c) t1Var.f185240b);
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = hVar.f281369g.b(juniorId, loadingStrategy);
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f290882w;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar5 = this.f290884y;
                    wk8.a aVar6 = bVar5.f77334r;
                    t1 t1Var2 = bVar5.f77333q;
                    JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = bVar5.o;
                    if (((jte.d) bVar5.z).c(JuniorReferralsApi$Toggles$JuniorReferralsRevamp.f77156c)) {
                        String juniorId2 = juniorSecurityAndPrivacyControllerContract$InputData.f77325a;
                        t1Var2.getClass();
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        un8.h hVar2 = (un8.h) ((un8.c) t1Var2.f185240b);
                        hVar2.getClass();
                        Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                        vkm.d dVarB2 = rd0.e.b(nim.a.w(hVar2.e.f(juniorId2, true), new vn8.a(4)));
                        String value = juniorSecurityAndPrivacyControllerContract$InputData.f77325a;
                        Intrinsics.checkNotNullParameter(value, "value");
                        flowB = nim.a.v(u0.m(dVarB2, aVar6.a(value, w4l.i.f294643c)), new vn8.a(5));
                    } else {
                        String juniorId3 = juniorSecurityAndPrivacyControllerContract$InputData.f77325a;
                        t1Var2.getClass();
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        un8.h hVar3 = (un8.h) ((un8.c) t1Var2.f185240b);
                        hVar3.getClass();
                        Intrinsics.checkNotNullParameter(juniorId3, "juniorId");
                        flowB = rd0.e.b(nim.a.w(kli.a.h(nim.a.w(hVar3.e.f(juniorId3, true), new vn8.a(6)), aVar6.b(juniorSecurityAndPrivacyControllerContract$InputData.f77325a, true)), new vn8.a(7)));
                    }
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f290882w;
                    w4l.k loadingStrategy2 = (w4l.k) this.f290883x;
                    com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar6 = this.f290884y;
                    f4h.a aVar8 = bVar6.f77337w;
                    String juniorId4 = bVar6.o.f77325a;
                    aVar8.getClass();
                    Intrinsics.checkNotNullParameter(juniorId4, "juniorId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    gb8.b bVar7 = (gb8.b) aVar8.f132229b;
                    bVar7.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    akg.n nVarV = nim.a.v(bVar7.e.b(Unit.f186387a, loadingStrategy2), new jb8.a(juniorId4, 2));
                    this.f290882w = null;
                    this.f290883x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, nVarV, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
