package hbg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b f150723b;

    public /* synthetic */ w(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, int i) {
        this.f150722a = i;
        this.f150723b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150722a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, null, null, null, null, null, false, ((jte.d) ((i9g.v) this.f150723b.f93850q).f159842a).c(TravelHotelsApi$Toggles.StaysInAppChangeDates.f93617c), 255);
            case 1:
                Data status = (Data) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = this.f150723b;
                return ue0.e.v(bVar.f93849p.b(bVar.o.f93646a, false)).g(efm.r.just(status));
            case 2:
                Boolean experiencesEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(experiencesEnabled, "experiencesEnabled");
                if (!experiencesEnabled.booleanValue()) {
                    efm.r rVarJust = efm.r.just(new Data(null, null, false, 7, null));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar2 = this.f150723b;
                efm.r rVarSwitchMap = m70.a.g(bVar2.f93849p.a(bVar2.o.f93646a, false), null, null, 3).switchMap(new hae.k(new w(bVar2, 3), 4));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return nim.a.w(rVarSwitchMap, new w(bVar2, 4));
            case 3:
                rei.g booking = (rei.g) obj2;
                Intrinsics.checkNotNullParameter(booking, "booking");
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar3 = this.f150723b;
                LocalDate now = ((l80.f) bVar3.f93855x).e();
                Intrinsics.checkNotNullParameter(booking, "<this>");
                Intrinsics.checkNotNullParameter(now, "now");
                if (booking.e.f253603b.isAfter(now)) {
                    tei.b[] elements = {tei.b.CANCELLED, tei.b.FAILED, tei.b.PROCESSING_CANCELLATION};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (!kotlin.collections.d.y0(elements).contains(booking.f253605b)) {
                        return bVar3.u.a(booking.f253604a, w4l.h.f294642c);
                    }
                }
                efm.r rVarJust2 = efm.r.just(new Data(null, null, false, 7, null));
                Intrinsics.h(rVarJust2);
                return rVarJust2;
            default:
                List experiences = (List) obj2;
                Intrinsics.checkNotNullParameter(experiences, "experiences");
                this.f150723b.getClass();
                if (experiences.size() >= 3) {
                    return experiences;
                }
                return null;
        }
    }
}
