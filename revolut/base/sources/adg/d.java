package adg;

import abf.n;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import ip0.u8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsGuestPickerScreen f3343w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3343w = travelHotelsGuestPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f3343w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f3343w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        u8 u8Var = (u8) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(u8Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        int i = this.u;
        TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen = this.f3343w;
        int i2 = 1;
        char c2 = 1;
        char c3 = 1;
        switch (i) {
            case 0:
                u8 model = (u8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = travelHotelsGuestPickerScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) jVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                hVar = obj3 instanceof h ? (h) obj3 : null;
                if (hVar != null) {
                    aVar2.H2(aVar2.f93964r, new n(hVar.f3345a, new a6j.a(hVar, aVar2, (boolean) (c3 == true ? 1 : 0)), c2 == true ? 1 : 0));
                }
                break;
            default:
                u8 model2 = (u8) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = travelHotelsGuestPickerScreen.d();
                Intrinsics.h(model2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a aVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) jVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Object obj4 = model2.k;
                hVar = obj4 instanceof h ? (h) obj4 : null;
                if (hVar != null) {
                    aVar4.H2(aVar4.f93964r, new n(hVar.f3345a, new a6j.a(hVar, aVar4, false), i2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
