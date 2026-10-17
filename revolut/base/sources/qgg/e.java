package qgg;

import android.net.Uri;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesAccountRegistrationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelMilesAccountRegistrationScreen travelMilesAccountRegistrationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesAccountRegistrationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesAccountRegistrationScreen travelMilesAccountRegistrationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) travelMilesAccountRegistrationScreen.f94257a0.getValue()).u2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) travelMilesAccountRegistrationScreen.f94257a0.getValue();
                oVar.getClass();
                oVar.l2(new m(oVar, null, 1), new qgf.o(oVar, 1));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) travelMilesAccountRegistrationScreen.f94257a0.getValue();
                Uri uri2 = Uri.parse(oVar2.f245842p.f94259a.e);
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                oVar2.C1(new BridgeDestination(new BrowserCommand(uri2)));
                break;
        }
        return Unit.f186387a;
    }
}
