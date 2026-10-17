package bh8;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import cu8.r0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ks8.j;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f15254w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f15255x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f15254w = uVar;
        this.f15255x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f15254w, this.f15255x, continuation, 0);
            default:
                return new r(this.f15254w, this.f15255x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        l lVar = this.f15255x;
        u uVar = this.f15254w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var = uVar.v;
                    this.v = 1;
                    obj2 = ks8.m.b(r0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ks8.j jVar = (ks8.j) obj2;
                if (jVar instanceof ks8.i) {
                    return uVar.C1(new BridgeDestination(((ks8.i) jVar).f189312a));
                }
                if (!(jVar instanceof j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = lVar == null ? -1 : q.f15253a[lVar.ordinal()];
                if (i5 == -1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Verify button visible while kyc is in passed state");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return Unit.f186387a;
                }
                if (i5 == 1) {
                    uVar.n2(new o(uVar, null, 0), new whi.b(6));
                    return Unit.f186387a;
                }
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                uVar.z2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r rVar = new r(uVar, lVar, continuation, i2);
                this.v = 1;
                Object objP2 = uVar.p2(this, rVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
