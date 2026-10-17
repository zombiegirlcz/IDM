package dw8;

import com.revolut.feature.kyc.impl.idnow.eid.flow.IdnowEidFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import oki.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.idnow.eid.flow.a f120351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f120352x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar, d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f120351w = aVar;
        this.f120352x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f120351w, this.f120352x, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f120351w, this.f120352x, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f120351w, this.f120352x, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.f120352x;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z = n1Var instanceof l1;
                com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar2 = this.f120351w;
                if (z) {
                    h.t2(aVar2, aVar2.f77781q, new IdnowEidFlowContract$Step.Sdk(aVar2.o.f77777a), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (n1Var instanceof k1) {
                    aVar2.I2(dVar);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Unexpected generic error dialog result ", n1Var));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 1:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z3 = n1Var2 instanceof l1;
                com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar4 = this.f120351w;
                if (z3) {
                    h.t2(aVar4, aVar4.f77781q, new IdnowEidFlowContract$Step.Sdk(aVar4.o.f77777a), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if ((n1Var2 instanceof m1) || (n1Var2 instanceof k1)) {
                    aVar4.I2(dVar);
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Unexpected invalid card dialog result ", n1Var2));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                break;
            default:
                n1 n1Var3 = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z4 = n1Var3 instanceof l1;
                com.revolut.feature.kyc.impl.idnow.eid.flow.a aVar6 = this.f120351w;
                if (z4) {
                    aVar6.C2(at8.b.f9017a);
                } else if (n1Var3 instanceof k1) {
                    aVar6.I2(dVar);
                } else {
                    IllegalStateException illegalStateException3 = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Unexpected invalid session dialog result ", n1Var3));
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
