package oul;

import aw0.f4;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TargetPriceScreen f229897w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TargetPriceScreen targetPriceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229897w = targetPriceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f229897w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f229897w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f229897w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((pvl.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TargetPriceScreen targetPriceScreen = this.f229897w;
        switch (i) {
            case 0:
                pvl.b bVar = (pvl.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i2 = e.f229895a[bVar.ordinal()];
                if (i2 == 1) {
                    com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.d();
                    j60.a.v(bVar2.f107009s, false, new v(bVar2, 1), 1);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.trading.orders.ui.invest.placement.target_price.b bVar3 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.d();
                    j60.a.v(bVar3.f107009s, false, new v(bVar3, 0), 1);
                }
                return Unit.f186387a;
            case 1:
                r validation = (r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar4 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.d();
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(validation, "validation");
                bVar4.n2(new osk.m(bVar4, validation, null, 2), new whi.b(6));
                return Unit.f186387a;
            default:
                f4 f4Var = (f4) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD = targetPriceScreen.d();
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar5 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) mVarD;
                bVar5.H2(bVar5.getState(), new ocb.u(f4Var.f10304b, 7));
                return Unit.f186387a;
        }
    }
}
