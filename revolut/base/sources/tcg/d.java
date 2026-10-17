package tcg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsLocationPickerScreen f269782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269782w = travelHotelsLocationPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f269782w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f269782w, continuation, 1);
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
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 28;
        TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = this.f269782w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = travelHotelsLocationPickerScreen.R2();
                Intrinsics.h(query);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) nVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                a2 a2Var = aVar2.f93945x;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                if (query.length() >= 3) {
                    aVar2.f93945x = yji.l.a1(aVar2, new v1(new sxe.g(aVar2, query, (Continuation) null)), null, null, new qqj.g(aVar2, query, continuation, 23), 3);
                } else {
                    aVar2.H2(aVar2.f93946y, new sef.j(query, 28));
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = travelHotelsLocationPickerScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) nVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "SMART_SEARCH_DISCLAIMER_ITEM_ID")) {
                    aVar4.n2(new s(aVar4, continuation, 1), new t9b.a(i2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
