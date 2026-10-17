package rk9;

import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lmb.y;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a f254786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f254786w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f254786w, continuation, 0);
            default:
                return new s(this.f254786w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar2 = this.f254786w;
                ti9.l lVar = aVar2.o;
                String str = aVar2.f78930p.f78928a;
                this.v = 1;
                Object objA = ((ti9.n) lVar).a(str, this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar4 = this.f254786w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y yVar = new y(2);
                    s sVar = new s(aVar4, null, 0);
                    this.v = 1;
                    obj2 = n14.k.V(aVar4, null, null, yVar, sVar, this, 3);
                    if (obj2 == aVar3) {
                        return aVar3;
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
                    j jVar = j.f254774a;
                    if (z) {
                        if (rightToCancelCancellationOutcome.f78849a == xi9.a.REPAYMENT_REQUIRED) {
                            aVar4.C2(l.f254776a);
                        } else {
                            aVar4.C2(jVar);
                        }
                    } else if ((n1Var instanceof m1) || (n1Var instanceof k1)) {
                        aVar4.C2(jVar);
                    } else if (!(n1Var instanceof j1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
        }
    }
}
