package f5g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature_travel_hotels_models.booking.request.HotelsPropertyBookingRequestStatus;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132322a;

    public /* synthetic */ l(int i) {
        this.f132322a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f132322a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return q4g.b.a(4, "TRAVEL_FLIGHTS_BOOKINGS_ERROR", true);
            case 1:
                Throwable error = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (map == null) {
                    return error;
                }
                return null;
            case 2:
                return Boolean.valueOf(Intrinsics.f(((Data) obj2).getContent(), ((Data) obj3).getContent()));
            case 3:
                ((Boolean) obj2).getClass();
                return eb8.l.f124309a;
            case 4:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var);
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 7:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 8:
                Throwable error4 = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pair == null) {
                    return error4;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((List) obj3, "<unused var>");
                return Unit.f186387a;
            case 10:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(14, null, false, false, null));
            case 11:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 13:
                Throwable error5 = (Throwable) obj2;
                TravelHotelsDropoff travelHotelsDropoff = (TravelHotelsDropoff) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (travelHotelsDropoff == null) {
                    return error5;
                }
                return null;
            case 14:
                Throwable error6 = (Throwable) obj2;
                TravelHotelsDropoff travelHotelsDropoff2 = (TravelHotelsDropoff) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (travelHotelsDropoff2 == null) {
                    return error6;
                }
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new fa8.h((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 21:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "it");
                throw null;
            case 22:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List properties = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(properties, "properties");
                throw null;
            case 23:
                Throwable error7 = (Throwable) obj2;
                HotelsPropertyBookingRequestStatus hotelsPropertyBookingRequestStatus = (HotelsPropertyBookingRequestStatus) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (hotelsPropertyBookingRequestStatus == null) {
                    return error7;
                }
                return null;
            case 24:
                ((Integer) obj3).intValue();
                tei.b[] elements = {tei.b.CONFIRMED, tei.b.CANCELLED, tei.b.FAILED, tei.b.PARTIALLY_COMPLETED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return Boolean.valueOf(!kotlin.collections.d.y0(elements).contains(((HotelsPropertyBookingRequestStatus) obj2).f97888b));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return fb6.n.a(new TextLocalisedClause(R$string.donations_rev_points_donation_donate, null, null, 14), false, fb6.a.f133443a);
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f132322a = i;
    }
}
