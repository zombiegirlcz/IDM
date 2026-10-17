package yna;

import com.revolut.feature.crypto.documents.api.navigation.destinations.CryptoDocumentsDestination;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileInputData;
import com.revolut.feature.payments.profile.api.navigation.PaymentsProfileDestination;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class u0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f315376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(c1 c1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f315376w = c1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u0(this.f315376w, continuation, 0);
            case 1:
                return new u0(this.f315376w, continuation, 1);
            case 2:
                return new u0(this.f315376w, continuation, 2);
            case 3:
                return new u0(this.f315376w, continuation, 3);
            case 4:
                return new u0(this.f315376w, continuation, 4);
            case 5:
                return new u0(this.f315376w, continuation, 5);
            default:
                return new u0(this.f315376w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objL;
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        c1 c1Var = this.f315376w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t0 t0Var = new t0(c1Var, null);
                this.v = 1;
                Object objB = pu7.a.B(c1Var.k, "getSwitcherButtonClickDescriptor", t0Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError = c1Var.z2().firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qla.a aVar3 = (qla.a) obj2;
                int i21 = aVar3 == null ? -1 : w0.f315382a[aVar3.ordinal()];
                if (i21 == -1) {
                    c1Var.C1(new PaymentsProfileDestination(new PaymentProfileInputData(ew9.b.DETAILS)));
                } else {
                    if (i21 == 1) {
                        return Unit.f186387a;
                    }
                    if (i21 != 2) {
                        if (i21 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c1Var.C1(new PaymentsProfileDestination(new PaymentProfileInputData(ew9.b.DETAILS)));
                    } else if (((a) c1Var.t2()).f315279j) {
                        c1Var.C1(new PaymentsProfileDestination(new PaymentProfileInputData(ew9.b.DETAILS)));
                    } else {
                        String str = ((a) c1Var.t2()).f315275b;
                        if (str != null && str.length() != 0) {
                            c1Var.f315316r.a(null, str, false);
                            if (!c70.a.g()) {
                                c1Var.H2();
                            }
                        }
                        Unit unit = Unit.f186387a;
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError2 = c1Var.z2().firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError2, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                qla.a aVar5 = (qla.a) obj2;
                int i32 = aVar5 == null ? -1 : x0.f315384a[aVar5.ordinal()];
                if (i32 != -1) {
                    if (i32 == 1) {
                        return c1Var.C1(CryptoDocumentsDestination.f70784a);
                    }
                    if (i32 != 2 && i32 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                ((jma.i) c1Var.f315314p).getClass();
                return c1Var.C1(new BridgeDestination(new FeatureCommand(ProfileFeatureConfig.Documents.f81347a)));
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    b1 b1Var = new b1(c1Var, continuation, i2);
                    this.v = 1;
                    if (c1Var.p2(this, b1Var) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    b1 b1Var2 = new b1(c1Var, continuation, i3);
                    this.v = 1;
                    if (c1Var.p2(this, b1Var2) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    aoa.j jVar = c1Var.v;
                    this.v = 1;
                    if (!((jte.d) jVar.f7952c).c(PricingPlanUpgradeEntryPointApi$Toggles.PlanWidgetNudges.f80973c) || (objL = jVar.e.l(this)) != aVar8) {
                        objL = Unit.f186387a;
                    }
                    if (objL == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a1 a1Var = new a1(c1Var, null, 2);
                this.v = 1;
                Object objP2 = c1Var.p2(this, a1Var);
                return objP2 == aVar9 ? aVar9 : objP2;
        }
    }
}
