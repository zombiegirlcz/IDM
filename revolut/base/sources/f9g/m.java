package f9g;

import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsHomeKompotDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import i9g.b0;
import i9g.h0;
import i9g.x;
import java.time.LocalDate;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements xii.b {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f132962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8g.c f132963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f132964c;
    public final p8g.d d;
    public final i9g.l e;
    public final h0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f132965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.e f132966h;

    public m(ang.f userInteractor, p8g.c travelHotelsFeatureInteractor, b0 travelHotelsPropertyInteractor, p8g.d travelHotelsLocationsInteractor, i9g.l travelHotelsBookingDraftInteractor, h0 travelHotelsPropertySearchParamsInteractor, x filtersDecorationDeeplinkInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsLocationsInteractor, "travelHotelsLocationsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsBookingDraftInteractor, "travelHotelsBookingDraftInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertySearchParamsInteractor, "travelHotelsPropertySearchParamsInteractor");
        Intrinsics.checkNotNullParameter(filtersDecorationDeeplinkInteractor, "filtersDecorationDeeplinkInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f132962a = userInteractor;
        this.f132963b = travelHotelsFeatureInteractor;
        this.f132964c = travelHotelsPropertyInteractor;
        this.d = travelHotelsLocationsInteractor;
        this.e = travelHotelsBookingDraftInteractor;
        this.f = travelHotelsPropertySearchParamsInteractor;
        this.f132965g = filtersDecorationDeeplinkInteractor;
        this.f132966h = dateProvider;
    }

    public static TravelHotelsHomeKompotDestination f(lg0.e eVar) {
        ZoomTransitionAnimation.Default defaultD;
        String strA = lg0.g.a("listId", eVar.f195041c);
        if (strA != null) {
            try {
                defaultD = com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(strA), null);
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                defaultD = null;
            }
        } else {
            defaultD = null;
        }
        return new TravelHotelsHomeKompotDestination(defaultD, null, null, 6);
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"hotels", "hotels/search", "hotels/property-rooms/{propertyId}", "hotels/booking/{bookingId}", "hotels/property/{propertyId}", "hotels/checkout/{propertyId}", "hotels/campaign/{campaignId}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    public final LocalDate b(lg0.e eVar) {
        LocalDate localDate;
        String strA = lg0.g.a("checkin", eVar.f195041c);
        if (strA != null) {
            try {
                localDate = LocalDate.parse(strA);
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                localDate = null;
            }
            if (localDate != null) {
                return localDate;
            }
        }
        return this.f.b();
    }

    public final LocalDate c(lg0.e eVar) {
        LocalDate localDate;
        String strA = lg0.g.a("checkout", eVar.f195041c);
        if (strA != null) {
            try {
                localDate = LocalDate.parse(strA);
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                localDate = null;
            }
            if (localDate != null) {
                return localDate;
            }
        }
        return this.f.c();
    }

    public final String d(lg0.e eVar) {
        String strA = lg0.g.a("occupancy", eVar.f195041c);
        return strA == null ? d0.k0(this.f.f159799a.a().d, ",", null, null, 0, new f7l.c(7), 30) : strA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0384 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r26) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9g.m.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }

    public final efm.b g(lg0.e eVar) {
        pfm.a aVar;
        String strA = lg0.g.a("occupancy", eVar.f195041c);
        if (strA != null) {
            try {
                aVar = new pfm.a(this.f.k(v04.b.g(strA)), mfm.f.f205044g, 1);
            } catch (Exception e) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
