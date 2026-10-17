package vgf;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;
import uhf.e;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vh f289151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a3 f289152x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(vh vhVar, com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Continuation continuation, a3 a3Var) {
        super(2, continuation);
        this.v = aVar;
        this.f289151w = vhVar;
        this.f289152x = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z0(this.f289151w, this.v, continuation, this.f289152x);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            up4.h hVar = new up4.h(4);
            o9a.v vVar = new o9a.v(14);
            y0 y0Var = new y0(this.f289151w, aVar2, null, this.f289152x);
            this.u = 1;
            obj2 = n14.k.Q(aVar2, null, vVar, hVar, y0Var, this, 1);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (!(eVar instanceof nii.d)) {
            if (eVar instanceof nii.c) {
                return Unit.f186387a;
            }
            throw new NoWhenBranchMatchedException();
        }
        uhf.e eVar2 = (uhf.e) ((nii.d) eVar).f216133a;
        if (eVar2 instanceof uhf.g) {
            aVar2.z.x(((uhf.g) eVar2).f280225a);
            return Unit.f186387a;
        }
        if (eVar2 instanceof uhf.f) {
            return aVar2.C1(new BridgeDestination(((uhf.f) eVar2).f280224a));
        }
        if (eVar2 instanceof e.a) {
            return Unit.f186387a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
