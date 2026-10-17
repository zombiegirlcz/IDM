package qeg;

import cli.y;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.TravelHotelsFilterOptionsPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsFilterOptionsPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsFilterOptionsPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsFilterOptionsPickerScreen travelHotelsFilterOptionsPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) travelHotelsFilterOptionsPickerScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) travelHotelsFilterOptionsPickerScreen.e3();
                y yVar = jVar.f245158r;
                zfi.b bVar = (zfi.b) ((e) ((j2) yVar.f22677a).getValue()).f245149a.getContent();
                if (bVar != null) {
                    jVar.C2(new f(s.e(((e) ((j2) yVar.f22677a).getValue()).f245150b, bVar)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
