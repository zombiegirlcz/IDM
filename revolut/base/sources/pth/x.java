package pth;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f239722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f239723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.onboarding.impl.workflow.a f239724y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f239724y = aVar;
        this.f239723x = function1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f239724y, (Function1) this.f239723x, continuation);
                xVar.f239722w = obj2;
                return xVar;
            default:
                x xVar2 = new x((Function1) this.f239723x, this.f239724y, continuation);
                xVar2.f239722w = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n1 n1Var = (n1) this.f239722w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    boolean z = n1Var instanceof j1;
                    ?? r56 = this.f239723x;
                    if (z || (n1Var instanceof m1) || (n1Var instanceof k1)) {
                        this.f239722w = null;
                        this.v = 1;
                        if (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.K2(this.f239724y, r56, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (!(n1Var instanceof l1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f239722w = null;
                        this.v = 2;
                        if (r56.invoke(this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                n1 n1Var2 = (n1) this.f239722w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    boolean z3 = n1Var2 instanceof l1;
                    ?? r59 = this.f239723x;
                    if (z3) {
                        this.f239722w = null;
                        this.v = 1;
                        if (r59.invoke(this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        boolean z4 = n1Var2 instanceof m1;
                        com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar3 = this.f239724y;
                        if (z4) {
                            aVar3.C1(new BridgeDestination(((btb.c) aVar3.f96496t).f18516a.c()));
                        } else {
                            this.f239722w = null;
                            this.v = 2;
                            if (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a.K2(aVar3, r59, this) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Function1 function1, com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f239723x = function1;
        this.f239724y = aVar;
    }
}
