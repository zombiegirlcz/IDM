package v6i;

import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OrderSettingsScreen f286392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(OrderSettingsScreen orderSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f286392w = orderSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f286392w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f286392w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OrderSettingsScreen orderSettingsScreen = this.f286392w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) orderSettingsScreen.P.getValue();
                Intrinsics.h(clickData);
                mVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "CurrentRateDescriptionClickId")) {
                    mVar.C1(u0.b(mVar.f286403p.h(mVar.I2().d, mVar.I2().e)));
                }
                break;
            default:
                String newFormattedInput = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar2 = (m) orderSettingsScreen.P.getValue();
                Intrinsics.h(newFormattedInput);
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(newFormattedInput, "newFormattedInput");
                mVar2.H2(mVar2.f286404q, new uo7.k(newFormattedInput, 23));
                break;
        }
        return Unit.f186387a;
    }
}
