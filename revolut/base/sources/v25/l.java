package v25;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q35.e0;
import tof.r9;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function1 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f285657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f285658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f285659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, String str, e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.f285657w = oVar;
        this.f285658x = str;
        this.f285659y = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f285657w, this.f285658x, this.f285659y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar2 = this.f285657w;
            r rVarK = oVar2.u.k(false);
            r rVarB = oVar2.f285665n.b(this.f285658x, w4l.h.f294642c);
            com.revolut.domain.interactors.transactions.a aVar2 = oVar2.v;
            e0 e0Var = this.f285659y;
            r rVarG = m70.a.g(nim.a.w(kli.a.i(rVarK, rVarB, com.revolut.domain.interactors.transactions.a.d(aVar2, new r9(e0Var.f241805b), null, new Integer(1), null, null, 26)), new k(e0Var, 0)), null, new g(3), 1);
            this.u = oVar2;
            this.v = 1;
            Object objC = nim.a.c(rVarG, this);
            if (objC == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
        oVar.getClass();
        oVar.A2(new BridgeDestination((NaviCommand) obj2));
        return Unit.f186387a;
    }
}
