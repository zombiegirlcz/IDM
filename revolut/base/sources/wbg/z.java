package wbg;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(TravelHotelsCheckoutScreen travelHotelsCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.v, continuation, 0);
            case 1:
                return new z(this.v, continuation, 1);
            case 2:
                return new z(this.v, continuation, 2);
            default:
                return new z(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsCheckoutScreen travelHotelsCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) travelHotelsCheckoutScreen.d()).K2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = TravelHotelsCheckoutScreen.f93892d0;
                travelHotelsCheckoutScreen.d3().e.setCollapsed(false, true);
                ScreenContentRecyclerView travelHotelsCheckoutScreenRecyclerView = travelHotelsCheckoutScreen.d3().d;
                Intrinsics.checkNotNullExpressionValue(travelHotelsCheckoutScreenRecyclerView, "travelHotelsCheckoutScreenRecyclerView");
                travelHotelsCheckoutScreen.getClass();
                RecyclerView.LayoutManager layoutManager = travelHotelsCheckoutScreenRecyclerView.getLayoutManager();
                int itemCount = layoutManager != null ? layoutManager.getItemCount() : -1;
                if (itemCount > 0) {
                    tw0.x.a(travelHotelsCheckoutScreenRecyclerView, itemCount - 1);
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) travelHotelsCheckoutScreen.d()).B2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) travelHotelsCheckoutScreen.d()).K2();
                break;
        }
        return Unit.f186387a;
    }
}
