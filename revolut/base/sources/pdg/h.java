package pdg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pdg.p;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsPropertyDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsPropertyDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelHotelsPropertyDetailsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) travelHotelsPropertyDetailsScreen.d();
                HotelsProperty hotelsProperty = (HotelsProperty) ((m) ((j2) i0Var.E.f22677a).getValue()).f235202b.getContent();
                if (hotelsProperty != null) {
                    List list = hotelsProperty.e;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((Image) it8.next()).f98056c);
                    }
                    i0Var.C2(new r(arrayList));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var2 = (i0) travelHotelsPropertyDetailsScreen.d();
                HotelsProperty hotelsProperty2 = (HotelsProperty) ((m) ((j2) i0Var2.E.f22677a).getValue()).f235202b.getContent();
                if (hotelsProperty2 != null) {
                    boolean zO = hx7.a.o(hotelsProperty2, fgi.a.VRBO);
                    if (hx7.a.m(hotelsProperty2)) {
                        Continuation continuation = null;
                        if (zO) {
                            i0Var2.n2(new c0(i0Var2, hotelsProperty2, continuation, 2), new whi.b(6));
                        } else {
                            i0Var2.n2(new c0(i0Var2, hotelsProperty2, continuation, 3), new whi.b(6));
                        }
                    } else {
                        i0Var2.C2(p.b.f235213a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
