package hp3;

import androidx.recyclerview.widget.RecyclerView;
import au0.j4;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CorporateEventsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = corporateEventsHomeScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        CorporateEventsHomeScreen corporateEventsHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n60.a) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).o.get()).R();
                if (corporateEventsHomeScreen.f66132d0) {
                    corporateEventsHomeScreen.d3().e.setVisibility(0);
                }
                corporateEventsHomeScreen.d3().f307592b.m0(j4.FROM_CLICKED_BUTTON);
                corporateEventsHomeScreen.d3().f307592b.i0();
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) corporateEventsHomeScreen.R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter("", "input");
                bVar.B.onNext("");
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Integer num = corporateEventsHomeScreen.f0;
                if (num != null) {
                    int iIntValue = num.intValue();
                    j jVar = new j(i2, corporateEventsHomeScreen.f3().getContext(), corporateEventsHomeScreen);
                    jVar.setTargetPosition(iIntValue);
                    RecyclerView.LayoutManager layoutManager = corporateEventsHomeScreen.f3().getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.startSmoothScroll(jVar);
                    }
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.corporate_events.impl.ui.screen.home.b) corporateEventsHomeScreen.R2()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
