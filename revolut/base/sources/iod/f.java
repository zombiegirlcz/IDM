package iod;

import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerController;
import gim.i;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TripsDatePickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TripsDatePickerController tripsDatePickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tripsDatePickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TripsDatePickerController tripsDatePickerController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) tripsDatePickerController.O.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) tripsDatePickerController.O.getValue();
                a aVar3 = (a) ((j2) gVar.f163228p.f22677a).getValue();
                LocalDate localDate = aVar3.f163220a;
                if (localDate != null) {
                    if (gVar.o.f87608c) {
                        gVar.C2(new b(localDate, null));
                    } else {
                        LocalDate localDate2 = aVar3.f163221b;
                        if (localDate2 != null) {
                            gVar.C2(new b(localDate, localDate2));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
