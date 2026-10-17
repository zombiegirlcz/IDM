package unc;

import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PortfolioSpareChangeScreen f281394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PortfolioSpareChangeScreen portfolioSpareChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281394w = portfolioSpareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f281394w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f281394w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PortfolioSpareChangeScreen portfolioSpareChangeScreen = this.f281394w;
        switch (i) {
            case 0:
                Integer num = (Integer) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE3 = portfolioSpareChangeScreen.R2();
                Intrinsics.h(num);
                b0VarE3.H2(b0VarE3.v, new l2c.l(num.intValue(), 25));
                return Unit.f186387a;
            default:
                h parcel = (h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE32 = portfolioSpareChangeScreen.R2();
                Intrinsics.h(parcel);
                b0VarE32.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.equals(f.f281395a)) {
                    j60.a.v(b0VarE32.f281390q, false, new tyl.a(b0VarE32, 22), 1);
                } else {
                    if (!parcel.equals(g.f281396a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b0VarE32.K2();
                }
                return Unit.f186387a;
        }
    }
}
