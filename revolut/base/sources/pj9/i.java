package pj9;

import aii.e0;
import aii.q;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ku1.v;
import lmb.y;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f236708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f236709x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236708w = lVar;
        this.f236709x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f236708w, this.f236709x, continuation, 0);
            case 1:
                return new i(this.f236708w, this.f236709x, continuation, 1);
            case 2:
                return new i(this.f236708w, this.f236709x, continuation, 2);
            case 3:
                return new i(this.f236708w, this.f236709x, continuation, 3);
            default:
                return new i(this.f236708w, this.f236709x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ti9.l lVar = this.f236708w.f236713p;
                this.v = 1;
                Object objA = ((ti9.n) lVar).a(this.f236709x, this);
                return objA == aVar ? aVar : objA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                l lVar2 = this.f236708w;
                Continuation continuation = null;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y yVar = new y(1);
                    i iVar = new i(lVar2, this.f236709x, continuation, 0);
                    this.v = 1;
                    obj2 = n14.k.V(lVar2, null, null, yVar, iVar, this, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (hVar instanceof nii.g) {
                    nii.g gVar = (nii.g) hVar;
                    n1 n1Var = gVar.f216153b;
                    RightToCancelCancellationOutcome rightToCancelCancellationOutcome = (RightToCancelCancellationOutcome) gVar.f216152a;
                    boolean z = n1Var instanceof l1;
                    q qVar = q.f5292a;
                    if (z) {
                        if (rightToCancelCancellationOutcome.f78849a == xi9.a.REPAYMENT_REQUIRED) {
                            lVar2.C1(new e0(new PayLaterKompotFeatureConfig.RepayAmount(0).f98274b, null, false, 2));
                        } else {
                            lVar2.C2(qVar);
                        }
                    } else if ((n1Var instanceof m1) || (n1Var instanceof k1)) {
                        lVar2.C2(qVar);
                    } else if (!(n1Var instanceof j1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xh9.a aVar4 = this.f236708w.o;
                    this.v = 1;
                    if (((ti9.g) aVar4).e(this.f236709x, this) == aVar3) {
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
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                l lVar3 = this.f236708w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    v vVar = new v(15);
                    i iVar2 = new i(lVar3, this.f236709x, null, 2);
                    this.v = 1;
                    obj2 = n14.k.V(lVar3, null, null, vVar, iVar2, this, 2);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    lVar3.C2(q.f5292a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar4 = this.f236708w;
                i iVar3 = new i(lVar4, this.f236709x, null, 3);
                this.v = 1;
                Object objB = pu7.a.B(lVar4.k, "deactivate", iVar3, this);
                return objB == aVar6 ? aVar6 : objB;
        }
    }
}
