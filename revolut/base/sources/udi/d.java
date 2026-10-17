package udi;

import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsPocketDetailsScreen revPointsPocketDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 0;
        RevPointsPocketDetailsScreen revPointsPocketDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                revPointsPocketDetailsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) revPointsPocketDetailsScreen.R2()).f97816r, false, null, 3);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar = (com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) revPointsPocketDetailsScreen.R2();
                j60.a.v(bVar.f97816r, false, null, 3);
                bVar.l2(new o(i2, bVar, continuation), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
