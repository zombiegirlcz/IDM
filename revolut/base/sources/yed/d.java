package yed;

import aw0.f4;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedCreateAlertRevampedScreen f312855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f312855w = sharedCreateAlertRevampedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f312855w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f312855w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen = this.f312855w;
        switch (i) {
            case 0:
                String amount = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarT2 = sharedCreateAlertRevampedScreen.T2();
                Intrinsics.h(amount);
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) qVarT2;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                String string = amount.toString();
                bVar.x2(new xwd.o(bVar, 12, string, bVar.f86750w.d(string)));
                bVar.E2();
                break;
            default:
                f4 f4Var = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarT22 = sharedCreateAlertRevampedScreen.T2();
                boolean z = f4Var.f10304b;
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar2 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) qVarT22;
                bVar2.getClass();
                bVar2.x2(new xyh.n(z, 8));
                break;
        }
        return Unit.f186387a;
    }
}
